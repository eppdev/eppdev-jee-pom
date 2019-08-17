/* FileName: EppdevIndexParam.java
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
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_index对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevIndexParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_id
    private String tableId;

    // properties for index_name
    private String indexName;

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

    // getters for index_name
    public String getIndexName() {
        return indexName;
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

    // setters for index_name
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
