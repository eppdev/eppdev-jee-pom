/* FileName: _EppdevColumn.java
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
    - 修改字段:create_count_distinct_in_groupby_flag
    - 修改字段:create_cnt_dist_in_groupby_flag
----------------------------------------------------
  修改人：jinlong.hao
  修改时间：2019-08-11
  修改类型：修改库表
  修改内容：
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_min_in_groupby_flag
    - 修改字段:group_by_param_flag
    - 修改表信息：_eppdev_column
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_min_in_groupby_flag
----------------------------------------------------
  修改人：jinlong.hao
  修改时间：2019-08-11
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:create_sum_in_groupby_flag
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
    - 修改字段:group_by_param_flag
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_column对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevColumn extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_id
    public static final String COLUMN_TABLE_ID_ = "table_id";
    public static final String COLUMN_TABLE_ID_ASC_ = "table_id asc";
    public static final String COLUMN_TABLE_ID_DESC_ = "table_id desc";

    // static properties for column_name
    public static final String COLUMN_COLUMN_NAME_ = "column_name";
    public static final String COLUMN_COLUMN_NAME_ASC_ = "column_name asc";
    public static final String COLUMN_COLUMN_NAME_DESC_ = "column_name desc";

    // static properties for column_type
    public static final String COLUMN_COLUMN_TYPE_ = "column_type";
    public static final String COLUMN_COLUMN_TYPE_ASC_ = "column_type asc";
    public static final String COLUMN_COLUMN_TYPE_DESC_ = "column_type desc";

    // static properties for column_length
    public static final String COLUMN_COLUMN_LENGTH_ = "column_length";
    public static final String COLUMN_COLUMN_LENGTH_ASC_ = "column_length asc";
    public static final String COLUMN_COLUMN_LENGTH_DESC_ = "column_length desc";

    // static properties for sort_index
    public static final String COLUMN_SORT_INDEX_ = "sort_index";
    public static final String COLUMN_SORT_INDEX_ASC_ = "sort_index asc";
    public static final String COLUMN_SORT_INDEX_DESC_ = "sort_index desc";

    // static properties for primary_key_flag
    public static final String COLUMN_PRIMARY_KEY_FLAG_ = "primary_key_flag";
    public static final String COLUMN_PRIMARY_KEY_FLAG_ASC_ = "primary_key_flag asc";
    public static final String COLUMN_PRIMARY_KEY_FLAG_DESC_ = "primary_key_flag desc";

    // static properties for logic_key_flag
    public static final String COLUMN_LOGIC_KEY_FLAG_ = "logic_key_flag";
    public static final String COLUMN_LOGIC_KEY_FLAG_ASC_ = "logic_key_flag asc";
    public static final String COLUMN_LOGIC_KEY_FLAG_DESC_ = "logic_key_flag desc";

    // static properties for column_comment
    public static final String COLUMN_COLUMN_COMMENT_ = "column_comment";
    public static final String COLUMN_COLUMN_COMMENT_ASC_ = "column_comment asc";
    public static final String COLUMN_COLUMN_COMMENT_DESC_ = "column_comment desc";

    // static properties for property_name
    public static final String COLUMN_PROPERTY_NAME_ = "property_name";
    public static final String COLUMN_PROPERTY_NAME_ASC_ = "property_name asc";
    public static final String COLUMN_PROPERTY_NAME_DESC_ = "property_name desc";

    // static properties for java_type
    public static final String COLUMN_JAVA_TYPE_ = "java_type";
    public static final String COLUMN_JAVA_TYPE_ASC_ = "java_type asc";
    public static final String COLUMN_JAVA_TYPE_DESC_ = "java_type desc";

    // static properties for origin_column_id
    public static final String COLUMN_ORIGIN_COLUMN_ID_ = "origin_column_id";
    public static final String COLUMN_ORIGIN_COLUMN_ID_ASC_ = "origin_column_id asc";
    public static final String COLUMN_ORIGIN_COLUMN_ID_DESC_ = "origin_column_id desc";

    // static properties for create_equal_flag
    public static final String COLUMN_CREATE_EQUAL_FLAG_ = "create_equal_flag";
    public static final String COLUMN_CREATE_EQUAL_FLAG_ASC_ = "create_equal_flag asc";
    public static final String COLUMN_CREATE_EQUAL_FLAG_DESC_ = "create_equal_flag desc";

    // static properties for create_like_flag
    public static final String COLUMN_CREATE_LIKE_FLAG_ = "create_like_flag";
    public static final String COLUMN_CREATE_LIKE_FLAG_ASC_ = "create_like_flag asc";
    public static final String COLUMN_CREATE_LIKE_FLAG_DESC_ = "create_like_flag desc";

    // static properties for create_left_like_flag
    public static final String COLUMN_CREATE_LEFT_LIKE_FLAG_ = "create_left_like_flag";
    public static final String COLUMN_CREATE_LEFT_LIKE_FLAG_ASC_ = "create_left_like_flag asc";
    public static final String COLUMN_CREATE_LEFT_LIKE_FLAG_DESC_ = "create_left_like_flag desc";

    // static properties for create_in_flag
    public static final String COLUMN_CREATE_IN_FLAG_ = "create_in_flag";
    public static final String COLUMN_CREATE_IN_FLAG_ASC_ = "create_in_flag asc";
    public static final String COLUMN_CREATE_IN_FLAG_DESC_ = "create_in_flag desc";

    // static properties for create_compare_flag
    public static final String COLUMN_CREATE_COMPARE_FLAG_ = "create_compare_flag";
    public static final String COLUMN_CREATE_COMPARE_FLAG_ASC_ = "create_compare_flag asc";
    public static final String COLUMN_CREATE_COMPARE_FLAG_DESC_ = "create_compare_flag desc";

    // static properties for create_cnt_dist_in_groupby_flag
    public static final String COLUMN_CREATE_CNT_DIST_IN_GROUPBY_FLAG_ = "create_cnt_dist_in_groupby_flag";
    public static final String COLUMN_CREATE_CNT_DIST_IN_GROUPBY_FLAG_ASC_ = "create_cnt_dist_in_groupby_flag asc";
    public static final String COLUMN_CREATE_CNT_DIST_IN_GROUPBY_FLAG_DESC_ = "create_cnt_dist_in_groupby_flag desc";

    // static properties for create_avg_in_groupby_flag
    public static final String COLUMN_CREATE_AVG_IN_GROUPBY_FLAG_ = "create_avg_in_groupby_flag";
    public static final String COLUMN_CREATE_AVG_IN_GROUPBY_FLAG_ASC_ = "create_avg_in_groupby_flag asc";
    public static final String COLUMN_CREATE_AVG_IN_GROUPBY_FLAG_DESC_ = "create_avg_in_groupby_flag desc";

    // static properties for create_sum_in_groupby_flag
    public static final String COLUMN_CREATE_SUM_IN_GROUPBY_FLAG_ = "create_sum_in_groupby_flag";
    public static final String COLUMN_CREATE_SUM_IN_GROUPBY_FLAG_ASC_ = "create_sum_in_groupby_flag asc";
    public static final String COLUMN_CREATE_SUM_IN_GROUPBY_FLAG_DESC_ = "create_sum_in_groupby_flag desc";

    // static properties for create_min_in_groupby_flag
    public static final String COLUMN_CREATE_MIN_IN_GROUPBY_FLAG_ = "create_min_in_groupby_flag";
    public static final String COLUMN_CREATE_MIN_IN_GROUPBY_FLAG_ASC_ = "create_min_in_groupby_flag asc";
    public static final String COLUMN_CREATE_MIN_IN_GROUPBY_FLAG_DESC_ = "create_min_in_groupby_flag desc";

    // static properties for create_max_in_groupby_flag
    public static final String COLUMN_CREATE_MAX_IN_GROUPBY_FLAG_ = "create_max_in_groupby_flag";
    public static final String COLUMN_CREATE_MAX_IN_GROUPBY_FLAG_ASC_ = "create_max_in_groupby_flag asc";
    public static final String COLUMN_CREATE_MAX_IN_GROUPBY_FLAG_DESC_ = "create_max_in_groupby_flag desc";



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_id
    private String tableId;

    // properties for column_name
    private String columnName;

    // properties for column_type
    private String columnType;

    // properties for column_length
    private Integer columnLength;

    // properties for sort_index
    private Integer sortIndex;

    // properties for primary_key_flag
    private Integer primaryKeyFlag;

    // properties for logic_key_flag
    private Integer logicKeyFlag;

    // properties for column_comment
    private String columnComment;

    // properties for property_name
    private String propertyName;

    // properties for java_type
    private String javaType;

    // properties for origin_column_id
    private String originColumnId;

    // properties for create_equal_flag
    private Integer createEqualFlag;

    // properties for create_like_flag
    private Integer createLikeFlag;

    // properties for create_left_like_flag
    private Integer createLeftLikeFlag;

    // properties for create_in_flag
    private Integer createInFlag;

    // properties for create_compare_flag
    private Integer createCompareFlag;

    // properties for create_cnt_dist_in_groupby_flag
    private Integer createCntDistInGroupbyFlag;

    // properties for create_avg_in_groupby_flag
    private Integer createAvgInGroupbyFlag;

    // properties for create_sum_in_groupby_flag
    private Integer createSumInGroupbyFlag;

    // properties for create_min_in_groupby_flag
    private Integer createMinInGroupbyFlag;

    // properties for create_max_in_groupby_flag
    private Integer createMaxInGroupbyFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for column_name
    public String getColumnName() {
        return columnName;
    }

    // getters for column_type
    public String getColumnType() {
        return columnType;
    }

    // getters for column_length
    public Integer getColumnLength() {
        return columnLength;
    }

    // getters for sort_index
    public Integer getSortIndex() {
        return sortIndex;
    }

    // getters for primary_key_flag
    public Integer getPrimaryKeyFlag() {
        return primaryKeyFlag;
    }

    // getters for logic_key_flag
    public Integer getLogicKeyFlag() {
        return logicKeyFlag;
    }

    // getters for column_comment
    public String getColumnComment() {
        return columnComment;
    }

    // getters for property_name
    public String getPropertyName() {
        return propertyName;
    }

    // getters for java_type
    public String getJavaType() {
        return javaType;
    }

    // getters for origin_column_id
    public String getOriginColumnId() {
        return originColumnId;
    }

    // getters for create_equal_flag
    public Integer getCreateEqualFlag() {
        return createEqualFlag;
    }

    // getters for create_like_flag
    public Integer getCreateLikeFlag() {
        return createLikeFlag;
    }

    // getters for create_left_like_flag
    public Integer getCreateLeftLikeFlag() {
        return createLeftLikeFlag;
    }

    // getters for create_in_flag
    public Integer getCreateInFlag() {
        return createInFlag;
    }

    // getters for create_compare_flag
    public Integer getCreateCompareFlag() {
        return createCompareFlag;
    }

    // getters for create_cnt_dist_in_groupby_flag
    public Integer getCreateCntDistInGroupbyFlag() {
        return createCntDistInGroupbyFlag;
    }

    // getters for create_avg_in_groupby_flag
    public Integer getCreateAvgInGroupbyFlag() {
        return createAvgInGroupbyFlag;
    }

    // getters for create_sum_in_groupby_flag
    public Integer getCreateSumInGroupbyFlag() {
        return createSumInGroupbyFlag;
    }

    // getters for create_min_in_groupby_flag
    public Integer getCreateMinInGroupbyFlag() {
        return createMinInGroupbyFlag;
    }

    // getters for create_max_in_groupby_flag
    public Integer getCreateMaxInGroupbyFlag() {
        return createMaxInGroupbyFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // getters for column_name
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    // getters for column_type
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    // getters for column_length
    public void setColumnLength(Integer columnLength) {
        this.columnLength = columnLength;
    }

    // getters for sort_index
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    // getters for primary_key_flag
    public void setPrimaryKeyFlag(Integer primaryKeyFlag) {
        this.primaryKeyFlag = primaryKeyFlag;
    }

    // getters for logic_key_flag
    public void setLogicKeyFlag(Integer logicKeyFlag) {
        this.logicKeyFlag = logicKeyFlag;
    }

    // getters for column_comment
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    // getters for property_name
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    // getters for java_type
    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    // getters for origin_column_id
    public void setOriginColumnId(String originColumnId) {
        this.originColumnId = originColumnId;
    }

    // getters for create_equal_flag
    public void setCreateEqualFlag(Integer createEqualFlag) {
        this.createEqualFlag = createEqualFlag;
    }

    // getters for create_like_flag
    public void setCreateLikeFlag(Integer createLikeFlag) {
        this.createLikeFlag = createLikeFlag;
    }

    // getters for create_left_like_flag
    public void setCreateLeftLikeFlag(Integer createLeftLikeFlag) {
        this.createLeftLikeFlag = createLeftLikeFlag;
    }

    // getters for create_in_flag
    public void setCreateInFlag(Integer createInFlag) {
        this.createInFlag = createInFlag;
    }

    // getters for create_compare_flag
    public void setCreateCompareFlag(Integer createCompareFlag) {
        this.createCompareFlag = createCompareFlag;
    }

    // getters for create_cnt_dist_in_groupby_flag
    public void setCreateCntDistInGroupbyFlag(Integer createCntDistInGroupbyFlag) {
        this.createCntDistInGroupbyFlag = createCntDistInGroupbyFlag;
    }

    // getters for create_avg_in_groupby_flag
    public void setCreateAvgInGroupbyFlag(Integer createAvgInGroupbyFlag) {
        this.createAvgInGroupbyFlag = createAvgInGroupbyFlag;
    }

    // getters for create_sum_in_groupby_flag
    public void setCreateSumInGroupbyFlag(Integer createSumInGroupbyFlag) {
        this.createSumInGroupbyFlag = createSumInGroupbyFlag;
    }

    // getters for create_min_in_groupby_flag
    public void setCreateMinInGroupbyFlag(Integer createMinInGroupbyFlag) {
        this.createMinInGroupbyFlag = createMinInGroupbyFlag;
    }

    // getters for create_max_in_groupby_flag
    public void setCreateMaxInGroupbyFlag(Integer createMaxInGroupbyFlag) {
        this.createMaxInGroupbyFlag = createMaxInGroupbyFlag;
    }

}
