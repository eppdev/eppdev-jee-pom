/* FileName: EppdevTableLogService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevTableLogDao;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_table_log对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevTableLogService extends BasicService<EppdevTableLog, EppdevTableLogParam> {

    @Autowired
    EppdevTableLogDao dao;

    @Override
    public EppdevTableLogDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevTableLog entity) {


        return false;
    }

}
