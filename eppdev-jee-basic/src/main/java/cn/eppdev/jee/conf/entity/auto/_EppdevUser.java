/* FileName: _EppdevUser.java
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
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_user对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevUser extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for login_name
    public static final String COLUMN_LOGIN_NAME_ = "login_name";
    public static final String COLUMN_LOGIN_NAME_ASC_ = "login_name asc";
    public static final String COLUMN_LOGIN_NAME_DESC_ = "login_name desc";
    public static final ColumnEntity COLUMN_ENTITY_LOGIN_NAME_ = new ColumnEntity("login_name", "loginName");

    // static properties for password_hex
    public static final String COLUMN_PASSWORD_HEX_ = "password_hex";
    public static final String COLUMN_PASSWORD_HEX_ASC_ = "password_hex asc";
    public static final String COLUMN_PASSWORD_HEX_DESC_ = "password_hex desc";
    public static final ColumnEntity COLUMN_ENTITY_PASSWORD_HEX_ = new ColumnEntity("password_hex", "passwordHex");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for login_name
    private String loginName;

    // properties for password_hex
    private String passwordHex;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for login_name
    public String getLoginName() {
        return this.loginName;
    }

    // getters for password_hex
    public String getPasswordHex() {
        return this.passwordHex;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for login_name
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    // getters for password_hex
    public void setPasswordHex(String passwordHex) {
        this.passwordHex = passwordHex;
    }

}
