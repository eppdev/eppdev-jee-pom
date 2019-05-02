/* FileName: ${entityName}Test.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.ApplicationTest;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName}</#if>.param.${entityName}Param;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName}</#if>.service.${entityName}Service;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class ${entityName}Test{

    @Autowired
    ${entityName}Service  entityService;

    @Test
    public void  testBasic(){
        ${entityName}Param param = new ${entityName}Param();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }
 