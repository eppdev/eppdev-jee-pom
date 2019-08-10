/* FileName: EppdevTableLogService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import cn.eppdev.jee.conf.service.auto._EppdevTableLogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevTableLogService extends _EppdevTableLogService {

    @Override
    public void customeInit(EppdevTableLog entity) {
    }


    /**
     * 根据tableId获取更新历史
     * @param tableId 表id
     * @return 字段更新历史
     */
    public List<EppdevTableLog> listByTableId(String tableId) {
        EppdevTableLogParam param = new EppdevTableLogParam();
        param.setTableId(tableId);
        param.buildOrderBy(EppdevTableLog.COLUMN_CREATE_DATE_DESC_);
        return list(param).getList();
    }

}
