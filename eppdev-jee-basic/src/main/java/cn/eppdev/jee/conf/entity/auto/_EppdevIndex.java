/* FileName: _EppdevIndex.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_index对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevIndex extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_id
    public static final String COLUMN_TABLE_ID_ = "table_id";
    public static final String COLUMN_TABLE_ID_ASC_ = "table_id asc";
    public static final String COLUMN_TABLE_ID_DESC_ = "table_id desc";

    // static properties for index_name
    public static final String COLUMN_INDEX_NAME_ = "index_name";
    public static final String COLUMN_INDEX_NAME_ASC_ = "index_name asc";
    public static final String COLUMN_INDEX_NAME_DESC_ = "index_name desc";

    // static properties for column_names
    public static final String COLUMN_COLUMN_NAMES_ = "column_names";
    public static final String COLUMN_COLUMN_NAMES_ASC_ = "column_names asc";
    public static final String COLUMN_COLUMN_NAMES_DESC_ = "column_names desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_id
    private String tableId;

    // properties for index_name
    private String indexName;

    // properties for column_names
    private String columnNames;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for index_name
    public String getIndexName() {
        return indexName;
    }

    // getters for column_names
    public String getColumnNames() {
        return columnNames;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // getters for index_name
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    // getters for column_names
    public void setColumnNames(String columnNames) {
        this.columnNames = columnNames;
    }

}
