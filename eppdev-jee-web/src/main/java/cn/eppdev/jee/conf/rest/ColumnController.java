/* FileName: ColumnController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
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
