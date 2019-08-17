/* FileName: _EppdevIndexDao.java
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
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_index对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevIndexDao extends BasicDao<EppdevIndex, EppdevIndexParam> {
    public int realDelete(@Param("id") String id);

}
