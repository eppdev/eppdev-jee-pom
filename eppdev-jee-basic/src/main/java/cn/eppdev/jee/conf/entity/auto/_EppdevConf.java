/* FileName: _EppdevConf.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity.auto;

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

    // static properties for conf_value
    public static final String COLUMN_CONF_VALUE_ = "conf_value";
    public static final String COLUMN_CONF_VALUE_ASC_ = "conf_value asc";
    public static final String COLUMN_CONF_VALUE_DESC_ = "conf_value desc";



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
        return confName;
    }

    // getters for conf_value
    public String getConfValue() {
        return confValue;
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
