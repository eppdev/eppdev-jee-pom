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
