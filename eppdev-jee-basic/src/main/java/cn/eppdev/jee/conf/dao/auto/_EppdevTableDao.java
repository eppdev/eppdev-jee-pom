/* FileName: _EppdevTableDao.java
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
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_table对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevTableDao extends BasicDao<EppdevTable, EppdevTableParam> {
    public int realDelete(@Param("id") String id);

}
