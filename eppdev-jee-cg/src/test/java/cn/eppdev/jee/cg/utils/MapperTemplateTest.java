/* FileName: MapperTemplateTest.java
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
public class MapperTemplateTest {
    static Logger logger = LoggerFactory.getLogger(MapperTemplateTest.class);

    @Test
    public void testUpperMapper(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/mapper/upper_mapper.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        System.out.println(result);
    }

    @Test
    public void testEntity(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/mapper/mapper.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        System.out.println(result);
    }
}
