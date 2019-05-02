/* FileName: EntityTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author jinlong.hao
 */
public class EntityTemplateTest {
    static Logger logger = LoggerFactory.getLogger(EntityTemplateTest.class);

    @Test
    public void testBasicEntity(){
       String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/entity/basic_entity.ftl");
       String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
       Assert.assertNotNull(result);
    }

    @Test
    public void testUpperEntity(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/entity/upper_entity.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
       Assert.assertNotNull(result);
    }

    @Test
    public void testEntity(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/entity/entity.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }


}
