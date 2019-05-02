/* FileName: _EppdevUser.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity.auto;

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

    // static properties for password_hex
    public static final String COLUMN_PASSWORD_HEX_ = "password_hex";
    public static final String COLUMN_PASSWORD_HEX_ASC_ = "password_hex asc";
    public static final String COLUMN_PASSWORD_HEX_DESC_ = "password_hex desc";



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
        return loginName;
    }

    // getters for password_hex
    public String getPasswordHex() {
        return passwordHex;
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
