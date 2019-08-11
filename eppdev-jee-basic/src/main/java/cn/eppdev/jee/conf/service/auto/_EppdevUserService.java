/* FileName: EppdevUserService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-11
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevUserDao;
import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.param.EppdevUserParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_user对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevUserService extends BasicService<EppdevUser, EppdevUserParam> {

    @Autowired
    EppdevUserDao dao;

    @Override
    public EppdevUserDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevUser entity) {

        // 判断逻辑主键
        EppdevUserParam param = new EppdevUserParam();
        param.setLoginName(entity.getLoginName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevUser> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
