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