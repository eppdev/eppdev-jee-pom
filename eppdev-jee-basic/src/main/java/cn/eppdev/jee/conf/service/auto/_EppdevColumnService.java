/* FileName: EppdevColumnService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevColumnDao;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_column对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevColumnService extends BasicService<EppdevColumn, EppdevColumnParam> {

    @Autowired
    EppdevColumnDao dao;

    @Override
    public EppdevColumnDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevColumn entity) {

        // 判断逻辑主键
        EppdevColumnParam param = new EppdevColumnParam();
        param.setTableId(entity.getTableId());
        param.setColumnName(entity.getColumnName());
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<EppdevColumn> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            if (pageInfo.getList().get(0).getId().equals(entity.getId())){
                return false;
            }
            return true;
        }

        return false;
    }

}
