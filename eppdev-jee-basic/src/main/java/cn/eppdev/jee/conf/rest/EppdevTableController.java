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
