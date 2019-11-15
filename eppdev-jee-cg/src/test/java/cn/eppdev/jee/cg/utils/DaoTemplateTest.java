/* FileName: DaoTemplateTest.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
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
public class DaoTemplateTest {
    static Logger logger = LoggerFactory.getLogger(DaoTemplateTest.class);

    @Test
    public void testBasicDao(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/dao/basic_dao.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
        Assert.assertNotNull(result);
    }

    @Test
    public void testUpperDao(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/dao/upper_dao.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }

    @Test
    public void testDao(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/dao/dao.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }
}
