/* FileName: _EppdevTable.java
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
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
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
    public static final ColumnEntity COLUMN_ENTITY_TABLE_NAME_ = new ColumnEntity("table_name", "tableName");

    // static properties for table_comment
    public static final String COLUMN_TABLE_COMMENT_ = "table_comment";
    public static final String COLUMN_TABLE_COMMENT_ASC_ = "table_comment asc";
    public static final String COLUMN_TABLE_COMMENT_DESC_ = "table_comment desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_COMMENT_ = new ColumnEntity("table_comment", "tableComment");

    // static properties for module_name
    public static final String COLUMN_MODULE_NAME_ = "module_name";
    public static final String COLUMN_MODULE_NAME_ASC_ = "module_name asc";
    public static final String COLUMN_MODULE_NAME_DESC_ = "module_name desc";
    public static final ColumnEntity COLUMN_ENTITY_MODULE_NAME_ = new ColumnEntity("module_name", "moduleName");

    // static properties for entity_name
    public static final String COLUMN_ENTITY_NAME_ = "entity_name";
    public static final String COLUMN_ENTITY_NAME_ASC_ = "entity_name asc";
    public static final String COLUMN_ENTITY_NAME_DESC_ = "entity_name desc";
    public static final ColumnEntity COLUMN_ENTITY_ENTITY_NAME_ = new ColumnEntity("entity_name", "entityName");

    // static properties for entity_name_upper
    public static final String COLUMN_ENTITY_NAME_UPPER_ = "entity_name_upper";
    public static final String COLUMN_ENTITY_NAME_UPPER_ASC_ = "entity_name_upper asc";
    public static final String COLUMN_ENTITY_NAME_UPPER_DESC_ = "entity_name_upper desc";
    public static final ColumnEntity COLUMN_ENTITY_ENTITY_NAME_UPPER_ = new ColumnEntity("entity_name_upper", "entityNameUpper");

    // static properties for table_type
    public static final String COLUMN_TABLE_TYPE_ = "table_type";
    public static final String COLUMN_TABLE_TYPE_ASC_ = "table_type asc";
    public static final String COLUMN_TABLE_TYPE_DESC_ = "table_type desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_TYPE_ = new ColumnEntity("table_type", "tableType");

    // static properties for version_id
    public static final String COLUMN_VERSION_ID_ = "version_id";
    public static final String COLUMN_VERSION_ID_ASC_ = "version_id asc";
    public static final String COLUMN_VERSION_ID_DESC_ = "version_id desc";
    public static final ColumnEntity COLUMN_ENTITY_VERSION_ID_ = new ColumnEntity("version_id", "versionId");

    // static properties for create_sql
    public static final String COLUMN_CREATE_SQL_ = "create_sql";
    public static final String COLUMN_CREATE_SQL_ASC_ = "create_sql asc";
    public static final String COLUMN_CREATE_SQL_DESC_ = "create_sql desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_SQL_ = new ColumnEntity("create_sql", "createSql");

    // static properties for origin_table_id
    public static final String COLUMN_ORIGIN_TABLE_ID_ = "origin_table_id";
    public static final String COLUMN_ORIGIN_TABLE_ID_ASC_ = "origin_table_id asc";
    public static final String COLUMN_ORIGIN_TABLE_ID_DESC_ = "origin_table_id desc";
    public static final ColumnEntity COLUMN_ENTITY_ORIGIN_TABLE_ID_ = new ColumnEntity("origin_table_id", "originTableId");



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

    // properties for entity_name_upper
    private String entityNameUpper;

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
        return this.tableName;
    }

    // getters for table_comment
    public String getTableComment() {
        return this.tableComment;
    }

    // getters for module_name
    public String getModuleName() {
        return this.moduleName;
    }

    // getters for entity_name
    public String getEntityName() {
        return this.entityName;
    }

    // getters for entity_name_upper
    public String getEntityNameUpper() {
        return this.entityNameUpper;
    }

    // getters for table_type
    public Integer getTableType() {
        return this.tableType;
    }

    // getters for version_id
    public String getVersionId() {
        return this.versionId;
    }

    // getters for create_sql
    public String getCreateSql() {
        return this.createSql;
    }

    // getters for origin_table_id
    public String getOriginTableId() {
        return this.originTableId;
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

    // getters for entity_name_upper
    public void setEntityNameUpper(String entityNameUpper) {
        this.entityNameUpper = entityNameUpper;
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
