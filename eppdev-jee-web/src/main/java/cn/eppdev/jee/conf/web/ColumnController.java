/* FileName: ColumnController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.service.ColumnService;
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
@Controller("webColumnController")
@RequestMapping("/web/conf/version/{versionId}/table/{tableId}/column")
public class ColumnController {
    static Logger logger = LoggerFactory.getLogger(ColumnController.class);

    @Autowired
    ColumnService columnService;

    @RequestMapping("/add/to")
    public String toAdd(@PathVariable("tableId") String tableId,
                        @PathVariable("versionId") String versionId,
                        Model model) {
        EppdevColumn column = new EppdevColumn();
        column.setTableId(tableId);
        model.addAttribute("tableId", tableId);
        model.addAttribute("versionId", versionId);
        model.addAttribute("column", column);
        model.addAttribute("columnTypeList", columnService.getTypeInfoList());
        return "column/form";
    }


    @RequestMapping("/add/do")
    public String doAdd(@PathVariable("versionId") String versionId,
                        @PathVariable("tableId") String tableId,
                        EppdevColumn column,
                        RedirectAttributes redirectAttributes) {
        try {
            columnService.add(column);
            redirectAttributes.addFlashAttribute("message", "保存成功");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "保存失败：" + e.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/update/{id}/to")
    public String toUpdate(@PathVariable("id") String columnId,
                           @PathVariable("versionId") String versionId,
                           @PathVariable("tableId") String tableId,
                           Model model,
                           RedirectAttributes redirectAttributes) {
        try {
            EppdevColumn column = columnService.get(columnId).getData();
            model.addAttribute("column", column);
            model.addAttribute("columnTypeList", columnService.getTypeInfoList());
            return "column/form";
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            redirectAttributes.addFlashAttribute("message", "获取信息失败" + e.getMessage());
            return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
        }
    }


    @RequestMapping("/update/{id}/do")
    public String doUpdate(@PathVariable("id") String id,
                           @PathVariable("versionId") String versionId,
                           @PathVariable("tableId") String tableId,
                           EppdevColumn column,
                           Model model,
                           RedirectAttributes redirectAttributes) {
        logger.debug("/web/conf/version/{}/table/{}/column/update/do -> column:{}",
                versionId, tableId, column);
        RestResult<Integer> result = columnService.update(column);
        logger.debug("/web/conf/version/{}/table/{}/column/update/do -> result:{}",
                versionId, tableId, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "修改成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "修改失败：" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + column.getTableId();
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id,
                         @PathVariable("versionId") String versionId,
                         @PathVariable("tableId") String tableId,
                         RedirectAttributes redirectAttributes) {
        RestResult<Integer> result = columnService.delete(id);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "删除成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "删除失败: " + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }
}
