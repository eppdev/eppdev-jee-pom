/* FileName: EppdevTableLogParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_table_log对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTableLogParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;
    private java.util.List<String> _inIdList;

    // properties for table_id
    private String tableId;

    // properties for author_name
    private String authorName;

    // properties for create_by
    private String createBy;

    // properties for update_by
    private String updateBy;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }
    public java.util.List<String> get_inIdList() {
        return _inIdList;
    }

    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for author_name
    public String getAuthorName() {
        return authorName;
    }

    // getters for create_by
    public String getCreateBy() {
        return createBy;
    }

    // getters for update_by
    public String getUpdateBy() {
        return updateBy;
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
    public void set_inId(java.util.List<String> _inIdList) {
        this._inIdList = _inIdList;
    }

    // setters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // setters for author_name
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // setters for create_by
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    // setters for update_by
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
