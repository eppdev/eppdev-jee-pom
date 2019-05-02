/* FileName: EppdevConfService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevConfDao;
import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_conf对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevConfService extends BasicService<EppdevConf, EppdevConfParam> {

    @Autowired
    EppdevConfDao dao;

    @Override
    public EppdevConfDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevConf entity) {

        // 判断逻辑主键
        EppdevConfParam param = new EppdevConfParam();
        param.setConfName(entity.getConfName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevConf> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
