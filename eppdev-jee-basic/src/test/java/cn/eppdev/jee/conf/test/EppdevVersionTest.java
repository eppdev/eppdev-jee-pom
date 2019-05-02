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
