/* FileName: NameUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class NameUtils {
    static Logger logger = LoggerFactory.getLogger(NameUtils.class);

    public static String getPropertyName(String columnName) {
        String[] strs = columnName.split("_");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(StringUtils.firstUpper(str.toLowerCase()));
        }
        return StringUtils.firstLower(sb.toString());
    }

    public static String getEntityName(String tableName) {
        String[] strs = tableName.split("_");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(StringUtils.firstUpper(str.toLowerCase()));
        }
        return sb.toString();
    }

}
