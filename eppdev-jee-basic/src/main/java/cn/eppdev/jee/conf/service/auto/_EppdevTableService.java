/* FileName: EppdevTableService.java
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
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevTableDao;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_table对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevTableService extends BasicService<EppdevTable, EppdevTableParam> {

    @Autowired
    EppdevTableDao dao;

    @Override
    public EppdevTableDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevTable entity) {


        return false;
    }

}
