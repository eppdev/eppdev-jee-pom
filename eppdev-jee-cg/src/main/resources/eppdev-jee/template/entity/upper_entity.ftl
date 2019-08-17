/* FileName: _${entityName}.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
<#if logList?exists>
<#list logList as log>
  修改人：${log.authorName}
  修改时间：${log.updateDate?string('yyyy-MM-dd')}
  修改类型：${log.operType}
  修改内容：
<#list log.operContent?split("\n") as s>
    - ${s}
</#list>
----------------------------------------------------
</#list>
</#if>
************************************************** */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.auto;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.entity.ColumnEntity;
import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.entity.BasicEntity;

/**
 * ${tableName}对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public class _${entityName} extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
            && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
            && column.columnName != "remarks">
    // static properties for ${column.columnName}
    public static final String COLUMN_${column.columnName?upper_case}_ = "${column.columnName}";
    public static final String COLUMN_${column.columnName?upper_case}_ASC_ = "${column.columnName} asc";
    public static final String COLUMN_${column.columnName?upper_case}_DESC_ = "${column.columnName} desc";
    public static final String COLUMN_ENTITY_${column.columnName?upper_case}_ = new ColumnEntity("${column.columnName}", "${column.propertyName}");
    </#if>
    </#list>


    /* ***********************************************
     * properties
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
        && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
        && column.columnName != "remarks">
    // properties for ${column.columnName}
    private ${column.javaType} ${column.propertyName};
    <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
    private Integer _cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
    private ${column.javaType} _avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
    private ${column.javaType} _sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
    private ${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
    private ${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * getters
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
        && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
        && column.columnName != "remarks">
    // getters for ${column.columnName}
    public ${column.javaType} get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return this.${column.propertyName};
    }
    <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
    public Integer get_cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
    public ${column.javaType} get_avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
    public ${column.javaType} get_sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
    public ${column.javaType} get_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
    public ${column.javaType} get_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * setters
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
        && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
        && column.columnName != "remarks">
    // getters for ${column.columnName}
    public void set${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} ${column.propertyName}) {
        this.${column.propertyName} = ${column.propertyName};
    }
    <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
    public void set_cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(Integer _cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
    public void set_avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
    public void set_sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
    public void set_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
    public void set_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>
}
