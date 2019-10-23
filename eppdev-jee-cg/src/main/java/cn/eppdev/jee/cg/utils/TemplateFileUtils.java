/* FileName: TemplateFileUtils.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author jinlong.hao
 */
public class TemplateFileUtils {
    static Logger logger = LoggerFactory.getLogger(TemplateFileUtils.class);

    /**
     * read templates file to String object
     * @param path the templates file path in classpath
     * @return the content of the templates file
     */
    public static String readTemplateToString(String path) {
        try {
            InputStream is = TemplateFileUtils.class.getResourceAsStream(path);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            return new String(buffer);
        } catch (IOException e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return null;
        }
    }
}
