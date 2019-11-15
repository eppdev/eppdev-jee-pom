/* FileName: IndexController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevIndex;
import cn.eppdev.jee.conf.service.IndexService;
import cn.eppdev.jee.conf.service.TableService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author jinlong.hao
 */
@Controller("webIndexController")
@RequestMapping("/web/conf/version/{versionId}/table/{tableId}/index")
public class IndexController {
    static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    IndexService indexService;

    @Autowired
    TableService tableService;

    @RequestMapping("/add/to")
    public String toAdd(@PathVariable("versionId") String versionId,
                        @PathVariable("tableId") String tableId,
                        Model model){
        logger.debug("/web/conf/version/{}/table/{}/index/add/to", versionId, tableId);
        EppdevIndex index = new EppdevIndex();
        index.setTableId(tableId);
        model.addAttribute("index", index);
        model.addAttribute("tableId", tableId);
        model.addAttribute("versionId", versionId);
        model.addAttribute("table", tableService.get(tableId).getData());
        return "index/form";
    }

    @RequestMapping("/add/do")
    public String doAdd(@PathVariable("versionId") String versionId,
                        @PathVariable("tableId") String tableId,
                        EppdevIndex index,
                        Model model,
                        RedirectAttributes redirectAttributes){
        RestResult<String> result = indexService.add(index);
        logger.debug("/web/conf/version/{}/table/{}/index/add/do -> result:{}", versionId, tableId, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "添加成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "添加失败:" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/delete/{indexId}")
    public String delete(@PathVariable("versionId") String versionId,
                         @PathVariable("tableId") String tableId,
                         @PathVariable("indexId") String indexId,
                         RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/version/{}/table/{}/index/delete/{}", versionId, tableId, indexId);
        RestResult<Integer> result = indexService.delete(indexId);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "添加成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "添加失败:" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }
}
