/* FileName: _EppdevTableLogDao.java
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
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_table_log对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevTableLogDao extends BasicDao<EppdevTableLog, EppdevTableLogParam> {
    public int realDelete(@Param("id") String id);

}
