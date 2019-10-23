/* FileName: _EppdevConf.java
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
    - 修改表信息：_eppdev_conf
    - 修改字段:conf_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_conf对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevConf extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for conf_name
    public static final String COLUMN_CONF_NAME_ = "conf_name";
    public static final String COLUMN_CONF_NAME_ASC_ = "conf_name asc";
    public static final String COLUMN_CONF_NAME_DESC_ = "conf_name desc";
    public static final ColumnEntity COLUMN_ENTITY_CONF_NAME_ = new ColumnEntity("conf_name", "confName");

    // static properties for conf_value
    public static final String COLUMN_CONF_VALUE_ = "conf_value";
    public static final String COLUMN_CONF_VALUE_ASC_ = "conf_value asc";
    public static final String COLUMN_CONF_VALUE_DESC_ = "conf_value desc";
    public static final ColumnEntity COLUMN_ENTITY_CONF_VALUE_ = new ColumnEntity("conf_value", "confValue");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for conf_name
    private String confName;

    // properties for conf_value
    private String confValue;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for conf_name
    public String getConfName() {
        return this.confName;
    }

    // getters for conf_value
    public String getConfValue() {
        return this.confValue;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for conf_name
    public void setConfName(String confName) {
        this.confName = confName;
    }

    // getters for conf_value
    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }

}
