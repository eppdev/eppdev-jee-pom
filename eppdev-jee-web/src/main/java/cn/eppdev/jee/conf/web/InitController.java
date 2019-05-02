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
