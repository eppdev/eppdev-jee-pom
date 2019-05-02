/* FileName: EppdevColumn.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevColumn;

/**
 * @author jinlong.hao
 */
public class EppdevColumn extends _EppdevColumn{
    private String dbColumnType;

    private String javaType;

    private EppdevTable table;

    public String getDbColumnType() {
        return dbColumnType;
    }

    public void setDbColumnType(String dbColumnType) {
        this.dbColumnType = dbColumnType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public EppdevTable getTable() {
        return table;
    }

    public void setTable(EppdevTable table) {
        this.table = table;
    }
}
