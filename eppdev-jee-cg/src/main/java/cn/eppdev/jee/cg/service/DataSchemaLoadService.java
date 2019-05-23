/* FileName: DataSchemaLoadService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.utils.TypeMapperUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import cn.eppdev.jee.conf.service.*;
import cn.eppdev.jee.utils.JSONUtils;
import cn.eppdev.jee.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author jinlong.hao
 */
@Service
public class DataSchemaLoadService {
    static Logger logger = LoggerFactory.getLogger(DataSchemaLoadService.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    EppdevConfService confService;

    @Autowired
    EppdevTableService tableService;

    @Autowired
    EppdevColumnService columnService;

    @Autowired
    EppdevIndexService indexService;

    @Autowired
    EppdevVersionService versionService;

    /**
     * 根据表名，读取表信息，具体逻辑包括：<br />
     * <ul>
     *   <li>1. 判断表是否存在</li>
     *   <li>2. 读取列信息</li>
     *   <li>3. 读取主键信息</li>
     *   <li>4. 读取索引信息</li>
     * </ul>
     */
    public EppdevTable getTableFromConn(String tableName) {
        try {
            Connection conn = dataSource.getConnection();
            String[] tableTypes = { "TABLE", "VIEW" };
            ResultSet rs = conn.getMetaData().getTables(null, null, tableName, tableTypes);
            /***********************************
             * 一、判断表是否存在
             ***********************************/
            EppdevTable eppdevTable = new EppdevTable();
            if (rs.next()) {
                eppdevTable.setTableName(rs.getString("TABLE_NAME"));
                eppdevTable.setTableComment(rs.getString("REMARKS"));
                eppdevTable.setVersionId(EppdevVersion.MASTER_VERSION_ID);
            } else {
                return null;
            }
            rs.close();

            /***********************************
             * 二、读取列信息
             ***********************************/
            rs = conn.getMetaData().getColumns(null, null, eppdevTable.getTableName(), null);
            List<EppdevColumn> columnList = new ArrayList<>();
            while (rs.next()) {
                EppdevColumn column = new EppdevColumn();
                column.setColumnName(rs.getString("COLUMN_NAME").toLowerCase());
                column.setColumnType(rs.getString("TYPE_NAME"));
                column.setColumnLength(rs.getInt("COLUMN_SIZE"));
                column.setColumnComment(rs.getString("REMARKS"));
                columnList.add(column);
            }
            eppdevTable.setColumnList(columnList);
            rs.close();

            /***********************************
             * 三、读取主键信息
             ***********************************/
            rs = conn.getMetaData().getPrimaryKeys(null, null, eppdevTable.getTableName());
            while (rs.next()) {
                String primaryKeyColumnName = rs.getString("COLUMN_NAME");
                for (EppdevColumn column : eppdevTable.getColumnList()) {
                    if (column.getColumnName().equals(primaryKeyColumnName)) {
                        column.setPrimaryKeyFlag(1);
                    }
                }
            }

            /***********************************
             * 四、处理索引信息
             ***********************************/
            rs = conn.getMetaData().getIndexInfo(null, null, eppdevTable.getTableName(), false, true);

            // 4.1 依次读取数据
            Map<String, List<Map<String, Object>>> indexMap = new HashMap<>();
            while (rs.next()) {
                String indexName = rs.getString("INDEX_NAME");
                String columnName = rs.getString("COLUMN_NAME");
                int indexPosition = rs.getInt("ORDINAL_POSITION");
                Map<String, Object> columnInfoMap = new HashMap<>();
                columnInfoMap.put("columnName", columnName);
                columnInfoMap.put("indexPosition", indexPosition);
                if (indexMap.containsKey(indexName)) {
                    List<Map<String, Object>> list = indexMap.get(indexName);
                    list.add(columnInfoMap);
                } else {
                    List<Map<String, Object>> list = new ArrayList<>();
                    list.add(columnInfoMap);
                    indexMap.put(indexName, list);
                }
            }
            rs.close();

            // 4.2 处理索引信息数据，进行数据还原
            List<EppdevIndex> indexList = new ArrayList<>();
            for (String idxName : indexMap.keySet()) {
                StringBuilder sb = new StringBuilder();
                List<Map<String, Object>> colList = indexMap.get(idxName);
                colList.sort(new Comparator<Map<String, Object>>() {
                    @Override
                    public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                        return ((Integer) o1.get("indexPosition")).compareTo((Integer) o2.get("indexPosition"));
                    }
                });
                for (Map<String, Object> map : colList) {
                    sb.append(map.get("columnName") + ",");
                }
                String indexColumns = StringUtils.removeEnd(sb.toString(), ",");
                EppdevIndex index = new EppdevIndex();
                index.setIndexName(idxName);
                index.setColumnNames(indexColumns);
                indexList.add(index);
            }
            eppdevTable.setIndexList(indexList);
            conn.close();
            return eppdevTable;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<EppdevTable> listTablesFromConn() {
        List<EppdevTable> eppdevTableList = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            String[] tableTypes = { "TABLE", "VIEW" };
            ResultSet rs = conn.getMetaData().getTables(null, null, null, tableTypes);
            // 表信息
            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                eppdevTableList.add(getTableFromConn(tableName));
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eppdevTableList;
    }

    @Transactional(readOnly = false)
    public void updateTableInfo() {
        List<EppdevTable> eppdevTableList = listTablesFromConn();
        logger.debug("eppdevTableList:{}", JSONUtils.toJson(eppdevTableList));

        for (EppdevTable table : eppdevTableList) {
            updateTableInfo(table);
        }

    }

    /**
     * 根据表名进行数据更新
     * @param tableName 更新数据
     */
    public void  updateTableInfo(String tableName){
        logger.debug("tableName: {}", tableName);
        updateTableInfo(getTableFromConn(tableName));
    }

    /**
     * 更新物理表信息到配置数据中
     * @param table 读取到的物理表信息
     */
    public void updateTableInfo(EppdevTable table){
        logger.debug("table:{}", table);
            // 处理表信息
            String tableId = null;
            String tableName = table.getTableName();
            EppdevTableParam table1Param = new EppdevTableParam();
            table1Param.setTableName(tableName);
            table1Param.setVersionId(EppdevVersion.MASTER_VERSION_ID);
            List<EppdevTable> resultList = tableService.list(table1Param).getList();
            if (resultList.size() > 1) {
                throw new RuntimeException("内部错误，重复表：" + tableName);
            } else if (resultList.size() == 1) {
                tableId = resultList.get(0).getId();
            } else {
                tableService.save(table);
                tableId = table.getId();
            }

            // 处理字段信息
            EppdevColumnParam columnParm = new EppdevColumnParam();
            columnParm.setTableId(tableId);
            List<EppdevColumn> columnListOrigin = columnService.list(columnParm).getList();
            logger.debug("columnListOrigin: {}", columnListOrigin);
            List<EppdevColumn> columnListNew = table.getColumnList();
            logger.debug("columnListNew: {}", columnListNew);

            // 记录sortIndex
            int sortIndex = 2;
            for (EppdevColumn column : columnListOrigin) {
                if (column.getSortIndex() > sortIndex && column.getSortIndex() < 9999) {
                    sortIndex = column.getSortIndex() + 1;
                }
            }

            // 物理库表中列信息与_eppdev_column表中的数据进行对比
            for (EppdevColumn column : columnListNew) {
                logger.debug("column: {}", column);
                boolean exists = false;
                column.setTableId(tableId);
                String newType = TypeMapperUtils.getStdTypeFromDb(column.getColumnType(), confService.getDbType());
                if (column.getColumnType() == null) {
                    logger.error("Error when generate columnType: {}", column);
                    throw new RuntimeException("库表类型暂不支持：" + column.getColumnType());
                }
                column.setColumnType(newType);

                for (EppdevColumn originColumn : columnListOrigin) {
                    if (column.getColumnName().equals(originColumn.getColumnName())) {
                        if (!column.getColumnType().equals(originColumn.getColumnType()) // 类型不同
                                || (TypeMapperUtils.getNeedLength(column.getColumnType()) // 长度有意义且长度不一致
                                        && column.getColumnLength() != originColumn.getColumnLength())) {
                            originColumn.setColumnType(column.getColumnType());
                            if (null != column.getColumnComment() && column.getColumnComment().trim().length() > 0) {
                                originColumn.setColumnComment(column.getColumnComment());
                            }
                            columnService.save(originColumn);
                        }
                        exists = true;
                        break;
                    }
                }
                if (!exists) {

                    // sortIndex
                    int sortIdx = TypeMapperUtils.getDefaultSortIndex(column.getColumnName());
                    if (sortIdx > 0) {
                        column.setSortIndex(sortIdx);
                    } else {
                        column.setSortIndex(sortIndex++);
                    }

                    // primaryKeyFlag
                    if (column.getPrimaryKeyFlag() == null) {
                        column.setPrimaryKeyFlag(0);
                    }

                    // logicKeyFlag
                    column.setLogicKeyFlag(0);

                    // createEqualFlag
                    if (column.getColumnName().equals("id") || column.getColumnName().equals("del_flag")) {
                        column.setCreateEqualFlag(1);
                    } else {
                        column.setCreateEqualFlag(0);
                    }

                    // createFlag
                    column.setCreateInFlag(0);
                    column.setCreateLikeFlag(0);
                    column.setCreateLeftLikeFlag(0);
                    column.setCreateCompareFlag(0);

                    columnService.save(column);
                }

            }

            // _eppdev_column表中的数据与物理库表信息进行对比
            for (EppdevColumn column : columnListOrigin) {
                boolean exists = false;
                for (EppdevColumn newColumn : columnListNew) {
                    if (column.getColumnName().equals(newColumn.getColumnName())) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    columnService.delete(column.getId());
                }
            }

            // 处理索引信息
            for (EppdevIndex idx : table.getIndexList()) {
                idx.setTableId(tableId);
                indexService.save(idx);
            }
    }

}

