/* FileName: EppdevColumnService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import cn.eppdev.jee.conf.service.auto._EppdevColumnService;
import cn.eppdev.jee.utils.NameUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevColumnService extends _EppdevColumnService {

    @Override
    public void customeInit(EppdevColumn entity) {
        if (entity.getOriginColumnId() == null || entity.getOriginColumnId().length() == 0) {
            entity.setOriginColumnId(entity.getId());
        }
        if (entity.getPropertyName() == null || entity.getPropertyName().length() == 0){
            entity.setPropertyName(NameUtils.getPropertyName(entity.getColumnName()));
        }
    }

    /**
     * list all the columns in a table
     *
     * @param tableId table id
     * @return columns list
     */
    public List<EppdevColumn> listByTableId(String tableId) {
        EppdevColumnParam param = new EppdevColumnParam();
        param.setTableId(tableId);
        param.buildOrderBy(EppdevColumn.COLUMN_SORT_INDEX_, EppdevColumn.COLUMN_UPDATE_DATE_DESC_);
        return list(param).getList();
    }

}
