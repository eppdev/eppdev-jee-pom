/* FileName: UtilsTemplateTest.java
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
public class UtilsTemplateTest {
    static Logger logger = LoggerFactory.getLogger(UtilsTemplateTest.class);

    @Test
    public void testJsonUtils(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/utils/json_utils.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
        Assert.assertNotNull(result);
    }
}
