/* FileName: _EppdevColumnDao.java
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
    - 修改字段:create_count_distinct_in_groupby_flag
    - 修改字段:create_cnt_dist_in_groupby_flag
----------------------------------------------------
  修改人：jinlong.hao
  修改时间：2019-08-11
  修改类型：修改库表
  修改内容：
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_min_in_groupby_flag
    - 修改字段:group_by_param_flag
    - 修改表信息：_eppdev_column
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_min_in_groupby_flag
----------------------------------------------------
  修改人：jinlong.hao
  修改时间：2019-08-11
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_column对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevColumnDao extends BasicDao<EppdevColumn, EppdevColumnParam> {
    public int realDelete(@Param("id") String id);

}
