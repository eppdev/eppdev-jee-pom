/* FileName: _EppdevTableLog.java
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
    - 修改表信息：_eppdev_table_log
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_table_log对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTableLog extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_id
    public static final String COLUMN_TABLE_ID_ = "table_id";
    public static final String COLUMN_TABLE_ID_ASC_ = "table_id asc";
    public static final String COLUMN_TABLE_ID_DESC_ = "table_id desc";

    // static properties for author_name
    public static final String COLUMN_AUTHOR_NAME_ = "author_name";
    public static final String COLUMN_AUTHOR_NAME_ASC_ = "author_name asc";
    public static final String COLUMN_AUTHOR_NAME_DESC_ = "author_name desc";

    // static properties for oper_type
    public static final String COLUMN_OPER_TYPE_ = "oper_type";
    public static final String COLUMN_OPER_TYPE_ASC_ = "oper_type asc";
    public static final String COLUMN_OPER_TYPE_DESC_ = "oper_type desc";

    // static properties for oper_content
    public static final String COLUMN_OPER_CONTENT_ = "oper_content";
    public static final String COLUMN_OPER_CONTENT_ASC_ = "oper_content asc";
    public static final String COLUMN_OPER_CONTENT_DESC_ = "oper_content desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_id
    private String tableId;

    // properties for author_name
    private String authorName;

    // properties for oper_type
    private String operType;

    // properties for oper_content
    private String operContent;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for author_name
    public String getAuthorName() {
        return authorName;
    }

    // getters for oper_type
    public String getOperType() {
        return operType;
    }

    // getters for oper_content
    public String getOperContent() {
        return operContent;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // getters for author_name
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // getters for oper_type
    public void setOperType(String operType) {
        this.operType = operType;
    }

    // getters for oper_content
    public void setOperContent(String operContent) {
        this.operContent = operContent;
    }

}
