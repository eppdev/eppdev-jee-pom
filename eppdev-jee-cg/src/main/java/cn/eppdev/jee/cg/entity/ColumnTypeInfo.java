/* FileName: ColumnTypeInfo.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class ColumnTypeInfo {
    static Logger logger = LoggerFactory.getLogger(ColumnTypeInfo.class);

    String columnType;

    String javaType;

    String dbColumnType;

    public ColumnTypeInfo(String columnType, String javaType) {
        this.columnType = columnType;
        this.javaType= javaType;
    }

    public ColumnTypeInfo(String columnType, String javaType, String dbColumnType) {
        this.columnType = columnType;
        this.javaType = javaType;
        this.dbColumnType = dbColumnType;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getDbColumnType() {
        return dbColumnType;
    }

    public void setDbColumnType(String dbColumnType) {
        this.dbColumnType = dbColumnType;
    }
}
