/* FileName: EppdevVersionService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

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

        // 判断逻辑主键
        EppdevVersionParam param = new EppdevVersionParam();
        param.setVersionName(entity.getVersionName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevVersion> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
