/* FileName: FreeMarkerUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.utils.RandomUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/**
 * @author jinlong.hao
 */
public class FreeMarkerUtils {
    static Logger logger = LoggerFactory.getLogger(FreeMarkerUtils.class);

    /**
     * Init the Configuration of FreeMarker
     */
    static Configuration CFG = new Configuration(Configuration.VERSION_2_3_28);
    static {
        CFG.setObjectWrapper(new DefaultObjectWrapper(Configuration.VERSION_2_3_28));
    }

    /**
     * Generate output from FreeMarker templates-jee with the data model
     * @param ftl the content of the freemarker templates-jee
     * @param dataModel the data model
     * @return the output string
     */
    public static String generate(String ftl, Object dataModel){
        try {
            Template template = getTemplate(ftl);
            return buildResult(template, dataModel);
        } catch (IOException e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
        } catch (TemplateException e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
        }
        return null;
    }

    /**
     * generate a new freemarker templates-jee with the content of the templates-jee, use the random templates-jee name
     * @param ftl the content of the templates-jee
     * @return the Template object
     * @throws IOException exception when read string
     */
    public static Template getTemplate(String ftl) throws IOException {
        Template template = new Template(RandomUtils.getRandomStr(8, RandomUtils.TYPE_NUMBER_LOWER_CHAR),new StringReader(ftl), CFG);
        return template;
    }

    /**
     * Generate a new freemarker templates-jee object with the content of the templates-jee
     * @param ftl the content of the templates-jee
     * @param templateName templates-jee name
     * @return the Template object
     * @throws IOException exception when read string
     */
    public static Template getTemplate(String ftl, String templateName) throws IOException {
        return new Template(templateName, new StringReader(ftl), CFG);
    }


    /**
     * Build the result for the templates-jee with the input data model
     * @param template the freemarker Template object
     * @param dataModel the input data model
     * @return the result of the data model
     * @throws IOException exception when write string
     * @throws TemplateException except when process the templates-jee
     */
    public static String buildResult(Template template, Object dataModel) throws IOException, TemplateException {
        Writer out = new StringWriter();
        template.process(dataModel, out);
        return out.toString();
    }
}
