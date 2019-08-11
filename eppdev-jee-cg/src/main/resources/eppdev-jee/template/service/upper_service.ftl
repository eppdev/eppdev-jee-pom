/* FileName: ${entityName}Service.java
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

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.service.auto;

import ${basicConf.BASIC_PACKAGE_NAME}.commons.service.BasicService;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ${tableName}对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public abstract class _${entityName}Service extends BasicService<${entityName}, ${entityName}Param> {

    @Autowired
    ${entityName}Dao dao;

    @Override
    public ${entityName}Dao getDao() {
        return dao;
    }


    @Override
    public boolean exists(${entityName} entity) {
        <#list columnList as column>
        <#if column.logicKeyFlag == 1>
            <#assign hasLogicKey=1 />
        </#if>
        <#if column.primaryKeyFlag == 1>
            <#assign hasPrimaryKey=1 />
        </#if>
        </#list>

        <#if hasLogicKey?exists && hasLogicKey == 1>
        // 判断逻辑主键
        ${entityName}Param param = new ${entityName}Param();
        <#list columnList as column>
        <#if column.logicKeyFlag == 1>
        param.set${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(entity.get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}());
        </#if>
        </#list>
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<${entityName}> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            <#if hasPrimaryKey?exists && hasPrimaryKey == 1>
            if (<#list primaryKeyList as column>pageInfo.getList().get(0).get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}().equals(entity.get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}())<#sep>
                && </#sep></#list>){
                return false;
            }
            </#if>
            return true;
        }
        </#if>

        return false;
    }

}
