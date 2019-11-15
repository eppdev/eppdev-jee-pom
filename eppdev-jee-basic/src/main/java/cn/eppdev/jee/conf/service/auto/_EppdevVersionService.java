/* FileName: EppdevVersionService.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
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
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevVersionDao;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_version对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevVersionService extends BasicService<EppdevVersion, EppdevVersionParam> {

    @Autowired
    EppdevVersionDao dao;

    @Override
    public EppdevVersionDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevVersion entity) {


        return false;
    }

}
