/* FileName: _EppdevTable.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_table对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTable extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_name
    public static final String COLUMN_TABLE_NAME_ = "table_name";
    public static final String COLUMN_TABLE_NAME_ASC_ = "table_name asc";
    public static final String COLUMN_TABLE_NAME_DESC_ = "table_name desc";

    // static properties for table_comment
    public static final String COLUMN_TABLE_COMMENT_ = "table_comment";
    public static final String COLUMN_TABLE_COMMENT_ASC_ = "table_comment asc";
    public static final String COLUMN_TABLE_COMMENT_DESC_ = "table_comment desc";

    // static properties for module_name
    public static final String COLUMN_MODULE_NAME_ = "module_name";
    public static final String COLUMN_MODULE_NAME_ASC_ = "module_name asc";
    public static final String COLUMN_MODULE_NAME_DESC_ = "module_name desc";

    // static properties for entity_name
    public static final String COLUMN_ENTITY_NAME_ = "entity_name";
    public static final String COLUMN_ENTITY_NAME_ASC_ = "entity_name asc";
    public static final String COLUMN_ENTITY_NAME_DESC_ = "entity_name desc";

    // static properties for table_type
    public static final String COLUMN_TABLE_TYPE_ = "table_type";
    public static final String COLUMN_TABLE_TYPE_ASC_ = "table_type asc";
    public static final String COLUMN_TABLE_TYPE_DESC_ = "table_type desc";

    // static properties for version_id
    public static final String COLUMN_VERSION_ID_ = "version_id";
    public static final String COLUMN_VERSION_ID_ASC_ = "version_id asc";
    public static final String COLUMN_VERSION_ID_DESC_ = "version_id desc";

    // static properties for create_sql
    public static final String COLUMN_CREATE_SQL_ = "create_sql";
    public static final String COLUMN_CREATE_SQL_ASC_ = "create_sql asc";
    public static final String COLUMN_CREATE_SQL_DESC_ = "create_sql desc";

    // static properties for origin_table_id
    public static final String COLUMN_ORIGIN_TABLE_ID_ = "origin_table_id";
    public static final String COLUMN_ORIGIN_TABLE_ID_ASC_ = "origin_table_id asc";
    public static final String COLUMN_ORIGIN_TABLE_ID_DESC_ = "origin_table_id desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_name
    private String tableName;

    // properties for table_comment
    private String tableComment;

    // properties for module_name
    private String moduleName;

    // properties for entity_name
    private String entityName;

    // properties for table_type
    private Integer tableType;

    // properties for version_id
    private String versionId;

    // properties for create_sql
    private String createSql;

    // properties for origin_table_id
    private String originTableId;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_name
    public String getTableName() {
        return tableName;
    }

    // getters for table_comment
    public String getTableComment() {
        return tableComment;
    }

    // getters for module_name
    public String getModuleName() {
        return moduleName;
    }

    // getters for entity_name
    public String getEntityName() {
        return entityName;
    }

    // getters for table_type
    public Integer getTableType() {
        return tableType;
    }

    // getters for version_id
    public String getVersionId() {
        return versionId;
    }

    // getters for create_sql
    public String getCreateSql() {
        return createSql;
    }

    // getters for origin_table_id
    public String getOriginTableId() {
        return originTableId;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_name
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    // getters for table_comment
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    // getters for module_name
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    // getters for entity_name
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    // getters for table_type
    public void setTableType(Integer tableType) {
        this.tableType = tableType;
    }

    // getters for version_id
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    // getters for create_sql
    public void setCreateSql(String createSql) {
        this.createSql = createSql;
    }

    // getters for origin_table_id
    public void setOriginTableId(String originTableId) {
        this.originTableId = originTableId;
    }

}
