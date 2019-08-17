/* FileName: EppdevColumnParam.java
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
    - 修改表信息：_eppdev_column
    - 修改字段:table_id
    - 修改字段:column_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_column对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevColumnParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_id
    private String tableId;

    // properties for column_name
    private String columnName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for column_name
    public String getColumnName() {
        return columnName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // setters for column_name
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
