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
