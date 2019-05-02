/* FileName: _${entityName}Dao.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.auto;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.dao.BasicDao;
import ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param;
import org.apache.ibatis.annotations.Param;

/**
 * ${tableName}对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public interface _${entityName}Dao extends BasicDao<${entityName}, ${entityName}Param> {
    public int realDelete(<#list primaryKeyList as column>@Param("${column.propertyName}") ${column.javaType} ${column.propertyName}<#sep>, </#sep></#list>);

}
