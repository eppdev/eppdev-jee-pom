---
title: EPPDEV-JEE源代码
subtitle: V1.6
author: 郝金隆
date: 2019-09
titlepage: true
toc-own-page: true
fontsize: 8pt
...

# EPPDEV-JEE-BASIC


## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevVersionTest.java

~~~java

/* FileName: EppdevVersionTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import cn.eppdev.jee.conf.service.EppdevVersionService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevVersionTest{

    @Autowired
    EppdevVersionService  entityService;

    @Test
    public void  testBasic(){
        EppdevVersionParam param = new EppdevVersionParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevIndexTest.java

~~~java

/* FileName: EppdevIndexTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import cn.eppdev.jee.conf.service.EppdevIndexService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevIndexTest{

    @Autowired
    EppdevIndexService  entityService;

    @Test
    public void  testBasic(){
        EppdevIndexParam param = new EppdevIndexParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevTableTest.java

~~~java

/* FileName: EppdevTableTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import cn.eppdev.jee.conf.service.EppdevTableService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevTableTest{

    @Autowired
    EppdevTableService  entityService;

    @Test
    public void  testBasic(){
        EppdevTableParam param = new EppdevTableParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevUserTest.java

~~~java

/* FileName: EppdevUserTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevUserParam;
import cn.eppdev.jee.conf.service.EppdevUserService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevUserTest{

    @Autowired
    EppdevUserService  entityService;

    @Test
    public void  testBasic(){
        EppdevUserParam param = new EppdevUserParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevConfTest.java

~~~java

/* FileName: EppdevConfTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import cn.eppdev.jee.conf.service.EppdevConfService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevConfTest{

    @Autowired
    EppdevConfService  entityService;

    @Test
    public void  testBasic(){
        EppdevConfParam param = new EppdevConfParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevColumnTest.java

~~~java

/* FileName: EppdevColumnTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import cn.eppdev.jee.conf.service.EppdevColumnService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevColumnTest{

    @Autowired
    EppdevColumnService  entityService;

    @Test
    public void  testBasic(){
        EppdevColumnParam param = new EppdevColumnParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/conf/test/EppdevTableLogTest.java

~~~java

/* FileName: EppdevTableLogTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package cn.eppdev.jee.conf.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import cn.eppdev.jee.ApplicationTest;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import cn.eppdev.jee.conf.service.EppdevTableLogService;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class EppdevTableLogTest{

    @Autowired
    EppdevTableLogService  entityService;

    @Test
    public void  testBasic(){
        EppdevTableLogParam param = new EppdevTableLogParam();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }

 }

~~~

## eppdev-jee-basic/src/test/java/cn/eppdev/jee/ApplicationTest.java

~~~java


/* FileName: ApplicationTest.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinlong.hao
 */
@SpringBootApplication
@MapperScan("cn.eppdev.jee")
public class ApplicationTest{

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/utils/PasswordUtils.java

~~~java

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

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/utils/RandomUtils.java

~~~java

/*
 * FileName: RandomUtils.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.utils;

import java.util.Random;

/**
 * @author jinlong.hao
 */
public class RandomUtils {

    public static String NUMBER_CHAR = "1234567890";
    public static String LOWER_CHAR = "qwertyuiopasdfghjklzxcvbnm";
    public static String UPPER_CHAR = "QWERTYUIOPASDFGHJKLZXCVBNM";
    public static String SYMBOL_CHAR = "~!@#$%^&*()";
    public static String ALL_CHAR = NUMBER_CHAR + LOWER_CHAR + UPPER_CHAR + SYMBOL_CHAR;
    public static Random RANDOM = new Random();

    public static int TYPE_NUMBER = 1;
    public static int TYPE_NUMBER_LOWER_CHAR = 2;
    public static int TYPE_NUMBER_LOWER_UPPER_CHAR = 3;
    public static int TPPE_NUMBER_ALL_CHAR = 4;

    /**
     * 生成随机字符串
     *
     * @param length 字符串长度
     * @param type   类型：<br/>
     *               1: 仅数字
     *               2: 数字+字母
     *               3: 数字+大小写字母
     *               4：数字+大小写字母+特殊字符
     * @return 随机数字
     */
    public static String getRandomStr(int length, int type) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(1000000);
            switch (type){
                case 1:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length())));
                    break;
                case 2:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length() + LOWER_CHAR.length())));
                    break;
                case 3:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length() + LOWER_CHAR.length()*2)));
                    break;
                case 4:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length() + LOWER_CHAR.length()*2 + SYMBOL_CHAR.length())));
                    break;
            }
        }
        return sb.toString();
    }

    /**
     * 随机生成0-max之间整数
     * @param max
     * @return
     */
    public static int getRandomInt(int max){
        return RANDOM.nextInt(max);
    }

    /**
     * 随机生成min-max之间整数
     * @param max
     * @param min
     * @return
     */
    public static int getRandomInt(int max, int min){
        return (int)(Math.random()*(max - min + 1) + min);
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/utils/NameUtils.java

~~~java

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

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/utils/StringUtils.java

~~~java

/* FileName: StringUtils.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.utils;


/**
 * 字符串的一些格式化操作
 * @author jinlong.hao
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

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/utils/JSONUtils.java

~~~java

/*
 * FileName: JsonUtils.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * JSON相关的工具类，用于javabean与json字符串的相互转换
 * @author jinlong.hao
 */
public class JSONUtils {
    private static Logger logger = LoggerFactory.getLogger(JSONUtils.class);
    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 将一个JavaBean转换为Json字符串
     *
     * @param obj 要转换的Java对象
     * @return 转换后的Json字符串
     */
    public static String toJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("Error While Transform JavaBean to Json: {}", e.getMessage());
        }
        return null;
    }


    /**
     * 将Json字符串转换为Java对象
     *
     * @param jsonStr 要转换的Json串
     * @param cls     目标对象的Java类
     * @param <T>     要转换的Java类型
     * @return 转化后的Java对象
     */
    public static <T> T readValue(String jsonStr, Class<T> cls) {
        try {
            return objectMapper.readValue(jsonStr, cls);
        } catch (IOException e) {
            logger.error("Error While Transform JsonString to JavaBean: {}\n {}", e.getMessage(),
                    e.getStackTrace());
        }
        return null;
    }

    /**
     * 将Json字符串转换为Java对象
     *
     * @param jsonStr 要转换的Json串
     * @param valueTypeRef     类型说明
     * @param <T>     要转换的Java类型
     * @return 转化后的Java对象
     */
    public static <T> T readValue(String jsonStr, TypeReference <T> valueTypeRef) {
        try {
            return objectMapper.readValue(jsonStr, valueTypeRef);
        } catch (IOException e) {
            logger.error("Error While Transform JsonString to JavaBean: {}\n {}", e.getMessage(),
                    e.getStackTrace());
        }
        return null;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevTableLogParam.java

~~~java

/* FileName: EppdevTableLogParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_table_log对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTableLogParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_id
    private String tableId;

    // properties for author_name
    private String authorName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for author_name
    public String getAuthorName() {
        return authorName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // setters for author_name
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevConfParam.java

~~~java

/* FileName: EppdevConfParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_conf
    - 修改字段:conf_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_conf对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevConfParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for conf_name
    private String confName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for conf_name
    public String getConfName() {
        return confName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for conf_name
    public void setConfName(String confName) {
        this.confName = confName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevColumnParam.java

~~~java

/* FileName: EppdevColumnParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:table_id
    - 修改字段:column_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_column对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevColumnParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_id
    private String tableId;

    // properties for column_name
    private String columnName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for column_name
    public String getColumnName() {
        return columnName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // setters for column_name
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevIndexParam.java

~~~java

/* FileName: EppdevIndexParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_index对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevIndexParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_id
    private String tableId;

    // properties for index_name
    private String indexName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for table_id
    public String getTableId() {
        return tableId;
    }

    // getters for index_name
    public String getIndexName() {
        return indexName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // setters for index_name
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevVersionParam.java

~~~java

/* FileName: EppdevVersionParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_version对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevVersionParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for version_name
    private String versionName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for version_name
    public String getVersionName() {
        return versionName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for version_name
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevTableParam.java

~~~java

/* FileName: EppdevTableParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_table对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTableParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for table_name
    private String tableName;

    // properties for version_id
    private String versionId;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for table_name
    public String getTableName() {
        return tableName;
    }

    // getters for version_id
    public String getVersionId() {
        return versionId;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for table_name
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    // setters for version_id
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/auto/_EppdevUserParam.java

~~~java

/* FileName: EppdevUserParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.param.auto;

import cn.eppdev.jee.commons.param.BasicParam;

/**
 * _eppdev_user对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevUserParam extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    // properties for id
    private String id;

    // properties for login_name
    private String loginName;

    // properties for del_flag
    private Integer delFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for id
    public String getId() {
        return id;
    }

    // getters for login_name
    public String getLoginName() {
        return loginName;
    }

    // getters for del_flag
    public Integer getDelFlag() {
        return delFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // setters for id
    public void setId(String id) {
        this.id = id;
    }

    // setters for login_name
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    // setters for del_flag
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevUserParam.java

~~~java

/* FileName: EppdevUserParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevUserParam;

/**
 * @author jinlong.hao
 */
public class EppdevUserParam extends _EppdevUserParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevIndexParam.java

~~~java

/* FileName: EppdevIndexParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevIndexParam;

/**
 * @author jinlong.hao
 */
public class EppdevIndexParam extends _EppdevIndexParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevConfParam.java

~~~java

/* FileName: EppdevConfParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevConfParam;

/**
 * @author jinlong.hao
 */
public class EppdevConfParam extends _EppdevConfParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevTableLogParam.java

~~~java

/* FileName: EppdevTableLogParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevTableLogParam;

/**
 * @author jinlong.hao
 */
public class EppdevTableLogParam extends _EppdevTableLogParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevTableParam.java

~~~java

/* FileName: EppdevTableParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevTableParam;

/**
 * @author jinlong.hao
 */
public class EppdevTableParam extends _EppdevTableParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevColumnParam.java

~~~java

/* FileName: EppdevColumnParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevColumnParam;

/**
 * @author jinlong.hao
 */
public class EppdevColumnParam extends _EppdevColumnParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/param/EppdevVersionParam.java

~~~java

/* FileName: EppdevVersionParam.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.param;

import cn.eppdev.jee.conf.param.auto._EppdevVersionParam;

/**
 * @author jinlong.hao
 */
public class EppdevVersionParam extends _EppdevVersionParam {

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevTableController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevTableController.URL)
public class EppdevTableController extends BasicController<EppdevTable, EppdevTableParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevTableController.class);

    public static final String URL= "/_eppdev_table";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevConfController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevConfController.URL)
public class EppdevConfController extends BasicController<EppdevConf, EppdevConfParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevConfController.class);

    public static final String URL= "/_eppdev_conf";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevColumnController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevColumnController.URL)
public class EppdevColumnController extends BasicController<EppdevColumn, EppdevColumnParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevColumnController.class);

    public static final String URL= "/_eppdev_column";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevUserController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.param.EppdevUserParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevUserController.URL)
public class EppdevUserController extends BasicController<EppdevUser, EppdevUserParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevUserController.class);

    public static final String URL= "/_eppdev_user";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevTableLogController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevTableLogController.URL)
public class EppdevTableLogController extends BasicController<EppdevTableLog, EppdevTableLogParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevTableLogController.class);

    public static final String URL= "/_eppdev_table_log";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevIndexController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevIndexController.URL)
public class EppdevIndexController extends BasicController<EppdevIndex, EppdevIndexParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevIndexController.class);

    public static final String URL= "/_eppdev_index";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/rest/EppdevVersionController.java

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.commons.rest.BasicController;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping(EppdevVersionController.URL)
public class EppdevVersionController extends BasicController<EppdevVersion, EppdevVersionParam> {
    static Logger logger = LoggerFactory.getLogger(EppdevVersionController.class);

    public static final String URL= "/_eppdev_version";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevColumn.java

~~~java

/* FileName: EppdevColumn.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevColumn;

/**
 * @author jinlong.hao
 */
public class EppdevColumn extends _EppdevColumn{
    private String dbColumnType;

    private String javaType;

    private EppdevTable table;

    public String getDbColumnType() {
        return dbColumnType;
    }

    public void setDbColumnType(String dbColumnType) {
        this.dbColumnType = dbColumnType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public EppdevTable getTable() {
        return table;
    }

    public void setTable(EppdevTable table) {
        this.table = table;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevVersion.java

~~~java

/* FileName: _EppdevVersion.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_version对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevVersion extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for version_name
    public static final String COLUMN_VERSION_NAME_ = "version_name";
    public static final String COLUMN_VERSION_NAME_ASC_ = "version_name asc";
    public static final String COLUMN_VERSION_NAME_DESC_ = "version_name desc";
    public static final ColumnEntity COLUMN_ENTITY_VERSION_NAME_ = new ColumnEntity("version_name", "versionName");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for version_name
    private String versionName;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for version_name
    public String getVersionName() {
        return this.versionName;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for version_name
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevIndex.java

~~~java

/* FileName: _EppdevIndex.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_index对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevIndex extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_id
    public static final String COLUMN_TABLE_ID_ = "table_id";
    public static final String COLUMN_TABLE_ID_ASC_ = "table_id asc";
    public static final String COLUMN_TABLE_ID_DESC_ = "table_id desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_ID_ = new ColumnEntity("table_id", "tableId");

    // static properties for index_name
    public static final String COLUMN_INDEX_NAME_ = "index_name";
    public static final String COLUMN_INDEX_NAME_ASC_ = "index_name asc";
    public static final String COLUMN_INDEX_NAME_DESC_ = "index_name desc";
    public static final ColumnEntity COLUMN_ENTITY_INDEX_NAME_ = new ColumnEntity("index_name", "indexName");

    // static properties for column_names
    public static final String COLUMN_COLUMN_NAMES_ = "column_names";
    public static final String COLUMN_COLUMN_NAMES_ASC_ = "column_names asc";
    public static final String COLUMN_COLUMN_NAMES_DESC_ = "column_names desc";
    public static final ColumnEntity COLUMN_ENTITY_COLUMN_NAMES_ = new ColumnEntity("column_names", "columnNames");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_id
    private String tableId;

    // properties for index_name
    private String indexName;

    // properties for column_names
    private String columnNames;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_id
    public String getTableId() {
        return this.tableId;
    }

    // getters for index_name
    public String getIndexName() {
        return this.indexName;
    }

    // getters for column_names
    public String getColumnNames() {
        return this.columnNames;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // getters for index_name
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    // getters for column_names
    public void setColumnNames(String columnNames) {
        this.columnNames = columnNames;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevConf.java

~~~java

/* FileName: _EppdevConf.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_conf
    - 修改字段:conf_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_conf对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevConf extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for conf_name
    public static final String COLUMN_CONF_NAME_ = "conf_name";
    public static final String COLUMN_CONF_NAME_ASC_ = "conf_name asc";
    public static final String COLUMN_CONF_NAME_DESC_ = "conf_name desc";
    public static final ColumnEntity COLUMN_ENTITY_CONF_NAME_ = new ColumnEntity("conf_name", "confName");

    // static properties for conf_value
    public static final String COLUMN_CONF_VALUE_ = "conf_value";
    public static final String COLUMN_CONF_VALUE_ASC_ = "conf_value asc";
    public static final String COLUMN_CONF_VALUE_DESC_ = "conf_value desc";
    public static final ColumnEntity COLUMN_ENTITY_CONF_VALUE_ = new ColumnEntity("conf_value", "confValue");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for conf_name
    private String confName;

    // properties for conf_value
    private String confValue;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for conf_name
    public String getConfName() {
        return this.confName;
    }

    // getters for conf_value
    public String getConfValue() {
        return this.confValue;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for conf_name
    public void setConfName(String confName) {
        this.confName = confName;
    }

    // getters for conf_value
    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevUser.java

~~~java

/* FileName: _EppdevUser.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_user对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevUser extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for login_name
    public static final String COLUMN_LOGIN_NAME_ = "login_name";
    public static final String COLUMN_LOGIN_NAME_ASC_ = "login_name asc";
    public static final String COLUMN_LOGIN_NAME_DESC_ = "login_name desc";
    public static final ColumnEntity COLUMN_ENTITY_LOGIN_NAME_ = new ColumnEntity("login_name", "loginName");

    // static properties for password_hex
    public static final String COLUMN_PASSWORD_HEX_ = "password_hex";
    public static final String COLUMN_PASSWORD_HEX_ASC_ = "password_hex asc";
    public static final String COLUMN_PASSWORD_HEX_DESC_ = "password_hex desc";
    public static final ColumnEntity COLUMN_ENTITY_PASSWORD_HEX_ = new ColumnEntity("password_hex", "passwordHex");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for login_name
    private String loginName;

    // properties for password_hex
    private String passwordHex;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for login_name
    public String getLoginName() {
        return this.loginName;
    }

    // getters for password_hex
    public String getPasswordHex() {
        return this.passwordHex;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for login_name
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    // getters for password_hex
    public void setPasswordHex(String passwordHex) {
        this.passwordHex = passwordHex;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevTableLog.java

~~~java

/* FileName: _EppdevTableLog.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_table_log对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTableLog extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_id
    public static final String COLUMN_TABLE_ID_ = "table_id";
    public static final String COLUMN_TABLE_ID_ASC_ = "table_id asc";
    public static final String COLUMN_TABLE_ID_DESC_ = "table_id desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_ID_ = new ColumnEntity("table_id", "tableId");

    // static properties for author_name
    public static final String COLUMN_AUTHOR_NAME_ = "author_name";
    public static final String COLUMN_AUTHOR_NAME_ASC_ = "author_name asc";
    public static final String COLUMN_AUTHOR_NAME_DESC_ = "author_name desc";
    public static final ColumnEntity COLUMN_ENTITY_AUTHOR_NAME_ = new ColumnEntity("author_name", "authorName");

    // static properties for oper_type
    public static final String COLUMN_OPER_TYPE_ = "oper_type";
    public static final String COLUMN_OPER_TYPE_ASC_ = "oper_type asc";
    public static final String COLUMN_OPER_TYPE_DESC_ = "oper_type desc";
    public static final ColumnEntity COLUMN_ENTITY_OPER_TYPE_ = new ColumnEntity("oper_type", "operType");

    // static properties for oper_content
    public static final String COLUMN_OPER_CONTENT_ = "oper_content";
    public static final String COLUMN_OPER_CONTENT_ASC_ = "oper_content asc";
    public static final String COLUMN_OPER_CONTENT_DESC_ = "oper_content desc";
    public static final ColumnEntity COLUMN_ENTITY_OPER_CONTENT_ = new ColumnEntity("oper_content", "operContent");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_id
    private String tableId;

    // properties for author_name
    private String authorName;

    // properties for oper_type
    private String operType;

    // properties for oper_content
    private String operContent;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_id
    public String getTableId() {
        return this.tableId;
    }

    // getters for author_name
    public String getAuthorName() {
        return this.authorName;
    }

    // getters for oper_type
    public String getOperType() {
        return this.operType;
    }

    // getters for oper_content
    public String getOperContent() {
        return this.operContent;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // getters for author_name
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    // getters for oper_type
    public void setOperType(String operType) {
        this.operType = operType;
    }

    // getters for oper_content
    public void setOperContent(String operContent) {
        this.operContent = operContent;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevColumn.java

~~~java

/* FileName: _EppdevColumn.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:table_id
    - 修改字段:column_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_column对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevColumn extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_id
    public static final String COLUMN_TABLE_ID_ = "table_id";
    public static final String COLUMN_TABLE_ID_ASC_ = "table_id asc";
    public static final String COLUMN_TABLE_ID_DESC_ = "table_id desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_ID_ = new ColumnEntity("table_id", "tableId");

    // static properties for column_name
    public static final String COLUMN_COLUMN_NAME_ = "column_name";
    public static final String COLUMN_COLUMN_NAME_ASC_ = "column_name asc";
    public static final String COLUMN_COLUMN_NAME_DESC_ = "column_name desc";
    public static final ColumnEntity COLUMN_ENTITY_COLUMN_NAME_ = new ColumnEntity("column_name", "columnName");

    // static properties for column_type
    public static final String COLUMN_COLUMN_TYPE_ = "column_type";
    public static final String COLUMN_COLUMN_TYPE_ASC_ = "column_type asc";
    public static final String COLUMN_COLUMN_TYPE_DESC_ = "column_type desc";
    public static final ColumnEntity COLUMN_ENTITY_COLUMN_TYPE_ = new ColumnEntity("column_type", "columnType");

    // static properties for column_length
    public static final String COLUMN_COLUMN_LENGTH_ = "column_length";
    public static final String COLUMN_COLUMN_LENGTH_ASC_ = "column_length asc";
    public static final String COLUMN_COLUMN_LENGTH_DESC_ = "column_length desc";
    public static final ColumnEntity COLUMN_ENTITY_COLUMN_LENGTH_ = new ColumnEntity("column_length", "columnLength");

    // static properties for sort_index
    public static final String COLUMN_SORT_INDEX_ = "sort_index";
    public static final String COLUMN_SORT_INDEX_ASC_ = "sort_index asc";
    public static final String COLUMN_SORT_INDEX_DESC_ = "sort_index desc";
    public static final ColumnEntity COLUMN_ENTITY_SORT_INDEX_ = new ColumnEntity("sort_index", "sortIndex");

    // static properties for primary_key_flag
    public static final String COLUMN_PRIMARY_KEY_FLAG_ = "primary_key_flag";
    public static final String COLUMN_PRIMARY_KEY_FLAG_ASC_ = "primary_key_flag asc";
    public static final String COLUMN_PRIMARY_KEY_FLAG_DESC_ = "primary_key_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_PRIMARY_KEY_FLAG_ = new ColumnEntity("primary_key_flag", "primaryKeyFlag");

    // static properties for logic_key_flag
    public static final String COLUMN_LOGIC_KEY_FLAG_ = "logic_key_flag";
    public static final String COLUMN_LOGIC_KEY_FLAG_ASC_ = "logic_key_flag asc";
    public static final String COLUMN_LOGIC_KEY_FLAG_DESC_ = "logic_key_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_LOGIC_KEY_FLAG_ = new ColumnEntity("logic_key_flag", "logicKeyFlag");

    // static properties for column_comment
    public static final String COLUMN_COLUMN_COMMENT_ = "column_comment";
    public static final String COLUMN_COLUMN_COMMENT_ASC_ = "column_comment asc";
    public static final String COLUMN_COLUMN_COMMENT_DESC_ = "column_comment desc";
    public static final ColumnEntity COLUMN_ENTITY_COLUMN_COMMENT_ = new ColumnEntity("column_comment", "columnComment");

    // static properties for property_name
    public static final String COLUMN_PROPERTY_NAME_ = "property_name";
    public static final String COLUMN_PROPERTY_NAME_ASC_ = "property_name asc";
    public static final String COLUMN_PROPERTY_NAME_DESC_ = "property_name desc";
    public static final ColumnEntity COLUMN_ENTITY_PROPERTY_NAME_ = new ColumnEntity("property_name", "propertyName");

    // static properties for java_type
    public static final String COLUMN_JAVA_TYPE_ = "java_type";
    public static final String COLUMN_JAVA_TYPE_ASC_ = "java_type asc";
    public static final String COLUMN_JAVA_TYPE_DESC_ = "java_type desc";
    public static final ColumnEntity COLUMN_ENTITY_JAVA_TYPE_ = new ColumnEntity("java_type", "javaType");

    // static properties for origin_column_id
    public static final String COLUMN_ORIGIN_COLUMN_ID_ = "origin_column_id";
    public static final String COLUMN_ORIGIN_COLUMN_ID_ASC_ = "origin_column_id asc";
    public static final String COLUMN_ORIGIN_COLUMN_ID_DESC_ = "origin_column_id desc";
    public static final ColumnEntity COLUMN_ENTITY_ORIGIN_COLUMN_ID_ = new ColumnEntity("origin_column_id", "originColumnId");

    // static properties for create_equal_flag
    public static final String COLUMN_CREATE_EQUAL_FLAG_ = "create_equal_flag";
    public static final String COLUMN_CREATE_EQUAL_FLAG_ASC_ = "create_equal_flag asc";
    public static final String COLUMN_CREATE_EQUAL_FLAG_DESC_ = "create_equal_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_EQUAL_FLAG_ = new ColumnEntity("create_equal_flag", "createEqualFlag");

    // static properties for create_like_flag
    public static final String COLUMN_CREATE_LIKE_FLAG_ = "create_like_flag";
    public static final String COLUMN_CREATE_LIKE_FLAG_ASC_ = "create_like_flag asc";
    public static final String COLUMN_CREATE_LIKE_FLAG_DESC_ = "create_like_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_LIKE_FLAG_ = new ColumnEntity("create_like_flag", "createLikeFlag");

    // static properties for create_left_like_flag
    public static final String COLUMN_CREATE_LEFT_LIKE_FLAG_ = "create_left_like_flag";
    public static final String COLUMN_CREATE_LEFT_LIKE_FLAG_ASC_ = "create_left_like_flag asc";
    public static final String COLUMN_CREATE_LEFT_LIKE_FLAG_DESC_ = "create_left_like_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_LEFT_LIKE_FLAG_ = new ColumnEntity("create_left_like_flag", "createLeftLikeFlag");

    // static properties for create_in_flag
    public static final String COLUMN_CREATE_IN_FLAG_ = "create_in_flag";
    public static final String COLUMN_CREATE_IN_FLAG_ASC_ = "create_in_flag asc";
    public static final String COLUMN_CREATE_IN_FLAG_DESC_ = "create_in_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_IN_FLAG_ = new ColumnEntity("create_in_flag", "createInFlag");

    // static properties for create_compare_flag
    public static final String COLUMN_CREATE_COMPARE_FLAG_ = "create_compare_flag";
    public static final String COLUMN_CREATE_COMPARE_FLAG_ASC_ = "create_compare_flag asc";
    public static final String COLUMN_CREATE_COMPARE_FLAG_DESC_ = "create_compare_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_COMPARE_FLAG_ = new ColumnEntity("create_compare_flag", "createCompareFlag");

    // static properties for create_cnt_dist_in_groupby_flag
    public static final String COLUMN_CREATE_CNT_DIST_IN_GROUPBY_FLAG_ = "create_cnt_dist_in_groupby_flag";
    public static final String COLUMN_CREATE_CNT_DIST_IN_GROUPBY_FLAG_ASC_ = "create_cnt_dist_in_groupby_flag asc";
    public static final String COLUMN_CREATE_CNT_DIST_IN_GROUPBY_FLAG_DESC_ = "create_cnt_dist_in_groupby_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_CNT_DIST_IN_GROUPBY_FLAG_ = new ColumnEntity("create_cnt_dist_in_groupby_flag", "createCntDistInGroupbyFlag");

    // static properties for create_avg_in_groupby_flag
    public static final String COLUMN_CREATE_AVG_IN_GROUPBY_FLAG_ = "create_avg_in_groupby_flag";
    public static final String COLUMN_CREATE_AVG_IN_GROUPBY_FLAG_ASC_ = "create_avg_in_groupby_flag asc";
    public static final String COLUMN_CREATE_AVG_IN_GROUPBY_FLAG_DESC_ = "create_avg_in_groupby_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_AVG_IN_GROUPBY_FLAG_ = new ColumnEntity("create_avg_in_groupby_flag", "createAvgInGroupbyFlag");

    // static properties for create_sum_in_groupby_flag
    public static final String COLUMN_CREATE_SUM_IN_GROUPBY_FLAG_ = "create_sum_in_groupby_flag";
    public static final String COLUMN_CREATE_SUM_IN_GROUPBY_FLAG_ASC_ = "create_sum_in_groupby_flag asc";
    public static final String COLUMN_CREATE_SUM_IN_GROUPBY_FLAG_DESC_ = "create_sum_in_groupby_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_SUM_IN_GROUPBY_FLAG_ = new ColumnEntity("create_sum_in_groupby_flag", "createSumInGroupbyFlag");

    // static properties for create_min_in_groupby_flag
    public static final String COLUMN_CREATE_MIN_IN_GROUPBY_FLAG_ = "create_min_in_groupby_flag";
    public static final String COLUMN_CREATE_MIN_IN_GROUPBY_FLAG_ASC_ = "create_min_in_groupby_flag asc";
    public static final String COLUMN_CREATE_MIN_IN_GROUPBY_FLAG_DESC_ = "create_min_in_groupby_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_MIN_IN_GROUPBY_FLAG_ = new ColumnEntity("create_min_in_groupby_flag", "createMinInGroupbyFlag");

    // static properties for create_max_in_groupby_flag
    public static final String COLUMN_CREATE_MAX_IN_GROUPBY_FLAG_ = "create_max_in_groupby_flag";
    public static final String COLUMN_CREATE_MAX_IN_GROUPBY_FLAG_ASC_ = "create_max_in_groupby_flag asc";
    public static final String COLUMN_CREATE_MAX_IN_GROUPBY_FLAG_DESC_ = "create_max_in_groupby_flag desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_MAX_IN_GROUPBY_FLAG_ = new ColumnEntity("create_max_in_groupby_flag", "createMaxInGroupbyFlag");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_id
    private String tableId;

    // properties for column_name
    private String columnName;

    // properties for column_type
    private String columnType;

    // properties for column_length
    private Integer columnLength;

    // properties for sort_index
    private Integer sortIndex;

    // properties for primary_key_flag
    private Integer primaryKeyFlag;

    // properties for logic_key_flag
    private Integer logicKeyFlag;

    // properties for column_comment
    private String columnComment;

    // properties for property_name
    private String propertyName;

    // properties for java_type
    private String javaType;

    // properties for origin_column_id
    private String originColumnId;

    // properties for create_equal_flag
    private Integer createEqualFlag;

    // properties for create_like_flag
    private Integer createLikeFlag;

    // properties for create_left_like_flag
    private Integer createLeftLikeFlag;

    // properties for create_in_flag
    private Integer createInFlag;

    // properties for create_compare_flag
    private Integer createCompareFlag;

    // properties for create_cnt_dist_in_groupby_flag
    private Integer createCntDistInGroupbyFlag;

    // properties for create_avg_in_groupby_flag
    private Integer createAvgInGroupbyFlag;

    // properties for create_sum_in_groupby_flag
    private Integer createSumInGroupbyFlag;

    // properties for create_min_in_groupby_flag
    private Integer createMinInGroupbyFlag;

    // properties for create_max_in_groupby_flag
    private Integer createMaxInGroupbyFlag;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_id
    public String getTableId() {
        return this.tableId;
    }

    // getters for column_name
    public String getColumnName() {
        return this.columnName;
    }

    // getters for column_type
    public String getColumnType() {
        return this.columnType;
    }

    // getters for column_length
    public Integer getColumnLength() {
        return this.columnLength;
    }

    // getters for sort_index
    public Integer getSortIndex() {
        return this.sortIndex;
    }

    // getters for primary_key_flag
    public Integer getPrimaryKeyFlag() {
        return this.primaryKeyFlag;
    }

    // getters for logic_key_flag
    public Integer getLogicKeyFlag() {
        return this.logicKeyFlag;
    }

    // getters for column_comment
    public String getColumnComment() {
        return this.columnComment;
    }

    // getters for property_name
    public String getPropertyName() {
        return this.propertyName;
    }

    // getters for java_type
    public String getJavaType() {
        return this.javaType;
    }

    // getters for origin_column_id
    public String getOriginColumnId() {
        return this.originColumnId;
    }

    // getters for create_equal_flag
    public Integer getCreateEqualFlag() {
        return this.createEqualFlag;
    }

    // getters for create_like_flag
    public Integer getCreateLikeFlag() {
        return this.createLikeFlag;
    }

    // getters for create_left_like_flag
    public Integer getCreateLeftLikeFlag() {
        return this.createLeftLikeFlag;
    }

    // getters for create_in_flag
    public Integer getCreateInFlag() {
        return this.createInFlag;
    }

    // getters for create_compare_flag
    public Integer getCreateCompareFlag() {
        return this.createCompareFlag;
    }

    // getters for create_cnt_dist_in_groupby_flag
    public Integer getCreateCntDistInGroupbyFlag() {
        return this.createCntDistInGroupbyFlag;
    }

    // getters for create_avg_in_groupby_flag
    public Integer getCreateAvgInGroupbyFlag() {
        return this.createAvgInGroupbyFlag;
    }

    // getters for create_sum_in_groupby_flag
    public Integer getCreateSumInGroupbyFlag() {
        return this.createSumInGroupbyFlag;
    }

    // getters for create_min_in_groupby_flag
    public Integer getCreateMinInGroupbyFlag() {
        return this.createMinInGroupbyFlag;
    }

    // getters for create_max_in_groupby_flag
    public Integer getCreateMaxInGroupbyFlag() {
        return this.createMaxInGroupbyFlag;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_id
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    // getters for column_name
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    // getters for column_type
    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    // getters for column_length
    public void setColumnLength(Integer columnLength) {
        this.columnLength = columnLength;
    }

    // getters for sort_index
    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    // getters for primary_key_flag
    public void setPrimaryKeyFlag(Integer primaryKeyFlag) {
        this.primaryKeyFlag = primaryKeyFlag;
    }

    // getters for logic_key_flag
    public void setLogicKeyFlag(Integer logicKeyFlag) {
        this.logicKeyFlag = logicKeyFlag;
    }

    // getters for column_comment
    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    // getters for property_name
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    // getters for java_type
    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    // getters for origin_column_id
    public void setOriginColumnId(String originColumnId) {
        this.originColumnId = originColumnId;
    }

    // getters for create_equal_flag
    public void setCreateEqualFlag(Integer createEqualFlag) {
        this.createEqualFlag = createEqualFlag;
    }

    // getters for create_like_flag
    public void setCreateLikeFlag(Integer createLikeFlag) {
        this.createLikeFlag = createLikeFlag;
    }

    // getters for create_left_like_flag
    public void setCreateLeftLikeFlag(Integer createLeftLikeFlag) {
        this.createLeftLikeFlag = createLeftLikeFlag;
    }

    // getters for create_in_flag
    public void setCreateInFlag(Integer createInFlag) {
        this.createInFlag = createInFlag;
    }

    // getters for create_compare_flag
    public void setCreateCompareFlag(Integer createCompareFlag) {
        this.createCompareFlag = createCompareFlag;
    }

    // getters for create_cnt_dist_in_groupby_flag
    public void setCreateCntDistInGroupbyFlag(Integer createCntDistInGroupbyFlag) {
        this.createCntDistInGroupbyFlag = createCntDistInGroupbyFlag;
    }

    // getters for create_avg_in_groupby_flag
    public void setCreateAvgInGroupbyFlag(Integer createAvgInGroupbyFlag) {
        this.createAvgInGroupbyFlag = createAvgInGroupbyFlag;
    }

    // getters for create_sum_in_groupby_flag
    public void setCreateSumInGroupbyFlag(Integer createSumInGroupbyFlag) {
        this.createSumInGroupbyFlag = createSumInGroupbyFlag;
    }

    // getters for create_min_in_groupby_flag
    public void setCreateMinInGroupbyFlag(Integer createMinInGroupbyFlag) {
        this.createMinInGroupbyFlag = createMinInGroupbyFlag;
    }

    // getters for create_max_in_groupby_flag
    public void setCreateMaxInGroupbyFlag(Integer createMaxInGroupbyFlag) {
        this.createMaxInGroupbyFlag = createMaxInGroupbyFlag;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/auto/_EppdevTable.java

~~~java

/* FileName: _EppdevTable.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.entity.auto;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.commons.entity.BasicEntity;

/**
 * _eppdev_table对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public class _EppdevTable extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    // static properties for table_name
    public static final String COLUMN_TABLE_NAME_ = "table_name";
    public static final String COLUMN_TABLE_NAME_ASC_ = "table_name asc";
    public static final String COLUMN_TABLE_NAME_DESC_ = "table_name desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_NAME_ = new ColumnEntity("table_name", "tableName");

    // static properties for table_comment
    public static final String COLUMN_TABLE_COMMENT_ = "table_comment";
    public static final String COLUMN_TABLE_COMMENT_ASC_ = "table_comment asc";
    public static final String COLUMN_TABLE_COMMENT_DESC_ = "table_comment desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_COMMENT_ = new ColumnEntity("table_comment", "tableComment");

    // static properties for module_name
    public static final String COLUMN_MODULE_NAME_ = "module_name";
    public static final String COLUMN_MODULE_NAME_ASC_ = "module_name asc";
    public static final String COLUMN_MODULE_NAME_DESC_ = "module_name desc";
    public static final ColumnEntity COLUMN_ENTITY_MODULE_NAME_ = new ColumnEntity("module_name", "moduleName");

    // static properties for entity_name
    public static final String COLUMN_ENTITY_NAME_ = "entity_name";
    public static final String COLUMN_ENTITY_NAME_ASC_ = "entity_name asc";
    public static final String COLUMN_ENTITY_NAME_DESC_ = "entity_name desc";
    public static final ColumnEntity COLUMN_ENTITY_ENTITY_NAME_ = new ColumnEntity("entity_name", "entityName");

    // static properties for entity_name_upper
    public static final String COLUMN_ENTITY_NAME_UPPER_ = "entity_name_upper";
    public static final String COLUMN_ENTITY_NAME_UPPER_ASC_ = "entity_name_upper asc";
    public static final String COLUMN_ENTITY_NAME_UPPER_DESC_ = "entity_name_upper desc";
    public static final ColumnEntity COLUMN_ENTITY_ENTITY_NAME_UPPER_ = new ColumnEntity("entity_name_upper", "entityNameUpper");

    // static properties for table_type
    public static final String COLUMN_TABLE_TYPE_ = "table_type";
    public static final String COLUMN_TABLE_TYPE_ASC_ = "table_type asc";
    public static final String COLUMN_TABLE_TYPE_DESC_ = "table_type desc";
    public static final ColumnEntity COLUMN_ENTITY_TABLE_TYPE_ = new ColumnEntity("table_type", "tableType");

    // static properties for version_id
    public static final String COLUMN_VERSION_ID_ = "version_id";
    public static final String COLUMN_VERSION_ID_ASC_ = "version_id asc";
    public static final String COLUMN_VERSION_ID_DESC_ = "version_id desc";
    public static final ColumnEntity COLUMN_ENTITY_VERSION_ID_ = new ColumnEntity("version_id", "versionId");

    // static properties for create_sql
    public static final String COLUMN_CREATE_SQL_ = "create_sql";
    public static final String COLUMN_CREATE_SQL_ASC_ = "create_sql asc";
    public static final String COLUMN_CREATE_SQL_DESC_ = "create_sql desc";
    public static final ColumnEntity COLUMN_ENTITY_CREATE_SQL_ = new ColumnEntity("create_sql", "createSql");

    // static properties for origin_table_id
    public static final String COLUMN_ORIGIN_TABLE_ID_ = "origin_table_id";
    public static final String COLUMN_ORIGIN_TABLE_ID_ASC_ = "origin_table_id asc";
    public static final String COLUMN_ORIGIN_TABLE_ID_DESC_ = "origin_table_id desc";
    public static final ColumnEntity COLUMN_ENTITY_ORIGIN_TABLE_ID_ = new ColumnEntity("origin_table_id", "originTableId");



    /* ***********************************************
     * properties
     * **********************************************/
    // properties for table_name
    private String tableName;

    // properties for table_comment
    private String tableComment;

    // properties for module_name
    private String moduleName;

    // properties for entity_name
    private String entityName;

    // properties for entity_name_upper
    private String entityNameUpper;

    // properties for table_type
    private Integer tableType;

    // properties for version_id
    private String versionId;

    // properties for create_sql
    private String createSql;

    // properties for origin_table_id
    private String originTableId;


    /* ***********************************************
     * getters
     * **********************************************/
    // getters for table_name
    public String getTableName() {
        return this.tableName;
    }

    // getters for table_comment
    public String getTableComment() {
        return this.tableComment;
    }

    // getters for module_name
    public String getModuleName() {
        return this.moduleName;
    }

    // getters for entity_name
    public String getEntityName() {
        return this.entityName;
    }

    // getters for entity_name_upper
    public String getEntityNameUpper() {
        return this.entityNameUpper;
    }

    // getters for table_type
    public Integer getTableType() {
        return this.tableType;
    }

    // getters for version_id
    public String getVersionId() {
        return this.versionId;
    }

    // getters for create_sql
    public String getCreateSql() {
        return this.createSql;
    }

    // getters for origin_table_id
    public String getOriginTableId() {
        return this.originTableId;
    }


    /* ***********************************************
     * setters
     * **********************************************/
    // getters for table_name
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    // getters for table_comment
    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    // getters for module_name
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    // getters for entity_name
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    // getters for entity_name_upper
    public void setEntityNameUpper(String entityNameUpper) {
        this.entityNameUpper = entityNameUpper;
    }

    // getters for table_type
    public void setTableType(Integer tableType) {
        this.tableType = tableType;
    }

    // getters for version_id
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    // getters for create_sql
    public void setCreateSql(String createSql) {
        this.createSql = createSql;
    }

    // getters for origin_table_id
    public void setOriginTableId(String originTableId) {
        this.originTableId = originTableId;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevTable.java

~~~java

/* FileName: EppdevTable.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevTable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class EppdevTable extends _EppdevTable{
    private List<EppdevColumn> columnList;
    private List<EppdevIndex> indexList;
    private List<EppdevTableLog> logList;
    private EppdevVersion version;
    private Map<String, String> basicConf;

    public List<EppdevColumn> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<EppdevColumn> columnList) {
        this.columnList = columnList;
    }

    public List<EppdevIndex> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<EppdevIndex> indexList) {
        this.indexList = indexList;
    }

    public EppdevVersion getVersion() {
        return version;
    }

    public void setVersion(EppdevVersion version) {
        this.version = version;
    }

    public Map<String, String> getBasicConf() {
        return basicConf;
    }

    public void setBasicConf(Map<String, String> basicConf) {
        this.basicConf = basicConf;
    }

    public List<EppdevTableLog> getLogList() {
        return logList;
    }

    public void setLogList(List<EppdevTableLog> logList) {
        this.logList = logList;
    }

    /**
     * 获取物理主键信息
     * @return
     */
    @JsonIgnore
    public List<EppdevColumn> getPrimaryKeyList(){
        List<EppdevColumn> list = new ArrayList<>();
        for (EppdevColumn column: columnList) {
            if (column.getPrimaryKeyFlag() == 1) {
                list.add(column);
            }
        }
        return list;
    }

    /**
     * 获取业务主键信息
     * @return
     */
    @JsonIgnore
    public List<EppdevColumn> getLogicKeyList(){
        List<EppdevColumn> list = new ArrayList<>();
        for (EppdevColumn column: columnList) {
            if (column.getLogicKeyFlag() == 1) {
                list.add(column);
            }
        }
        return list;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevTableLog.java

~~~java

/* FileName: EppdevTableLog.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevTableLog;

/**
 * @author jinlong.hao
 */
public class EppdevTableLog extends _EppdevTableLog {
    public static final String OPER_TYPE_CREATE = "创建库表";
    public static final String OPER_TYPE_UPDATE = "修改库表";
    public static final String OPER_TYPE_DELETE = "删除库表";
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevIndex.java

~~~java

/* FileName: EppdevIndex.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevIndex;

/**
 * @author jinlong.hao
 */
public class EppdevIndex extends _EppdevIndex{
    private EppdevTable table;

    public EppdevTable getTable() {
        return table;
    }

    public void setTable(EppdevTable table) {
        this.table = table;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevConf.java

~~~java

/* FileName: EppdevConf.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevConf;

/**
 * @author jinlong.hao
 */
public class EppdevConf extends _EppdevConf{

    private Boolean overrided;

    public Boolean getOverrided() {
        return overrided;
    }

    public void setOverrided(Boolean overrided) {
        this.overrided = overrided;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevVersion.java

~~~java

/* FileName: EppdevVersion.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevVersion;

import java.util.List;

/**
 * @author jinlong.hao
 */
public class EppdevVersion extends _EppdevVersion{
    public static String MASTER_VERSION_ID = "00000000000000000000000000000000";

    private String fromVersionId;

    private List<EppdevTable> tableList;

    public String getFromVersionId() {
        return fromVersionId;
    }

    public void setFromVersionId(String fromVersionId) {
        this.fromVersionId = fromVersionId;
    }

    public List<EppdevTable> getTableList() {
        return tableList;
    }

    public void setTableList(List<EppdevTable> tableList) {
        this.tableList = tableList;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/entity/EppdevUser.java

~~~java

/* FileName: EppdevUser.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.entity;

import cn.eppdev.jee.conf.entity.auto._EppdevUser;

/**
 * @author jinlong.hao
 */
public class EppdevUser extends _EppdevUser{
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevTableService.java

~~~java

/* FileName: EppdevTableService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import cn.eppdev.jee.conf.service.auto._EppdevTableService;
import cn.eppdev.jee.utils.NameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevTableService extends _EppdevTableService {

    @Autowired
    EppdevColumnService columnService;

    @Autowired
    EppdevIndexService indexService;

    @Autowired
    EppdevConfService confService;

    @Autowired
    EppdevTableLogService tableLogService;

    @Override
    public void customeInit(EppdevTable entity) {
        // 初始化originId
        if (entity.getOriginTableId() == null || entity.getOriginTableId().length() == 0){
            entity.setOriginTableId(entity.getId());
        }

        // 初始化entityName
        if (entity.getEntityName() == null || entity.getEntityName().length() == 0){
            entity.setEntityName(NameUtils.getEntityName(entity.getTableName()));
        }

        // 初始化moduleName
        if (entity.getModuleName() == null || entity.getModuleName().length() == 0){
            String[] str = entity.getTableName().split("_");
            if (str.length > 1){
                entity.setModuleName(str[0]);
            }
        }
    }


    /**
     * list tables for the specified version
     * @param versionId version id
     * @return all the tables in this version
     */
    public List<EppdevTable> listByVersionId(String versionId){
        EppdevTableParam param = new EppdevTableParam();
        param.setVersionId(versionId);
        param.buildOrderBy(EppdevTable.COLUMN_MODULE_NAME_, EppdevTable.COLUMN_TABLE_NAME_);
        return list(param).getList();
    }

    @Override
    public EppdevTable get(String id) {
        EppdevTable table = super.get(id);
        if (table != null){
            table.setColumnList(columnService.listByTableId(id));
            table.setIndexList(indexService.listByTableId(id));
            table.setBasicConf(confService.getAllConf());
            table.setLogList(tableLogService.listByTableId(id));
        }
        return table;
    }



}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevVersionService.java

~~~java

/* FileName: EppdevVersionService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.service.auto._EppdevVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevVersionService extends _EppdevVersionService {

    @Autowired
    EppdevTableService tableService;

    @Override
    public void customeInit(EppdevVersion entity) {
    }

    public EppdevVersion get(String id) {
        EppdevVersion version = super.get(id);
        if (version != null) {
            version.setTableList(tableService.listByVersionId(id));
        }
        return version;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevColumnService.java

~~~java

/* FileName: EppdevColumnService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import cn.eppdev.jee.conf.service.auto._EppdevColumnService;
import cn.eppdev.jee.utils.NameUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevColumnService extends _EppdevColumnService {

    @Override
    public void customeInit(EppdevColumn entity) {
        if (entity.getOriginColumnId() == null || entity.getOriginColumnId().length() == 0) {
            entity.setOriginColumnId(entity.getId());
        }
        if (entity.getPropertyName() == null || entity.getPropertyName().length() == 0) {
            entity.setPropertyName(NameUtils.getPropertyName(entity.getColumnName()));
        }
        if (entity.getCreateEqualFlag() == null) {
            entity.setCreateEqualFlag(0);
        }
        if (entity.getCreateLikeFlag() == null) {
            entity.setCreateLikeFlag(0);
        }
        if (entity.getCreateLeftLikeFlag() == null) {
            entity.setCreateLeftLikeFlag(0);
        }
        if (entity.getCreateInFlag() == null) {
            entity.setCreateInFlag(0);
        }
        if (entity.getCreateCompareFlag() == null) {
            entity.setCreateCompareFlag(0);
        }
        if (entity.getCreateCntDistInGroupbyFlag() == null) {
            entity.setCreateCntDistInGroupbyFlag(0);
        }
        if (entity.getCreateAvgInGroupbyFlag() == null) {
            entity.setCreateAvgInGroupbyFlag(0);
        }
        if (entity.getCreateSumInGroupbyFlag() == null) {
            entity.setCreateSumInGroupbyFlag(0);
        }
        if (entity.getCreateMinInGroupbyFlag() == null) {
            entity.setCreateMinInGroupbyFlag(0);
        }
        if (entity.getCreateMaxInGroupbyFlag() == null) {
            entity.setCreateMaxInGroupbyFlag(0);
        }
    }

    /**
     * list all the columns in a table
     *
     * @param tableId table id
     * @return columns list
     */
    public List<EppdevColumn> listByTableId(String tableId) {
        EppdevColumnParam param = new EppdevColumnParam();
        param.setTableId(tableId);
        param.buildOrderBy(EppdevColumn.COLUMN_SORT_INDEX_, EppdevColumn.COLUMN_UPDATE_DATE_DESC_);
        return list(param).getList();
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevVersionService.java

~~~java

/* FileName: EppdevVersionService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevVersionDao;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_version对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevVersionService extends BasicService<EppdevVersion, EppdevVersionParam> {

    @Autowired
    EppdevVersionDao dao;

    @Override
    public EppdevVersionDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevVersion entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevTableLogService.java

~~~java

/* FileName: EppdevTableLogService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevTableLogDao;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_table_log对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevTableLogService extends BasicService<EppdevTableLog, EppdevTableLogParam> {

    @Autowired
    EppdevTableLogDao dao;

    @Override
    public EppdevTableLogDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevTableLog entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevTableService.java

~~~java

/* FileName: EppdevTableService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevTableDao;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_table对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevTableService extends BasicService<EppdevTable, EppdevTableParam> {

    @Autowired
    EppdevTableDao dao;

    @Override
    public EppdevTableDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevTable entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevIndexService.java

~~~java

/* FileName: EppdevIndexService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevIndexDao;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_index对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevIndexService extends BasicService<EppdevIndex, EppdevIndexParam> {

    @Autowired
    EppdevIndexDao dao;

    @Override
    public EppdevIndexDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevIndex entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevConfService.java

~~~java

/* FileName: EppdevConfService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_conf
    - 修改字段:conf_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevConfDao;
import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_conf对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevConfService extends BasicService<EppdevConf, EppdevConfParam> {

    @Autowired
    EppdevConfDao dao;

    @Override
    public EppdevConfDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevConf entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevUserService.java

~~~java

/* FileName: EppdevUserService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevUserDao;
import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.param.EppdevUserParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_user对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevUserService extends BasicService<EppdevUser, EppdevUserParam> {

    @Autowired
    EppdevUserDao dao;

    @Override
    public EppdevUserDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevUser entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/auto/_EppdevColumnService.java

~~~java

/* FileName: EppdevColumnService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:table_id
    - 修改字段:column_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.service.auto;

import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.conf.dao.EppdevColumnDao;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * _eppdev_column对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public abstract class _EppdevColumnService extends BasicService<EppdevColumn, EppdevColumnParam> {

    @Autowired
    EppdevColumnDao dao;

    @Override
    public EppdevColumnDao getDao() {
        return dao;
    }


    @Override
    public boolean exists(EppdevColumn entity) {


        return false;
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevIndexService.java

~~~java

/* FileName: EppdevIndexService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import cn.eppdev.jee.conf.service.auto._EppdevIndexService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevIndexService extends _EppdevIndexService {

    @Override
    public void customeInit(EppdevIndex entity) {
    }


    /**
     * list indexes by table id
     * @param tableId table id
     * @return all the indexes of the table
     */
    public List<EppdevIndex> listByTableId(String tableId){
        EppdevIndexParam param = new EppdevIndexParam();
        param.setTableId(tableId);
        return list(param).getList();
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevConfService.java

~~~java

/* FileName: EppdevConfService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import cn.eppdev.jee.conf.service.auto._EppdevConfService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevConfService extends _EppdevConfService {

    static ConcurrentHashMap<String, String> CACHED_MAP = new ConcurrentHashMap<>();


    @Value("${eppdev.author.name:#{null}}")
    String authorName;

    @Value("${eppdev.author.mail:#{null}}")
    String authorMail;

    @Value("${eppdev.project.path:#{null}}")
    String projectPath;

    @Value("${eppdev.git.path:#{null}}")
    String gitPath;

    @Value("${eppdev.git.auto-push:#{null}}")
    String gitAuthPush;

    @Value("${eppdev.git.use-new-branch:#{null}}")
    String gitUseNewBrach;

    @Value("${eppdev.git.main-branch-name:#{null}}")
    String gitMainBranchName;

    @Value("${spring.datasource.url:#{null}}")
    String dbUrl;

    @Value("${spring.datasource.username:#{null}}")
    String dbUsername;

    @Value("${spring.datasource.password:#{null}}")
    String dbPassword;


    @Override
    public void customeInit(EppdevConf entity) {
    }

    public String getConf(String key) {
        return getAllConf().get(key);
    }


    @Override
    public PageInfo<EppdevConf> listAll() {
        PageInfo<EppdevConf> pageInfo = super.listAll();
        return loadLocalConfig(pageInfo);
    }

    @Override
    public PageInfo<EppdevConf> list(EppdevConfParam param) {
        PageInfo<EppdevConf> pageInfo =  super.list(param);
        return loadLocalConfig(pageInfo);
    }

    PageInfo<EppdevConf> loadLocalConfig(PageInfo<EppdevConf> pageInfo){
        for (EppdevConf conf : pageInfo.getList()) {
            if (conf.getConfName().equals("AUTHOR_NAME") && authorName != null
                    && authorName.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(authorName);
            } else if (conf.getConfName().equals("AUTHOR_EMAIL") && authorMail != null
                    && authorMail.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(authorMail);
            } else if (conf.getConfName().equals("PROJECT_PATH") && projectPath != null
                    && projectPath.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(projectPath);
            } else if (conf.getConfName().equals("GIT_PATH") && gitPath != null
                    && gitPath.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitPath);
            } else if (conf.getConfName().equals("GIT_AUTO_PUSH") && gitAuthPush != null
                    && gitAuthPush.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitAuthPush);
            }else if (conf.getConfName().equals("GIT_USE_NEW_BRANCH") && gitUseNewBrach != null
                    && gitUseNewBrach.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitUseNewBrach);
            }else if (conf.getConfName().equals("GIT_MAIN_BRANCH_NAME") && gitMainBranchName != null
                    && gitMainBranchName.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitMainBranchName);
            } else {
                conf.setOverrided(false);
            }
        }
        return pageInfo;
    }

    public Map<String, String> getAllConf() {
        if (CACHED_MAP.keySet().size() == 0) {
            for (EppdevConf conf : listAll().getList()) {
                CACHED_MAP.put(conf.getConfName(), conf.getConfValue());
            }
            if (dbUrl != null) {
                CACHED_MAP.put("dbUrl", dbUrl);
            }
            if (dbUsername != null) {
                CACHED_MAP.put("dbUsername", dbUsername);
            }
            if (dbPassword != null ) {
                CACHED_MAP.put("dbPassword", dbPassword);
            }
        }
        return CACHED_MAP;
    }

    public String getDbType() {
        return getAllConf().get("DB_TYPE");
    }

    public String getProjectPath() {
        return getAllConf().get("PROJECT_PATH");
    }

    public String getBasicPackageName() {
        return getAllConf().get("BASIC_PACKAGE_NAME");
    }

    public String getGitPath() {
        return getAllConf().get("GIT_PATH");
    }

    public String getGitAutoPush() {
        return getAllConf().get("GIT_AUTO_PUSH");
    }

    public String getGitUseNewBranch() {
        return getAllConf().get("GIT_USE_NEW_BRANCH");
    }

    public String getGitMainBranchName() {
        return getAllConf().get("GIT_MAIN_BRANCH_NAME");
    }

    /**
     * 重载基础方法，更新缓存对象
     *
     * @param entity 要保存的数据对象
     * @return
     */
    @Override
    public int update(EppdevConf entity) {
        int cnt = super.update(entity);
        if (cnt > 0) {
            CACHED_MAP.put(entity.getConfName(), entity.getConfValue());
        }
        return cnt;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevUserService.java

~~~java

/* FileName: EppdevUserService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.service.auto._EppdevUserService;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevUserService extends _EppdevUserService {

    @Override
    public void customeInit(EppdevUser entity) {
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/service/EppdevTableLogService.java

~~~java

/* FileName: EppdevTableLogService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import cn.eppdev.jee.conf.service.auto._EppdevTableLogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevTableLogService extends _EppdevTableLogService {

    @Override
    public void customeInit(EppdevTableLog entity) {
    }


    /**
     * 根据tableId获取更新历史
     * @param tableId 表id
     * @return 字段更新历史
     */
    public List<EppdevTableLog> listByTableId(String tableId) {
        EppdevTableLogParam param = new EppdevTableLogParam();
        param.setTableId(tableId);
        param.buildOrderBy(EppdevTableLog.COLUMN_CREATE_DATE_DESC_);
        return list(param).getList();
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevIndexDao.java

~~~java

/* FileName: EppdevIndexDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevIndexDao;

/**
 * @author jinlong.hao
 */
public interface EppdevIndexDao extends _EppdevIndexDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevVersionDao.java

~~~java

/* FileName: _EppdevVersionDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_version对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevVersionDao extends BasicDao<EppdevVersion, EppdevVersionParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevTableDao.java

~~~java

/* FileName: _EppdevTableDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_table对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevTableDao extends BasicDao<EppdevTable, EppdevTableParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevIndexDao.java

~~~java

/* FileName: _EppdevIndexDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.param.EppdevIndexParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_index对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevIndexDao extends BasicDao<EppdevIndex, EppdevIndexParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevConfDao.java

~~~java

/* FileName: _EppdevConfDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_conf
    - 修改字段:conf_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_conf对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevConfDao extends BasicDao<EppdevConf, EppdevConfParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevTableLogDao.java

~~~java

/* FileName: _EppdevTableLogDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.conf.param.EppdevTableLogParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_table_log对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevTableLogDao extends BasicDao<EppdevTableLog, EppdevTableLogParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevUserDao.java

~~~java

/* FileName: _EppdevUserDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.param.EppdevUserParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_user对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevUserDao extends BasicDao<EppdevUser, EppdevUserParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/auto/_EppdevColumnDao.java

~~~java

/* FileName: _EppdevColumnDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:table_id
    - 修改字段:column_name
----------------------------------------------------
************************************************** */

package cn.eppdev.jee.conf.dao.auto;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import org.apache.ibatis.annotations.Param;

/**
 * _eppdev_column对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author jinlong.hao
 */
public interface _EppdevColumnDao extends BasicDao<EppdevColumn, EppdevColumnParam> {
    public int realDelete(@Param("id") String id);

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevVersionDao.java

~~~java

/* FileName: EppdevVersionDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevVersionDao;

/**
 * @author jinlong.hao
 */
public interface EppdevVersionDao extends _EppdevVersionDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevColumnDao.java

~~~java

/* FileName: EppdevColumnDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevColumnDao;

/**
 * @author jinlong.hao
 */
public interface EppdevColumnDao extends _EppdevColumnDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevTableLogDao.java

~~~java

/* FileName: EppdevTableLogDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevTableLogDao;

/**
 * @author jinlong.hao
 */
public interface EppdevTableLogDao extends _EppdevTableLogDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevUserDao.java

~~~java

/* FileName: EppdevUserDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevUserDao;

/**
 * @author jinlong.hao
 */
public interface EppdevUserDao extends _EppdevUserDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevTableDao.java

~~~java

/* FileName: EppdevTableDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevTableDao;

/**
 * @author jinlong.hao
 */
public interface EppdevTableDao extends _EppdevTableDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/conf/dao/EppdevConfDao.java

~~~java

/* FileName: EppdevConfDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.dao;

import cn.eppdev.jee.conf.dao.auto._EppdevConfDao;

/**
 * @author jinlong.hao
 */
public interface EppdevConfDao extends _EppdevConfDao {
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/param/BasicParam.java

~~~java

/* FileName: BasicParam.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.param;

import cn.eppdev.jee.commons.entity.ColumnEntity;
import cn.eppdev.jee.utils.JSONUtils;
import cn.eppdev.jee.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class BasicParam {
    static Logger logger = LoggerFactory.getLogger(BasicParam.class);

    private String _orderBy;

    private String _customWhere;

    private Integer _pageNum;

    private Integer _pageSize;

    private List<ColumnEntity> _groupByList;

    public String get_orderBy() {
        return _orderBy;
    }

    public void set_orderBy(String _orderBy) {
        this._orderBy = _orderBy;
    }

    public String get_customWhere() {
        return _customWhere;
    }

    public void set_customWhere(String _customWhere) {
        this._customWhere = _customWhere;
    }

    public Integer get_pageNum() {
        return _pageNum;
    }

    public void set_pageNum(Integer _pageNum) {
        this._pageNum = _pageNum;
    }

    public Integer get_pageSize() {
        return _pageSize;
    }

    public void set_pageSize(Integer _pageSize) {
        this._pageSize = _pageSize;
    }


    public List<ColumnEntity> get_groupByList() {
        return _groupByList;
    }

    public void set_groupByList(List<ColumnEntity> _groupByList) {
        this._groupByList = _groupByList;
    }


    public void buildBroupBy(ColumnEntity... columnEntities) {
        if (_groupByList == null) {
            _groupByList = new ArrayList<>();
        }
        for (ColumnEntity entity: columnEntities) {
            _groupByList.add(entity);
        }
    }

    public void buildOrderBy(String... orderbyStrs) {
        StringBuilder sb = new StringBuilder();
        for (String str : orderbyStrs) {
            if(str.contains(".")) {
                sb.append(str + ", ");
            }
            else {
                sb.append("a." + str + ", ");
            }
        }
        this._orderBy = StringUtils.removeEnd(sb.toString().trim(), ",");
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}
~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/rest/BasicController.java

~~~java

/* FileName: BasicController.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.rest;

import cn.eppdev.jee.commons.entity.BasicEntity;
import cn.eppdev.jee.commons.entity.RestResult;
import cn.eppdev.jee.commons.param.BasicParam;
import cn.eppdev.jee.commons.service.BasicService;
import cn.eppdev.jee.commons.service.SysService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinlong.hao
 */
public abstract class BasicController<T extends BasicEntity, P extends BasicParam> {
    static Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    BasicService<T, P> service;

    @Autowired
    SysService sysService;

    @RequestMapping("/get/{id}")
    public RestResult<T> get(@PathVariable("id") String id) {
        logger.debug("{}/get/{}", getBasicUrl(), id);
        RestResult<T> restResult;
        try {
            T data = service.get(id);
            if (null == data) {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "数据不存在", null);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", data);
            }
        } catch (Exception e) {
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/get/{} -> result: {}", getBasicUrl(), id, restResult);
        return restResult;
    }


    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody T entity) {
        RestResult<String> restResult = null;
        logger.debug("{}/add -> entity:{}", getBasicUrl(), entity);
        try {
            String userId = sysService.getCurrentUserId();
            if (userId != null) {
                entity.setCreateBy(userId);
                entity.setUpdateBy(userId);
            }
            int cnt = service.insert(entity);
            if (cnt == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "添加成功", entity.getId());
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "添加失败，数据重复？", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/add -> result:{}", getBasicUrl(), restResult);
        return restResult;
    }

    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id) {
        logger.debug("{}/delete/{}", getBasicUrl(), id);
        RestResult<Integer> restResult = null;
        try {
            String userId = sysService.getCurrentUserId();
            int count = service.delete(id, userId);
            if (count == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "删除成功", count);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "删除失败，数据不存在？", count);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/delete/{} -> result: {}", getBasicUrl(), id, restResult);
        return restResult;
    }

    @RequestMapping("/update")
    public RestResult<Integer> update(@RequestBody T entity) {
        logger.debug("{}/update -> entity:{}", getBasicUrl(), entity);
        RestResult<Integer> restResult = null;
        try {
            String userId = sysService.getCurrentUserId();
            if (userId != null && entity.getUpdateBy() == null){
                entity.setUpdateBy(userId);
            }
            int count = service.update(entity);
            if (count == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "更新成功", count);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "更新失败：关键字重复？", count);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/update -> restResult:{}", getBasicUrl(), restResult);
        return restResult;
    }

    @RequestMapping("/list")
    public RestResult<PageInfo<T>> list(@RequestBody P param) {
        logger.debug("{}/list -> param:{}", getBasicUrl(), param);
        RestResult<PageInfo<T>> restResult = null;
        try {
            PageInfo<T> pageInfo = service.list(param);
            restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch (Exception e) {
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/list -> restResult:{}", getBasicUrl(), restResult);
        return restResult;
    }

    public abstract String getBasicUrl();

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/entity/BasicEntity.java

~~~java

/* FileName: BasicEntity.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.entity;

import cn.eppdev.jee.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author jinlong.hao
 */
public class BasicEntity {

    public static final String COLUMN_ID_ = "id";
    public static final String COLUMN_ID_DESC_ = "id desc";
    public static final String COLUMN_CREATE_DATE_ = "create_date";
    public static final String COLUMN_CREATE_DATE_DESC_ = "create_date desc";
    public static final String COLUMN_CREATE_BY_ = "create_by";
    public static final String COLUMN_UPDATE_DATE_ = "update_date";
    public static final String COLUMN_UPDATE_DATE_DESC_ = "update_date desc";
    public static final String COLUMN_UPDATE_BY_ = "update_by";
    public static final String COLUMN_DEL_FLAG_ = "del_flag";
    public static final String COLUMN_REMARKS_ = "remarks";

    // id对应的属性
    private String id;

    // create_date对应的属性
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    // create_by对应的属性
    private String createBy;

    // update_date对应的属性
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    // update_by对应的属性
    private String updateBy;

    // del_flag对应的属性
    private Integer delFlag;

    // remarks对应的属性
    private String remarks;

    // count属性，用于groupBy计算的结果
    private Integer _count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer get_count() {
        return _count;
    }

    public void set_count(Integer _count) {
        this._count = _count;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/entity/ColumnEntity.java

~~~java

/* FileName: ColumnEntity.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.entity;

import cn.eppdev.jee.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class ColumnEntity {
    static Logger logger = LoggerFactory.getLogger(ColumnEntity.class);

    private String columnName;
    private String propertyName;

    public ColumnEntity(String columnName, String propertyName) {
        this.columnName = columnName;
        this.propertyName = propertyName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/entity/RestResult.java

~~~java

/* FileName: RestResult.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.entity;

import cn.eppdev.jee.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class RestResult <T> {
    static Logger logger = LoggerFactory.getLogger(RestResult.class);

    public static final int STATUS_SUCCESS = 2000;
    public static final int STATUS_FAILED = 2001;

    public Integer status;

    public String message;

    public T data;

    public RestResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/service/BasicService.java

~~~java

/* FileName: BasicService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.service;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.commons.entity.BasicEntity;
import cn.eppdev.jee.commons.param.BasicParam;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.UUID;
import org.springframework.transaction.annotation.Transactional;

/**
 * 基础Service类，提供了一些基础的方法
 *
 * @author jinlong.hao
 */
public abstract class BasicService<T extends BasicEntity, P extends BasicParam> {
    private static Logger logger = LoggerFactory.getLogger(BasicService.class);

    public static final Integer DEL_FLAG_NORMAL = 0;

    /**
     * 获取一条数据
     *
     * @param id 数据ID
     * @return 单条数据
     */
    public T get(String id) {
        return getDao().get(id);
    }

    /* 删除一条数据
     *
     * @param id 要删除的数据ID
     * @return 实际删除的数据条数
     */
    @Transactional(readOnly = false)
    public int delete(String id) {
        BasicEntity entity = new BasicEntity();
        entity.setId(id);
        entity.setUpdateDate(new Date());
        return getDao().delete(entity);
    }

    /* 删除一条数据
     *
     * @param id 要删除的数据ID
     * @param userId 要删除的用户ID
     * @return 实际删除的数据条数
     */
    @Transactional(readOnly = false)
    public int delete(String id, String userId) {
        BasicEntity entity = new BasicEntity();
        entity.setId(id);
        entity.setUpdateDate(new Date());
        entity.setUpdateBy(userId);
        return getDao().delete(entity);
    }

    /**
     * 根据条件进行数据删除
     *
     * @param param 条件（主要是_inIdList，支持多条数据的删除）
     * @return 删除的总条数
     */
    public int deleteBy(P param) {
        return getDao().deleteBy(param);
    }

    /**
     * 保存数据，若存在ID，则执行更新操作，若不存在，则执行插入操作
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    @Transactional(readOnly = false)
    public int save(T entity) {
        logger.debug("entity: {}", entity);
        // 首先判断逻辑主键是否有重复的，如有则不更新修改
        if (!exists(entity)) {
            if (entity.getId() == null || entity.getId().trim().length() == 0) {
                return insert(entity);
            } else {
                return update(entity);
            }
        } else {
            return 0;
        }
    }

    /**
     * 插入输入，若无ID则新初始化一个ID，若有则用原来的id进行保存
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    @Transactional(readOnly = false)
    public int insert(T entity) {
        logger.debug("entity: {}", entity);
        if (!exists(entity)) {
            _init(entity);
            return getDao().insert(entity);
        } else {
            return 0;
        }
    }

    /**
     * 修改数据
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    public int update(T entity) {
        logger.debug("entity:{}", entity);
        if (!exists(entity)) {
            entity.setUpdateDate(new Date());
            return getDao().update(entity);
        } else {
            return 0;
        }
    }


    /**
     * 插入强的数据初始化
     *
     * @param entity 要插入的数据
     */
    private void _init(T entity) {
        Date date = new Date();
        if (entity.getId() == null || entity.getId().trim().length() == 0) {
            entity.setId(UUID.randomUUID().toString().replace("-", ""));
        }
        entity.setCreateDate(date);
        entity.setUpdateDate(date);
        entity.setDelFlag(DEL_FLAG_NORMAL);
        customeInit(entity);
    }


    /**
     * 获取所有的数据
     *
     * @return 获取所有数据
     */
    public PageInfo<T> listAll() {
        return new PageInfo<>(getDao().list(null));
    }

    /**
     * 获取分页列表
     *
     * @param param 参数值
     * @return
     */
    public PageInfo<T> list(P param) {
        return new PageInfo<>(getDao().list(param));
    }


    /**
     * 获取分页列表[含GroupBy条件]
     *
     * @param param 参数值
     * @return
     */
    public PageInfo<T> listGroupBy(P param) {
        return new PageInfo<>(getDao().listGroupBy(param));
    }



    /**
     * 业务上根据逻辑主键判断此数据是否存在
     *
     * @param entity 要判断的对象
     * @return 数据是否存在
     */
    public abstract boolean exists(T entity);

    /**
     * 数据保存前自定义的初始化操作，数据的初始化
     * @param entity 要初始化的对象
     */
    public abstract void customeInit(T entity);

    /**
     * 获取此处要使用的Dao对象，之所以要这样做，为了实现自动生成的Dao配置文件和可以修改的配置文件的分离
     * @return 要使用的Dao实例
     */
    public abstract BasicDao<T, P> getDao();
}
~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/service/SysService.java

~~~java

/* FileName: SysUserService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class SysService {
    static Logger logger = LoggerFactory.getLogger(SysService.class);

    public String getCurrentUserId(){
        return null;
    }
}

~~~

## eppdev-jee-basic/src/main/java/cn/eppdev/jee/commons/dao/BasicDao.java

~~~java

/* FileName: BasicDao.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * License: Anti-996 License V1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.dao;

import cn.eppdev.jee.commons.entity.BasicEntity;
import cn.eppdev.jee.commons.param.BasicParam;
import java.util.List;

/**
 * Dao的基础类
 * @author jinlong.hao
 */
public interface BasicDao<T extends BasicEntity, P extends BasicParam> {


    /**
     * 插入数据
     * @param entity 要插入的数据
     * @return 插入数据条数
     */
    int insert(T entity);

    /**
     * 删除数据 会自动修改del_flag, update_date, update_by三个字段，设置为删除.
     * @param entity 要删除的数据信息
     * @return 删除的数据条数
     */
    int delete(BasicEntity entity);

    /**
     * 根据条件进行数据删除（注意要慎重使用），删除条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 删除数据的条数
     */
    int deleteBy(P param);

    /**
     * 更新数据
     * @param Entity 要更新的数据
     * @return 更新成功的数据条数
     */
    int update(T Entity);

    /**
     * 获取数据
     * @param id 数据ID
     * @return 数据对象
     */
    T get(String id);

    /**
     * 查询数据，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 返回的结果列表
     */
    List<T> list(P param);

    /**
     * 根据Group By查询数据，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 返回的结果列表
     */
    List<T> listGroupBy(P param);

    /**
     * <b>Deprecated: 使用PageHelper后请使用#listBy方法代替</b><br />
     * 根据条件查询数据条数，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 满足条件的数据条数
     */
    @Deprecated
    public int count(P param);

}
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevIndexDao.xml

~~~java

<!-- ===============================================
 _eppdev_index对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_index
    - 修改字段:table_id
    - 修改字段:index_name
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevIndexDao">
    <sql id="columns">
        a.id as id,
        a.table_id as tableId,
        a.index_name as indexName,
        a.column_names as columnNames,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevIndex">
        insert into _eppdev_index(
        <trim suffixOverrides=",">
            id,
            table_id,
            index_name,
            column_names,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{tableId},
            #{indexName},
            #{columnNames},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_index a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevIndexParam">
        update _eppdev_index a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="indexName != null and indexName != ''">and a.index_name=#{indexName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevIndex">
        update _eppdev_index a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="tableId != null and tableId != ''">a.table_id = #{tableId},</if>
            <if test="indexName != null and indexName != ''">a.index_name = #{indexName},</if>
            <if test="columnNames != null and columnNames != ''">a.column_names = #{columnNames},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevIndex">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefColumns"/>
        </trim>
        from _eppdev_index a
        <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevIndex">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefColumns"/>
        </trim>
        from _eppdev_index a
        <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="indexName != null and indexName != ''">and a.index_name=#{indexName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevIndex">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_index a
        <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="indexName != null and indexName != ''">and a.index_name=#{indexName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevIndexDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_index a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevColumnDao.xml

~~~java

<!-- ===============================================
 _eppdev_column对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_column
    - 修改字段:table_id
    - 修改字段:column_name
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevColumnDao">
    <sql id="columns">
        a.id as id,
        a.table_id as tableId,
        a.column_name as columnName,
        a.column_type as columnType,
        a.column_length as columnLength,
        a.sort_index as sortIndex,
        a.primary_key_flag as primaryKeyFlag,
        a.logic_key_flag as logicKeyFlag,
        a.column_comment as columnComment,
        a.property_name as propertyName,
        a.java_type as javaType,
        a.origin_column_id as originColumnId,
        a.create_equal_flag as createEqualFlag,
        a.create_like_flag as createLikeFlag,
        a.create_left_like_flag as createLeftLikeFlag,
        a.create_in_flag as createInFlag,
        a.create_compare_flag as createCompareFlag,
        a.create_cnt_dist_in_groupby_flag as createCntDistInGroupbyFlag,
        a.create_avg_in_groupby_flag as createAvgInGroupbyFlag,
        a.create_sum_in_groupby_flag as createSumInGroupbyFlag,
        a.create_min_in_groupby_flag as createMinInGroupbyFlag,
        a.create_max_in_groupby_flag as createMaxInGroupbyFlag,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevColumn">
        insert into _eppdev_column(
        <trim suffixOverrides=",">
            id,
            table_id,
            column_name,
            column_type,
            column_length,
            sort_index,
            primary_key_flag,
            logic_key_flag,
            column_comment,
            property_name,
            java_type,
            origin_column_id,
            create_equal_flag,
            create_like_flag,
            create_left_like_flag,
            create_in_flag,
            create_compare_flag,
            create_cnt_dist_in_groupby_flag,
            create_avg_in_groupby_flag,
            create_sum_in_groupby_flag,
            create_min_in_groupby_flag,
            create_max_in_groupby_flag,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{tableId},
            #{columnName},
            #{columnType},
            #{columnLength},
            #{sortIndex},
            #{primaryKeyFlag},
            #{logicKeyFlag},
            #{columnComment},
            #{propertyName},
            #{javaType},
            #{originColumnId},
            #{createEqualFlag},
            #{createLikeFlag},
            #{createLeftLikeFlag},
            #{createInFlag},
            #{createCompareFlag},
            #{createCntDistInGroupbyFlag},
            #{createAvgInGroupbyFlag},
            #{createSumInGroupbyFlag},
            #{createMinInGroupbyFlag},
            #{createMaxInGroupbyFlag},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_column a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevColumnParam">
        update _eppdev_column a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="columnName != null and columnName != ''">and a.column_name=#{columnName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevColumn">
        update _eppdev_column a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="tableId != null and tableId != ''">a.table_id = #{tableId},</if>
            <if test="columnName != null and columnName != ''">a.column_name = #{columnName},</if>
            <if test="columnType != null and columnType != ''">a.column_type = #{columnType},</if>
            <if test="columnLength != null">a.column_length = #{columnLength},</if>
            <if test="sortIndex != null">a.sort_index = #{sortIndex},</if>
            <if test="primaryKeyFlag != null">a.primary_key_flag = #{primaryKeyFlag},</if>
            <if test="logicKeyFlag != null">a.logic_key_flag = #{logicKeyFlag},</if>
            <if test="columnComment != null and columnComment != ''">a.column_comment = #{columnComment},</if>
            <if test="propertyName != null and propertyName != ''">a.property_name = #{propertyName},</if>
            <if test="javaType != null and javaType != ''">a.java_type = #{javaType},</if>
            <if test="originColumnId != null and originColumnId != ''">a.origin_column_id = #{originColumnId},</if>
            <if test="createEqualFlag != null">a.create_equal_flag = #{createEqualFlag},</if>
            <if test="createLikeFlag != null">a.create_like_flag = #{createLikeFlag},</if>
            <if test="createLeftLikeFlag != null">a.create_left_like_flag = #{createLeftLikeFlag},</if>
            <if test="createInFlag != null">a.create_in_flag = #{createInFlag},</if>
            <if test="createCompareFlag != null">a.create_compare_flag = #{createCompareFlag},</if>
            <if test="createCntDistInGroupbyFlag != null">a.create_cnt_dist_in_groupby_flag = #{createCntDistInGroupbyFlag},</if>
            <if test="createAvgInGroupbyFlag != null">a.create_avg_in_groupby_flag = #{createAvgInGroupbyFlag},</if>
            <if test="createSumInGroupbyFlag != null">a.create_sum_in_groupby_flag = #{createSumInGroupbyFlag},</if>
            <if test="createMinInGroupbyFlag != null">a.create_min_in_groupby_flag = #{createMinInGroupbyFlag},</if>
            <if test="createMaxInGroupbyFlag != null">a.create_max_in_groupby_flag = #{createMaxInGroupbyFlag},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevColumn">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefColumns"/>
        </trim>
        from _eppdev_column a
        <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevColumn">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefColumns"/>
        </trim>
        from _eppdev_column a
        <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="columnName != null and columnName != ''">and a.column_name=#{columnName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevColumn">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_column a
        <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="columnName != null and columnName != ''">and a.column_name=#{columnName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevColumnDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_column a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevConfDao.xml

~~~java

<!-- ===============================================
 _eppdev_conf对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_conf
    - 修改字段:conf_name
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevConfDao">
    <sql id="columns">
        a.id as id,
        a.conf_name as confName,
        a.conf_value as confValue,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevConf">
        insert into _eppdev_conf(
        <trim suffixOverrides=",">
            id,
            conf_name,
            conf_value,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{confName},
            #{confValue},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_conf a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevConfParam">
        update _eppdev_conf a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="confName != null and confName != ''">and a.conf_name=#{confName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevConf">
        update _eppdev_conf a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="confName != null and confName != ''">a.conf_name = #{confName},</if>
            <if test="confValue != null and confValue != ''">a.conf_value = #{confValue},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevConf">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefColumns"/>
        </trim>
        from _eppdev_conf a
        <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevConf">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefColumns"/>
        </trim>
        from _eppdev_conf a
        <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="confName != null and confName != ''">and a.conf_name=#{confName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevConf">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_conf a
        <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="confName != null and confName != ''">and a.conf_name=#{confName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevConfDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_conf a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevTableDao.xml

~~~java

<!-- ===============================================
 _eppdev_table对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table
    - 修改字段:table_name
    - 修改字段:version_id
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevTableDao">
    <sql id="columns">
        a.id as id,
        a.table_name as tableName,
        a.table_comment as tableComment,
        a.module_name as moduleName,
        a.entity_name as entityName,
        a.entity_name_upper as entityNameUpper,
        a.table_type as tableType,
        a.version_id as versionId,
        a.create_sql as createSql,
        a.origin_table_id as originTableId,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevTable">
        insert into _eppdev_table(
        <trim suffixOverrides=",">
            id,
            table_name,
            table_comment,
            module_name,
            entity_name,
            entity_name_upper,
            table_type,
            version_id,
            create_sql,
            origin_table_id,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{tableName},
            #{tableComment},
            #{moduleName},
            #{entityName},
            #{entityNameUpper},
            #{tableType},
            #{versionId},
            #{createSql},
            #{originTableId},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_table a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevTableParam">
        update _eppdev_table a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableName != null and tableName != ''">and a.table_name=#{tableName}</if>
            <if test="versionId != null and versionId != ''">and a.version_id=#{versionId}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevTable">
        update _eppdev_table a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="tableName != null and tableName != ''">a.table_name = #{tableName},</if>
            <if test="tableComment != null and tableComment != ''">a.table_comment = #{tableComment},</if>
            <if test="moduleName != null and moduleName != ''">a.module_name = #{moduleName},</if>
            <if test="entityName != null and entityName != ''">a.entity_name = #{entityName},</if>
            <if test="entityNameUpper != null and entityNameUpper != ''">a.entity_name_upper = #{entityNameUpper},</if>
            <if test="tableType != null">a.table_type = #{tableType},</if>
            <if test="versionId != null and versionId != ''">a.version_id = #{versionId},</if>
            <if test="createSql != null and createSql != ''">a.create_sql = #{createSql},</if>
            <if test="originTableId != null and originTableId != ''">a.origin_table_id = #{originTableId},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevTable">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefColumns"/>
        </trim>
        from _eppdev_table a
        <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevTable">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefColumns"/>
        </trim>
        from _eppdev_table a
        <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableName != null and tableName != ''">and a.table_name=#{tableName}</if>
            <if test="versionId != null and versionId != ''">and a.version_id=#{versionId}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevTable">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_table a
        <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableName != null and tableName != ''">and a.table_name=#{tableName}</if>
            <if test="versionId != null and versionId != ''">and a.version_id=#{versionId}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_table a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevUserDao.xml

~~~java

<!-- ===============================================
 _eppdev_user对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_user
    - 修改字段:login_name
    - 修改字段:update_by
    - 修改字段:update_by
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevUserDao">
    <sql id="columns">
        a.id as id,
        a.login_name as loginName,
        a.password_hex as passwordHex,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevUser">
        insert into _eppdev_user(
        <trim suffixOverrides=",">
            id,
            login_name,
            password_hex,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{loginName},
            #{passwordHex},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_user a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevUserParam">
        update _eppdev_user a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="loginName != null and loginName != ''">and a.login_name=#{loginName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevUser">
        update _eppdev_user a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="loginName != null and loginName != ''">a.login_name = #{loginName},</if>
            <if test="passwordHex != null and passwordHex != ''">a.password_hex = #{passwordHex},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevUser">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefColumns"/>
        </trim>
        from _eppdev_user a
        <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevUser">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefColumns"/>
        </trim>
        from _eppdev_user a
        <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="loginName != null and loginName != ''">and a.login_name=#{loginName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevUser">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_user a
        <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="loginName != null and loginName != ''">and a.login_name=#{loginName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevUserDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_user a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevTableLogDao.xml

~~~java

<!-- ===============================================
 _eppdev_table_log对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_table_log
    - 修改字段:table_id
    - 修改字段:author_name
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevTableLogDao">
    <sql id="columns">
        a.id as id,
        a.table_id as tableId,
        a.author_name as authorName,
        a.oper_type as operType,
        a.oper_content as operContent,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevTableLog">
        insert into _eppdev_table_log(
        <trim suffixOverrides=",">
            id,
            table_id,
            author_name,
            oper_type,
            oper_content,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{tableId},
            #{authorName},
            #{operType},
            #{operContent},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_table_log a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevTableLogParam">
        update _eppdev_table_log a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="authorName != null and authorName != ''">and a.author_name=#{authorName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevTableLog">
        update _eppdev_table_log a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="tableId != null and tableId != ''">a.table_id = #{tableId},</if>
            <if test="authorName != null and authorName != ''">a.author_name = #{authorName},</if>
            <if test="operType != null and operType != ''">a.oper_type = #{operType},</if>
            <if test="operContent != null and operContent != ''">a.oper_content = #{operContent},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevTableLog">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefColumns"/>
        </trim>
        from _eppdev_table_log a
        <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevTableLog">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefColumns"/>
        </trim>
        from _eppdev_table_log a
        <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="authorName != null and authorName != ''">and a.author_name=#{authorName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevTableLog">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_table_log a
        <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="tableId != null and tableId != ''">and a.table_id=#{tableId}</if>
            <if test="authorName != null and authorName != ''">and a.author_name=#{authorName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevTableLogDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_table_log a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/auto/_EppdevVersionDao.xml

~~~java

<!-- ===============================================
 _eppdev_version对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
  修改人：jinlong.hao
  修改时间：2019-08-16
  修改类型：修改库表
  修改内容：
    - 修改表信息：_eppdev_version
    - 修改字段:version_name
 ===================================================
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.auto._EppdevVersionDao">
    <sql id="columns">
        a.id as id,
        a.version_name as versionName,
        a.remarks as remarks,
        a.create_date as createDate,
        a.create_by as createBy,
        a.update_date as updateDate,
        a.update_by as updateBy,
        a.del_flag as delFlag,
    </sql>

    <insert id="insert" parameterType="cn.eppdev.jee.conf.entity.EppdevVersion">
        insert into _eppdev_version(
        <trim suffixOverrides=",">
            id,
            version_name,
            remarks,
            create_date,
            create_by,
            update_date,
            update_by,
            del_flag,
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            #{id},
            #{versionName},
            #{remarks},
            #{createDate},
            #{createBy},
            #{updateDate},
            #{updateBy},
            #{delFlag},
        </trim>
        )
    </insert>

    <delete id="delete">
        update _eppdev_version a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            and a.id=#{id}
                and a.del_flag = 0
        </where>
    </delete>

    <delete id="deleteBy" parameterType="cn.eppdev.jee.conf.param.EppdevVersionParam">
        update _eppdev_version a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=#{updateDate}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy}, </if>
        </set>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="versionName != null and versionName != ''">and a.version_name=#{versionName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
        </where>
    </delete>

    <update id="update" parameterType="cn.eppdev.jee.conf.entity.EppdevVersion">
        update _eppdev_version a
        <set>
            <if test="id != null and id != ''">a.id = #{id},</if>
            <if test="versionName != null and versionName != ''">a.version_name = #{versionName},</if>
            <if test="remarks != null and remarks != ''">a.remarks = #{remarks},</if>
            <if test="createDate != null">a.create_date = #{createDate},</if>
            <if test="createBy != null and createBy != ''">a.create_by = #{createBy},</if>
            <if test="updateDate != null">a.update_date = #{updateDate},</if>
            <if test="updateBy != null and updateBy != ''">a.update_by = #{updateBy},</if>
            <if test="delFlag != null">a.del_flag = #{delFlag},</if>
        </set>
        <where>
        and a.id=#{id}
        </where>
    </update>


    <select id="get" resultType="cn.eppdev.jee.conf.entity.EppdevVersion">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefColumns"/>
        </trim>
        from _eppdev_version a
        <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefJoin"/>
        <where>
            and a.id=#{id}
        </where>
    </select>


    <select id="list" resultType="cn.eppdev.jee.conf.entity.EppdevVersion">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefColumns"/>
        </trim>
        from _eppdev_version a
        <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="versionName != null and versionName != ''">and a.version_name=#{versionName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
            <otherwise>
                order by a.update_date desc
            </otherwise>
        </choose>
    </select>


    <select id="listGroupBy" resultType="cn.eppdev.jee.conf.entity.EppdevVersion">
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName} as ${_item.propertyName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefGroupByColumns"/>
        </trim>
        from _eppdev_version a
        <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefGroupByJoin"/>
        <where>
            <if test="id != null and id != ''">and a.id=#{id}</if>
            <if test="versionName != null and versionName != ''">and a.version_name=#{versionName}</if>
            <if test="delFlag != null">and a.del_flag=#{delFlag}</if>
                and a.del_flag = 0
            <if test="_customWhere != null and _customWhere != ''">${_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${_item.columnName},
            </foreach>
            </if>
            <include refid="cn.eppdev.jee.conf.dao.EppdevVersionDao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${_orderBy}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from _eppdev_version a
        <where>
            and a.id=#{id}
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevColumnDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevColumnDao">

    <!-- 此段代码将在_EppdevColumnDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">
        b.id as "table.id",
        b.table_name as "table.tableName",
        b.table_comment as "table.tableComment",
        b.module_name as "table.moduleName",
        b.entity_name as "table.entityName",
        b.table_type as "table.tableType",
        b.version_id as "table.versionId",
        b.create_sql as "table.createSql",
        b.origin_table_id as "table.originTableId",
        b.remarks as "table.remarks",
        b.create_by as "table.createBy",
        b.update_by as "table.updateBy",
        b.create_date as "table.createDate",
        b.update_date as "table.updateDate",
        b.del_flag as "table.delFlag",
    </sql>

    <!-- 此段代码将在_EppdevColumnDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">
        left join _eppdev_table b on a.table_id=b.id
    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevTableDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevTableDao">

    <!-- 此段代码将在_EppdevTableDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">
        b.id as "version.id",
        b.version_name as "version.versionName",
        b.remarks as "version.remarks",
        b.create_by as "version.createBy",
        b.update_by as "version.updateBy",
        b.create_date as "version.createDate",
        b.update_date as "version.updateDate",
        b.del_flag as "version.delFlag",
    </sql>

    <!-- 此段代码将在_EppdevTableDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">
        left join _eppdev_version b on a.version_id=b.id
    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevIndexDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevIndexDao">

    <!-- 此段代码将在_EppdevIndexDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">
        b.id as "table.id",
        b.table_name as "table.tableName",
        b.table_comment as "table.tableComment",
        b.module_name as "table.moduleName",
        b.entity_name as "table.entityName",
        b.table_type as "table.tableType",
        b.version_id as "table.versionId",
        b.create_sql as "table.createSql",
        b.origin_table_id as "table.originTableId",
        b.remarks as "table.remarks",
        b.create_by as "table.createBy",
        b.update_by as "table.updateBy",
        b.create_date as "table.createDate",
        b.update_date as "table.updateDate",
        b.del_flag as "table.delFlag",
    </sql>

    <!-- 此段代码将在_EppdevIndexDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">
        left join _eppdev_table b on a.table_id=b.id
    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevConfDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevConfDao">

    <!-- 此段代码将在_EppdevConfDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">

    </sql>

    <!-- 此段代码将在_EppdevConfDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">

    </sql>


    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevTableLogDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevTableLogDao">

    <!-- 此段代码将在_EppdevTableLogDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">

    </sql>

    <!-- 此段代码将在_EppdevTableLogDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">

    </sql>


    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevUserDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevUserDao">

    <!-- 此段代码将在_EppdevUserDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">

    </sql>

    <!-- 此段代码将在_EppdevUserDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-basic/src/main/resources/cn/eppdev/jee/conf/dao/EppdevVersionDao.xml

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="cn.eppdev.jee.conf.dao.EppdevVersionDao">

    <!-- 此段代码将在_EppdevVersionDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">

    </sql>

    <!-- 此段代码将在_EppdevVersionDao.xml中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_TestDao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>


</mapper>

~~~

## eppdev-jee-basic/pom.xml

~~~java

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>eppdev-jee-pom</artifactId>
        <groupId>cn.eppdev.jee</groupId>
        <version>0.1.6</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>eppdev-jee-basic</artifactId>


    <dependencies>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
        </dependency>

        <!-- for jackson -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
        </dependency>
        <!-- jackson end -->


        <!-- commons -->
        <dependency>
            <groupId>commons-codec</groupId>
            <artifactId>commons-codec</artifactId>
        </dependency>
        <!-- end of commons -->


        <!-- spring -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <!-- end of spring -->

        <!-- mybatis -->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>
        <!-- end of mybatis -->

    </dependencies>
</project>

~~~

# EPPDEV-JEE-CG


## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/DaoTemplateTest.java

~~~java

/* FileName: DaoTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/GitUtilsTest.java

~~~java

/* FileName: GitUtilsTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author jinlong.hao
 */
public class GitUtilsTest {
    static Logger logger = LoggerFactory.getLogger(GitUtilsTest.class);

    String gitPath = "/Users/jinlong.hao/Projects/02-ciov/ciov-java-pom";

    //@Test
    public void testGitPull() throws IOException {
        GitUtils.gitPull(gitPath, "master");
    }

    //@Test
    public void testGitBranch() throws  IOException{
        GitUtils.gitNewBranch(gitPath, "dev/test");
    }

    //@Test
    public void testPush() throws IOException{
        GitUtils.gitPush(gitPath, "dev/test", "test");
    }

}

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/FreeMarkerUtilsTest.java

~~~java

/* FileName: FreeMarkerUtilsTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/UtilsTemplateTest.java

~~~java

/* FileName: UtilsTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/EntityTemplateTest.java

~~~java

/* FileName: EntityTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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
public class EntityTemplateTest {
    static Logger logger = LoggerFactory.getLogger(EntityTemplateTest.class);

    @Test
    public void testBasicEntity(){
       String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/entity/basic_entity.ftl");
       String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
       Assert.assertNotNull(result);
    }

    @Test
    public void testUpperEntity(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/entity/upper_entity.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
       Assert.assertNotNull(result);
    }

    @Test
    public void testEntity(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/entity/entity.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }


}

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/ServiceTemplateTest.java

~~~java

/* FileName: DaoTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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
public class ServiceTemplateTest {
    static Logger logger = LoggerFactory.getLogger(ServiceTemplateTest.class);

    @Test
    public void testBasicService(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/service/basic_service.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.getBasicConf());
        Assert.assertNotNull(result);
    }

    @Test
    public void testService(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/service/service.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }
}

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/SampleModelBuilder.java

~~~java

/* FileName: SampleModelBuilder.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class SampleModelBuilder {
    static Logger logger = LoggerFactory.getLogger(SampleModelBuilder.class);

    public static Map<String, String> getBasicConf(){
        Map<String, String> map = new HashMap<>();
        map.put("BASIC_PACKAGE_NAME", "cn.eppdev.test");
        map.put("AUTHOR_NAME", "testAuthor");
        map.put("AUTHOR_EMAIL", "mail@test");
        map.put("YEAR", "2018");
        map.put("MONTH", "01");
        map.put("DAY", "20");
        map.put("DATE", "2018-01-20");
        map.put("COMPANY_NAME", "EPPDEV-TEST");
        map.put("LICENSE_DESC", "MIT");
        return map;
    }

    public static EppdevTable createSampleTable(){
        EppdevTable table = new EppdevTable();
        table.setTableName("test_table");
        table.setEntityName("TestTable");
        table.setModuleName("module");
        List<EppdevColumn> columnList = new ArrayList<>();

        EppdevColumn column = new EppdevColumn();
        column.setColumnName("id");
        column.setPropertyName("id");
        column.setColumnType("char");
        column.setColumnLength(32);
        column.setJavaType("String");
        column.setDbColumnType("char");
        column.setPrimaryKeyFlag(1);
        column.setCreateCompareFlag(0);
        column.setCreateEqualFlag(1);
        column.setCreateLikeFlag(0);
        column.setCreateLeftLikeFlag(0);
        column.setCreateLikeFlag(0);
        column.setCreateInFlag(1);
        column.setColumnComment("UUID，唯一标识");
        column.setLogicKeyFlag(0);
        columnList.add(column);

        EppdevColumn column1 = new EppdevColumn();
        column1.setColumnName("age");
        column1.setPropertyName("age");
        column1.setColumnType("int");
        column1.setJavaType("Integer");
        column1.setDbColumnType("Integer");
        column1.setPrimaryKeyFlag(0);
        column1.setCreateEqualFlag(0);
        column1.setCreateCompareFlag(1);
        column1.setCreateLikeFlag(0);
        column1.setCreateLeftLikeFlag(0);
        column1.setCreateLikeFlag(0);
        column1.setCreateInFlag(1);
        column1.setColumnComment("年龄");
        column1.setLogicKeyFlag(1);
        columnList.add(column1);

        EppdevColumn column2 = new EppdevColumn();
        column2.setColumnName("name");
        column2.setColumnType("varchar");
        column2.setColumnLength(20);
        column2.setPropertyName("name");
        column2.setJavaType("String");
        column2.setDbColumnType("varchar");
        column2.setCreateEqualFlag(0);
        column2.setCreateCompareFlag(0);
        column2.setCreateLikeFlag(1);
        column2.setCreateLeftLikeFlag(1);
        column2.setPrimaryKeyFlag(1);
        column2.setCreateLikeFlag(1);
        column2.setCreateInFlag(1);
        column2.setColumnComment("姓名");
        column2.setLogicKeyFlag(1);
        columnList.add(column2);

        table.setColumnList(columnList);

        table.setBasicConf(getBasicConf());
        return table;
    }
}

~~~

## eppdev-jee-cg/src/test/java/cn/eppdev/jee/cg/utils/MapperTemplateTest.java

~~~java

/* FileName: MapperTemplateTest.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.Assert;

/**
 * @author jinlong.hao
 */
public class MapperTemplateTest {
    static Logger logger = LoggerFactory.getLogger(MapperTemplateTest.class);

    @Test
    public void testUpperMapper(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/mapper/upper_mapper.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }

    @Test
    public void testEntity(){
        String ftl = TemplateFileUtils.readTemplateToString("/eppdev-jee/template/mapper/mapper.ftl");
        String result = FreeMarkerUtils.generate(ftl, SampleModelBuilder.createSampleTable());
        Assert.assertNotNull(result);
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/GitUtils.java

~~~java

/* FileName: GitUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author jinlong.hao
 */
public class GitUtils {
    static Logger logger = LoggerFactory.getLogger(GitUtils.class);

    public static void gitPull(String gitPath, String mainBranchName) throws IOException {
        logger.debug("gitPath:{}", gitPath);
        logger.debug("mainBranchName:{}", mainBranchName);
        if (mainBranchName != null){
            String[] cmd = new String[]{"git", "checkout", mainBranchName};
            exec(cmd, gitPath);
        }
        String[] cmd = new String[]{"git", "pull"};
        exec(cmd, gitPath);
    }

    public static void gitNewBranch(String gitPath, String newBranchName) throws IOException {
        logger.debug("gitPath:{}", gitPath);
        logger.debug("newBranchName:{}", newBranchName);
        if (newBranchName == null){
            return;
        }
        String[] cmd1 = new String[]{"git", "branch", newBranchName};
        String[] cmd2 = new String[]{"git", "checkout", newBranchName};
        exec(cmd1, gitPath);
        exec(cmd2, gitPath);
    }

    public static void gitPush(String gitPath, String newBranchName, String comment) throws IOException {
        logger.debug("gitPath:{}", gitPath);
        logger.debug("newBranchName:{}", newBranchName);
        logger.debug("comment:{}", comment);
        String[] cmd1 = new String[]{"git", "add", "."};
        String[] cmd2 = new String[]{"git", "commit",  "-m", comment};
        exec(cmd1, gitPath);
        exec(cmd2, gitPath);
        if (newBranchName != null){
            String[] cmd3 = new String[]{"git", "push",  "--set-upstream",  "origin", newBranchName};
            exec(cmd3, gitPath);
        } else {
            String[] cmd3 = new String[]{"git", "push"};
            exec(cmd3, gitPath);
        }
    }


    public static void exec(String[] cmd, String dirPath) throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("cmd:{}", Arrays.asList(cmd));
            logger.debug("dirPath:{}", dirPath);
        }
        Process process = Runtime.getRuntime().exec(cmd, new String[]{"GIT_DIR="+dirPath + "/.git", "GIT_WORK_TREE="+dirPath}, null);
        if (logger.isWarnEnabled()){
            Reader reader = new InputStreamReader(process.getErrorStream());
            BufferedReader br = new BufferedReader(reader);
            String s = null;
            while ((s = br.readLine()) != null){
               logger.warn("exec error: {}", s);
            }
            br.close();
        }
        if (logger.isDebugEnabled()){
            Reader reader = new InputStreamReader(process.getInputStream());
            BufferedReader br = new BufferedReader(reader);
            String s = null;
            while ((s = br.readLine()) != null){
                logger.debug("exec output: {}", s);
            }
            br.close();
        }
        process.getOutputStream().close();
    }


    public static String generateNewBranchName(){
        DateFormat df = new SimpleDateFormat("yyyymmdd");
        return "eppdev/" + df.format(new Date()) + "-" + System.currentTimeMillis();
    }


}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/TypeMapperUtils.java

~~~java

/* FileName: TypeMapperUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class TypeMapperUtils {
    static Logger logger = LoggerFactory.getLogger(TypeMapperUtils.class);

    static Map<String, String> DB_TO_STD_MAP = new HashMap<>();

    static Map<String, Boolean> NEED_LENGTH_MAP = new HashMap<>();

    static Map<String, Integer> COLUMN_INDEX_MAP = new HashMap<>();

    static {
        DB_TO_STD_MAP.put("CHAR", "char");
        DB_TO_STD_MAP.put("VARCHAR", "varchar");
        DB_TO_STD_MAP.put("TINYTEXT", "varchar");
        DB_TO_STD_MAP.put("TEXT", "text");
        DB_TO_STD_MAP.put("LONGTEXT", "text");
        DB_TO_STD_MAP.put("MEDIUMTEXT", "text");
        DB_TO_STD_MAP.put("DATE", "datetime");
        DB_TO_STD_MAP.put("DATETIME", "datetime");
        DB_TO_STD_MAP.put("TIMESTAMP", "datetime");
        DB_TO_STD_MAP.put("TINYINT", "int");
        DB_TO_STD_MAP.put("INT", "int");
        DB_TO_STD_MAP.put("BIGINT", "bigint");
        DB_TO_STD_MAP.put("DOUBLE", "double");
        DB_TO_STD_MAP.put("FLOAT", "float ");
        DB_TO_STD_MAP.put("BLOB", "bytes");
        DB_TO_STD_MAP.put("LONGBLOB", "bytes");
        DB_TO_STD_MAP.put("MEDIUMBLOB", "bytes");
        DB_TO_STD_MAP.put("TINYBLOB", "bytes");
        DB_TO_STD_MAP.put("BINARY", "bytes");
        DB_TO_STD_MAP.put("VARBINARY", "bytes");
        DB_TO_STD_MAP.put("DECIMAL", "decimal");
        DB_TO_STD_MAP.put("BIT", "boolean");


        NEED_LENGTH_MAP.put("boolean", false);
        NEED_LENGTH_MAP.put("int", false);
        NEED_LENGTH_MAP.put("long", false);
        NEED_LENGTH_MAP.put("float", false);
        NEED_LENGTH_MAP.put("double", false);
        NEED_LENGTH_MAP.put("char", true);
        NEED_LENGTH_MAP.put("varchar", true);
        NEED_LENGTH_MAP.put("bytes", false);
        NEED_LENGTH_MAP.put("datetime", false);
        NEED_LENGTH_MAP.put("text", false);
        NEED_LENGTH_MAP.put("decimal", false);



        COLUMN_INDEX_MAP.put("id", 1);
        COLUMN_INDEX_MAP.put("remarks", 9999);
        COLUMN_INDEX_MAP.put("create_date", 10000);
        COLUMN_INDEX_MAP.put("create_by", 10001);
        COLUMN_INDEX_MAP.put("update_date", 10002);
        COLUMN_INDEX_MAP.put("update_by", 10003);
        COLUMN_INDEX_MAP.put("del_flag", 10004);
    }

    public static String getStdTypeFromDb(String dbColumnType, String dbType){
        return DB_TO_STD_MAP.get(dbColumnType);
    }


    public static Boolean getNeedLength(String columnType){
        return NEED_LENGTH_MAP.get(columnType);
    }


    public static Integer getDefaultSortIndex(String columnName){
        Integer index = COLUMN_INDEX_MAP.get(columnName);
        if (index != null){
            return index;
        }
        return -1;
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/TemplateFileUtils.java

~~~java

/* FileName: TemplateFileUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/FreeMarkerUtils.java

~~~java

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

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/SourceFileUtils.java

~~~java

/* FileName: SourceFileUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
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

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/FilePathUtils.java

~~~java

/* FileName: FilePathUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.conf.entity.EppdevTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author jinlong.hao
 */
public class FilePathUtils {
    static Logger logger = LoggerFactory.getLogger(FilePathUtils.class);

    public static String getInitFilePath(String fileName, Map<String, String> basicConf) {
        logger.debug("fileName:{}", fileName);
        logger.debug("basicConf:{}", basicConf);
        String projectDir = basicConf.get("PROJECT_PATH");
        String basicPackageName = basicConf.get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/java/" + basicPackageName.replace(".", "/");

        // Utils文件
        if (fileName.endsWith("Utils.java")) {
            return basicPackageDir + "/utils/" + fileName;
        }
        // 其他文件
        else if ("pom.xml".equals(fileName)) {
            return projectDir + "/" + fileName;
        } else if ("Application.java".equals(fileName)) {
            return basicPackageDir + "/" + fileName;
        } else if ("application.properties".equals(fileName)) {
            return projectDir + "/src/main/resources" + "/" + fileName;
        } else if ("BasicDao.java".equals(fileName)) {
            return basicPackageDir + "/commons/dao" + "/" + fileName;
        } else if ("BasicEntity.java".equals(fileName)) {
            return basicPackageDir + "/commons/entity" + "/" + fileName;
        } else if ("BasicParam.java".equals(fileName)) {
            return basicPackageDir + "/commons/param" + "/" + fileName;
        } else if ("BasicService.java".equals(fileName)) {
            return basicPackageDir + "/commons/service" + "/" + fileName;
        }
        return null;
    }

    public static String getEntityFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/entity/" + eppdevTable.getEntityName() + ".java";
    }

    public static String getUpperEntityFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/entity/auto/_" + eppdevTable.getEntityName() + ".java";
    }

    public static String getDaoFilePath(EppdevTable eppdevTable){
        return getModulePackageDir(eppdevTable) + "/dao/" + eppdevTable.getEntityName() + "Dao.java";
    }

    public static String getUpperDaoFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/dao/auto/_" + eppdevTable.getEntityName() + "Dao.java";
    }

    public static String getParamFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/param/" + eppdevTable.getEntityName() + "Param.java";
    }

    public static String getUpperParamFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/param/auto/_" + eppdevTable.getEntityName() + "Param.java";
    }

    public static String getServiceFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/service/" + eppdevTable.getEntityName() + "Service.java";
    }

    public static String getMapperXmlFilePath(EppdevTable eppdevTable) {
        return getModuleSourceDir(eppdevTable) + "/dao/" + eppdevTable.getEntityName() + "Dao.xml";
    }

    public static String getUpperMapperXmlFilePath(EppdevTable eppdevTable) {
        return getModuleSourceDir(eppdevTable) + "/dao/auto/_" + eppdevTable.getEntityName() + "Dao.xml";
    }

    public static String getModuleSourceDir(EppdevTable eppdevTable) {
        String projectDir = eppdevTable.getBasicConf().get("PROJECT_PATH");
        String basicPackageName = eppdevTable.getBasicConf().get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/resources/" + basicPackageName.replace(".", "/");
        if (eppdevTable.getModuleName() != null && eppdevTable.getModuleName().trim().length() > 0){
            return basicPackageDir + "/" + eppdevTable.getModuleName();
        } else {
            return basicPackageDir;
        }
    }




    public static String getModulePackageDir(EppdevTable eppdevTable){
        String projectDir = eppdevTable.getBasicConf().get("PROJECT_PATH");
        String basicPackageName = eppdevTable.getBasicConf().get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/java/" + basicPackageName.replace(".", "/");
        if (eppdevTable.getModuleName() != null && eppdevTable.getModuleName().trim().length() > 0){
            return basicPackageDir + "/" + eppdevTable.getModuleName();
        } else {
            return basicPackageDir;
        }
    }

    public static String getBasicPackageDir(Map<String, String> basicConf){
        String projectDir = basicConf.get("PROJECT_PATH");
        String basicPackageName = basicConf.get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/java/" + basicPackageName.replace(".", "/");
        return basicPackageDir;
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/utils/GeneratorUtils.java

~~~java

/* FileName: GeneratorUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.cg.entity.ColumnTypeInfo;
import cn.eppdev.jee.cg.entity.InitFileInfo;
import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.cg.entity.TableFileInfo;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class GeneratorUtils {
    static Logger logger = LoggerFactory.getLogger(GeneratorUtils.class);

    static List<InitFileType> INIT_FILE_TYPE_LIST = new ArrayList<>();

    static List<TableFileInfo> TABLE_FILE_INFO_LIST = new ArrayList<>();

    static {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document= documentBuilder.parse(GeneratorUtils.class.getResourceAsStream("/eppdev-jee/conf/eppdev.xml"));

            // 处理InitFileType
            NodeList initFileTypeNodeList = document.getElementsByTagName("initFileType");
            for (int i=0; i< initFileTypeNodeList.getLength(); i++){
                Node node = initFileTypeNodeList.item(i);
                NamedNodeMap attrs = node.getAttributes();
                String typeId = attrs.getNamedItem("typeId").getNodeValue();
                String typeName = attrs.getNamedItem("typeName").getNodeValue();
                InitFileType initFileType = new InitFileType(typeId, typeName);
                INIT_FILE_TYPE_LIST.add(initFileType);
            }

            // 处理InitFile
            NodeList initFileNodeList = document.getElementsByTagName("initFile");
            for (int i=0; i< initFileNodeList.getLength(); i++){
                Node node = initFileNodeList.item(i);
                InitFileInfo initFileInfo = new InitFileInfo();
                String fileName = node.getAttributes().getNamedItem("fileName").getNodeValue();
                initFileInfo.setFileName(fileName);
                String type = node.getAttributes().getNamedItem("type").getNodeValue();
                NodeList initFileAttrNodeList = node.getChildNodes();
                for (int j=0; j<initFileAttrNodeList.getLength(); j++){
                   Node node2 = initFileAttrNodeList.item(j);
                   if (node2.getNodeName().equals("filePathTemplate")){
                       String filePathTemplateStr = node2.getTextContent().trim();
                       initFileInfo.setFilePathTemplate(FreeMarkerUtils.getTemplate(filePathTemplateStr));
                   } else if (node2.getNodeName().equals("contentTemplatePath")){
                       String contentTemplatePath = node2.getTextContent().trim();
                       initFileInfo.setContentTemplate(FreeMarkerUtils.getTemplate(TemplateFileUtils.readTemplateToString(contentTemplatePath)));
                   } else if (node2.getNodeName().equals("fileInfo")){
                       String fileInfo = node2.getTextContent().trim();
                       initFileInfo.setFileInfo(fileInfo);
                   }
                }
                logger.debug("initFileInfo:{}", initFileInfo);
                for (InitFileType initFileType: INIT_FILE_TYPE_LIST){
                    if (initFileType.getTypeId().equals(type)){
                        initFileType.getFileInfoList().add(initFileInfo);
                    }
                }
            }

            // 处理TableFileInfo
            NodeList tableFileNodeList = document.getElementsByTagName("tableFile");
            for (int i=0; i< tableFileNodeList.getLength(); i++){
                Node node = tableFileNodeList.item(i);
                String type = node.getAttributes().getNamedItem("type").getNodeValue();
                String replace = node.getAttributes().getNamedItem("replace").getNodeValue();
                TableFileInfo tableFileInfo = new TableFileInfo(type, "true".equals(replace.trim().toLowerCase()));
                NodeList initFileAttrNodeList = node.getChildNodes();
                for (int j=0; j<initFileAttrNodeList.getLength(); j++){
                    Node node2 = initFileAttrNodeList.item(j);
                    if (node2.getNodeName().equals("filePathTemplate")){
                        String filePathTemplateStr = node2.getTextContent().trim();
                        tableFileInfo.setFilePathTemplate(FreeMarkerUtils.getTemplate(filePathTemplateStr));
                    } else if (node2.getNodeName().equals("contentTemplatePath")){
                        String dbType = node2.getAttributes().getNamedItem("dbType").getNodeValue();
                        String contentTemplatePath = node2.getTextContent().trim();
                        Template template = FreeMarkerUtils.getTemplate(TemplateFileUtils.readTemplateToString(contentTemplatePath));
                        tableFileInfo.setContentTemplate(dbType, template);
                    }
                }
                logger.debug("tableFileInfo:{}", tableFileInfo);
                TABLE_FILE_INFO_LIST.add(tableFileInfo);
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<InitFileType> getInitFileTypeList(String dbType) {
        return INIT_FILE_TYPE_LIST;
    }


    public static InitFileInfo getInitFileInfo(String dbType, String fileName) {
        for (InitFileType initFileType : INIT_FILE_TYPE_LIST){
            for (InitFileInfo initFileInfo: initFileType.getFileInfoList()){
                if (fileName.equals(initFileInfo.getFileName())){
                    return initFileInfo;
                }
            }
        }
        return null;
    }


    public static List<TableFileInfo> getTableFileInfoList() {
        return TABLE_FILE_INFO_LIST;
    }

    public static TableFileInfo getTableFileInfo(String dbType, String type){
        for (TableFileInfo tableFileInfo: TABLE_FILE_INFO_LIST){
            if (type.equals(tableFileInfo.getType())){
                return tableFileInfo;
            }
        }
        return null;
    }


    public static List<ColumnTypeInfo> listAllColumnType(String dbType){
        List<ColumnTypeInfo> list = new ArrayList<>();
        list.add(new ColumnTypeInfo("int", "Integer", "integer"));
        list.add(new ColumnTypeInfo("long", "Integer", "long"));
        list.add(new ColumnTypeInfo("decimal", "java.math.BigDecimal", "double"));
        list.add(new ColumnTypeInfo("char", "String", "char"));
        list.add(new ColumnTypeInfo("varchar", "String", "varchar"));
        list.add(new ColumnTypeInfo("text", "String", "text"));
        list.add(new ColumnTypeInfo("boolean", "Boolean", "bit(1)"));
        list.add(new ColumnTypeInfo("datetime", "java.util.Date", "datetime"));
        list.add(new ColumnTypeInfo("float", "Float", "float"));
        list.add(new ColumnTypeInfo("double", "Double", "double"));
        list.add(new ColumnTypeInfo("blob", "byte[]", "blob"));
        return list;
    }

    public static String getDbColumnType(String dbType, String columnType){
        for (ColumnTypeInfo typeInfo: listAllColumnType(dbType)){
            if (typeInfo.getColumnType().equals(columnType)){
                return typeInfo.getDbColumnType();
            }
        }
        return null;
    }

    public static String getJavaType(String dbType, String columnType){
        for (ColumnTypeInfo typeInfo: listAllColumnType(dbType)){
            if (typeInfo.getColumnType().equals(columnType)){
                return typeInfo.getJavaType();
            }
        }
        return null;
    }

}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/entity/TableFileInfo.java

~~~java

/* FileName: TableFileInfo.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import cn.eppdev.jee.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class TableFileInfo{
    static Logger logger = LoggerFactory.getLogger(TableFileInfo.class);

    static final String DB_TYPE_DEFAULT = "default";

    String type;

    Boolean replace;

    String filePath;

    @JsonIgnore
    Template filePathTemplate;

    @JsonIgnore
    Map<String, Template> contentTemplateMap = new HashMap<>();

    public TableFileInfo(String type, Boolean replace) {
        this.type = type;
        this.replace = replace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Template getFilePathTemplate() {
        return filePathTemplate;
    }

    public void setFilePathTemplate(Template filePathTemplate) {
        this.filePathTemplate = filePathTemplate;
    }

    public Boolean getReplace() {
        return replace;
    }

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setContentTemplate(String dbType, Template template){
        contentTemplateMap.put(dbType, template);
    }

    public Template getContentTemplate(String dbType){
        if (contentTemplateMap.containsKey(dbType)){
            return contentTemplateMap.get(dbType);
        } else {
            return contentTemplateMap.get(DB_TYPE_DEFAULT);
        }
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/entity/InitFileInfo.java

~~~java

/* FileName: InitFileInfo.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import cn.eppdev.jee.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class InitFileInfo {
    static Logger logger = LoggerFactory.getLogger(InitFileInfo.class);

    String fileName;

    String fileInfo;

    String filePath;

    public InitFileInfo(){}

    public InitFileInfo(String fileName, String fileInfo) {
        this.fileName = fileName;
        this.fileInfo = fileInfo;
    }

    @JsonIgnore
    Template filePathTemplate;

    @JsonIgnore
    Template contentTemplate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
    }

    public Template getFilePathTemplate() {
        return filePathTemplate;
    }

    public void setFilePathTemplate(Template filePathTemplate) {
        this.filePathTemplate = filePathTemplate;
    }

    public Template getContentTemplate() {
        return contentTemplate;
    }

    public void setContentTemplate(Template contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/entity/ColumnTypeInfo.java

~~~java

/* FileName: ColumnTypeInfo.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class ColumnTypeInfo {
    static Logger logger = LoggerFactory.getLogger(ColumnTypeInfo.class);

    String columnType;

    String javaType;

    String dbColumnType;

    public ColumnTypeInfo(String columnType, String javaType) {
        this.columnType = columnType;
        this.javaType= javaType;
    }

    public ColumnTypeInfo(String columnType, String javaType, String dbColumnType) {
        this.columnType = columnType;
        this.javaType = javaType;
        this.dbColumnType = dbColumnType;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getDbColumnType() {
        return dbColumnType;
    }

    public void setDbColumnType(String dbColumnType) {
        this.dbColumnType = dbColumnType;
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/entity/InitFileType.java

~~~java

/* FileName: InitFileType.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import cn.eppdev.jee.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class InitFileType {
    static Logger logger = LoggerFactory.getLogger(InitFileType.class);

    String typeId;
    String typeName;
    List<InitFileInfo> fileInfoList = new ArrayList<>();

    public InitFileType(){}

    public InitFileType(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<InitFileInfo> getFileInfoList() {
        return fileInfoList;
    }

    public void setFileInfoList(List<InitFileInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/service/ColumnGeneratorService.java

~~~java

/* FileName: ColumnGeneratorService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.entity.ColumnTypeInfo;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class ColumnGeneratorService {
    static Logger logger = LoggerFactory.getLogger(ColumnGeneratorService.class);

    public List<EppdevColumn> generateDefaultColumn(){
        List<EppdevColumn> list = new ArrayList<>();

        // ID
        EppdevColumn columnId = new EppdevColumn();
        columnId.setColumnName("id");
        columnId.setColumnType("char");
        columnId.setColumnLength(32);
        columnId.setSortIndex(1);
        columnId.setPrimaryKeyFlag(1);
        columnId.setLogicKeyFlag(0);
        columnId.setColumnComment("UUID，唯一标识");
        columnId.setPropertyName("id");
        columnId.setJavaType("String");
        columnId.setOriginColumnId(null);
        columnId.setCreateEqualFlag(1);
        columnId.setCreateInFlag(1);
        columnId.setRemarks(null);
        columnId.setCreateBy("eppdev");
        columnId.setUpdateBy("eppdev");
        columnId.setDelFlag(0);
        list.add(columnId);


        // createDate
        EppdevColumn columnCreateDate = new EppdevColumn();
        columnCreateDate.setColumnName("create_date");
        columnCreateDate.setColumnType("datetime");
        columnCreateDate.setColumnLength(null);
        columnCreateDate.setSortIndex(10001);
        columnCreateDate.setPrimaryKeyFlag(0);
        columnCreateDate.setLogicKeyFlag(0);
        columnCreateDate.setColumnComment("数据创建时间（技术字段）");
        columnCreateDate.setPropertyName("createDate");
        columnCreateDate.setJavaType("java.utils.Date");
        columnCreateDate.setOriginColumnId(null);
        columnCreateDate.setRemarks(null);
        columnCreateDate.setCreateBy("eppdev");
        columnCreateDate.setUpdateBy("eppdev");
        columnCreateDate.setDelFlag(0);
        list.add(columnCreateDate);



        // updateDate
        EppdevColumn columnUpdateDate = new EppdevColumn();
        columnUpdateDate.setColumnName("update_date");
        columnUpdateDate.setColumnType("datetime");
        columnUpdateDate.setColumnLength(null);
        columnUpdateDate.setSortIndex(10002);
        columnUpdateDate.setPrimaryKeyFlag(0);
        columnUpdateDate.setLogicKeyFlag(0);
        columnUpdateDate.setColumnComment("数据最后修改时间（技术字段）");
        columnUpdateDate.setPropertyName("updateDate");
        columnUpdateDate.setJavaType("java.utils.Date");
        columnUpdateDate.setOriginColumnId(null);
        columnUpdateDate.setRemarks(null);
        columnUpdateDate.setCreateBy("eppdev");
        columnUpdateDate.setUpdateBy("eppdev");
        columnUpdateDate.setDelFlag(0);
        list.add(columnUpdateDate);


        // createBy
        EppdevColumn columnCreateBy = new EppdevColumn();
        columnCreateBy.setColumnName("create_by");
        columnCreateBy.setColumnType("char");
        columnCreateBy.setColumnLength(32);
        columnCreateBy.setSortIndex(10003);
        columnCreateBy.setPrimaryKeyFlag(0);
        columnCreateBy.setLogicKeyFlag(0);
        columnCreateBy.setColumnComment("数据创建人ID（技术字段）");
        columnCreateBy.setPropertyName("createBy");
        columnCreateBy.setJavaType("String");
        columnCreateBy.setOriginColumnId(null);
        columnCreateBy.setCreateEqualFlag(1);
        columnCreateBy.setRemarks(null);
        columnCreateBy.setCreateBy("eppdev");
        columnCreateBy.setUpdateBy("eppdev");
        columnCreateBy.setDelFlag(0);
        list.add(columnCreateBy);


        // updateBy
        EppdevColumn columnUpdateBy = new EppdevColumn();
        columnUpdateBy.setColumnName("update_by");
        columnUpdateBy.setColumnType("char");
        columnUpdateBy.setColumnLength(32);
        columnUpdateBy.setSortIndex(10004);
        columnUpdateBy.setPrimaryKeyFlag(0);
        columnUpdateBy.setLogicKeyFlag(0);
        columnUpdateBy.setColumnComment("数据最后修改人ID（技术字段）");
        columnUpdateBy.setPropertyName("updateBy");
        columnUpdateBy.setJavaType("String");
        columnUpdateBy.setOriginColumnId(null);
        columnUpdateBy.setCreateEqualFlag(1);
        columnUpdateBy.setRemarks(null);
        columnUpdateBy.setCreateBy("eppdev");
        columnUpdateBy.setUpdateBy("eppdev");
        columnUpdateBy.setDelFlag(0);
        list.add(columnUpdateBy);


        // remarks
        EppdevColumn columnRemarks = new EppdevColumn();
        columnRemarks.setColumnName("remarks");
        columnRemarks.setColumnType("varchar");
        columnRemarks.setColumnLength(1024);
        columnRemarks.setSortIndex(10005);
        columnRemarks.setPrimaryKeyFlag(0);
        columnRemarks.setLogicKeyFlag(0);
        columnRemarks.setColumnComment("备注（技术字段）");
        columnRemarks.setPropertyName("remarks");
        columnRemarks.setJavaType("String");
        columnRemarks.setOriginColumnId(null);
        columnRemarks.setRemarks(null);
        columnRemarks.setCreateBy("eppdev");
        columnRemarks.setUpdateBy("eppdev");
        columnRemarks.setDelFlag(0);
        list.add(columnRemarks);

        // delFlag
        EppdevColumn columnDelFlag = new EppdevColumn();
        columnDelFlag.setColumnName("del_flag");
        columnDelFlag.setColumnType("int");
        columnDelFlag.setColumnLength(null);
        columnDelFlag.setSortIndex(10006);
        columnDelFlag.setPrimaryKeyFlag(0);
        columnDelFlag.setLogicKeyFlag(0);
        columnDelFlag.setColumnComment("删除标识（技术字段）");
        columnDelFlag.setPropertyName("delFlag");
        columnDelFlag.setJavaType("Integer");
        columnDelFlag.setOriginColumnId(null);
        columnDelFlag.setCreateEqualFlag(1);
        columnDelFlag.setCreateLikeFlag(0);
        columnDelFlag.setCreateLeftLikeFlag(0);
        columnDelFlag.setCreateInFlag(0);
        columnDelFlag.setCreateCompareFlag(0);
        columnDelFlag.setRemarks(null);
        columnDelFlag.setCreateBy("eppdev");
        columnDelFlag.setUpdateBy("eppdev");
        columnDelFlag.setDelFlag(0);
        list.add(columnDelFlag);

        return list;
    }

    public List<ColumnTypeInfo> listAllColumnType(String dbType){
        return GeneratorUtils.listAllColumnType(dbType);
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/service/GitService.java

~~~java

/* FileName: GitService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.utils.GitUtils;
import cn.eppdev.jee.conf.service.EppdevConfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author jinlong.hao
 */
@Service
public class GitService {
    static Logger logger = LoggerFactory.getLogger(GitService.class);


    @Autowired
    EppdevConfService confService;

    public void pull() throws IOException {
        if ("1".equals(confService.getGitAutoPush())){
            if ("1".equals(confService.getGitUseNewBranch())){  // 使用新的分支，pull以前需要checkout到主分支
                GitUtils.gitPull(confService.getGitPath(), confService.getGitMainBranchName());
            } else {  // 不使用新分支，不用checkout
                GitUtils.gitPull(confService.getGitPath(), null);
            }
        } else{
            logger.debug("不需要人工提交");
        }
    }


    public void push(String newBranchName, String comment) throws IOException {
        logger.debug("newBranchName:{}", newBranchName);
        logger.debug("comment:{}", comment);
        if ("1".equals(confService.getGitAutoPush())){
            if ("1".equals(confService.getGitUseNewBranch())){  // 使用新的分支，需要git push --set-upstream
                logger.debug("创建新的分支{}，自动提交", newBranchName);
                GitUtils.gitNewBranch(confService.getGitPath(), newBranchName);
                GitUtils.gitPush(confService.getGitPath(), newBranchName, comment);
            } else {  // 不使用新分支，直接git push即可
                logger.debug("不创建新的分支，自动提交");
                GitUtils.gitPush(confService.getGitPath(), null, comment);
            }
        } else{
            logger.debug("不需要自动提交");
        }
    }
}

~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/service/FileGeneratorService.java

~~~java

/* FileName: FileGeneratorService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.entity.InitFileInfo;
import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.cg.entity.TableFileInfo;
import cn.eppdev.jee.cg.utils.*;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.service.EppdevConfService;
import cn.eppdev.jee.conf.service.EppdevTableService;
import cn.eppdev.jee.utils.StringUtils;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class FileGeneratorService {
    static Logger logger = LoggerFactory.getLogger(FileGeneratorService.class);

    @Autowired
    EppdevConfService confService;

    @Autowired
    EppdevTableService tableService;

    @Autowired
    GitService gitService;

    public String getInitFileContent(String fileName) throws IOException, TemplateException {
        Map<String, String> basicConf = confService.getAllConf();
        String dbType = basicConf.get("DB_TYPE");
        return FreeMarkerUtils.buildResult(GeneratorUtils.getInitFileInfo(dbType, fileName).getContentTemplate(), basicConf);
    }

    public Map<String, String> generateAllInitFile() throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // 1. git pull
        gitService.pull();

        // 2. generator init file
        List<InitFileType> fileTypeList = GeneratorUtils.getInitFileTypeList(confService.getDbType());
        for (InitFileType fileType : fileTypeList) {
            for (InitFileInfo initFileInfo : fileType.getFileInfoList()) {
                logger.debug("generate file: {}", initFileInfo.getFileName());
                String filePath = FreeMarkerUtils.buildResult(initFileInfo.getFilePathTemplate(), confService.getAllConf());
                String fileContent = FreeMarkerUtils.buildResult(initFileInfo.getContentTemplate(), confService.getAllConf());
                int cnt = SourceFileUtils.writeFile(filePath, fileContent, false);
                if (cnt > 0) {
                    count++;
                    map.put(initFileInfo.getFileName(), "Success");
                    sb.append(initFileInfo.getFileName());
                }
            }
        }

        // 3. git push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(), "generate " + StringUtils.removeEnd(sb.toString(), ","));
        }

        return map;
    }


    public Map<String, String> generateInitFileByType(String type) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // 1. git pull
        gitService.pull();

        // 2. generator init file
        List<InitFileType> fileTypeList = GeneratorUtils.getInitFileTypeList(confService.getDbType());
        for (InitFileType fileType : fileTypeList) {
            if (type.equals(fileType.getTypeId())) {
                for (InitFileInfo initFileInfo : fileType.getFileInfoList()) {
                    logger.debug("generate file: {}", initFileInfo.getFileName());
                    String filePath = FreeMarkerUtils.buildResult(initFileInfo.getFilePathTemplate(), confService.getAllConf());
                    String fileContent = FreeMarkerUtils.buildResult(initFileInfo.getContentTemplate(), confService.getAllConf());
                    int cnt = SourceFileUtils.writeFile(filePath, fileContent, false);
                    if (cnt > 0) {
                        count++;
                        map.put(initFileInfo.getFileName(), "Success");
                        sb.append(initFileInfo.getFileName());
                    }
                }
            }
        }

        // 3. git push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(), "generate " + StringUtils.removeEnd(sb.toString(), ","));
        }

        return map;
    }


    public Map<String, String> generateInitFileByFileName(String fileName) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();

        // 1. git pull
        gitService.pull();

        // 2. generator init file
        InitFileInfo initFileInfo = GeneratorUtils.getInitFileInfo(confService.getDbType(), fileName);
        logger.debug("generate file: {}", initFileInfo.getFileName());
        String filePath = FreeMarkerUtils.buildResult(initFileInfo.getFilePathTemplate(), confService.getAllConf());
        String fileContent = FreeMarkerUtils.buildResult(initFileInfo.getContentTemplate(), confService.getAllConf());
        int cnt = SourceFileUtils.writeFile(filePath, fileContent, false);

        // 3. build result and push
        if (cnt > 0) {
            map.put(initFileInfo.getFileName(), "Success");
            gitService.push(GitUtils.generateNewBranchName(), "generate " + fileName);
        }

        return map;
    }

    public Map<String, String> generateAllTableFile(String tableId) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // 1. git pull
        gitService.pull();

        // 2. generator tableFile
        EppdevTable eppdevTable = getTableInfo(tableId);
        List<TableFileInfo> tableFileInfoList = GeneratorUtils.getTableFileInfoList();
        for (TableFileInfo tableFileInfo : tableFileInfoList) {
            logger.debug("generate {} for {}", tableFileInfo.getType(), eppdevTable.getTableName());
            String filePath = FreeMarkerUtils.buildResult(tableFileInfo.getFilePathTemplate(), eppdevTable);
            String content = FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
            int cnt = SourceFileUtils.writeFile(filePath, content, tableFileInfo.getReplace());
            if (cnt > 0) {
                count++;
                map.put(tableFileInfo.getType(), "Success");
                sb.append(tableFileInfo.getType());
            }
        }

        // 3. git push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(),
                    "generate " + StringUtils.removeEnd(sb.toString(), ",") + " for " + eppdevTable.getTableName());
        }

        return map;
    }

    public Map<String, String> generateVersionFileByType(String versionId, String type) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();

        // 1. git pull
        gitService.pull();

        // 2. generate file
        List<EppdevTable> list = tableService.listByVersionId(versionId);
        int count = 0;
        for (EppdevTable table : list) {
            EppdevTable eppdevTable = getTableInfo(table.getId());
            TableFileInfo tableFileInfo = GeneratorUtils.getTableFileInfo(confService.getDbType(), type);
            logger.debug("generate {} for {}", eppdevTable.getTableName(), type);
            String filePath = FreeMarkerUtils.buildResult(tableFileInfo.getFilePathTemplate(), eppdevTable);
            String fileContent = FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
            int cnt = SourceFileUtils.writeFile(filePath, fileContent, tableFileInfo.getReplace());
            if (cnt > 0){
                map.put(eppdevTable.getTableName(), "Success");
            }
            count += cnt;
        }

        // 3. build result and push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(), "regenerate " + type + " for " + versionId);
        }
        return map;
    }


    public Map<String, String> generateTableFileByType(String tableId, String type) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();

        // 1. git pull
        gitService.pull();

        // 2. generator init file
        EppdevTable eppdevTable = getTableInfo(tableId);
        TableFileInfo tableFileInfo = GeneratorUtils.getTableFileInfo(confService.getDbType(), type);
        logger.debug("generate {} for {}", eppdevTable.getTableName(), type);
        String filePath = FreeMarkerUtils.buildResult(tableFileInfo.getFilePathTemplate(), eppdevTable);
        String fileContent = FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
        int cnt = SourceFileUtils.writeFile(filePath, fileContent, tableFileInfo.getReplace());

        // 3. build result and push
        if (cnt > 0) {
            map.put(type, "Success");
            gitService.push(GitUtils.generateNewBranchName(), "generate " + type + " for " + eppdevTable.getTableName());
        }

        return map;
    }

    public String generateContent(String tableId, String type) throws IOException, TemplateException {
        EppdevTable eppdevTable = getTableInfo(tableId);
        TableFileInfo tableFileInfo = GeneratorUtils.getTableFileInfo(confService.getDbType(), type);
        return FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
    }


    public EppdevTable getTableInfo(String tableId) {
        EppdevTable eppdevTable = tableService.get(tableId);
        for (EppdevColumn column : eppdevTable.getColumnList()) {
            column.setJavaType(GeneratorUtils.getJavaType(confService.getDbType(), column.getColumnType()));
            column.setDbColumnType(GeneratorUtils.getDbColumnType(confService.getDbType(), column.getColumnType()));
        }
        return eppdevTable;
    }
}


~~~

## eppdev-jee-cg/src/main/java/cn/eppdev/jee/cg/service/DataSchemaLoadService.java

~~~java

/* FileName: DataSchemaLoadService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.utils.TypeMapperUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevColumnParam;
import cn.eppdev.jee.conf.param.EppdevTableParam;
import cn.eppdev.jee.conf.service.*;
import cn.eppdev.jee.utils.JSONUtils;
import cn.eppdev.jee.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author jinlong.hao
 */
@Service
public class DataSchemaLoadService {
    static Logger logger = LoggerFactory.getLogger(DataSchemaLoadService.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    EppdevConfService confService;

    @Autowired
    EppdevTableService tableService;

    @Autowired
    EppdevColumnService columnService;

    @Autowired
    EppdevIndexService indexService;

    @Autowired
    EppdevVersionService versionService;

    /**
     * 根据表名，读取表信息，具体逻辑包括：<br />
     * <ul>
     *   <li>1. 判断表是否存在</li>
     *   <li>2. 读取列信息</li>
     *   <li>3. 读取主键信息</li>
     *   <li>4. 读取索引信息</li>
     * </ul>
     */
    public EppdevTable getTableFromConn(String tableName) {
        try {
            Connection conn = dataSource.getConnection();
            String[] tableTypes = { "TABLE", "VIEW" };
            ResultSet rs = conn.getMetaData().getTables(null, null, tableName, tableTypes);
            /***********************************
             * 一、判断表是否存在
             ***********************************/
            EppdevTable eppdevTable = new EppdevTable();
            if (rs.next()) {
                eppdevTable.setTableName(rs.getString("TABLE_NAME"));
                eppdevTable.setTableComment(rs.getString("REMARKS"));
                eppdevTable.setVersionId(EppdevVersion.MASTER_VERSION_ID);
            } else {
                return null;
            }
            rs.close();

            /***********************************
             * 二、读取列信息
             ***********************************/
            rs = conn.getMetaData().getColumns(null, null, eppdevTable.getTableName(), null);
            List<EppdevColumn> columnList = new ArrayList<>();
            while (rs.next()) {
                EppdevColumn column = new EppdevColumn();
                column.setColumnName(rs.getString("COLUMN_NAME").toLowerCase());
                column.setColumnType(rs.getString("TYPE_NAME"));
                column.setColumnLength(rs.getInt("COLUMN_SIZE"));
                column.setColumnComment(rs.getString("REMARKS"));
                columnList.add(column);
            }
            eppdevTable.setColumnList(columnList);
            rs.close();

            /***********************************
             * 三、读取主键信息
             ***********************************/
            rs = conn.getMetaData().getPrimaryKeys(null, null, eppdevTable.getTableName());
            while (rs.next()) {
                String primaryKeyColumnName = rs.getString("COLUMN_NAME");
                for (EppdevColumn column : eppdevTable.getColumnList()) {
                    if (column.getColumnName().equals(primaryKeyColumnName)) {
                        column.setPrimaryKeyFlag(1);
                    }
                }
            }

            /***********************************
             * 四、处理索引信息
             ***********************************/
            rs = conn.getMetaData().getIndexInfo(null, null, eppdevTable.getTableName(), false, true);

            // 4.1 依次读取数据
            Map<String, List<Map<String, Object>>> indexMap = new HashMap<>();
            while (rs.next()) {
                String indexName = rs.getString("INDEX_NAME");
                String columnName = rs.getString("COLUMN_NAME");
                int indexPosition = rs.getInt("ORDINAL_POSITION");
                Map<String, Object> columnInfoMap = new HashMap<>();
                columnInfoMap.put("columnName", columnName);
                columnInfoMap.put("indexPosition", indexPosition);
                if (indexMap.containsKey(indexName)) {
                    List<Map<String, Object>> list = indexMap.get(indexName);
                    list.add(columnInfoMap);
                } else {
                    List<Map<String, Object>> list = new ArrayList<>();
                    list.add(columnInfoMap);
                    indexMap.put(indexName, list);
                }
            }
            rs.close();

            // 4.2 处理索引信息数据，进行数据还原
            List<EppdevIndex> indexList = new ArrayList<>();
            for (String idxName : indexMap.keySet()) {
                StringBuilder sb = new StringBuilder();
                List<Map<String, Object>> colList = indexMap.get(idxName);
                colList.sort(new Comparator<Map<String, Object>>() {
                    @Override
                    public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                        return ((Integer) o1.get("indexPosition")).compareTo((Integer) o2.get("indexPosition"));
                    }
                });
                for (Map<String, Object> map : colList) {
                    sb.append(map.get("columnName") + ",");
                }
                String indexColumns = StringUtils.removeEnd(sb.toString(), ",");
                EppdevIndex index = new EppdevIndex();
                index.setIndexName(idxName);
                index.setColumnNames(indexColumns);
                indexList.add(index);
            }
            eppdevTable.setIndexList(indexList);
            conn.close();
            return eppdevTable;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<EppdevTable> listTablesFromConn() {
        List<EppdevTable> eppdevTableList = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            String[] tableTypes = { "TABLE", "VIEW" };
            ResultSet rs = conn.getMetaData().getTables(null, null, null, tableTypes);
            // 表信息
            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                eppdevTableList.add(getTableFromConn(tableName));
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return eppdevTableList;
    }

    @Transactional(readOnly = false)
    public void updateTableInfo() {
        List<EppdevTable> eppdevTableList = listTablesFromConn();
        logger.debug("eppdevTableList:{}", JSONUtils.toJson(eppdevTableList));

        for (EppdevTable table : eppdevTableList) {
            updateTableInfo(table);
        }

    }

    /**
     * 根据表名进行数据更新
     * @param tableName 更新数据
     */
    public void  updateTableInfo(String tableName){
        logger.debug("tableName: {}", tableName);
        updateTableInfo(getTableFromConn(tableName));
    }

    /**
     * 更新物理表信息到配置数据中
     * @param table 读取到的物理表信息
     */
    public void updateTableInfo(EppdevTable table){
        logger.debug("table:{}", table);
            // 处理表信息
            String tableId = null;
            String tableName = table.getTableName();
            EppdevTableParam table1Param = new EppdevTableParam();
            table1Param.setTableName(tableName);
            table1Param.setVersionId(EppdevVersion.MASTER_VERSION_ID);
            List<EppdevTable> resultList = tableService.list(table1Param).getList();
            if (resultList.size() > 1) {
                throw new RuntimeException("内部错误，重复表：" + tableName);
            } else if (resultList.size() == 1) {
                tableId = resultList.get(0).getId();
            } else {
                tableService.save(table);
                tableId = table.getId();
            }

            // 处理字段信息
            EppdevColumnParam columnParm = new EppdevColumnParam();
            columnParm.setTableId(tableId);
            List<EppdevColumn> columnListOrigin = columnService.list(columnParm).getList();
            logger.debug("columnListOrigin: {}", columnListOrigin);
            List<EppdevColumn> columnListNew = table.getColumnList();
            logger.debug("columnListNew: {}", columnListNew);

            // 记录sortIndex
            int sortIndex = 2;
            for (EppdevColumn column : columnListOrigin) {
                if (column.getSortIndex() > sortIndex && column.getSortIndex() < 9999) {
                    sortIndex = column.getSortIndex() + 1;
                }
            }

            // 物理库表中列信息与_eppdev_column表中的数据进行对比
            for (EppdevColumn column : columnListNew) {
                logger.debug("column: {}", column);
                boolean exists = false;
                column.setTableId(tableId);
                String newType = TypeMapperUtils.getStdTypeFromDb(column.getColumnType(), confService.getDbType());
                if (column.getColumnType() == null) {
                    logger.error("Error when generate columnType: {}", column);
                    throw new RuntimeException("库表类型暂不支持：" + column.getColumnType());
                }
                column.setColumnType(newType);

                for (EppdevColumn originColumn : columnListOrigin) {
                    if (column.getColumnName().equals(originColumn.getColumnName())) {
                        if (!column.getColumnType().equals(originColumn.getColumnType()) // 类型不同
                                || (TypeMapperUtils.getNeedLength(column.getColumnType()) // 长度有意义且长度不一致
                                        && column.getColumnLength() != originColumn.getColumnLength())) {
                            originColumn.setColumnType(column.getColumnType());
                            if (null != column.getColumnComment() && column.getColumnComment().trim().length() > 0) {
                                originColumn.setColumnComment(column.getColumnComment());
                            }
                            columnService.save(originColumn);
                        }
                        exists = true;
                        break;
                    }
                }
                if (!exists) {

                    // sortIndex
                    int sortIdx = TypeMapperUtils.getDefaultSortIndex(column.getColumnName());
                    if (sortIdx > 0) {
                        column.setSortIndex(sortIdx);
                    } else {
                        column.setSortIndex(sortIndex++);
                    }

                    // primaryKeyFlag
                    if (column.getPrimaryKeyFlag() == null) {
                        column.setPrimaryKeyFlag(0);
                    }

                    // logicKeyFlag
                    column.setLogicKeyFlag(0);

                    // createEqualFlag
                    if (column.getColumnName().equals("id") || column.getColumnName().equals("del_flag")) {
                        column.setCreateEqualFlag(1);
                    } else {
                        column.setCreateEqualFlag(0);
                    }

                    // createFlag
                    column.setCreateInFlag(0);
                    column.setCreateLikeFlag(0);
                    column.setCreateLeftLikeFlag(0);
                    column.setCreateCompareFlag(0);

                    columnService.save(column);
                }

            }

            // _eppdev_column表中的数据与物理库表信息进行对比
            for (EppdevColumn column : columnListOrigin) {
                boolean exists = false;
                for (EppdevColumn newColumn : columnListNew) {
                    if (column.getColumnName().equals(newColumn.getColumnName())) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    columnService.delete(column.getId());
                }
            }

            // 处理索引信息
            for (EppdevIndex idx : table.getIndexList()) {
                idx.setTableId(tableId);
                indexService.save(idx);
            }
    }

}


~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/conf/eppdev.xml

~~~java

<eppdev>
    <initFileList>

        <initFileType typeId="conf" typeName="基础配置" />
        <initFileType typeId="basic" typeName="基础类" />
        <initFileType typeId="utils" typeName="工具类" />
        <initFileType typeId="testConf" typeName="测试配置" />

        <!-- init.conf -->
        <initFile fileName="pom.xml" type="conf">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/pom.xml]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/conf/pom.xml.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[maven工程的pom文件, 多模块方式需调整]]>
            </fileInfo>
        </initFile>
        <initFile fileName="application.properties" type="conf">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/resources/application.properties]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/conf/application.properties.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[springboot的配置文件，多模块方式需复制到相应目录中]]>
            </fileInfo>
        </initFile>
        <initFile fileName="Application.java" type="conf">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/Application.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/conf/Application.java.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[springboot的启动文件，多模块方式需调整]]>
            </fileInfo>
        </initFile>
        <initFile fileName=".gitignore" type="conf">
            <filePathTemplate>
                <![CDATA[${GIT_PATH}/.gitignore]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/conf/gitignore.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[Git初始化文件，用于确保IDE相关文件不上传]]>
            </fileInfo>
        </initFile>


        <!-- init.basic -->
        <initFile fileName="BasicDao.java" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/dao/BasicDao.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/dao/basic_dao.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成本工程Dao类的父类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="BasicEntity.java" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/entity/BasicEntity.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/entity/basic_entity.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成本工程Entity类的父类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="ColumnEntity.java" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/entity/ColumnEntity.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/entity/column_entity.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成基础的ColumnEntity属性，用于构建GroupByParam]]>
            </fileInfo>
        </initFile>
        <initFile fileName="BasicService.java" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/service/BasicService.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/service/basic_service.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成本工程Service类的父类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="BasicParam.java" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/param/BasicParam.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/param/basic_param.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成本工程Param类的父类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="BasicController" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/rest/BasicController.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/rest/basic_controller.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成本工程Controller的父类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="RestResult.java" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/entity/RestResult.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/entity/rest_result.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成RestResult基础类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="SysService" type="basic">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/commons/service/SysService.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/service/sys_service.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成SysService基础类，主要用于获取userId]]>
            </fileInfo>
        </initFile>


        <!-- init.utils -->
        <initFile fileName="JSONUtils.java" type="utils">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/utils/JSONUtils.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/utils/json_utils.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[生成JSONUtils工具类，用于JavaBean到json的相互转换]]>
            </fileInfo>
        </initFile>
        <initFile fileName="StringUtils.java" type="utils">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/utils/StringUtils.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/utils/string_utils.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[字符串处理的工具类，主要用于字符串的转化处理]]>
            </fileInfo>
        </initFile>
        <initFile fileName="RandomUtils.java" type="utils">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/utils/RandomUtils.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/utils/random_utils.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[随机码生成的工具类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="PasswordUtils.java" type="utils">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/main/java/${BASIC_PACKAGE_NAME?replace('.','/')}/utils/PasswordUtils.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/utils/password_utils.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[密码相关的工具类，用于实现密码哈希加盐和密码的有如题等]]>
            </fileInfo>
        </initFile>

        <!-- init.testConf -->
        <initFile fileName="ApplicationTest.java" type="testConf">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/test/java/${BASIC_PACKAGE_NAME?replace('.','/')}/ApplicationTest.java]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/test/ApplicationTest.java.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[SpringTest测试引用的基础类]]>
            </fileInfo>
        </initFile>
        <initFile fileName="application_test.properties" type="testConf">
            <filePathTemplate>
                <![CDATA[${PROJECT_PATH}/src/test/resources/application_test.properties]]>
            </filePathTemplate>
            <contentTemplatePath>
                <![CDATA[/eppdev-jee/template/test/application_test.properties.ftl]]>
            </contentTemplatePath>
            <fileInfo>
                <![CDATA[SpringTest测试所需的基础类]]>
            </fileInfo>
        </initFile>

    </initFileList>

    <tableFileList>
        <tableFile type="upperEntity" replace="true">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/entity/auto/_${entityName}.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/entity/upper_entity.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="entity" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/entity/${entityName}.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/entity/entity.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="upperDao" replace="true">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/dao/auto/_${entityName}Dao.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/dao/upper_dao.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="dao" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/dao/${entityName}Dao.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/dao/dao.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="upperMapperXml" replace="true">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/resources/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/dao/auto/_${entityName}Dao.xml]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/mapper/upper_mapper.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="mapperXml" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/resources/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/dao/${entityName}Dao.xml]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/mapper/mapper.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="upperParam" replace="true">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/param/auto/_${entityName}Param.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/param/upper_param.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="param" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/param/${entityName}Param.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/param/param.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="upperService" replace="true">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/service/auto/_${entityName}Service.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/service/upper_service.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="service" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/service/${entityName}Service.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/service/service.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="test" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/test/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/test/${entityName}Test.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/test/test.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="controller" replace="false">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/src/main/java/${basicConf.BASIC_PACKAGE_NAME?replace('.','/')}<#if moduleName?exists && moduleName?trim?length &gt; 0>/${moduleName}</#if>/rest/${entityName}Controller.java]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/rest/controller.ftl]]>
            </contentTemplatePath>
        </tableFile>
        <tableFile type="schema" replace="true">
            <filePathTemplate>
                <![CDATA[${basicConf.PROJECT_PATH}/sql/${version.versionName}/schema/${tableName}.sql]]>
            </filePathTemplate>
            <contentTemplatePath dbType="default" >
                <![CDATA[/eppdev-jee/template/sql/schema.ftl]]>
            </contentTemplatePath>
        </tableFile>

    </tableFileList>

</eppdev>
~~~

## eppdev-jee-cg/pom.xml

~~~java

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>eppdev-jee-pom</artifactId>
        <groupId>cn.eppdev.jee</groupId>
        <version>0.1.6</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>eppdev-jee-cg</artifactId>

    <dependencies>
        <dependency>
            <groupId>cn.eppdev.jee</groupId>
            <artifactId>eppdev-jee-basic</artifactId>
        </dependency>

        <dependency>
            <groupId>org.freemarker</groupId>
            <artifactId>freemarker</artifactId>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/utils/json_utils.ftl

~~~java

/*
 * FileName: JsonUtils.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * JSON相关的工具类，用于javabean与json字符串的相互转换
 * @author ${AUTHOR_NAME}
 */
public class JSONUtils {
    private static Logger logger = LoggerFactory.getLogger(JSONUtils.class);
    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * 将一个JavaBean转换为Json字符串
     *
     * @param obj 要转换的Java对象
     * @return 转换后的Json字符串
     */
    public static String toJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            logger.error("Error While Transform JavaBean to Json: {}", e.getMessage());
        }
        return null;
    }


    /**
     * 将Json字符串转换为Java对象
     *
     * @param jsonStr 要转换的Json串
     * @param cls     目标对象的Java类
     * @param <T>     要转换的Java类型
     * @return 转化后的Java对象
     */
    public static <T> T readValue(String jsonStr, Class<T> cls) {
        try {
            return objectMapper.readValue(jsonStr, cls);
        } catch (IOException e) {
            logger.error("Error While Transform JsonString to JavaBean: {}\n {}", e.getMessage(),
                    e.getStackTrace());
        }
        return null;
    }

    /**
     * 将Json字符串转换为Java对象
     *
     * @param jsonStr 要转换的Json串
     * @param valueTypeRef     类型说明
     * @param <T>     要转换的Java类型
     * @return 转化后的Java对象
     */
    public static <T> T readValue(String jsonStr, TypeReference <T> valueTypeRef) {
        try {
            return objectMapper.readValue(jsonStr, valueTypeRef);
        } catch (IOException e) {
            logger.error("Error While Transform JsonString to JavaBean: {}\n {}", e.getMessage(),
                    e.getStackTrace());
        }
        return null;
    }
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/utils/password_utils.ftl

~~~java

/*
 * # PasswordUtils.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 密码+salt进行Hash的工具类
 *
 * @author ${AUTHOR_NAME}
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

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/utils/random_utils.ftl

~~~java

/*
 * FileName: RandomUtils.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.utils;

import java.util.Random;

/**
 * @author ${AUTHOR_NAME}
 */
public class RandomUtils {

    public static String NUMBER_CHAR = "1234567890";
    public static String LOWER_CHAR = "qwertyuiopasdfghjklzxcvbnm";
    public static String UPPER_CHAR = "QWERTYUIOPASDFGHJKLZXCVBNM";
    public static String SYMBOL_CHAR = "~!@#$%^&*()";
    public static String ALL_CHAR = NUMBER_CHAR + LOWER_CHAR + UPPER_CHAR + SYMBOL_CHAR;
    public static Random RANDOM = new Random();

    public static int TYPE_NUMBER = 1;
    public static int TYPE_NUMBER_LOWER_CHAR = 2;
    public static int TYPE_NUMBER_LOWER_UPPER_CHAR = 3;
    public static int TPPE_NUMBER_ALL_CHAR = 4;

    /**
     * 生成随机字符串
     *
     * @param length 字符串长度
     * @param type   类型：<br/>
     *               1: 仅数字
     *               2: 数字+字母
     *               3: 数字+大小写字母
     *               4：数字+大小写字母+特殊字符
     * @return 随机数字
     */
    public static String getRandomStr(int length, int type) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int randomInt = random.nextInt(1000000);
            switch (type){
                case 1:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length())));
                    break;
                case 2:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length() + LOWER_CHAR.length())));
                    break;
                case 3:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length() + LOWER_CHAR.length()*2)));
                    break;
                case 4:
                    sb.append(ALL_CHAR.charAt(randomInt % (NUMBER_CHAR.length() + LOWER_CHAR.length()*2 + SYMBOL_CHAR.length())));
                    break;
            }
        }
        return sb.toString();
    }

    /**
     * 随机生成0-max之间整数
     * @param max
     * @return
     */
    public static int getRandomInt(int max){
        return RANDOM.nextInt(max);
    }

    /**
     * 随机生成min-max之间整数
     * @param max
     * @param min
     * @return
     */
    public static int getRandomInt(int max, int min){
        return (int)(Math.random()*(max - min + 1) + min);
    }
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/utils/string_utils.ftl

~~~java

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

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/param/param.ftl

~~~java

/* FileName: ${entityName}Param.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param;

import ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.auto._${entityName}Param;

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
public class ${entityName}Param extends _${entityName}Param {

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/param/upper_param.ftl

~~~java

/* FileName: ${entityName}Param.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
<#if logList?exists>
<#list logList as log>
  修改人：${log.authorName}
  修改时间：${log.updateDate?string('yyyy-MM-dd')}
  修改类型：${log.operType}
  修改内容：
<#list log.operContent?split("\n") as s>
    - ${s}
</#list>
----------------------------------------------------
</#list>
</#if>
************************************************** */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.auto;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.param.BasicParam;

/**
 * ${tableName}对应的基础参数类，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public class _${entityName}Param extends BasicParam {

    /* ***********************************************
     * properties
     * **********************************************/
    <#list columnList as column>
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1 || column.createLikeFlag == 1 || column.createLeftLikeFlag == 1 || column.createInFlag == 1 || column.createCompareFlag == 1>
    // properties for ${column.columnName}
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
    private ${column.javaType} ${column.propertyName};
    </#if>
    <#if column.createLikeFlag == 1>
    private ${column.javaType} _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createLeftLikeFlag == 1>
    private ${column.javaType} _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createInFlag == 1>
    private java.util.List<${column.javaType}> _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List;
    </#if>
    <#if column.createCompareFlag == 1>
    private ${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    private ${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * getters
     * **********************************************/
    <#list columnList as column>
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1 || column.createLikeFlag == 1 || column.createLeftLikeFlag == 1 || column.createInFlag == 1 || column.createCompareFlag == 1>
    // getters for ${column.columnName}
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
    public ${column.javaType} get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return ${column.propertyName};
    }
    </#if>
    <#if column.createLikeFlag == 1>
    public ${column.javaType} get_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createLeftLikeFlag == 1>
    public ${column.javaType} get_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createInFlag == 1>
    public java.util.List<${column.javaType}> get_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List() {
        return _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List;
    }
    </#if>
    <#if column.createCompareFlag == 1>
    public ${column.javaType} get_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    public ${column.javaType} get_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * setters
     * **********************************************/
    <#list columnList as column>
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1 || column.createLikeFlag == 1 || column.createLeftLikeFlag == 1 || column.createInFlag == 1 || column.createCompareFlag == 1>
    // setters for ${column.columnName}
    <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
    public void set${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} ${column.propertyName}) {
        this.${column.propertyName} = ${column.propertyName};
    }
    </#if>
    <#if column.createLikeFlag == 1>
    public void set_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}) {
        this._like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createLeftLikeFlag == 1>
    public void set_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}) {
        this._leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createInFlag == 1>
    public void set_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(java.util.List<${column.javaType}> _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List) {
        this._in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List = _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List;
    }
    </#if>
    <#if column.createCompareFlag == 1>
    public void set_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}) {
        this._min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    public void set_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/param/basic_param.ftl

~~~java

/* FileName: BasicParam.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.param;

import ${BASIC_PACKAGE_NAME}.commons.entity.ColumnEntity;
import ${BASIC_PACKAGE_NAME}.utils.JSONUtils;
import ${BASIC_PACKAGE_NAME}.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ${AUTHOR_NAME}
 */
public class BasicParam {
    static Logger logger = LoggerFactory.getLogger(BasicParam.class);

    private String _orderBy;

    private String _customWhere;

    private Integer _pageNum;

    private Integer _pageSize;

    private List<ColumnEntity> _groupByList;

    public String get_orderBy() {
        return _orderBy;
    }

    public void set_orderBy(String _orderBy) {
        this._orderBy = _orderBy;
    }

    public String get_customWhere() {
        return _customWhere;
    }

    public void set_customWhere(String _customWhere) {
        this._customWhere = _customWhere;
    }

    public Integer get_pageNum() {
        return _pageNum;
    }

    public void set_pageNum(Integer _pageNum) {
        this._pageNum = _pageNum;
    }

    public Integer get_pageSize() {
        return _pageSize;
    }

    public void set_pageSize(Integer _pageSize) {
        this._pageSize = _pageSize;
    }


    public List<ColumnEntity> get_groupByList() {
        return _groupByList;
    }

    public void set_groupByList(List<ColumnEntity> _groupByList) {
        this._groupByList = _groupByList;
    }


    public void buildBroupBy(ColumnEntity... columnEntities) {
        if (_groupByList == null) {
            _groupByList = new ArrayList<>();
        }
        for (ColumnEntity entity: columnEntities) {
            _groupByList.add(entity);
        }
    }

    public void buildOrderBy(String... orderbyStrs) {
        StringBuilder sb = new StringBuilder();
        for (String str : orderbyStrs) {
            if(str.contains(".")) {
                sb.append(str + ", ");
            }
            else {
                sb.append("a." + str + ", ");
            }
        }
        this._orderBy = StringUtils.removeEnd(sb.toString().trim(), ",");
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/rest/basic_controller.ftl

~~~java

/* FileName: BasicController.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.rest;

import ${BASIC_PACKAGE_NAME}.commons.entity.BasicEntity;
import ${BASIC_PACKAGE_NAME}.commons.entity.RestResult;
import ${BASIC_PACKAGE_NAME}.commons.param.BasicParam;
import ${BASIC_PACKAGE_NAME}.commons.service.BasicService;
import ${BASIC_PACKAGE_NAME}.commons.service.SysService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ${AUTHOR_NAME}
 */
public abstract class BasicController<T extends BasicEntity, P extends BasicParam> {
    static Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    BasicService<T, P> service;

    @Autowired
    SysService sysService;

    @RequestMapping("/get/{id}")
    public RestResult<T> get(@PathVariable("id") String id) {
        logger.debug("{}/get/{}", getBasicUrl(), id);
        RestResult<T> restResult;
        try {
            T data = service.get(id);
            if (null == data) {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "数据不存在", null);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", data);
            }
        } catch (Exception e) {
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/get/{} -> result: {}", getBasicUrl(), id, restResult);
        return restResult;
    }


    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody T entity) {
        RestResult<String> restResult = null;
        logger.debug("{}/add -> entity:{}", getBasicUrl(), entity);
        try {
            String userId = sysService.getCurrentUserId();
            if (userId != null) {
                entity.setCreateBy(userId);
                entity.setUpdateBy(userId);
            }
            int cnt = service.insert(entity);
            if (cnt == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "添加成功", entity.getId());
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "添加失败，数据重复？", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/add -> result:{}", getBasicUrl(), restResult);
        return restResult;
    }

    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id) {
        logger.debug("{}/delete/{}", getBasicUrl(), id);
        RestResult<Integer> restResult = null;
        try {
            String userId = sysService.getCurrentUserId();
            int count = service.delete(id, userId);
            if (count == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "删除成功", count);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "删除失败，数据不存在？", count);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/delete/{} -> result: {}", getBasicUrl(), id, restResult);
        return restResult;
    }

    @RequestMapping("/update")
    public RestResult<Integer> update(@RequestBody T entity) {
        logger.debug("{}/update -> entity:{}", getBasicUrl(), entity);
        RestResult<Integer> restResult = null;
        try {
            String userId = sysService.getCurrentUserId();
            if (userId != null && entity.getUpdateBy() == null){
                entity.setUpdateBy(userId);
            }
            int count = service.update(entity);
            if (count == 1) {
                restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "更新成功", count);
            } else {
                restResult = new RestResult<>(RestResult.STATUS_FAILED, "更新失败：关键字重复？", count);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/update -> restResult:{}", getBasicUrl(), restResult);
        return restResult;
    }

    @RequestMapping("/list")
    public RestResult<PageInfo<T>> list(@RequestBody P param) {
        logger.debug("{}/list -> param:{}", getBasicUrl(), param);
        RestResult<PageInfo<T>> restResult = null;
        try {
            PageInfo<T> pageInfo = service.list(param);
            restResult = new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch (Exception e) {
            restResult = new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
        logger.debug("{}/list -> restResult:{}", getBasicUrl(), restResult);
        return restResult;
    }

    public abstract String getBasicUrl();

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/rest/controller.ftl

~~~java

/* FileName: DimAreaInfoController.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.rest;

import ${basicConf.BASIC_PACKAGE_NAME}.commons.rest.BasicController;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
@RestController
@RequestMapping(${entityName}Controller.URL)
public class ${entityName}Controller extends BasicController<${entityName}, ${entityName}Param> {
    static Logger logger = LoggerFactory.getLogger(${entityName}Controller.class);

    public static final String URL= "/${tableName}";

    @Override
    public String getBasicUrl() {
        return URL;
    }
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/test/ApplicationTest.java.ftl

~~~java


/* FileName: ApplicationTest.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME};

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ${AUTHOR_NAME}
 */
@SpringBootApplication
@MapperScan("${BASIC_PACKAGE_NAME}")
public class ApplicationTest{

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/test/test.ftl

~~~java

/* FileName: ${entityName}Test.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */


 package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.ApplicationTest;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName}</#if>.param.${entityName}Param;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName}</#if>.service.${entityName}Service;

@SpringBootTest(classes = {ApplicationTest.class})
@RunWith(SpringRunner.class)
@TestPropertySource("classpath:/application_test.properties")
 public class ${entityName}Test{

    @Autowired
    ${entityName}Service  entityService;

    @Test
    public void  testBasic(){
        ${entityName}Param param = new ${entityName}Param();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.list(param));
    }


    @Test
    public void testListGroupBy(){
        ${entityName}Param param = new ${entityName}Param();
        param.set_pageNum(1);
        param.set_pageSize(1);
        Assert.assertNotNull(entityService.listGroupBy(param));
    }

 }
 
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/test/application_test.properties.ftl

~~~java


#########################################
# DataBase Configurations
#########################################
spring.datasource.url=${dbUrl}
spring.datasource.username=${dbUsername}
spring.datasource.password=${dbPassword}
spring.datasource.type = com.alibaba.druid.pool.DruidDataSource
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.continue-on-error=true
spring.datasource.filters = stat
spring.datasource.maxActive = 50
spring.datasource.initialSize = 1
spring.datasource.maxWait = 60000
spring.datasource.minIdle = 1
spring.datasource.timeBetweenEvictionRunsMillis = 60000
spring.datasource.minEvictableIdleTimeMillis = 300000
spring.datasource.validationQuery = select 'x'
spring.datasource.testWhileIdle = true
spring.datasource.testOnBorrow = false
spring.datasource.testOnReturn = false
spring.datasource.poolPreparedStatements = true
spring.datasource.maxOpenPreparedStatements = 20
spring.datasource.initialization-mode=always



#########################################
# PageHelper Configurations
#########################################
pagehelper.autoDialect=true
pagehelper.closeConn=true
pagehelper.offset-as-page-num=false
pagehelper.supportMethodsArguments=true
pagehelper.params=pageSize=_pageSize;pageNum=_pageNum;


#########################################
# Log Configurations
#########################################
logging.level.root=INFO
logging.level.${BASIC_PACKAGE_NAME}=DEBUG
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/entity/upper_entity.ftl

~~~java

/* FileName: _${entityName}.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
<#if logList?exists>
<#list logList as log>
  修改人：${log.authorName}
  修改时间：${log.updateDate?string('yyyy-MM-dd')}
  修改类型：${log.operType}
  修改内容：
<#list log.operContent?split("\n") as s>
    - ${s}
</#list>
----------------------------------------------------
</#list>
</#if>
************************************************** */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.auto;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.entity.ColumnEntity;
import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.entity.BasicEntity;

/**
 * ${tableName}对应的基础实体类，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public class _${entityName} extends BasicEntity {

    /* ***********************************************
     * static properties
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
            && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
            && column.columnName != "remarks">
    // static properties for ${column.columnName}
    public static final String COLUMN_${column.columnName?upper_case}_ = "${column.columnName}";
    public static final String COLUMN_${column.columnName?upper_case}_ASC_ = "${column.columnName} asc";
    public static final String COLUMN_${column.columnName?upper_case}_DESC_ = "${column.columnName} desc";
    public static final ColumnEntity COLUMN_ENTITY_${column.columnName?upper_case}_ = new ColumnEntity("${column.columnName}", "${column.propertyName}");

    </#if>
    </#list>


    /* ***********************************************
     * properties
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
        && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
        && column.columnName != "remarks">
    // properties for ${column.columnName}
    private ${column.javaType} ${column.propertyName};
    <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
    private Integer _cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
    private ${column.javaType} _avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
    private ${column.javaType} _sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
    private ${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>
    <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
    private ${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * getters
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
        && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
        && column.columnName != "remarks">
    // getters for ${column.columnName}
    public ${column.javaType} get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}() {
        return this.${column.propertyName};
    }
    <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
    public Integer get_cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
    public ${column.javaType} get_avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
    public ${column.javaType} get_sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
    public ${column.javaType} get_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
    public ${column.javaType} get_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(){
        return this._max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>

    /* ***********************************************
     * setters
     * **********************************************/
    <#list columnList as column>
    <#if column.columnName != "id" && column.columnName != "create_date" && column.columnName != "create_by"
        && column.columnName != "update_date" && column.columnName != "update_by" && column.columnName != "del_flag"
        && column.columnName != "remarks">
    // getters for ${column.columnName}
    public void set${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} ${column.propertyName}) {
        this.${column.propertyName} = ${column.propertyName};
    }
    <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
    public void set_cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(Integer _cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
    public void set_avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
    public void set_sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
    public void set_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>
    <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
    public void set_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(${column.javaType} _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}){
        this._max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} = _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)};
    }
    </#if>

    </#if>
    </#list>
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/entity/column_entity.ftl

~~~java

/* FileName: ColumnEntity.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.entity;

import cn.eppdev.jee.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class ColumnEntity {
    static Logger logger = LoggerFactory.getLogger(ColumnEntity.class);

    private String columnName;
    private String propertyName;

    public ColumnEntity(String columnName, String propertyName) {
        this.columnName = columnName;
        this.propertyName = propertyName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/entity/basic_entity.ftl

~~~java

/* FileName: BasicEntity.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.entity;

import ${BASIC_PACKAGE_NAME}.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author ${AUTHOR_NAME}
 */
public class BasicEntity {

    public static final String COLUMN_ID_ = "id";
    public static final String COLUMN_ID_DESC_ = "id desc";
    public static final String COLUMN_CREATE_DATE_ = "create_date";
    public static final String COLUMN_CREATE_DATE_DESC_ = "create_date desc";
    public static final String COLUMN_CREATE_BY_ = "create_by";
    public static final String COLUMN_UPDATE_DATE_ = "update_date";
    public static final String COLUMN_UPDATE_DATE_DESC_ = "update_date desc";
    public static final String COLUMN_UPDATE_BY_ = "update_by";
    public static final String COLUMN_DEL_FLAG_ = "del_flag";
    public static final String COLUMN_REMARKS_ = "remarks";

    // id对应的属性
    private String id;

    // create_date对应的属性
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    // create_by对应的属性
    private String createBy;

    // update_date对应的属性
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    // update_by对应的属性
    private String updateBy;

    // del_flag对应的属性
    private Integer delFlag;

    // remarks对应的属性
    private String remarks;

    // count属性，用于groupBy计算的结果
    private Integer _count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer get_count() {
        return _count;
    }

    public void set_count(Integer _count) {
        this._count = _count;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/entity/rest_result.ftl

~~~java

/* FileName: RestResult.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.entity;

import ${BASIC_PACKAGE_NAME}.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ${AUTHOR_NAME}
 */
public class RestResult <T> {
    static Logger logger = LoggerFactory.getLogger(RestResult.class);

    public static final int STATUS_SUCCESS = 2000;
    public static final int STATUS_FAILED = 2001;

    public Integer status;

    public String message;

    public T data;

    public RestResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/entity/entity.ftl

~~~java

/* FileName: ${entityName}.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity;

import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.auto._${entityName};

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
public class ${entityName} extends _${entityName}{
}
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/sql/schema.ftl

~~~java

-- ------------------------------------------------
-- 修订历史：
-- ------------------------------------------------
<#if logList?exists>
<#list logList as log>
-- 修改人：${log.authorName}
-- 修改时间：${log.updateDate?string('yyyy-MM-dd')}
-- 修改类型：${log.operType}
-- 修改内容：
<#list log.operContent?split("\n") as s>
--  - ${s}
</#list>
-- --------------------------------------------------
</#list>
</#if>

create table ${tableName}(
  <#list columnList as column>
  ${column.columnName} ${column.dbColumnType}<#if column.columnLength?exists && column.columnLength &gt; 0>(${column.columnLength?c})</#if> comment '${column.columnComment}',
  </#list>
  primary key(<#list primaryKeyList as column>${column.columnName}<#sep>, </#sep></#list>)
);

<#list indexList as idx>
<#if idx.indexName != 'PRIMARY'>
create index ${idx.indexName} on ${tableName}(${idx.columnNames});
</#if>
</#list>


~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/conf/gitignore.ftl

~~~java

target/
pom.xml.tag
pom.xml.releaseBackup
pom.xml.versionsBackup
pom.xml.next
release.properties
dependency-reduced-pom.xml
buildNumber.properties
.mvn/timing.properties

# Avoid ignoring Maven wrapper jar file (.jar files are usually ignored)
!/.mvn/wrapper/maven-wrapper.jar

#########################################
# FOR IDEA
#########################################
*.iml
*/*.iml
*/*/*.iml
*/*/*/*.iml

.idea
*/.idea
*/*/.idea
*/*/*/.idea


.DS_Store
settings.json

#########################################
# FOR ECLIPSE
#########################################
.settings
*/.settings
*/*/.settings
*/*/*/.settings

bin
*/bin
*/*/bin
*/*/*/bin

.mymetadata
*/.mymetadata
*/*/.mymetadata
*/*/*/.mymetadata

.project
*/.project
*/*/.project
*/*/*/.project

.class
*/.class
*/*/.class
*/*/*/.class

.classpath
*/.classpath
*/*/.classpath
*/*/*/.classpath


#########################################
# FOR MAVEN
#########################################
target
*/target
*/*/target
*/*/*/target

#########################################
# FOR OTHERS
#########################################
.war
.zip
.rar

.~*
*/.~*
*/*/.~*
*/*/*/.~*
.DS_Store
.vscode/settings.json
.vscode/settings.json

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/conf/application.properties.ftl

~~~java

#########################################
# DataBase Configurations
#########################################
spring.datasource.url=${dbUrl}
spring.datasource.username=${dbUsername}
spring.datasource.password=${dbPassword}
spring.datasource.type = com.alibaba.druid.pool.DruidDataSource
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.continue-on-error=true
spring.datasource.filters = stat
spring.datasource.maxActive = 50
spring.datasource.initialSize = 3
spring.datasource.maxWait = 60000
spring.datasource.minIdle = 1
spring.datasource.timeBetweenEvictionRunsMillis = 60000
spring.datasource.minEvictableIdleTimeMillis = 300000
spring.datasource.validationQuery = select 'x'
spring.datasource.testWhileIdle = true
spring.datasource.testOnBorrow = false
spring.datasource.testOnReturn = false
spring.datasource.poolPreparedStatements = true
spring.datasource.maxOpenPreparedStatements = 20
spring.datasource.initialization-mode=always



#########################################
# PageHelper Configurations
#########################################
pagehelper.autoDialect=true
pagehelper.closeConn=true
pagehelper.offset-as-page-num=false
pagehelper.supportMethodsArguments=true
pagehelper.params=pageSize=_pageSize;pageNum=_pageNum;


#########################################
# Log Configurations
#########################################
logging.level.root=INFO
logging.level.${BASIC_PACKAGE_NAME}=DEBUG
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/conf/pom.xml.ftl

~~~java

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.2.RELEASE</version>
    </parent>

    <modelVersion>4.0.0</modelVersion>

    <groupId>${BASIC_PACKAGE_NAME}</groupId>
    <artifactId>${PROJECT_NAME}</artifactId>
    <version>0.1</version>

    <properties>
        <java.version>1.8</java.version>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <pagehelper-spring-boot-starter.version>1.2.9</pagehelper-spring-boot-starter.version>
        <commons-codec.version>1.10</commons-codec.version>
        <commons-beanutils.version>1.9.1</commons-beanutils.version>
        <commons-lang3.version>3.8.1</commons-lang3.version>
        <mysql-connection.version>5.1.46</mysql-connection.version>
        <druid.version>1.1.12</druid.version>
        <ojdbc.version>10.2.0.4.0</ojdbc.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
        </dependency>

        <!-- for jackson -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
        </dependency>
        <!-- jackson end -->


        <!-- commons -->
        <dependency>
            <groupId>commons-codec</groupId>
            <artifactId>commons-codec</artifactId>
        </dependency>
        <!-- end of commons -->


        <!-- spring -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
         </dependency>

        <!-- end of spring -->

        <!-- mybatis -->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>
        <#if DB_TYPE == 'mysql'>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        </#if>
        <!-- end of mybatis -->

    </dependencies>


    <dependencyManagement>

        <dependencies>

            <!-- for apache commons -->
            <dependency>
                <groupId>commons-codec</groupId>
                <artifactId>commons-codec</artifactId>
                <version>${r'${'}commons-codec.version}</version>
            </dependency>
            <dependency>
                <groupId>org.apache.commons</groupId>
                <artifactId>commons-lang3</artifactId>
                <version>${r'${'}commons-lang3.version}</version>
            </dependency>
            <dependency>
                <groupId>commons-beanutils</groupId>
                <artifactId>commons-beanutils</artifactId>
                <version>${r'${'}commons-beanutils.version}</version>
            </dependency>
            <!--  end for apache commons -->

            <!-- for database -->
            <dependency>
                <groupId>com.github.pagehelper</groupId>
                <artifactId>pagehelper-spring-boot-starter</artifactId>
                <version>${r'${'}pagehelper-spring-boot-starter.version}</version>
            </dependency>
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${r'${'}mysql-connection.version}</version>
            </dependency>
            <dependency>
                <groupId>com.oracle</groupId>
                <artifactId>ojdbc14</artifactId>
                <version>${r'${'}ojdbc.version}</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${r'${'}druid.version}</version>
            </dependency>
            <!-- end of database -->

        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <executable>true</executable>
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/conf/Application.java.ftl

~~~java

/* FileName: Application.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME};

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ${AUTHOR_NAME}
 */
@SpringBootApplication
@MapperScan("${BASIC_PACKAGE_NAME}")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/mapper/upper_mapper.ftl

~~~java

<!-- ===============================================
 ${tableName}对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
 由EPPDEV-JEE自动创建
 ===================================================
 - 修订历史：
 ===================================================
<#if logList?exists>
<#list logList as log>
  修改人：${log.authorName}
  修改时间：${log.updateDate?string('yyyy-MM-dd')}
  修改类型：${log.operType}
  修改内容：
<#list log.operContent?split("\n") as s>
    - ${s}
</#list>
 ===================================================
</#list>
</#if>
================================================= -->

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.auto._${entityName}Dao">
    <sql id="columns">
        <#list columnList as column>
        a.${column.columnName} as ${column.propertyName},
        </#list>
    </sql>

    <insert id="insert" parameterType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        insert into ${tableName}(
        <trim suffixOverrides=",">
            <#list columnList as column>
            ${column.columnName},
            </#list>
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            <#list columnList as column>
            ${r"#{"}${column.propertyName}${r"}"},
            </#list>
        </trim>
        )
    </insert>

    <delete id="delete">
        update ${tableName} a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=${r"#{"}updateDate${r"}"}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = ${"#{"}updateBy${r"}"}, </if>
        </set>
        <where>
            <#list primaryKeyList as column>
            and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
        </where>
    </delete>

    <delete id="deleteBy" parameterType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param">
        <#list columnList as column>
        <#if column.createLikeFlag == 1>
        <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_like_${column.columnName}" value="'%' + _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        <#if column.createLeftLikeFlag == 1>
        <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_left_like_${column.columnName}" value="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        </#list>
        update ${tableName} a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=${r"#{"}updateDate${r"}"}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = ${"#{"}updateBy${r"}"}, </if>
        </set>
        <where>
            <#list columnList as column>
            <#if column.createEqualFlag == 1>
            <if test="${column.propertyName} != null<#if column.javaType=='String'> and ${column.propertyName} != ''</#if>">and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}</if>
            </#if>
            <#if column.createInFlag == 1>
            <if test="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List != null and _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List.length > 0">
                and a.${column.columnName} in
                <foreach collection="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List" item="_item" separator="," open="(" close=")">
                    ${r"#{"}_item${r"}"}
                </foreach>
            </if>
            </#if>
            <#if column.createCompareFlag == 1>
            <if test="_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType=='String'>  and _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">and a.${column.columnName} &gt;= ${r"#{"}_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            <if test="_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType=='String'>  and _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">and a.${column.columnName} &lt;= ${r"#{"}_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            </#if>
            <#if column.createLikeFlag == 1>
            <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_like_${column.columnName}${r"}"}</if>
            </#if>
            <#if column.createLeftLikeFlag == 1>
            <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_left_like_${column.columnName}${r"}"}</if>
            </#if>
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
        </where>
    </delete>

    <update id="update" parameterType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        update ${tableName} a
        <set>
            <#list columnList as column>
            <if test="${column.propertyName} != null<#if column.javaType == 'String'> and ${column.propertyName} != ''</#if>">a.${column.columnName} = ${r"#{"}${column.propertyName}${r"}"},</if>
            </#list>
        </set>
        <where>
        <#list primaryKeyList as column>
        and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
        </#list>
        </where>
    </update>


    <select id="get" resultType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefColumns"/>
        </trim>
        from ${tableName} a
        <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefJoin"/>
        <where>
        <#list columnList as column>
        <#if column.primaryKeyFlag == 1>
            and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
        </#if>
        </#list>
        </where>
    </select>


    <select id="list" resultType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        <#list columnList as column>
        <#if column.createLikeFlag == 1>
        <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_like_${column.columnName}" value="'%' + _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        <#if column.createLeftLikeFlag == 1>
        <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_left_like_${column.columnName}" value="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        </#list>
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefColumns"/>
        </trim>
        from ${tableName} a
        <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefJoin"/>
        <where>
            <#list columnList as column>
            <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
            <if test="${column.propertyName} != null<#if column.javaType=='String'> and ${column.propertyName} != ''</#if>">and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}</if>
            </#if>
            <#if column.createInFlag == 1>
            <if test="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List != null and _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List.length > 0">
                and a.${column.columnName} in
                <foreach collection="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List" item="_item" separator="," open="(" close=")">
                    ${r"#{"}_item${r"}"}
                </foreach>
            </if>
            </#if>
            <#if column.createCompareFlag == 1>
            <if test="_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType == 'String'> and _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">and a.${column.columnName} &gt;= ${r"#{"}_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            <if test="_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType == 'String'> and _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">and a.${column.columnName} &lt;= ${r"#{"}_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            </#if>
            <#if column.createLikeFlag == 1>
            <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_like_${column.columnName}${r"}"}</if>
            </#if>
            <#if column.createLeftLikeFlag == 1>
            <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_left_like_${column.columnName}${r"}"}</if>
            </#if>
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
            <if test="_customWhere != null and _customWhere != ''">${r"${"}_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${r"${"}_orderBy${r"}"}
            </when>
            <#list columnList as column>
            <#if column.columnName == "update_date">
            <otherwise>
                order by a.update_date desc
            </otherwise>
            </#if>
            </#list>
        </choose>
    </select>


    <select id="listGroupBy" resultType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        <#list columnList as column>
        <#if column.createLikeFlag == 1>
        <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_like_${column.columnName}" value="'%' + _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        <#if column.createLeftLikeFlag == 1>
        <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_left_like_${column.columnName}" value="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        </#list>
        select
        <trim suffixOverrides=",">
            count(1) as "_count",
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${r"${"}_item.columnName${r"}"} as ${r"${"}_item.propertyName${r"}"},
            </foreach>
            </if>
            <#list columnList as column>
            <#if column.createCntDistInGroupbyFlag?exists && column.createCntDistInGroupbyFlag == 1>
            count(distinct ${column.columnName}) as "_cntDist${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}",
            </#if>
            <#if column.createAvgInGroupbyFlag?exists && column.createAvgInGroupbyFlag == 1>
            avg(${column.columnName}) as "_avg${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}",
            </#if>
            <#if column.createSumInGroupbyFlag?exists && column.createSumInGroupbyFlag == 1>
            sum(${column.columnName}) as "_sum${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}",
            </#if>
            <#if column.createMinInGroupbyFlag?exists && column.createMinInGroupbyFlag == 1>
            min(${column.columnName}) as "_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}",
            </#if>
            <#if column.createMaxInGroupbyFlag?exists && column.createMaxInGroupbyFlag == 1>
            max(${column.columnName}) as "_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}",
            </#if>
            </#list>
            <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefGroupByColumns"/>
        </trim>
        from ${tableName} a
        <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefGroupByJoin"/>
        <where>
            <#list columnList as column>
            <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
            <if test="${column.propertyName} != null<#if column.javaType=='String'> and ${column.propertyName} != ''</#if>">and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}</if>
            </#if>
            <#if column.createInFlag == 1>
            <if test="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List != null and _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List.length > 0">
                and a.${column.columnName} in
                <foreach collection="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List" item="_item" separator="," open="(" close=")">
                    ${r"#{"}_item${r"}"}
                </foreach>
            </if>
            </#if>
            <#if column.createCompareFlag == 1>
            <if test="_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType == 'String'> and _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">and a.${column.columnName} &gt;= ${r"#{"}_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            <if test="_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType == 'String'> and _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">and a.${column.columnName} &lt;= ${r"#{"}_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            </#if>
            <#if column.createLikeFlag == 1>
            <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_like_${column.columnName}${r"}"}</if>
            </#if>
            <#if column.createLeftLikeFlag == 1>
            <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_left_like_${column.columnName}${r"}"}</if>
            </#if>
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
            <if test="_customWhere != null and _customWhere != ''">${r"${"}_customWhere}</if>
        </where>
        group by
        <trim suffixOverrides=",">
            null,
            <if test="_groupByList != null and _groupByList.length > 0">
            <foreach collection="_groupByList" item="_item">
            a.${r"${"}_item.columnName${r"}"},
            </foreach>
            </if>
            <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefGroupByColumns"/>
        </trim>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${r"${"}_orderBy${r"}"}
            </when>
        </choose>
    </select>



    <delete id="realDelete">
        delete from ${tableName} a
        <where>
            <#list primaryKeyList as column>
            and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
            </#list>
        </where>
    </delete>

</mapper>
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/mapper/mapper.ftl

~~~java

<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao">

    <!-- 此段代码将在_${entityName}Dao.xml的list、get方法中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">

    </sql>

    <!-- 此段代码将在_${entityName}Dao.xml的list、get方法中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">

    </sql>

    <!-- 此段代码将在_${entityName}Dao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_${entityName}Dao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/service/service.ftl

~~~java

/* FileName: ${entityName}Service.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.service;

import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.service.auto._${entityName}Service;
import org.springframework.stereotype.Service;

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
@Service
public class ${entityName}Service extends _${entityName}Service {

    @Override
    public void customeInit(${entityName} entity) {
    }

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/service/sys_service.ftl

~~~java

/* FileName: SysUserService.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author ${AUTHOR_NAME}
 */
@Service
public class SysService {
    static Logger logger = LoggerFactory.getLogger(SysService.class);

    public String getCurrentUserId(){
        return null;
    }
}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/service/basic_service.ftl

~~~java

/* FileName: BasicService.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME}.commons.service;

import ${BASIC_PACKAGE_NAME}.commons.dao.BasicDao;
import ${BASIC_PACKAGE_NAME}.commons.entity.BasicEntity;
import ${BASIC_PACKAGE_NAME}.commons.param.BasicParam;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.UUID;
import org.springframework.transaction.annotation.Transactional;

/**
 * 基础Service类，提供了一些基础的方法
 *
 * @author ${AUTHOR_NAME}
 */
public abstract class BasicService<T extends BasicEntity, P extends BasicParam> {
    private static Logger logger = LoggerFactory.getLogger(BasicService.class);

    public static final Integer DEL_FLAG_NORMAL = 0;

    /**
     * 获取一条数据
     *
     * @param id 数据ID
     * @return 单条数据
     */
    public T get(String id) {
        return getDao().get(id);
    }

    /* 删除一条数据
     *
     * @param id 要删除的数据ID
     * @return 实际删除的数据条数
     */
    @Transactional(readOnly = false)
    public int delete(String id) {
        BasicEntity entity = new BasicEntity();
        entity.setId(id);
        entity.setUpdateDate(new Date());
        return getDao().delete(entity);
    }

    /* 删除一条数据
     *
     * @param id 要删除的数据ID
     * @param userId 要删除的用户ID
     * @return 实际删除的数据条数
     */
    @Transactional(readOnly = false)
    public int delete(String id, String userId) {
        BasicEntity entity = new BasicEntity();
        entity.setId(id);
        entity.setUpdateDate(new Date());
        entity.setUpdateBy(userId);
        return getDao().delete(entity);
    }

    /**
     * 根据条件进行数据删除
     *
     * @param param 条件（主要是_inIdList，支持多条数据的删除）
     * @return 删除的总条数
     */
    public int deleteBy(P param) {
        return getDao().deleteBy(param);
    }

    /**
     * 保存数据，若存在ID，则执行更新操作，若不存在，则执行插入操作
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    @Transactional(readOnly = false)
    public int save(T entity) {
        logger.debug("entity: {}", entity);
        // 首先判断逻辑主键是否有重复的，如有则不更新修改
        if (!exists(entity)) {
            if (entity.getId() == null || entity.getId().trim().length() == 0) {
                return insert(entity);
            } else {
                return update(entity);
            }
        } else {
            return 0;
        }
    }

    /**
     * 插入输入，若无ID则新初始化一个ID，若有则用原来的id进行保存
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    @Transactional(readOnly = false)
    public int insert(T entity) {
        logger.debug("entity: {}", entity);
        if (!exists(entity)) {
            _init(entity);
            return getDao().insert(entity);
        } else {
            return 0;
        }
    }

    /**
     * 修改数据
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    public int update(T entity) {
        logger.debug("entity:{}", entity);
        if (!exists(entity)) {
            entity.setUpdateDate(new Date());
            return getDao().update(entity);
        } else {
            return 0;
        }
    }


    /**
     * 插入强的数据初始化
     *
     * @param entity 要插入的数据
     */
    private void _init(T entity) {
        Date date = new Date();
        if (entity.getId() == null || entity.getId().trim().length() == 0) {
            entity.setId(UUID.randomUUID().toString().replace("-", ""));
        }
        entity.setCreateDate(date);
        entity.setUpdateDate(date);
        entity.setDelFlag(DEL_FLAG_NORMAL);
        customeInit(entity);
    }


    /**
     * 获取所有的数据
     *
     * @return 获取所有数据
     */
    public PageInfo<T> listAll() {
        return new PageInfo<>(getDao().list(null));
    }

    /**
     * 获取分页列表
     *
     * @param param 参数值
     * @return
     */
    public PageInfo<T> list(P param) {
        return new PageInfo<>(getDao().list(param));
    }


    /**
     * 获取分页列表[含GroupBy条件]
     *
     * @param param 参数值
     * @return
     */
    public PageInfo<T> listGroupBy(P param) {
        return new PageInfo<>(getDao().listGroupBy(param));
    }



    /**
     * 业务上根据逻辑主键判断此数据是否存在
     *
     * @param entity 要判断的对象
     * @return 数据是否存在
     */
    public abstract boolean exists(T entity);

    /**
     * 数据保存前自定义的初始化操作，数据的初始化
     * @param entity 要初始化的对象
     */
    public abstract void customeInit(T entity);

    /**
     * 获取此处要使用的Dao对象，之所以要这样做，为了实现自动生成的Dao配置文件和可以修改的配置文件的分离
     * @return 要使用的Dao实例
     */
    public abstract BasicDao<T, P> getDao();
}


~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/service/upper_service.ftl

~~~java

/* FileName: ${entityName}Service.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
<#if logList?exists>
<#list logList as log>
  修改人：${log.authorName}
  修改时间：${log.updateDate?string('yyyy-MM-dd')}
  修改类型：${log.operType}
  修改内容：
<#list log.operContent?split("\n") as s>
    - ${s}
</#list>
----------------------------------------------------
</#list>
</#if>
************************************************** */

package ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.service.auto;

import ${basicConf.BASIC_PACKAGE_NAME}.commons.service.BasicService;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao;
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ${tableName}对应的基础Service类，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public abstract class _${entityName}Service extends BasicService<${entityName}, ${entityName}Param> {

    @Autowired
    ${entityName}Dao dao;

    @Override
    public ${entityName}Dao getDao() {
        return dao;
    }


    @Override
    public boolean exists(${entityName} entity) {
        <#list columnList as column>
        <#if column.logicKeyFlag == 1>
            <#assign hasLogicKey=1 />
        </#if>
        <#if column.primaryKeyFlag == 1>
            <#assign hasPrimaryKey=1 />
        </#if>
        </#list>

        <#if hasLogicKey?exists && hasLogicKey == 1>
        // 判断逻辑主键
        ${entityName}Param param = new ${entityName}Param();
        <#list columnList as column>
        <#if column.logicKeyFlag == 1>
        param.set${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}(entity.get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}());
        </#if>
        </#list>
        param.set_pageNum(1);
        param.set_pageSize(1);
        PageInfo<${entityName}> pageInfo = list(param);
        if (pageInfo.getTotal() > 0) {
            <#if hasPrimaryKey?exists && hasPrimaryKey == 1>
            if (<#list primaryKeyList as column>pageInfo.getList().get(0).get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}().equals(entity.get${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}())<#sep>
                && </#sep></#list>){
                return false;
            }
            </#if>
            return true;
        }
        </#if>

        return false;
    }

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/dao/basic_dao.ftl

~~~java

/* FileName: BasicDao.java
 * Copyright ${COMPANY_NAME}, All Rights Preserved!
 * License: ${LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${BASIC_PACKAGE_NAME?trim}.commons.dao;

import ${BASIC_PACKAGE_NAME?trim}.commons.entity.BasicEntity;
import ${BASIC_PACKAGE_NAME?trim}.commons.param.BasicParam;
import java.util.List;

/**
 * Dao的基础类
 * @author ${AUTHOR_NAME}
 */
public interface BasicDao<T extends BasicEntity, P extends BasicParam> {


    /**
     * 插入数据
     * @param entity 要插入的数据
     * @return 插入数据条数
     */
    int insert(T entity);

    /**
     * 删除数据 会自动修改del_flag, update_date, update_by三个字段，设置为删除.
     * @param entity 要删除的数据信息
     * @return 删除的数据条数
     */
    int delete(BasicEntity entity);

    /**
     * 根据条件进行数据删除（注意要慎重使用），删除条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 删除数据的条数
     */
    int deleteBy(P param);

    /**
     * 更新数据
     * @param Entity 要更新的数据
     * @return 更新成功的数据条数
     */
    int update(T Entity);

    /**
     * 获取数据
     * @param id 数据ID
     * @return 数据对象
     */
    T get(String id);

    /**
     * 查询数据，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 返回的结果列表
     */
    List<T> list(P param);

    /**
     * 根据Group By查询数据，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 返回的结果列表
     */
    List<T> listGroupBy(P param);

    /**
     * <b>Deprecated: 使用PageHelper后请使用#listBy方法代替</b><br />
     * 根据条件查询数据条数，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 满足条件的数据条数
     */
    @Deprecated
    public int count(P param);

}
~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/dao/upper_dao.ftl

~~~java

/* FileName: _${entityName}Dao.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

/* *************************************************
 * 修订历史：
 * *************************************************
<#if logList?exists>
<#list logList as log>
  修改人：${log.authorName}
  修改时间：${log.updateDate?string('yyyy-MM-dd')}
  修改类型：${log.operType}
  修改内容：
<#list log.operContent?split("\n") as s>
    - ${s}
</#list>
----------------------------------------------------
</#list>
</#if>
************************************************** */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.auto;

import ${basicConf.BASIC_PACKAGE_NAME?trim}.commons.dao.BasicDao;
import ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName};
import ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param;
import org.apache.ibatis.annotations.Param;

/**
 * ${tableName}对应的基础Dao，请勿修改，代码生成时会自动进行覆盖
 * @author ${basicConf.AUTHOR_NAME}
 */
public interface _${entityName}Dao extends BasicDao<${entityName}, ${entityName}Param> {
    public int realDelete(<#list primaryKeyList as column>@Param("${column.propertyName}") ${column.javaType} ${column.propertyName}<#sep>, </#sep></#list>);

}

~~~

## eppdev-jee-cg/src/main/resources/eppdev-jee/template/dao/dao.ftl

~~~java

/* FileName: ${entityName}Dao.java
 * Copyright ${basicConf.COMPANY_NAME}, All Rights Preserved!
 * License: ${basicConf.LICENSE_DESC}
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao;

import ${basicConf.BASIC_PACKAGE_NAME?trim}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.auto._${entityName}Dao;

/**
 * @author ${basicConf.AUTHOR_NAME}
 */
public interface ${entityName}Dao extends _${entityName}Dao {
}

~~~


# EPPDEV-JEE-WEB



## eppdev-jee-web/src/main/java/cn/eppdev/jee/cg/service/CgService.java

~~~java

/* FileName: CgService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class CgService {
    static Logger logger = LoggerFactory.getLogger(CgService.class);

    @Autowired
    FileGeneratorService fileGeneratorService;

    @Autowired
    DataSchemaLoadService dataSchemaLoadService;

    public RestResult<Map<String, String>> generateInitFileByFileName(String fileName) {
        Map<String, String> map = new HashMap<>();
        try {
            map = fileGeneratorService.generateInitFileByFileName(fileName);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "生成成功", map);
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), map);
        }
    }

    public RestResult<Map<String, String>> generateAllInitFile() {
        Map<String, String> map = new HashMap<>();
        try {
            map = fileGeneratorService.generateAllInitFile();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "生成成功", map);
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), map);
        }
    }


    public RestResult<Map<String, String>> generateInitFileByType(String type) {
        Map<String, String> map = new HashMap<>();
        try {
            map = fileGeneratorService.generateInitFileByType(type);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "生成成功", map);
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), map);
        }
    }

    public RestResult<Map<String, String>> generateVerionFileByType(String versionId, String type){
        try {
            return new RestResult<>(RestResult.STATUS_SUCCESS,
                    "生成成功",
                    fileGeneratorService.generateVersionFileByType(versionId, type));
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new HashMap<>());
        }
    }

    public RestResult<Map<String, String>> generateAllTableFile(String tableId) {
        try {
            return new RestResult<>(RestResult.STATUS_SUCCESS,
                    "生成成功",
                    fileGeneratorService.generateAllTableFile(tableId));
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new HashMap<>());
        }
    }


    public RestResult<Map<String, String>> generateTableFileByType(String tableId, String type) {
        try {
            return new RestResult<>(RestResult.STATUS_SUCCESS,
                    "生成成功",
                    fileGeneratorService.generateTableFileByType(tableId, type));
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new HashMap<>());
        }
    }


    public RestResult<String> readFromDb(){
        try{
            dataSchemaLoadService.updateTableInfo();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "加载成功", null);
        } catch (Exception e ){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<String> readFromDb(String tableName){
        try{
            dataSchemaLoadService.updateTableInfo(tableName);
            return new RestResult<String>(RestResult.STATUS_SUCCESS, "加载成功", null);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/cg/web/CgController.java

~~~java

/* FileName: GenerateController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.web;

import cn.eppdev.jee.cg.service.CgService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

/**
 * 代码生成的入口
 *
 * @author jinlong.hao
 */
@Controller("webCgController")
@RequestMapping("/web/cg")
public class CgController {

    static Logger logger = LoggerFactory.getLogger(CgController.class);

    @Autowired
    CgService cgService;

    @RequestMapping("/init/file/{fileName}")
    public String generateInitFileByFileName(@PathVariable("fileName") String fileName,
                                             RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateInitFileByFileName(fileName);
        logger.debug("/web/cg/init/file/{}: {}", fileName, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/init/list";
    }

    @RequestMapping("/init/type/{type}")
    public String generateInitFileByType(@PathVariable("type") String type,
                                         RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateInitFileByType(type);
        logger.debug("/web/cg/init/type/{}: {}", type, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/init/list";
    }

    @RequestMapping("/init/all")
    public String generateInitAllFile(RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateAllInitFile();
        logger.debug("/web/cg/init/all: {}", restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/init/list";
    }

    @RequestMapping("/read/db")
    public String readFromDb(RedirectAttributes redirectAttributes) {
        RestResult<String> result = cgService.readFromDb();
        logger.debug("/web/cg/read/db -> result:{}", result);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return "redirect:/web/conf/version/view/00000000000000000000000000000000";
    }


    @RequestMapping("/read/db/{tableName}")
    public String readFromDb(@PathVariable("tableName") String tableName, RedirectAttributes redirectAttributes){
        RestResult<String> result = cgService.readFromDb(tableName);
        logger.debug("/web/cg/read/db -> result:{}", result);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return "redirect:/web/conf/version/view/00000000000000000000000000000000";
    }


    @RequestMapping("/version/{versionId}/type/{type}")
    public String generateVersionFileByType(@PathVariable("versionId") String versionId,
                                            @PathVariable("type") String type,
                                            RedirectAttributes redirectAttributes){
        RestResult<Map<String, String>> restResult = cgService.generateVerionFileByType(versionId, type);
        logger.debug("/web/cg/version/{}/type/{} -> restResult:{}", versionId, type, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/version/list";
    }

    @RequestMapping("/version/{versionId}/table/{tableId}/all")
    public String generateTableCodeAll(@PathVariable("versionId") String versionId,
                                  @PathVariable("tableId") String tableId,
                                  RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateAllTableFile(tableId);
        logger.debug("/web/cg/version/{}/table/{}/all", versionId, tableId, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/version/{versionId}/table/{tableId}/type/{type}")
    public String generateTableFileByType(@PathVariable("versionId") String versionId,
                                          @PathVariable("tableId") String tableId,
                                          @PathVariable("type") String type,
                                          RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateTableFileByType(tableId, type);
        logger.debug("/web/cg/table/{}/type/{}: {}", tableId, type, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/rest/UserController.java

~~~java

/* FileName: UserController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController("restUserController")
@RequestMapping("/rest/mapper/user")
public class UserController {
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/rest/VersionController.java

~~~java

/* FileName: VersionController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.service.EppdevVersionService;
import cn.eppdev.jee.conf.service.VersionService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController("restVersionController")
@RequestMapping("/rest/mapper/version")
public class VersionController {
    static Logger logger = LoggerFactory.getLogger(VersionController.class);

    @Autowired
    EppdevVersionService eppdevVersionService;

    @Autowired
    VersionService versionService;

    @RequestMapping("/get/{id}")
    public RestResult<EppdevVersion> get(@PathVariable("id") String id){
        logger.debug("/rest/mapper/version/get/{}", id);
        RestResult<EppdevVersion> result = versionService.get(id);
        logger.debug("/rest/mapper/version/get/{} ->result:{}", id, result);
        return result;
    }

    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody EppdevVersion version){
        logger.debug("/rest/mapper/version/add -> version:{}", version);
        RestResult<String> result = versionService.add(version.getVersionName(), version.getFromVersionId());
        logger.debug("/rest/mapper/version/add -> result:{}", result);
        return result;
    }


    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id){
        logger.debug("/rest/mapper/version/delete/{}", id);
        RestResult<Integer> result = versionService.delete(id);
        logger.debug("/rest/mapper/version/delete/{} -> result:{}", id, result);
        return result;
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/rest/IndexController.java

~~~java

/* FileName: IndexService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.service.IndexService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController("restIndexController")
@RequestMapping("/rest/mapper/index")
public class IndexController {
    static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    IndexService indexService;

    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody EppdevIndex eppdevIndex) {
        logger.debug("/rest/mapper/index/add -> eppdevIndex:{}", eppdevIndex);
        RestResult<String> result = indexService.add(eppdevIndex);
        logger.debug("/rest/mapper/index/add -> result:{}", result);
        return result;
    }


    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id) {
        logger.debug("/rest/mapper/index/delete/{}", id);
        RestResult<Integer> result = indexService.delete(id);
        logger.debug("/rest/mapper/index/delete/{} -> result:{}", id, result);
        return result;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/rest/ColumnController.java

~~~java

/* FileName: ColumnController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.service.ColumnService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController("restColumnController")
@RequestMapping("/rest/mapper/column")
public class ColumnController {

    static Logger logger = LoggerFactory.getLogger(ColumnController.class);

    @Autowired
    ColumnService columnService;

    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody EppdevColumn eppdevColumn){
        logger.debug("/rest/mapper/column/add -> eppdevColumn:{}", eppdevColumn);
        RestResult<String> result = columnService.add(eppdevColumn);
        logger.debug("/rest/mapper/column/add -> result:{}", result);
        return result;
    }

    @RequestMapping("/get/{id}")
    public RestResult<EppdevColumn> get(@PathVariable("Id") String id){
        logger.debug("/rest/mapper/column/get/{}", id);
        RestResult<EppdevColumn> result = columnService.get(id);
        logger.debug("/rest/mapper/column/get/{} -> result:{}", id, result);
        return result;
    }

    @RequestMapping("/update")
    public RestResult<Integer> update(@RequestBody EppdevColumn eppdevColumn){
        logger.debug("/rest/mapper/column/update -> eppdevColumn:{}", eppdevColumn);
        RestResult<Integer> result = columnService.update(eppdevColumn);
        logger.debug("/rest/mapper/column/update -> result:{}", result);
        return result;
    }

    @RequestMapping("/delete/{id}")
    public RestResult<Integer> delete(@PathVariable("id") String id){
        logger.debug("/rest/mapper/column/delete/{}", id);
        RestResult<Integer> result = columnService.delete(id);
        logger.debug("/rest/mapper/column/delete/{} -> result:{}", id, result);
        return result;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/rest/TableController.java

~~~java

/* FileName: TableController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.service.TableService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController("restTableController")
@RequestMapping("/rest/mapper/table")
public class TableController {

    static Logger logger = LoggerFactory.getLogger(TableController.class);

    @Autowired
    TableService tableService;

    @RequestMapping("/get/{id}")
    public RestResult<EppdevTable> get(@PathVariable("id") String id){
        logger.debug("/rest/mapper/table/get/{}", id);
        RestResult<EppdevTable> result =  tableService.get(id);
        logger.debug("/rest/mapper/table/get/{} -> result:{}", id, result);
        return result;
    }

    @RequestMapping("/update")
    public RestResult<Integer> update(@RequestBody EppdevTable eppdevTable){
        logger.debug("/rest/mapper/table/update -> eppdevTable:{}", eppdevTable);
        RestResult<Integer> result = tableService.update(eppdevTable);
        logger.debug("/rest/mapper/table/update -> result:{}", result);
        return result;
    }


    @RequestMapping("/add")
    public RestResult<String> add(@RequestBody EppdevTable eppdevTable){
        logger.debug("/rest/mapper/table/add -> eppdevTable:{}", eppdevTable);
        RestResult<String> result = tableService.add(eppdevTable);
        logger.debug("/rest/mapper/table/add -> result:{}", result);
        return result;
    }

    public RestResult<Integer> delete(@PathVariable("id") String id){
        logger.debug("/rest/mapper/table/delete/{}", id);
        RestResult<Integer> result = tableService.delete(id);
        logger.debug("/rest/mapper/table/delete/{} -> result:{}", id, result);
        return result;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/rest/LogController.java

~~~java

/* FileName: LogController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping("/rest/mapper/log")
public class LogController {
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/ConfService.java

~~~java

/* FileName: ConfService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class ConfService {

    static Logger logger = LoggerFactory.getLogger(ConfService.class);

    @Autowired
    EppdevConfService eppdevConfService;

    public RestResult<Map<String, String>> getAllConf(){
        try {
            Map<String, String> map = eppdevConfService.getAllConf();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", map);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<PageInfo<EppdevConf>> listAll(){
        try {
            EppdevConfParam confParam = new EppdevConfParam();
            confParam.buildOrderBy(EppdevConf.COLUMN_ID_);
            PageInfo<EppdevConf> pageInfo = eppdevConfService.list(confParam);
            for (EppdevConf conf: pageInfo.getList()){
                eppdevConfService.getAllConf().put(conf.getConfName(), conf.getConfValue());
            }
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch ( Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public RestResult<Integer> update(EppdevConf eppdevConf){
        try {
            Integer cnt = eppdevConfService.update(eppdevConf);
            if (cnt > 0){
                eppdevConfService.getAllConf().put(eppdevConf.getConfName(), eppdevConf.getConfValue());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "保存成功", cnt);
            }else {
                return new RestResult<>(RestResult.STATUS_FAILED, "保存失败，无此配置？", cnt);
            }
        } catch ( Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/IndexService.java

~~~java

/* FileName: IndexService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class IndexService {
    static Logger logger = LoggerFactory.getLogger(IndexService.class);

    @Autowired
    EppdevIndexService eppdevIndexService;

    @Autowired
    TableLogService tableLogService;

    public RestResult<String> add(EppdevIndex eppdevIndex){
        try{
            int cnt = eppdevIndexService.save(eppdevIndex);
            tableLogService.addLog(eppdevIndex.getTableId(), EppdevTableLog.OPER_TYPE_UPDATE, "添加索引：" + eppdevIndex.getIndexName());
            if (cnt == 1){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", eppdevIndex.getId());
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Index name exist?", null);
            }
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<Integer> delete(String id){
        try {
            EppdevIndex index = eppdevIndexService.get(id);
            int cnt = eppdevIndexService.delete(id);
            tableLogService.addLog(index.getTableId(), EppdevTableLog.OPER_TYPE_UPDATE, "删除索引：" + index.getIndexName());
            if (cnt == 1){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Index NOT exists?", cnt);
            }
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/TableService.java

~~~java

/* FileName: TableService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.TableFileInfo;
import cn.eppdev.jee.cg.service.ColumnGeneratorService;
import cn.eppdev.jee.cg.service.FileGeneratorService;
import cn.eppdev.jee.cg.utils.FreeMarkerUtils;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class TableService {

    @Autowired
    EppdevTableService eppdevTableService;

    @Autowired
    ColumnGeneratorService columnGeneratorService;

    @Autowired
    EppdevColumnService eppdevColumnService;

    @Autowired
    EppdevConfService eppdevConfService;

    @Autowired
    TableLogService tableLogService;

    @Autowired
    FileGeneratorService fileGeneratorService;

    static Logger logger = LoggerFactory.getLogger(TableService.class);

    public RestResult<EppdevTable> get(String id) {
        try {
            EppdevTable table = eppdevTableService.get(id);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "", table);
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<Integer> update(EppdevTable eppdevTable) {
        try {
            int cnt = eppdevTableService.save(eppdevTable);
            if (cnt == 1) {
                tableLogService.addLog(eppdevTable.getId(), EppdevTableLog.OPER_TYPE_UPDATE, "修改表信息：" + eppdevTable.getTableName());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "保存成功", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "保存失败", 0);
            }
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }


    public RestResult<String> add(EppdevTable eppdevTable) {
        try {
            int cnt = eppdevTableService.insert(eppdevTable);
            if (cnt == 1) {
                List<EppdevColumn> columnList = columnGeneratorService.generateDefaultColumn();
                for (EppdevColumn column: columnList){
                    column.setTableId(eppdevTable.getId());
                    eppdevColumnService.insert(column);
                }
                tableLogService.addLog(eppdevTable.getId(), EppdevTableLog.OPER_TYPE_CREATE, "创建库表并初始化技术字段：" + eppdevTable.getTableName());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "保存成功", eppdevTable.getId());
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "保存失败", null);
            }
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public RestResult<Integer> delete(String id) {
        try {
            EppdevTable eppdevTable = eppdevTableService.get(id);
            int cnt = eppdevTableService.delete(id);
            if (cnt == 1) {
                tableLogService.addLog(eppdevTable.getId(), EppdevTableLog.OPER_TYPE_DELETE, "删除库表：" + eppdevTable.getTableName());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Table NOT exists?", cnt);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

    public List<TableFileInfo> getTableFileInfoList(String tableId) {
        List<TableFileInfo> tableFileInfoList = GeneratorUtils.getTableFileInfoList();
        try {
            EppdevTable eppdevTable = get(tableId).getData();
            logger.debug("eppdevTable:{}", eppdevTable);
            List<TableFileInfo> list = new ArrayList<>();
            for (TableFileInfo fileInfo : tableFileInfoList) {
                TableFileInfo tableFileInfo = new TableFileInfo(fileInfo.getType(), fileInfo.getReplace());
                tableFileInfo.setFilePath(FreeMarkerUtils.buildResult(fileInfo.getFilePathTemplate(), eppdevTable));
                list.add(tableFileInfo);
            }
            return list;
        } catch (Exception e){
            e.printStackTrace();
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return tableFileInfoList;
        }
    }

    public RestResult<String> preview(String tableId, String type){
        try {
            String content = fileGeneratorService.generateContent(tableId, type);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "预览成功", content);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, "预览失败：" + e.getMessage(), null);
        }
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/TableLogService.java

~~~java

/* FileName: TableLogService.java
 * Copyright EPPDEV.CN(jinlong.hao@eppdev.cn)  All Rights Preserved!
 * Licensed By ANTI-996 License V1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevTableLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class TableLogService {
    static Logger logger = LoggerFactory.getLogger(TableLogService.class);

    @Autowired
    EppdevTableLogService eppdevTableLogService;

    @Autowired
    EppdevConfService eppdevConfService;

    @Transactional(readOnly = false)
    public int addLog(String tableId, String operType, String operContent) {
        String authorName = eppdevConfService.getConf("AUTHOR_NAME");
        List<EppdevTableLog> list = eppdevTableLogService.listByTableId(tableId);
        // 24小时之内同一个人的操作，直接合并
        if (list.size() > 0 && authorName.equals(list.get(0).getAuthorName())
                &&  System.currentTimeMillis() - list.get(0).getCreateDate().getTime() < 1000L*60*60*8) {
            EppdevTableLog eppdevTableLog  = list.get(0);
            eppdevTableLog.setOperContent(eppdevTableLog.getOperContent() + "\n" + operContent);
            eppdevTableLogService.save(eppdevTableLog);
        } else {
            EppdevTableLog eppdevTableLog = new EppdevTableLog();
            eppdevTableLog.setTableId(tableId);
            eppdevTableLog.setAuthorName(authorName);
            eppdevTableLog.setOperType(operType);
            eppdevTableLog.setOperContent(operContent);
            eppdevTableLogService.save(eppdevTableLog);
        }
        return 1;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/VersionService.java

~~~java

/* FileName: VersionService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.TableFileInfo;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.param.EppdevVersionParam;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class VersionService {

    static Logger logger = LoggerFactory.getLogger(VersionService.class);

    @Autowired
    EppdevVersionService eppdevVersionService;

    @Autowired
    EppdevTableService eppdevTableService;

    @Autowired
    EppdevColumnService eppdevColumnService;

    @Autowired
    EppdevIndexService eppdevIndexService;

    public RestResult<EppdevVersion> get(String id){
        try {
            EppdevVersion version = eppdevVersionService.get(id);
            if (version != null){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success!", version);
            }
            else {
                return new RestResult<>(RestResult.STATUS_FAILED, "this version does not exists？", null);
            }
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return  new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    /**
     * 添加一个新版本，具体逻辑如下：<br />
     * <ul>
     *     <li>1. 获取旧版本信息</li>
     *     <li>2. 判断新版本名称是否存在</li>
     *     <li>3. 保存新版本的信息</li>
     *     <li>4. 复制老版本的所有信息到新版本中（表信息、列信息、索引信息）</li>
     * </ul>
     * @param versionName 新版本名称
     * @param fromVersionId 老版本的id
     * @return 新的versionId
     */
    public RestResult<String> add(String versionName, String fromVersionId){
        try {
            /**
             * 一、获取旧版本信息
             */
            EppdevVersion oldVersion = eppdevVersionService.get(fromVersionId);
            if (oldVersion == null) {
                return new RestResult<>(RestResult.STATUS_FAILED, "Source Version does NOT exists?", null);
            }

            /**
             * 二、判断新版本名称是否存在
             */
            EppdevVersionParam param = new EppdevVersionParam();
            param.setVersionName(versionName);
            PageInfo<EppdevVersion> pageInfo = eppdevVersionService.list(param);
            if (pageInfo.getTotal() > 0) {
                return new RestResult<>(RestResult.STATUS_FAILED, "Version name exists?", null);
            }

            /**
             * 三、保存新的版本信息
             */
            EppdevVersion newVersion = new EppdevVersion();
            newVersion.setVersionName(versionName);
            eppdevVersionService.save(newVersion);

            /**
             * 四、依次保存老版本的所有信息到新版本中
             */
            String newVersionId = newVersion.getId();
            for (EppdevTable table : oldVersion.getTableList()) {
                // 4.1 获取表中的列、所有信息
                List<EppdevColumn> columnList = eppdevColumnService.listByTableId(table.getId());
                List<EppdevIndex> indexList = eppdevIndexService.listByTableId(table.getId());

                // 4.2 保存表
                table.setId(null);
                table.setVersionId(newVersionId);
                eppdevTableService.save(table);
                String newTableId = table.getId();

                // 4.3 保存列信息
                for (EppdevColumn column : columnList) {
                    column.setTableId(newTableId);
                    column.setId(null);
                    eppdevColumnService.save(column);
                }

                // 4.4 保存索引信息
                for (EppdevIndex index : indexList) {
                    index.setTableId(newTableId);
                    index.setId(null);
                    eppdevIndexService.save(index);
                }
            }

            return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", newVersionId);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public RestResult<Integer> delete(String id){
        try{
            int cnt = eppdevVersionService.delete(id);
            if (cnt == 1){
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Version NOT exist?", 0);
            }
        }catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

    public RestResult<PageInfo<EppdevVersion>> listAll(){
        try {
            PageInfo<EppdevVersion> pageInfo = eppdevVersionService.listAll();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", pageInfo);
        } catch ( Exception e){
           logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
           return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public List<TableFileInfo> listTableFileInfo(){
        return GeneratorUtils.getTableFileInfoList();
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/InitService.java

~~~java

/* FileName: InitService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.InitFileInfo;
import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.cg.service.FileGeneratorService;
import cn.eppdev.jee.cg.utils.FreeMarkerUtils;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class InitService {
    static Logger logger = LoggerFactory.getLogger(InitService.class);

    @Autowired
    FileGeneratorService fileGeneratorService;

    @Autowired
    EppdevConfService confService;

    public RestResult<List<InitFileType>> list() {
        try {
            Map<String, String> basicConf = confService.getAllConf();
            List<InitFileType> initFileTypeList = GeneratorUtils.getInitFileTypeList(basicConf.get("DB_TYPE"));
            for (InitFileType fileType: initFileTypeList){
                for (InitFileInfo fileInfo : fileType.getFileInfoList()){
                    if (fileInfo.getFilePath() == null || fileInfo.getFilePath().trim().length() == 0){
                        fileInfo.setFilePath(FreeMarkerUtils.buildResult(fileInfo.getFilePathTemplate(), basicConf));
                    }
                }
            }
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", initFileTypeList);
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new ArrayList<>());
        }
    }

    public RestResult<String> preview(String fileName) {
        try {
            String content = fileGeneratorService.getInitFileContent(fileName);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", content);
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/service/ColumnService.java

~~~java

/* FileName: ColumnService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.ColumnTypeInfo;
import cn.eppdev.jee.cg.service.ColumnGeneratorService;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevTableLog;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class ColumnService {
    static Logger logger = LoggerFactory.getLogger(ColumnService.class);

    @Autowired
    EppdevColumnService eppdevColumnService;

    @Autowired
    EppdevConfService eppdevConfService;

    @Autowired
    TableLogService tableLogService;

    @Autowired
    ColumnGeneratorService generatorService;

    public RestResult<EppdevColumn> get(String id) {
        try {
            EppdevColumn eppdevColumn = eppdevColumnService.get(id);
            if (eppdevColumn != null) {
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", eppdevColumn);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Column NOT exists?", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<String> add(EppdevColumn eppdevColumn) {
        try {
            List<EppdevColumn> list = eppdevColumnService.listByTableId(eppdevColumn.getTableId());
            int maxSortIndex = 1;
            for (EppdevColumn column: list) {
                if (column.getSortIndex() < 9000 && column.getSortIndex() > 1){
                    maxSortIndex = column.getSortIndex();
                }
            }
            eppdevColumn.setSortIndex(maxSortIndex + 1);
            int cnt = eppdevColumnService.save(eppdevColumn);
            if (cnt == 1) {
                tableLogService.addLog(eppdevColumn.getTableId(), EppdevTableLog.OPER_TYPE_UPDATE, "添加字段:" + eppdevColumn.getColumnName());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", eppdevColumn.getId());
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Column name exists?", null);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


    public RestResult<Integer> update(EppdevColumn eppdevColumn) {
        try {
            int cnt = eppdevColumnService.save(eppdevColumn);
            if (cnt == 1) {
                tableLogService.addLog(eppdevColumn.getTableId(), EppdevTableLog.OPER_TYPE_UPDATE, "修改字段:" + eppdevColumn.getColumnName());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Column NOT exists?", 0);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }


    public RestResult<Integer> delete(String id) {
        try {
            EppdevColumn column = eppdevColumnService.get(id);
            int cnt = eppdevColumnService.delete(id);
            if (cnt == 1) {
                tableLogService.addLog(column.getTableId(), EppdevTableLog.OPER_TYPE_UPDATE, "删除字段:" + column.getColumnName());
                return new RestResult<>(RestResult.STATUS_SUCCESS, "Success", cnt);
            } else {
                return new RestResult<>(RestResult.STATUS_FAILED, "Failed. Column NOT exists?", 0);
            }
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), 0);
        }
    }

    public List<ColumnTypeInfo> getTypeInfoList(){
        return generatorService.listAllColumnType(eppdevConfService.getDbType());
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/DbController.java

~~~java

/* FileName: DbController.java
 * Copyright EPPDEV.CN, All right preserved!
 * Author: jinlong.hao
 * Lisenced by: Anti-996 License 1.0
 */
package cn.eppdev.jee.conf.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.eppdev.jee.cg.service.DataSchemaLoadService;
import cn.eppdev.jee.conf.entity.EppdevTable;

@Controller
@RequestMapping("/web/conf/db")
public class DbController{

    static Logger logger = LoggerFactory.getLogger(DbController.class);

    @Autowired
    DataSchemaLoadService schemaLoadService;

    @RequestMapping("/list")
    public String readAll(ModelMap modelMap){
        List<EppdevTable> list = schemaLoadService.listTablesFromConn();
        logger.debug("/web/conf/db/list -> list: {}", list);
        modelMap.addAttribute("list", schemaLoadService.listTablesFromConn());
        return "db/list";
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/VersionController.java

~~~java

/* FileName: VersionController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.service.VersionService;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

/**
 * @author jinlong.hao
 */
@Controller("webVersionController")
@RequestMapping("/web/conf/version")
public class VersionController {
    static Logger logger = LoggerFactory.getLogger(VersionController.class);

    @Autowired
    VersionService versionService;

    @RequestMapping("/list")
    public String list(Model model, RedirectAttributes redirectAttributes){
        RestResult<PageInfo<EppdevVersion>> restResult = versionService.listAll();
        logger.debug("/web/conf/version/list -> restResult:{}", restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            model.addAttribute("list", restResult.getData().getList());
            model.addAttribute("tableFileInfoList", versionService.listTableFileInfo());
        } else {
            redirectAttributes.addAttribute("message", restResult.getMessage());
            model.addAttribute("list", new ArrayList<>());
        }
        return "version/list";
    }

    @RequestMapping("/view/{id}")
    public String get(@PathVariable("id") String id,  Model model,
                      RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/view/{id} -> id:{}", id);
        RestResult<EppdevVersion> restResult = versionService.get(id);
        logger.debug("/web/conf/view/{} -> restResult:{}", id, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            model.addAttribute("version", restResult.getData());
        } else {
            redirectAttributes.addAttribute("message", restResult.getMessage());
            return "redirect:/message";
        }
        return "version/view";
    }

    @RequestMapping("/add/to")
    public String toAdd(){
        return "version/add";
    }


    @RequestMapping("/add/do")
    public String doAdd(Model model){
        return "redirect:";
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/IndexController.java

~~~java

/* FileName: IndexController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.service.IndexService;
import cn.eppdev.jee.conf.service.TableService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author jinlong.hao
 */
@Controller("webIndexController")
@RequestMapping("/web/conf/version/{versionId}/table/{tableId}/index")
public class IndexController {
    static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    IndexService indexService;

    @Autowired
    TableService tableService;

    @RequestMapping("/add/to")
    public String toAdd(@PathVariable("versionId") String versionId,
                        @PathVariable("tableId") String tableId,
                        Model model){
        logger.debug("/web/conf/version/{}/table/{}/index/add/to", versionId, tableId);
        EppdevIndex index = new EppdevIndex();
        index.setTableId(tableId);
        model.addAttribute("index", index);
        model.addAttribute("tableId", tableId);
        model.addAttribute("versionId", versionId);
        model.addAttribute("table", tableService.get(tableId).getData());
        return "index/form";
    }

    @RequestMapping("/add/do")
    public String doAdd(@PathVariable("versionId") String versionId,
                        @PathVariable("tableId") String tableId,
                        EppdevIndex index,
                        Model model,
                        RedirectAttributes redirectAttributes){
        RestResult<String> result = indexService.add(index);
        logger.debug("/web/conf/version/{}/table/{}/index/add/do -> result:{}", versionId, tableId, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "添加成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "添加失败:" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/delete/{indexId}")
    public String delete(@PathVariable("versionId") String versionId,
                         @PathVariable("tableId") String tableId,
                         @PathVariable("indexId") String indexId,
                         RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/version/{}/table/{}/index/delete/{}", versionId, tableId, indexId);
        RestResult<Integer> result = indexService.delete(indexId);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "添加成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "添加失败:" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/ColumnController.java

~~~java

/* FileName: ColumnController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.service.ColumnService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author jinlong.hao
 */
@Controller("webColumnController")
@RequestMapping("/web/conf/version/{versionId}/table/{tableId}/column")
public class ColumnController {
    static Logger logger = LoggerFactory.getLogger(ColumnController.class);

    @Autowired
    ColumnService columnService;

    @RequestMapping("/add/to")
    public String toAdd(@PathVariable("tableId") String tableId,
                        @PathVariable("versionId") String versionId,
                        Model model) {
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        model.addAttribute("tableId", tableId);
        model.addAttribute("versionId", versionId);
        model.addAttribute("column", column);
        model.addAttribute("columnTypeList", columnService.getTypeInfoList());
        return "column/form";
    }


    @RequestMapping("/add/do")
    public String doAdd(@PathVariable("versionId") String versionId,
                        @PathVariable("tableId") String tableId,
                        EppdevColumn column,
                        RedirectAttributes redirectAttributes) {
        try {
            columnService.add(column);
            redirectAttributes.addFlashAttribute("message", "保存成功");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "保存失败：" + e.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/update/{id}/to")
    public String toUpdate(@PathVariable("id") String columnId,
                           @PathVariable("versionId") String versionId,
                           @PathVariable("tableId") String tableId,
                           Model model,
                           RedirectAttributes redirectAttributes) {
        try {
            EppdevColumn column = columnService.get(columnId).getData();
            model.addAttribute("column", column);
            model.addAttribute("columnTypeList", columnService.getTypeInfoList());
            return "column/form";
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            redirectAttributes.addFlashAttribute("message", "获取信息失败" + e.getMessage());
            return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
        }
    }


    @RequestMapping("/update/{id}/do")
    public String doUpdate(@PathVariable("id") String id,
                           @PathVariable("versionId") String versionId,
                           @PathVariable("tableId") String tableId,
                           EppdevColumn column,
                           Model model,
                           RedirectAttributes redirectAttributes) {
        logger.debug("/web/conf/version/{}/table/{}/column/update/do -> column:{}",
                versionId, tableId, column);
        RestResult<Integer> result = columnService.update(column);
        logger.debug("/web/conf/version/{}/table/{}/column/update/do -> result:{}",
                versionId, tableId, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "修改成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "修改失败：" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + column.getTableId();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id,
                         @PathVariable("versionId") String versionId,
                         @PathVariable("tableId") String tableId,
                         RedirectAttributes redirectAttributes) {
        RestResult<Integer> result = columnService.delete(id);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "删除成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "删除失败: " + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/InitController.java

~~~java

/* FileName: InitController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.conf.service.ConfService;
import cn.eppdev.jee.conf.service.InitService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author jinlong.hao
 */
@Controller("webInitController")
@RequestMapping("/web/conf/init")
public class InitController {
    static Logger logger = LoggerFactory.getLogger(InitController.class);

    @Autowired
    ConfService confService;

    @Autowired
    InitService initService;

    @RequestMapping("/list")
    public String list(Model model){
        RestResult<List<InitFileType>> restResult = initService.list();
        logger.debug("/web/conf/init/list -> restResult:{}", restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            model.addAttribute("list", restResult.getData());
            model.addAttribute("conf", confService.listAll());
        } else {
            model.addAttribute("message", "配置获取错误");
            model.addAttribute("conf", confService.listAll());
        }
        return "init/list";
    }

    @RequestMapping("/preview/{fileName}")
    public String preview(@PathVariable("fileName") String fileName,
                          Model model){
        RestResult<String> restResult = initService.preview(fileName);
        model.addAttribute("fileName", fileName);
        logger.debug("/web/conf/init/preview/{} -> restResult:{}", fileName, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            model.addAttribute("content", restResult.getData());
        } else {
            model.addAttribute("message", restResult.getMessage());
        }
        return "init/preview";
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/TableController.java

~~~java

/* FileName: TableController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.service.TableService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author jinlong.hao
 */
@Controller("webTableController")
@RequestMapping("/web/conf/version/{versionId}/table")
public class TableController {
    static Logger logger = LoggerFactory.getLogger(TableController.class);

    @Autowired
    TableService tableService;

    @RequestMapping("/view/{id}")
    public String view(@PathVariable("id") String id,
                       @PathVariable("versionId") String versionId,
                       Model model,
                       RedirectAttributes redirectAttributes){
        RestResult<EppdevTable> result = tableService.get(id);
        logger.debug("/web/conf/table/view/{} -> result:{}", id, result);
        if (result.getStatus() != RestResult.STATUS_SUCCESS){
            redirectAttributes.addFlashAttribute("message", "数据获取失败: " + result.getMessage());
            return "redirect:/web/conf/version/list";
        } else {
            model.addAttribute("table", result.getData());
            model.addAttribute("tableFileInfoList", tableService.getTableFileInfoList(id));
        }
        return "table/view";
    }


    @RequestMapping("/add/to")
    public String toAdd(@PathVariable("versionId") String versionId,
                        Model model){
        EppdevTable eppdevTable = new EppdevTable();
        eppdevTable.setVersionId(versionId);
        model.addAttribute("table", eppdevTable);
        return "table/form";
    }


    @RequestMapping("/add/do")
    public String doAdd(@PathVariable("versionId") String versionId,
                        EppdevTable eppdevTable,
                        RedirectAttributes redirectAttributes){
        RestResult<String> result = tableService.add(eppdevTable);
        if (RestResult.STATUS_SUCCESS == result.getStatus()){
            redirectAttributes.addFlashAttribute("message", "创建成功");
            return "redirect:/web/conf/version/" + versionId + "/table/view/" + result.getData();
        } else {
            redirectAttributes.addFlashAttribute("message", "创建成功");
            return "redirect:/web/conf/version/view/" + eppdevTable.getVersionId();
        }
    }


    @RequestMapping("/update/{tableId}/to")
    public String toUpdate(@PathVariable("tableId") String tableId,
                           @PathVariable("versionId") String versionId,
                           EppdevTable eppdevTable,
                           Model model){
        RestResult<EppdevTable> restResult = tableService.get(tableId);
        logger.debug("/web/conf/version/{}/table/update/{}/do -> restResult:{}", versionId, tableId, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            model.addAttribute("table", restResult.getData());
            return "table/form";
        } else {
            return "redirect:/web/conf/version/view/" + versionId;
        }
    }

    @RequestMapping("/update/{tableId}/do")
    public String doUpdate(@PathVariable("versionId") String versionId,
                           @PathVariable("tableId") String tableId,
                           EppdevTable eppdevTable,
                           RedirectAttributes redirectAttributes){
        RestResult<Integer> result = tableService.update(eppdevTable);
        logger.debug("/web/conf/version/{}/table/update/{}/do -> result:{}", versionId, tableId, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "修改成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "修改失败：" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id,
                         @PathVariable("versionId") String versionId,
                         RedirectAttributes redirectAttributes){
        RestResult<Integer> result = tableService.delete(id);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "删除成功");
        }
        else {
            redirectAttributes.addFlashAttribute("message", "删除失败:" + result.getMessage());
        }
        return "redirect:/web/conf/version/view/" + versionId;
    }

    @RequestMapping("/{tableId}/preview/{type}")
    public String preview(@PathVariable("versionId") String versionId,
                          @PathVariable("tableId") String tableId,
                          @PathVariable("type") String type,
                          Model model,
                          RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/version/{}/table/{}/preview/{}", versionId, tableId, type);
        RestResult<String> result = tableService.preview(tableId, type);
        logger.debug("/web/conf/table/{}/preview/{} -> result:{}",tableId, type, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            model.addAttribute("content", result.getData());
            model.addAttribute("fileName", type);
            model.addAttribute("tableId", tableId);
            model.addAttribute("versionId", versionId);
            return "table/preview";
        } else {
            redirectAttributes.addFlashAttribute("message", "预览出错：" + result.getMessage());
            return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
        }
    }



}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/conf/web/BasicController.java

~~~java

/* FileName: BasicController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.service.ConfService;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

/**
 * @author jinlong.hao
 */
@Controller("webBasicController")
@RequestMapping("/web/conf/basic")
public class BasicController {
    static Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    ConfService confService;

    @RequestMapping("/list")
    public String list(Model model, RedirectAttributes redirectAttributes){
        RestResult<PageInfo<EppdevConf>> restResult = confService.listAll();
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            model.addAttribute("list", restResult.getData().getList());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
            model.addAttribute("list", new ArrayList<>());
        }
        return "conf/list";
    }

    @RequestMapping("/save")
    public String doUpdate(EppdevConf conf, RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/basic/save -> conf:{}", conf);
        RestResult<Integer> restResult = confService.update(conf);
        logger.debug("/web/conf/basic/save -> restResult:{}", restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            redirectAttributes.addFlashAttribute("message", "保存成功");
        } else{
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/basic/list";
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/Application.java

~~~java

/* FileName: Application.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinlong.hao
 */
@SpringBootApplication
@MapperScan("cn.eppdev.jee.conf.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/share/rest/LoginController.java

~~~java

/* FileName: LoginController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.rest;

import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.service.EppdevUserService;
import cn.eppdev.jee.share.entity.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping("/rest/share")
public class LoginController {

    @Autowired
    EppdevUserService userService;

    @RequestMapping("/login")
    public RestResult<EppdevUser> login(String loginName, String password){
        return null;
    }

    @RequestMapping("/logout")
    public RestResult<String> logout(){
        return null;
    }

}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/share/entity/RestResult.java

~~~java

/* FileName: RestResult.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.entity;

import cn.eppdev.jee.utils.JSONUtils;

/**
 * @author jinlong.hao
 */
public class RestResult<T> {
    public static int STATUS_SUCCESS = 2000;
    public static int STATUS_FAILED = 2001;
    private int status;
    private String message;
    private T data;

    public RestResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/share/service/LoginService.java

~~~java

/* FileName: LoginService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author jinlong.hao
 */
@Service
public class LoginService {
    static Logger logger = LoggerFactory.getLogger(LoginService.class);


}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/share/web/RootController.java

~~~java

/* FileName: RootController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.web;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinlong.hao
 */
@Controller("webRootController")
public class RootController {
    static Logger logger = LoggerFactory.getLogger(RootController.class);

    @RequestMapping("/")
    public String index(){
        return "redirect:/web/conf/version/view/" + EppdevVersion.MASTER_VERSION_ID;
    }
}

~~~

## eppdev-jee-web/src/main/java/cn/eppdev/jee/share/web/MessageController.java

~~~java

/* FileName: MessageController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinlong.hao
 */
@Controller
public class MessageController {
    static Logger logger = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping("/message")
    public String message(Model model){
        return "message";
    }
}

~~~

## eppdev-jee-web/pom.xml

~~~java

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>eppdev-jee-pom</artifactId>
        <groupId>cn.eppdev.jee</groupId>
        <version>0.1.6</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>eppdev-jee-web</artifactId>


    <dependencies>

        <!-- for springboot -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
        <!-- end of springboot -->

        <!-- for eppdev-jee -->
        <dependency>
            <groupId>cn.eppdev.jee</groupId>
            <artifactId>eppdev-jee-basic</artifactId>
        </dependency>
        <dependency>
            <groupId>cn.eppdev.jee</groupId>
            <artifactId>eppdev-jee-cg</artifactId>
        </dependency>
        <!-- end of eppdev-jee -->

        <!-- for database -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
        </dependency>
        <!-- end of database -->

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <executable>true</executable>
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>
    </build>

</project>

~~~

## eppdev-jee-web/src/main/resources/templates/fragments/footer.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<body>
<div th:fragment="copy" class="text-center">
    <hr />
    <p class="text-muted"><small><small>版权所有 &copy; <a href="mailto:jinlong.hao@eppdev.cn">Eppdev团队</a></small></small></p>
    <p class="text-muted"><small><small><a href="http://jee.eppdev.cn">EPPDEV-JEE</a> 是一个<b>开源JavaEE</b>软件框架，采用<a href="https://github.com/eppdev/eppdev-jee-pom/blob/master/LICENSE">Apache License 2.0 with 996ICU</a>进行发布</small></small></p>
</div>
</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/fragments/alert.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<div class="alert alert-warning row" th:fragment="alert" th:if="${message}">
    <a href="#" class="close" data-dismiss="alert">
        &times;
    </a>
    <p th:text="${message}"></p>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/fragments/head.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:fragment="head(title)">
    <title th:replace="${title}">head</title>
    <link rel="stylesheet" th:href="@{/css/bootstrap.min.css}"
          href="../../static/css/bootstrap.min.css" />
    <link rel="stylesheet" th:href="@{/css/bootstrap-theme.min.css}"
          href="../../static/css/bootstrap-theme.min.css" />
    <script type="text/javascript" src="../../static/js/jquery.min.js" th:src="@{/js/jquery.min.js}" ></script>
    <script type="text/javascript" src="../../static/js/bootstrap.min.js" th:src="@{/js/bootstrap.min.js}"></script>
</head>
<body>

</body>
~~~

## eppdev-jee-web/src/main/resources/templates/fragments/navbar.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav class="navbar navbar-default" th:fragment="navbar">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" th:href="@{/}"><span class="glyphicon glyphicon-home"></span>&nbsp;首页</a></a>
        </div>
        <div class="navbar navbar-nav">
            <ul class="nav navbar-nav">
                <li>
                    <a th:href="@{/web/conf/basic/list}">初始配置</a>
                </li>
                <li>
                    <a th:href="@{/web/conf/init/list}">工程初始化</a>
                </li>
                <li>
                    <a th:href="@{/web/conf/version/view/00000000000000000000000000000000}">最新库表信息列表</a>
                </li>
                <li>
                    <a th:href="@{/web/conf/version/list}">历史版本</a>
                </li>
            </ul>
        </div>

        <div class="navbar navbar-nav navbar-right">
            <ul class="nav navbar-nav">
                <li>
                    <a href="http://jee.eppdev.cn">
                        <small>EPPDEV-JEE</small>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/version/form.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>构建新版本</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center">构建新版本</h3>
    <div class="row">
        <form action="do" class="form-horizontal" role="form" method="post">
            <div class="form-group">
                <label class="col-sm-2 control-label" for="versionName">版本号：</label>
                <div class="col-sm-8">
                    <input id="versionName" name="versionName" class="form-control"
                           placeholder="请输入版本号"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">版本号：</label>
                <div class="col-sm-8">
                    <textarea class="form-control" id="remarks" name="remark" rows="3"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label" for="originVersion">源自：</label>
                <div class="col-sm-8">
                    <select id="originVersion" name="originVersion" class="form-control" readonly="readonly">
                        <option th:each="version : ${list}"
                                th:text="${version.versionName}"
                                th:value="${version.id}"
                                th:selected="${version.id eq '00000000000000000000000000000000'} ? 'selected'"></option>
                    </select>
                </div>
                <div class="col-sm-1">
                    <input type="button" value="选择源" class="form-control"
                           onclick="javascript:$('#fromVersion').removeAttr('readonly')"/>
                </div>
            </div>
            <div class="form-group text-center">
                <input type="submit" value="提交" />
            </div>
        </form>
    </div>
    <div th:replace="fragments/footer :: copy"></div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/version/view.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>数据库列表</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center">数据库列表&lt;<span th:text="${version.versionName}">versionName</span>&gt;</h3>
    <div>
        <div class="text-right">
            <a th:href="@{'/web/conf/version/' + ${version.id} + '/table/add/to'}">
                <button class="btn-sm btn-link">
                <span class="glyphicon glyphicon-plus-sign">增加表
                </span>
                </button>
            </a>
        </div>
        <table class="table table-bordered">
            <thead>
            <tr>
                <td class="text-center" width="5%">序号</td>
                <td class="text-center" width="20%">表名</td>
                <td class="text-center" width="10%">所在模块</td>
                <td class="text-center" width="20%">实体名</td>
                <td class="text-center" width="30%">表注释</td>
                <td class="text-center" width="15%">操作</td>
            </tr>
            </thead>
            <tbody>
            <tr th:each="table,iterStat : ${version.tableList}">
                <td class="text-center" th:text="${iterStat.count}">1</td>
                <td>
                    <a th:href="@{'/web/conf/version/' + ${version.id} + '/table/view/' + ${table.id}}"
                       th:text="${table.tableName}">table_name</a>
                </td>
                <td class="text-center" th:text="${table.moduleName}">module_name</td>
                <td th:text="${table.entityName}">entity_name</td>
                <td class="text-left" th:text="${table.tableComment}">table_comment</td>
                <td class="text-center">
                    <a th:href="@{'/web/cg/version/' + table.versionId + '/table/' + ${table.id} + '/all' }">代码生成</a>
                    <a th:href="@{'/web/conf/version/' + ${version.id} + '/table/update/' + ${table.id} + '/to'}">修改</a>
                    <a th:href="@{'/web/conf/version/' + ${version.id} + '/table/delete/' + ${table.id} }">删除</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div th:replace="fragments/footer :: copy"></div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/version/list.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>版本记录</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">导航栏</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center">版本记录</h3>
    <div>
        <table class="table table-bordered">
            <thead class="text-center">
            <tr>
                <td width="5%">序号</td>
                <td width="10%">版本号</td>
                <td width="15%">创建时间</td>
                <td width="30%">说明</td>
                <td width="40%">操作</td>
            </tr>
            </thead>
            <tbody class="text-center">
            <tr th:each="version,iterStat : ${list}">
                <td th:text="${iterStat.count}">1</td>
                <td>
                    <a th:text="${version.versionName}" th:href="@{'/web/conf/version/view/' + ${version.id} }">编号</a>
                </td>
                <td th:text="${#dates.format( version.createDate, 'yyyy-MM-dd HH:mm')}">2017-10-12</td>
                <td class="text-left" th:text="${version.remarks}">备注</td>
                <td>
                    <div class="col-sm-6 form-group" th:each="fileInfo: ${tableFileInfoList}">
                        <button class="form-control btn-small">
                            <a th:href="@{'/web/cg/version/' + ${version.id} + '/type/' + ${fileInfo.type} }" th:text="'生成' + ${fileInfo.type}">生成</a>
                        </button>
                    </div>
                    <div class="col-sm-12" th:if="${version.id != '00000000000000000000000000000000'}" >
                        <button class="form-control btn-small">
                            <a th:href="@{'/web/conf/version/delete/' + ${version.id} }">删除</a>
                        </button>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div th:replace="fragments/footer :: copy">版权信息</div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/index/form.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>添加索引</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <div class="text-left">
        <a th:href="@{'/table/' + ${table.id} }">返回</a>
    </div>
    <h3 class="text-center">添加索引</h3>
    <br/>
    <div>
        <form action="do" class="form-horizontal" role="form" method="post">
            <input type="hidden" name="id" th:value="${index.id}"/>
            <input type="hidden" name="tableId" th:value="${table.id}"/>
            <div class="form-group">
                <label class="control-label col-sm-2" for="columnNames">索引字段:</label>
                <div class="col-sm-10">
                    <div class="row form-group">
                        <input id="columnNames" type="text" name="columnNames"
                               class="form-control input-sm" readonly="readonly"/>
                    </div>
                </div>
            </div>
            <div>
                <label class="control-label col-sm-2">字段选择：</label>
                <div class="col-sm-10 row">
                    <div th:each="column,iterStat : ${table.columnList}" class="form-group col-sm-4">
                            <input type="button" class="btn btn-sm" value="选择"
                                   th:id="${'btn_' + column.columnName}"
                                   th:onclick="@{'javascript:add(\'' + ${column.columnName} + '\')'}"
                                   onclick="javascript:add(this)">
                            <span>&nbsp;&nbsp;</span>
                            <span th:id="@{'c_name_' + ${iterStat.count} }" th:text="${column.columnName}"></span>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="indexName">名称字段:</label>
                <div class="col-sm-10">
                    <div class="row form-group">
                        <input id="indexName" type="text" name="indexName"
                               th:value="'idx__' + ${table.tableName}"
                               class="form-control input-sm"/>
                    </div>
                </div>
            </div>
            <div class="form-group text-center">
                <input type="reset" value="重置" onclick="$(':button').removeAttr('disabled')"/> &nbsp;&nbsp;&nbsp;
                <input type="submit" value="提交"/>
            </div>
        </form>

    </div>
    <div th:replace="fragments/footer :: copy"></div>
</div>
<script type="text/javascript">
    function add(columnName) {
        $("#indexName").val($("#indexName").val() + '__' + columnName);
        var columnNames = $("#columnNames").val() + ',' + columnName;
        if(columnNames.indexOf(",") == 0){
            $("#columnNames").val(columnNames.substr(1));
        }else{
            $("#columnNames").val(columnNames);
        }
        $("#btn_" + columnName).attr("disabled", "disabled");
    }





</script>
</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/init/preview.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>代码预览</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">导航栏</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <div class="text-left">
        <a th:href="@{/web/conf/init/list}">返回</a>
    </div>
    <h3 class="text-center">代码预览<span th:text="${fileName}"></span></h3>
    <div>
        <pre th:text="${content}">
        </pre>
    </div>
    <div th:replace="fragments/footer :: copy">版权信息</div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/init/list.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>初始化</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">导航栏</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center">工程初始化管理</h3>
    <br/>
    <div class="row">
        <div class="text-center col-sm-6">
            <button class="form-control"><a th:href="@{/web/conf/db/list}">加载最新物理表</a></button>
        </div>
        <div class="text-center col-sm-6">
            <button class="form-control"><a th:href="@{/web/cg/init/all}">全部初始化</a></button>
        </div>
    </div>
    <br/>
    <br />
    <div class="row" th:each="initFileType,typeStat: ${list}">
        <h4 th:text="${typeStat.count + '. ' + initFileType.typeName}"></h4>
        <table class="table table-bordered">
            <thead class="text-center">
            <tr>
                <td width="5%">序号</td>
                <td width="15%">文件</td>
                <td width="50%">文件位置</td>
                <td width="20%">说明</td>
                <td width="10%">操作</td>
            </tr>
            </thead>
            <tbody class="text-center">
            <tr th:each="initFileInfo,fileStat: ${initFileType.fileInfoList}">
                <td class="text-center" th:text="${typeStat.count + '.' + fileStat.count}">${typeStat}.${fileStat}
                </td>
                <td class="text-left" th:text="${initFileType.typeName + ':' + initFileInfo.fileName}">
                    基础配置：pom.xml
                </td>
                <td class="text-left" th:text="${initFileInfo.filePath}"></td>
                <td class="text-left" th:text="${initFileInfo.fileInfo}"></td>
                <td class="text-center">
                    <a th:href="@{'/web/conf/init/preview/' + ${initFileInfo.fileName}}">预览</a>
                    <a th:href="@{'/web/cg/init/file/' + ${initFileInfo.fileName}}">创建</a>
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <button class="form-control">
                        <a th:href="@{'/web/cg/init/type/' + ${initFileType.typeId}}"
                           th:text="${'创建所有' + initFileType.typeName}">初始化基础配置</a>
                    </button>
                </td>
            </tr>
            </tbody>
        </table>
        <br />
    </div>

    <div th:replace="fragments/footer :: copy">版权信息</div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/layout.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
    <title>Layout</title>
    <link rel="stylesheet" th:href="@{/css/bootstrap.min.css}"
          href="../static/css/bootstrap.min.css" />
</head>
<body>
<div class="container-fluid">
    <div class="navbar">
        <div class="navbar-inner">
            <a class="brand"
               href="https://github.com/ultraq/thymeleaf-layout-dialect">
                Thymeleaf - Layout </a>
            <ul class="nav">
                <li><a th:href="@{/}" href="messages.html"> Messages </a></li>
            </ul>
        </div>
    </div>
    <h1 layout:fragment="header">Layout</h1>
    <div layout:fragment="content">Fake content</div>
</div>
<script type="text/javascript" src="../static/js/jquery.min.js" th:src="@{/js/jquery.min.js}" />
<script type="text/javascript" src="../static/js/bootstrap.min.js" th:src="@{/js/bootstrap.min.js}" />
</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/table/preview.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>代码预览</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">导航栏</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <div class="text-left">
        <a th:href="@{'/web/conf/version/' + ${versionId} + '/table/view/' + ${tableId} }">返回</a>
    </div>
    <h3 class="text-center">代码预览：<span th:text="${fileName}"></span></h3>
    <div>
        <pre th:text="${content}">
        </pre>
    </div>
    <div th:replace="fragments/footer :: copy">版权信息</div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/table/form.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title th:if="${table} == null">创建表</title>
    <title th:if="${eppdevTalbe} != null">更新表</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <div class="text-left">
        <a th:if="${table} != null" th:href="@{'/table/' + ${table.id} }">返回</a>
        <a th:if="${table} == null" th:href=" @{'/web/conf/version/view/' + ${versionId}} ">返回</a>
    </div>
    <h3 class="text-center" th:if="${table} != null">修表信息</h3>
    <h3 class="text-center" th:if="${table} == null">添加表</h3>
    <br/>
    <div class="row">
        <form action="do" class="form-horizontal" role="form">
            <div class="form-group">
                <label class="control-label col-sm-2" for="tableName">表名：</label>
                <div class="col-sm-9">
                    <input type="hidden" name="versionId"
                           th:value="${table}? ${table.versionId} : ${versionId}" />
                    <input type="hidden" name="id" th:value="${table}? ${table.id} : ''" />
                    <input id="tableName" type="text" name="tableName"
                           th:value="${table} ? ${table.tableName} : ''"
                           class="form-control input-sm"
                           placeholder="请输入表名"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="tableComment">表说明：</label>
                <div class="col-sm-9">
                    <input id="tableComment" type="text" name="tableComment"
                           th:value="${table} ? ${table.tableComment} : ''"
                           class="form-control input-sm"
                           placeholder="请输入所属模块"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="moduleName">模块名：</label>
                <div class="col-sm-9">
                    <input id="moduleName" type="text" name="moduleName"
                           th:value="${table} ? ${table.moduleName} : ''"
                           class="form-control input-sm"
                           placeholder="请输入所属模块"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="entityName">实体名：</label>
                <div class="col-sm-9">
                    <input id="entityName" type="text" name="entityName"
                           th:value="${table} ? ${table.entityName} : ''"
                           class="form-control input-sm"
                           placeholder="不填采用默认规则自动创建"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">备注：</label>
                <div class="col-sm-9">
                <textarea id="remarks" name="remark" rows="5"
                          th:text="${table}? ${table.remarks} : ''"
                          class="form-control">
                </textarea>
                </div>
            </div>
            <div class="form-group text-center">
                <input type="submit" value="提交" />
            </div>
        </form>
    </div>
    <br/>
    <br/>
    <div th:replace="fragments/footer :: copy"></div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/table/view.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>表详情</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center" th:text="${table.tableName + ' 表详情'}">表详情</h3>
    <hr/>
    <div class="row">
        <div class="col-sm-6">
            <p>所属版本：
                <a th:href="@{'/web/conf/version/view/' + ${table.versionId} }">
                    <span th:text="${table.version.versionName}"></span></a>
            </p>
        </div>
        <div class="col-sm-6">
            <p>所属模块：
                <span th:text="${table.moduleName}"></span>
            </p>
        </div>
        <div class="col-sm-6">
            <p>实体名称：
                <span th:text="${table.entityName}"></span>
            </p>
        </div>
        <div class="col-sm-6">
            <p>表说明：
                <span th:text="${table.tableComment}"></span>
            </p>
        </div>
        <div class="col-sm-6">
            <p>创建时间：
                <span th:text="${#dates.format(table.createDate, 'yyyy-MM-dd HH:mm:ss')}"></span>
            </p>
        </div>
        <div class="col-sm-6">
            <p>修改时间：
                <span th:text="${#dates.format(table.updateDate, 'yyyy-MM-dd HH:mm:ss')}"></span>
            </p>
        </div>
        <div class="col-sm-12">
            <p>备注：
                <small th:text="${table.remarks}"></small>
            </p>
        </div>
    </div>
    <hr/>
    <div class="row panel panel-default">
        <div class="panel-heading">字段列表</div>
        <div class="panel-body">
            <div class="text-right">
                <a th:href="@{'/web/conf/version/' + ${table.versionId} + '/table/' + ${table.id} + '/column/add/to'} ">添加</a>
            </div>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <td width="4%" rowspan="2" class="text-center">序号</td>
                    <td width="8%" rowspan="2" class="text-center">列名</td>
                    <td width="5%" rowspan="2" class="text-center">类型</td>
                    <td width="5%" rowspan="2" class="text-center">长度</td>
                    <td width="5%" rowspan="2" class="text-center">主键</td>
                    <td width="5%" rowspan="2" class="text-center">业务主键</td>
                    <td width="8%" rowspan="2" class="text-center">属性名称</td>
                    <td width="20%" rowspan="2" class="text-center">说明</td>
                    <td width="15%" colspan="5" class="text-center">查询条件</td>
                    <td width="15%" colspan="5" class="text-center">GroupBy条件</td>
                    <td width="10%" rowspan="2" class="text-center">操作</td>
                </tr>
                <tr>
                    <td width="3%" class="text-center" title="创建=查询条件">=</td>
                    <td width="3%" class="text-center" title="创建like查询条件">%</td>
                    <td width="3%" class="text-center" title="创建left like查询条件">X%</td>
                    <td width="3%" class="text-center" title="创建in查询条件">in</td>
                    <td width="3%" class="text-center" title="创建<>查询条件">&lt;&gt;</td>
                    <td width="3%" class="text-center">dist_cnt</td>
                    <td width="3%" class="text-center">avg</td>
                    <td width="3%" class="text-center">sum</td>
                    <td width="3%" class="text-center">min</td>
                    <td width="3%" class="text-center">max</td>
                </tr>
                </thead>
                <tbody>
                <tr th:each="column,iterStat : ${table.columnList}">
                    <td th:text="${iterStat.count}" class="text-center">1</td>
                    <td th:text="${column.columnName}"></td>
                    <td th:text="${column.columnType}"></td>
                    <td th:text="${column.columnLength}"></td>
                    <td th:text="${column.primaryKeyFlag}"></td>
                    <td th:text="${column.logicKeyFlag}"></td>
                    <td th:text="${column.propertyName}"></td>
                    <td th:text="${column.columnComment}"></td>
                    <td th:text="${column.createEqualFlag}"></td>
                    <td th:text="${column.createLikeFlag}"></td>
                    <td th:text="${column.createLeftLikeFlag}"></td>
                    <td th:text="${column.createInFlag}"></td>
                    <td th:text="${column.createCompareFlag}"></td>
                    <td th:text="${column.createCntDistInGroupbyFlag}"></td>
                    <td th:text="${column.createAvgInGroupbyFlag}"></td>
                    <td th:text="${column.createSumInGroupbyFlag}"></td>
                    <td th:text="${column.createMinInGroupbyFlag}"></td>
                    <td th:text="${column.createMaxInGroupbyFlag}"></td>
                    <td class="text-center">
                        <a th:href="@{'/web/conf/version/' + ${table.versionId} + '/table/' + ${table.id}  + '/column/update/' + ${column.id} + '/to'}">修改</a>
                        &nbsp;
                        <a th:href="@{'/web/conf/version/' + ${table.versionId} + '/table/' + ${table.id}  + '/column/delete/' + ${column.id} }">删除</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <hr/>
    <div class="row panel panel-default">
        <div class="panel-heading">索引列表</div>
        <div class="panel-body">
            <div class="text-right">
                <a th:href="@{'/web/conf/version/' + ${table.versionId} + '/table/' + ${table.id} +'/index/add/to'}">添加</a>
            </div>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <td class="text-center" width="7%">序号</td>
                    <td class="text-center" width="45%">索引名</td>
                    <td class="text-center" width="40">索引字段</td>
                    <td class="text-center" width="8%">操作</td>
                </tr>
                </thead>
                <tbody>
                <tr th:each="idx,iterStat : ${table.indexList}">
                    <td th:text="${iterStat.count}" class="text-center"></td>
                    <td th:text="${idx.indexName}"></td>
                    <td th:text="${idx.columnNames}"></td>
                    <td class="text-center">
                        <a th:href="@{'/web/conf/version/' + ${table.versionId} + '/table/' + ${table.id} + '/index/delete/' + ${idx.id}}">删除</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row panel panel-default">
        <div class="panel-heading">代码生成</div>
        <div class="panel-body">
            <div class="col-sm-12 form-group">
                <button class="form-control">
                    <a th:href="@{'/web/cg/version/' + ${versionId} + '/table/' + ${table.id} + '/all'}">生成本表对应的所有文件</a>
                </button>
            </div>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <td class="text-center" width="5%">序号</td>
                    <td class="text-center" width="10%">项目</td>
                    <td class="text-center" width="65%">文件地址</td>
                    <td class="text-center" width="10%">覆盖原文件</td>
                    <td class="text-center" width="10%">操作</td>
                </tr>
                </thead>
                <tbody>
                <tr th:each="tableFileInfo,iterStat : ${tableFileInfoList}">
                    <td th:text="${iterStat.count}" class="text-center"></td>
                    <td th:text="${tableFileInfo.type}"></td>
                    <td th:text="${tableFileInfo.filePath}"></td>
                    <td class="text-center" th:text="${tableFileInfo.replace}"></td>
                    <td class="text-center">
                            <a th:href="@{'/web/cg/version/' + ${versionId} + '/table/' + ${table.id} + '/type/' + ${tableFileInfo.type}}">创建</a>
                            <span>&nbsp;&nbsp;</span>
                            <a th:href="@{'/web/conf/version/' + ${versionId} + '/table/' + ${table.id} + '/preview/' + ${tableFileInfo.type}}">预览</a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>


    <div class="row panel panel-default">
        <div class="panel-heading">修订记录</div>
        <div class="panel-body">
            <table class="table table-bordered">
                <thead>
                <tr>
                    <td class="text-center" width="5%">序号</td>
                    <td class="text-center" width="10%">修改类型</td>
                    <td class="text-center" width="10%">操作人</td>
                    <td class="text-center" width="15%">操作时间</td>
                    <td class="text-center" width="60%">操作内容</td>
                </tr>
                </thead>
                <tbody>
                <tr th:each="logInfo,iterStat : ${table.logList}">
                    <td class="text-center" th:text="${iterStat.count}"></td>
                    <td class="text-center" th:text="${logInfo.operType}"></td>
                    <td th:text="${logInfo.authorName}"></td>
                    <td class="text-center" th:text="${#dates.format(logInfo.updateDate, 'yyyy-MM-dd HH:mm:ss')}"></td>
                    <td><pre th:text="${logInfo.operContent}"></pre></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>


</div>
<div th:replace="fragments/footer :: copy"></div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/table/list.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>数据库列表</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center">数据库列表</h3>
    <div>
        <div class="text-right">
            <a th:href="@{/table/add/to}">
                <button class="btn-sm btn-link">
                <span class="glyphicon glyphicon-plus-sign">增加表
                </span>
                </button>
            </a>
        </div>
        <table class="table table-bordered">
            <thead>
            <tr>
                <td class="text-center">序号</td>
                <td class="text-center">表名</td>
                <td class="text-center">所在模块</td>
                <td class="text-center">实体名</td>
                <td class="text-center">操作</td>
            </tr>
            </thead>
            <tbody>
            <tr th:each="table,iterStat : ${list}">
                <td class="text-center" th:text="${iterStat.count}">1</td>
                <td class="text-center" >
                    <a th:href="@{'/table/' + ${table.id}}"
                       th:text="${table.tableName}">table_name</a>
                </td>
                <td class="text-center" th:text="${table.moduleName}">module_name</td>
                <td class="text-center" th:text="${table.entityName}">entity_name</td>
                <td class="text-center">
                    <a th:href="@{'/generateSource/table/' + ${table.id} }">代码生成</a>
                    <a th:href="@{'/table/' + ${table.id} + '/update/to'}">修改</a>
                    <a th:href="@{'/table/' + ${table.id} + '/delete'}">删除</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div th:replace="fragments/footer :: copy"></div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/conf/list.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title>版本记录</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">导航栏</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <h3 class="text-center">配置管理</h3>
    <div>
        <table class="table table-bordered">
            <thead class="text-center">
            <tr>
                <td width="5%">序号</td>
                <td width="15%">配置项名称</td>
                <td width="35%">配置值</td>
                <td width="35%">说明</td>
                <td width="10%">保存</td>
            </tr>
            </thead>
            <tbody class="text-center">
            <tr th:each="conf,iterStat : ${list}">
                <form action="save">
                    <td th:text="${iterStat.count}">1</td>
                    <td class="text-left">
                        <span th:text="${conf.confName}">编号</span>
                        <input type="hidden" name="id" th:value="${conf.id}">
                    </td>
                    <td>
                        <input th:if="${conf.overrided}" readonly="readonly" class="form-control" type="text" name="confValue" th:value="${conf.confValue}"
                               value="test">
                        <input th:unless="${conf.overrided}" class="form-control" type="text" name="confValue" th:value="${conf.confValue}"
                               value="test">
                        <input type="hidden" name="confName" th:value="${conf.confName}">
                    </td>
                    <td class="text-left" th:text="${conf.remarks}">备注</td>
                    <td>
                        <input th:unless="${conf.overrided}" class="form-control" type="submit" value="保存">
                        <span th:if="${conf.overrided}">本地配置，不能修改</span>
                    </td>
                </form>
            </tr>
            </tbody>
        </table>
    </div>
    <div th:replace="fragments/footer :: copy">版权信息</div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/column/form.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head th:replace="fragments/head :: head(~{:: title})">
    <title th:if="${column} == null">添加字段</title>
    <title th:if="${column} != null">修改字段</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css"/>
</head>
<body>
<nav th:replace="fragments/navbar :: navbar">navbar</nav>
<div class="container-fluid">
    <div th:insert="fragments/alert :: alert">alert</div>
    <div class="text-left">
        <a th:href="@{'/web/conf/version/' + ${versionId} + '/table/view/' + ${column.tableId} }">返回</a>
    </div>
    <h3 class="text-center" th:if="${column} and ${column.id}">修改字段</h3>
    <h3 class="text-center" th:if="${column} == null or ${column.id}==null">添加字段</h3>
    <br/>
    <div class="row">
        <form action="do" class="form-horizontal" role="form">
            <h4 class="text-center">1. 基础属性</h4>
            <input type="hidden" name="tableId" th:value="${column.tableId}"/>
            <input type="hidden" name="id" th:value="${column.id}"/>
            <div class="form-group">
                <label class="control-label col-sm-3" for="columnName">字段名：</label>
                <div class="col-sm-8">
                    <input id="columnName" type="text" name="columnName"
                           th:value="${column} ? ${column.columnName} : ''"
                           class="form-control input-sm"
                           placeholder="请输入字段名"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="primaryKeyFlag">是否主键：</label>
                <div class="col-sm-8">
                    <select id="primaryKeyFlag" name="primaryKeyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.primaryKeyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="logicKeyFlag">是否业务主键：</label>
                <div class="col-sm-8">
                    <select id="logicKeyFlag" name="logicKeyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.logicKeyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="columnType">字段类型：</label>
                <div class="col-sm-8">
                    <select id="columnType" name="columnType" class="form-control">
                        <option th:each="type : ${columnTypeList}"
                                th:text="${type.columnType}"
                                th:value="${type.columnType}"
                                th:selected="${type.columnType == column.columnType}? 'selected'">int
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="columnLength">字段长度：</label>
                <div class="col-sm-8">
                    <input id="columnLength" type="text" name="columnLength"
                           th:value="${column} ? ${column.columnLength} : ''"
                           class="form-control input-sm"
                           placeholder="请输入整数"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="columnComment">字段说明：</label>
                <div class="col-sm-8">
                    <input id="columnComment" type="text" name="columnComment"
                           th:value="${column} ? ${column.columnComment} : ''"
                           class="form-control input-sm"
                           placeholder="字段说明"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="propertyName">实体名：</label>
                <div class="col-sm-8">
                    <input id="propertyName" type="text" name="propertyName"
                           th:value="${column} ? ${column.propertyName} : ''"
                           class="form-control input-sm"
                           placeholder="不填采用默认规则自动创建"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="javaType">属性类：</label>
                <div class="col-sm-8">
                    <input id="javaType" type="text" name="javaType"
                           th:value="${column} ? ${column.javaType} : ''"
                           class="form-control input-sm"
                           placeholder="不填采用默认规则自动创建"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="sortIndex">列排序：</label>
                <div class="col-sm-8">
                    <input id="sortIndex" type="text" name="sortIndex"
                           th:value="${column} ? ${column.sortIndex} : ''"
                           class="form-control input-sm"
                           placeholder="字段排序"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-3">备注：</label>
                <div class="col-sm-8">
                <textarea id="remarks" name="remark" rows="5"
                          th:text="${column}? ${column.remarks} : ''"
                          class="form-control">
                </textarea>
                </div>
            </div>
            <h4 class="text-center">2. 查询条件</h4>
            <div class="form-group">
                <label class="control-label col-sm-3" for="createEqualFlag">是否创建=条件：</label>
                <div class="col-sm-8">
                    <select id="createEqualFlag" name="createEqualFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createEqualFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="createLikeFlag">是否创建like条件：</label>
                <div class="col-sm-8">
                    <select id="createLikeFlag" name="createLikeFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createLikeFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="createLeftLikeFlag">是否创建left like条件：</label>
                <div class="col-sm-8">
                    <select id="createLeftLikeFlag" name="createLeftLikeFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createLeftLikeFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="createInFlag">是否创建in查询条件：</label>
                <div class="col-sm-8">
                    <select id="createInFlag" name="createInFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createInFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-3" for="createCompareFlag">是否创建大于小于条件：</label>
                <div class="col-sm-8">
                    <select id="createCompareFlag" name="createCompareFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createCompareFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>
            <h4 class="text-center">3. GroupBy结果</h4>
            <div class="form-group">
                <label class="control-label col-sm-3" for="createCntDistInGroupbyFlag">是否在GroupBy中创建count distinct：</label>
                <div class="col-sm-8">
                    <select id="createCntDistInGroupbyFlag" name="createCntDistInGroupbyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createCntDistInGroupbyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-3" for="createAvgInGroupbyFlag">是否在GroupBy中创建AVG：</label>
                <div class="col-sm-8">
                    <select id="createAvgInGroupbyFlag" name="createAvgInGroupbyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createAvgInGroupbyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-3" for="createSumInGroupbyFlag">是否在GroupBy中创建SUM：</label>
                <div class="col-sm-8">
                    <select id="createSumInGroupbyFlag" name="createSumInGroupbyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createSumInGroupbyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-3" for="createMinInGroupbyFlag">是否在GroupBy中创建MIN：</label>
                <div class="col-sm-8">
                    <select id="createMinInGroupbyFlag" name="createMinInGroupbyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createMinInGroupbyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-sm-3" for="createMaxInGroupbyFlag">是否在GroupBy中创建MAX：</label>
                <div class="col-sm-8">
                    <select id="createMaxInGroupbyFlag" name="createMaxInGroupbyFlag" class="form-control">
                        <option value="0">否</option>
                        <option value="1"
                                th:selected="${column.createMaxInGroupbyFlag}==1? 'selected'">是
                        </option>
                    </select>
                </div>
            </div>


            <div class="form-group text-center">
                <input type="submit" value="提交"/>
            </div>
        </form>
    </div>
    <br/>
    <br/>
    <div th:replace="fragments/footer :: copy"></div>
</div>

</body>
</html>
~~~

## eppdev-jee-web/src/main/resources/templates/db/list.html

~~~java

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head th:replace="fragments/head :: head(~{:: title})">
    <title>版本记录</title>
    <link rel="stylesheet" href="../../static/css/bootstrap.min.css" />
</head>

<body>
    <nav th:replace="fragments/navbar :: navbar">导航栏</nav>
    <div class="container-fluid">
        <div th:insert="fragments/alert :: alert">alert</div>
        <h3 class="text-center">物理表信息</h3>
        <div class="text-center col-sm-12">
            <button class="form-control"><a th:href="@{/web/cg/read/db}">加载最新物理表</a></button>
        </div>
        <div>
            <table class="table table-bordered">
                <thead class="text-center">
                    <tr>
                        <td width="15%">序号</td>
                        <td width="40%">表名</td>
                        <td width="25%">状态</td>
                        <td width="20%">操作</td>
                    </tr>
                </thead>
                <tbody class="text-center">
                    <tr th:each="table,iterStat : ${list}">
                        <td th:text="${iterStat.count}">1</td>
                        <td class="text-left">
                            <span th:text="${table.tableName}">表名</span>
                        </td>
                        <td class="text-center">
                            <span>-</span>
                        </td>
                        <td>
                            <button class="form-control"><a th:href="@{'/web/cg/read/db/' + ${table.tableName}}">加载最新物理表</a></button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div th:replace="fragments/footer :: copy">版权信息</div>
    </div>

</body>

</html>
~~~

