/* FileName: EppdevTableService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import cn.eppdev.jee.conf.service.auto._EppdevTableService;
import cn.eppdev.jee.utils.NameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevTableService extends _EppdevTableService {

    @Autowired
    EppdevColumnService columnService;

    @Autowired
    EppdevIndexService indexService;

    @Autowired
    EppdevConfService confService;

    @Autowired
    EppdevTableLogService tableLogService;

    @Override
    public void customeInit(EppdevTable entity) {
        // 初始化originId
        if (entity.getOriginTableId() == null || entity.getOriginTableId().length() == 0){
            entity.setOriginTableId(entity.getId());
        }

        // 初始化entityName
        if (entity.getEntityName() == null || entity.getEntityName().length() == 0){
            entity.setEntityName(NameUtils.getEntityName(entity.getTableName()));
        }

        // 初始化moduleName
        if (entity.getModuleName() == null || entity.getModuleName().length() == 0){
            String[] str = entity.getTableName().split("_");
            if (str.length > 1){
                entity.setModuleName(str[0]);
            }
        }
    }


    /**
     * list tables for the specified version
     * @param versionId version id
     * @return all the tables in this version
     */
    public List<EppdevTable> listByVersionId(String versionId){
        EppdevTableParam param = new EppdevTableParam();
        param.setVersionId(versionId);
        param.buildOrderBy(EppdevTable.COLUMN_MODULE_NAME_, EppdevTable.COLUMN_TABLE_NAME_);
        return list(param).getList();
    }

    @Override
    public EppdevTable get(String id) {
        EppdevTable table = super.get(id);
        if (table != null){
            table.setColumnList(columnService.listByTableId(id));
            table.setIndexList(indexService.listByTableId(id));
            table.setBasicConf(confService.getAllConf());
            table.setLogList(tableLogService.listByTableId(id));
        }
        return table;
    }



}
