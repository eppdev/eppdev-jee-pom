/* FileName: _EppdevVersion.java
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
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_version对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevVersion extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for version_name
    public static final String COLUMN_VERSION_NAME_ = "version_name";
    public static final String COLUMN_VERSION_NAME_ASC_ = "version_name asc";
    public static final String COLUMN_VERSION_NAME_DESC_ = "version_name desc";
    public static final ColumnEntity COLUMN_ENTITY_VERSION_NAME_ = new ColumnEntity("version_name", "versionName");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for version_name
    private String versionName;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for version_name
    public String getVersionName() {
        return this.versionName;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for version_name
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
