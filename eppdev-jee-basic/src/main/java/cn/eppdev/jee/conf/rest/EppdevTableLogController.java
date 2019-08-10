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
