/*
 * # PasswordUtils.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 密码+salt进行Hash的工具类
 *
 * @author jinlong.hao
 */
public class PasswordUtils {

    /**
     * 将原始密码加盐（salt）后进行hash，生成密码的Hash值
     * @param password 原始密码
     * @return Hash后的结果
     */
    public static String generateHash(String password) {
        String randomStr = RandomUtils.getRandomStr(16, 2);
        return randomStr + DigestUtils.md5Hex(randomStr + password);
    }

    /**
     * 判断密码是否正确
     * @param password 原始密码
     * @param hashCode 密码加盐（salt）后的hash值
     * @return 密码是否正确
     */
    public static boolean checkHash(String password, String hashCode) {
        if (hashCode.length() < 48) {
            return false;
        }
        String randomStr = hashCode.substring(0, 16);
        return hashCode.substring(16).equals(DigestUtils.md5Hex(randomStr + password));
    }
}
