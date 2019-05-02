/* FileName: DaoTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class ServiceTemplateTest {
    static Logger logger = LoggerFactory.getLogger(ServiceTemplateTest.class);

    @Test
    public void testBasicService(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/service/basic_service.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
        System.out.println(result);
    }

    @Test
    public void testService(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/service/service.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        System.out.println(result);
    }
}
