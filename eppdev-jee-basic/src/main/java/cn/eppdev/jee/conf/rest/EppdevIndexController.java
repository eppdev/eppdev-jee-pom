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
