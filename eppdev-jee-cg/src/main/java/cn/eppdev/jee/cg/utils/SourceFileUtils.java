/* FileName: SourceFileUtils.java
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
public class SourceFileUtils {
    static Logger logger = LoggerFactory.getLogger(SourceFileUtils.class);

    public static int writeFile(String filePath, String content, boolean replace) throws IOException {
        logger.debug("filePath:{}", filePath);
        File file = new File(filePath);
        if (file.exists()) {
            if (!replace) {
                logger.debug("file {} exists, DO NOT write file", filePath);
                return 0;
            }
        } else {
            // 判断目录是否存在，如果不存在则创建目录
            String dirPath = filePath.substring(0, filePath.lastIndexOf('/'));
            File dirFile = new File(dirPath);
            if (!dirFile.exists()){
                dirFile.mkdirs();
            }

            // 文件不存在则创建文件
            file.createNewFile();
        }

        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        writer.write(content);
        writer.flush();
        writer.close();
        return 1;
    }
}
