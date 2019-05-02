/* FileName: ${entityName}Param.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.auto;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.param.BasicParam;

/**
 * ${tableName}对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public class _${entityName}Param extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    <#list columnList as column>
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1 || column.createLikeFlag == 1 || column.createLeftLikeFlag == 1 || column.createInFlag == 1 || column.createCompareFlag == 1>
    // properties for ${column.columnName}
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
    private ${column.javaType} ${column.propertyName};
    </#if>
    <#if column.createLikeFlag == 1>
    private ${column.javaType} _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createLeftLikeFlag == 1>
    private ${column.javaType} _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createInFlag == 1>
    private java.util.List<${column.javaType}> _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List;
    </#if>
    <#if column.createCompareFlag == 1>
    private ${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    private ${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * getters
     * **********************************************/
    <#list columnList as column>
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1 || column.createLikeFlag == 1 || column.createLeftLikeFlag == 1 || column.createInFlag == 1 || column.createCompareFlag == 1>
    // getters for ${column.columnName}
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
    public ${column.javaType} get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return ${column.propertyName};
    }
    </#if>
    <#if column.createLikeFlag == 1>
    public ${column.javaType} get_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createLeftLikeFlag == 1>
    public ${column.javaType} get_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createInFlag == 1>
    public java.util.List<${column.javaType}> get_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List() {
        return _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List;
    }
    </#if>
    <#if column.createCompareFlag == 1>
    public ${column.javaType} get_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    public ${column.javaType} get_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * setters
     * **********************************************/
    <#list columnList as column>
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1 || column.createLikeFlag == 1 || column.createLeftLikeFlag == 1 || column.createInFlag == 1 || column.createCompareFlag == 1>
    // getters for ${column.columnName}
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
    public void set${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} ${column.propertyName}) {
        this.${column.propertyName} = ${column.propertyName};
    }
    </#if>
    <#if column.createLikeFlag == 1>
    public void set_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}) {
        this._like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createLeftLikeFlag == 1>
    public void set_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}) {
        this._leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createInFlag == 1>
    public void set_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(java.util.List<${column.javaType}> _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List) {
        this._in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List = _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List;
    }
    </#if>
    <#if column.createCompareFlag == 1>
    public void get_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}) {
        this._min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    public void set_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>
}
