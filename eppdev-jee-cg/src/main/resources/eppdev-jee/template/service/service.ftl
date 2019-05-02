/* FileName: ${entityName}Service.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.service;

import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.service.auto._${entityName}Service;
import org.springframework.stereotype.Service;

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
@Service
public class ${entityName}Service extends _${entityName}Service {

    @Override
    public void customeInit(${entityName} entity) {
    }

}
