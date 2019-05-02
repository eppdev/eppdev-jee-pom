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
