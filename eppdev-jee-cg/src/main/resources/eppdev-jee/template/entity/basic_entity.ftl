/* FileName: BasicEntity.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.entity;

import ${BASIC_PACKAGE_NAME}.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ${AUTHOR_NAME}
 */
public class BasicEntity {

    public static final String COLUMN_ID_ = "id";
    public static final String COLUMN_ID_DESC_ = "id desc";
    public static final String COLUMN_CREATE_DATE_ = "create_date";
    public static final String COLUMN_CREATE_DATE_DESC_ = "create_date desc";
    public static final String COLUMN_CREATE_BY_ = "create_by";
    public static final String COLUMN_UPDATE_DATE_ = "update_date";
    public static final String COLUMN_UPDATE_DATE_DESC_ = "update_date desc";
    public static final String COLUMN_UPDATE_BY_ = "update_by";
    public static final String COLUMN_DEL_FLAG_ = "del_flag";
    public static final String COLUMN_REMARKS_ = "remarks";

    // id对应的属性
    private String id;

    // create_date对应的属性
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    // create_by对应的属性
    private String createBy;

    // update_date对应的属性
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    // update_by对应的属性
    private String updateBy;

    // del_flag对应的属性
    private Integer delFlag;

    // remarks对应的属性
    private String remarks;

    // count属性，用于groupBy计算的结果
    private Integer _count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer get_count() {
        return _count;
    }

    public void set_count(Integer _count) {
        this._count = _count;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
