/* FileName: DimAreaInfoController.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.rest;

import ${basicConf.BASIC_PACKAGE_NAME}.commons.rest.BasicController;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
@RestController
@RequestMapping(${entityName}Controller.URL)
public class ${entityName}Controller extends BasicController<${entityName}, ${entityName}Param> {
    static Logger logger = LoggerFactory.getLogger(${entityName}Controller.class);

    public static final String URL= "/${tableName}";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}
