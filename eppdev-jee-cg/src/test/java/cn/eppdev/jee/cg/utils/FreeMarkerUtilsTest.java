/* FileName: FreeMarkerUtilsTest.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class FreeMarkerUtilsTest {
    static Logger logger = LoggerFactory.getLogger(FreeMarkerUtilsTest.class);


    @Test
    public void testFirstUpper(){
        String ftl = "${str?substring(0,1)?upper_case}${str?substring(1)}";
        Map<String, String> model = new HashMap<>();
        model.put("str", "interestModel");
        String result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("InterestModel", result);
    }

    @Test
    public void testLoop(){
        String ftl = "<#list list as item>${item}</#list>";
        Map<String, List<String>> model = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("jinlong.hao");
        list.add("san.zhang");
        model.put("list", list);
        String result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("jinlong.haosan.zhang", result);
    }

    @Test
    public void testIf(){
        String ftl = "<#list list as item><#if item == 'jinlong.hao'>${item}</#if></#list>";
        Map<String, List<String>> model = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("jinlong.hao");
        list.add("san.zhang");
        model.put("list", list);
        String result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("jinlong.hao", result);
    }

    @Test
    public void testLastStr(){
        String ftl = "${str?substring(str?last_index_of('.') + 1)}";
        Map<String, String> model = new HashMap<>();
        model.put("str", "java.utils.List");
        String result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("List", result);
    }

    @Test
    public void testIfwithLength(){
        String ftl = "${basicPackage}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>";
        Map<String, String> model = new HashMap<>();
        model.put("basicPackage", "cn.eppdev");
        model.put("moduleName", "conf");
        String result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("cn.eppdev.conf", result);
        model.remove("moduleName");
        result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("cn.eppdev", result);
        model.put("moduleName", " ");
        result = FreeMarkerUtils.generate(ftl, model);
        Assert.assertEquals("cn.eppdev", result);
    }
}
