/* FileName: EppdevTableParam.java
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

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_table对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTableParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_name
    private String tableName;

    // properties for version_id
    private String versionId;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for table_name
    public String getTableName() {
        return tableName;
    }

    // getters for version_id
    public String getVersionId() {
        return versionId;
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

    // setters for table_name
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    // setters for version_id
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
