/* FileName: VersionController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevVersion;
import cn.eppdev.jee.conf.service.VersionService;
import cn.eppdev.jee.share.entity.RestResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

/**
 * @author jinlong.hao
 */
@Controller("webVersionController")
@RequestMapping("/web/conf/version")
public class VersionController {
    static Logger logger = LoggerFactory.getLogger(VersionController.class);

    @Autowired
    VersionService versionService;

    @RequestMapping("/list")
    public String list(Model model, RedirectAttributes redirectAttributes){
        RestResult<PageInfo<EppdevVersion>> restResult = versionService.listAll();
        logger.debug("/web/conf/version/list -> restResult:{}", restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            model.addAttribute("list", restResult.getData().getList());
            model.addAttribute("tableFileInfoList", versionService.listTableFileInfo());
        } else {
            redirectAttributes.addAttribute("message", restResult.getMessage());
            model.addAttribute("list", new ArrayList<>());
        }
        return "version/list";
    }

    @RequestMapping("/view/{id}")
    public String get(@PathVariable("id") String id,  Model model,
                      RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/view/{id} -> id:{}", id);
        RestResult<EppdevVersion> restResult = versionService.get(id);
        logger.debug("/web/conf/view/{} -> restResult:{}", id, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()){
            model.addAttribute("version", restResult.getData());
        } else {
            redirectAttributes.addAttribute("message", restResult.getMessage());
            return "redirect:/message";
        }
        return "version/view";
    }

    @RequestMapping("/add/to")
    public String toAdd(){
        return "version/add";
    }


    @RequestMapping("/add/do")
    public String doAdd(Model model){
        return "redirect:";
    }

}
