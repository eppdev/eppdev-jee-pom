/* FileName: StringUtils.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.utils;

/**
 * 字符串的一些格式化操作
 * @author ${AUTHOR_NAME}
 */
public class StringUtils {

    /**
     * 将输入的字符串的首字母变成大写
     *
     * @param str
     *            输入的字符串
     * @return 将str的首字母转换成为大写后的结果
     */
    public static String firstUpper(String str) {
        if(null == str || str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        ch = Character.toUpperCase(ch);
        return ch + str.substring(1);
    }

    /**
     * 将输入的字符串的首字母变成小写
     *
     * @param str
     *            输入的字符串
     * @return 将str的首字母转换成为小写后的结果
     */
    public static String firstLower(String str) {
        if(null == str || str.length() == 0){
            return "";
        }
        char ch = str.charAt(0);
        ch = Character.toLowerCase(ch);
        return ch + str.substring(1);
    }

    /**
     * 将后面的删除
     * @param content
     * @param toRemove
     * @return
     */
    public static String removeEnd(String content, String toRemove){
        if(content.endsWith(toRemove)){
            return content.substring(0, content.length() - toRemove.length());
        }
        return content;
    }

    /**
     * 将前面的删除
     * @param content
     * @param toRemove
     * @return
     */
    public static String removeBefore(String content, String toRemove){
        if(content.startsWith(toRemove)){
            return content.substring(toRemove.length());
        }
        return content;
    }

    /**
     * 将前后的某字符删除
     * @param content
     * @param toRemove
     * @return
     */
    public static String removeBeforeAndEnd(String content, String toRemove){
        String str = removeBefore(content, toRemove);
        return removeEnd(str, toRemove);
    }

    /**
     * 判断字符串是否为空值
     * @param str
     * @return
     */
    public static boolean isBlank(String str){
        if(null == str || str.trim().length() == 0){
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否为非空值
     * @param str
     * @return
     */
    public static boolean isNotBlank(String str){
        if(null == str || str.trim().length() == 0){
            return false;
        }
        return true;
    }
}
