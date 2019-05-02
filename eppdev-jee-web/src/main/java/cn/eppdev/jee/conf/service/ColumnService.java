/* FileName: ColumnService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.ColumnTypeInfo;
import cn.eppdev.jee.cg.service.ColumnGeneratorService;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
@Transactional(readOnly = true)
public class ColumnService {
    static Logger logger = LoggerFactory.getLogger(ColumnService.class);

    @Autowired
    EppdevColumnService eppdevColumnService;

    @Autowired
    EppdevConfService eppdevConfService;

    @Autowired
    ColumnGeneratorService generatorService;

    public RestResult<EppdevColumn> get(String id) {
        try {
            EppdevColumn eppdevColumn = eppdevColumnService.get(id);
            if (eppdevColumn != null) {
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", eppdevColumn);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Column NOT exists?", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    @Transactional(readOnly = false)
    public RestResult<String> add(EppdevColumn eppdevColumn) {
        try {
            List<EppdevColumn> list = eppdevColumnService.listByTableId(eppdevColumn.getTableId());
            int maxSortIndex = 1;
            for (EppdevColumn column: list) {
                if (column.getSortIndex() < 10000 && column.getSortIndex() > 1){
                    maxSortIndex = column.getSortIndex();
                }
            }
            eppdevColumn.setSortIndex(maxSortIndex + 1);
            int cnt = eppdevColumnService.save(eppdevColumn);
            if (cnt == 1) {
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", eppdevColumn.getId());
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Column name exists?", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    @Transactional(readOnly = false)
    public RestResult<Integer> update(EppdevColumn eppdevColumn) {
        try {
            int cnt = eppdevColumnService.save(eppdevColumn);
            if (cnt == 1) {
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Column NOT exists?", 0);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }


    @Transactional(readOnly = false)
    public RestResult<Integer> delete(String id) {
        try {
            int cnt = eppdevColumnService.delete(id);
            if (cnt == 1) {
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Column NOT exists?", 0);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

    public List<ColumnTypeInfo> getTypeInfoList(){
        return generatorService.listAllColumnType(eppdevConfService.getDbType());
    }
}
