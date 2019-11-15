/* FileName: TableController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.web;

import cn.eppdev.jee.conf.entity.EppdevTable;
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
@Controller("webTableController")
@RequestMapping("/web/conf/version/{versionId}/table")
public class TableController {
    static Logger logger = LoggerFactory.getLogger(TableController.class);

    @Autowired
    TableService tableService;

    @RequestMapping("/view/{id}")
    public String view(@PathVariable("id") String id,
                       @PathVariable("versionId") String versionId,
                       Model model,
                       RedirectAttributes redirectAttributes){
        RestResult<EppdevTable> result = tableService.get(id);
        logger.debug("/web/conf/table/view/{} -> result:{}", id, result);
        if (result.getStatus() != RestResult.STATUS_SUCCESS){
            redirectAttributes.addFlashAttribute("message", "数据获取失败: " + result.getMessage());
            return "redirect:/web/conf/version/list";
        } else {
            model.addAttribute("table", result.getData());
            model.addAttribute("tableFileInfoList", tableService.getTableFileInfoList(id));
        }
        return "table/view";
    }


    @RequestMapping("/add/to")
    public String toAdd(@PathVariable("versionId") String versionId,
                        Model model){
        EppdevTable eppdevTable = new EppdevTable();
        eppdevTable.setVersionId(versionId);
        model.addAttribute("table", eppdevTable);
        return "table/form";
    }


    @RequestMapping("/add/do")
    public String doAdd(@PathVariable("versionId") String versionId,
                        EppdevTable eppdevTable,
                        RedirectAttributes redirectAttributes){
        RestResult<String> result = tableService.add(eppdevTable);
        if (RestResult.STATUS_SUCCESS == result.getStatus()){
            redirectAttributes.addFlashAttribute("message", "创建成功");
            return "redirect:/web/conf/version/" + versionId + "/table/view/" + result.getData();
        } else {
            redirectAttributes.addFlashAttribute("message", "创建成功");
            return "redirect:/web/conf/version/view/" + eppdevTable.getVersionId();
        }
    }


    @RequestMapping("/update/{tableId}/to")
    public String toUpdate(@PathVariable("tableId") String tableId,
                           @PathVariable("versionId") String versionId,
                           EppdevTable eppdevTable,
                           Model model){
        RestResult<EppdevTable> restResult = tableService.get(tableId);
        logger.debug("/web/conf/version/{}/table/update/{}/do -> restResult:{}", versionId, tableId, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            model.addAttribute("table", restResult.getData());
            return "table/form";
        } else {
            return "redirect:/web/conf/version/view/" + versionId;
        }
    }

    @RequestMapping("/update/{tableId}/do")
    public String doUpdate(@PathVariable("versionId") String versionId,
                           @PathVariable("tableId") String tableId,
                           EppdevTable eppdevTable,
                           RedirectAttributes redirectAttributes){
        RestResult<Integer> result = tableService.update(eppdevTable);
        logger.debug("/web/conf/version/{}/table/update/{}/do -> result:{}", versionId, tableId, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "修改成功");
        } else {
            redirectAttributes.addFlashAttribute("message", "修改失败：" + result.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id,
                         @PathVariable("versionId") String versionId,
                         RedirectAttributes redirectAttributes){
        RestResult<Integer> result = tableService.delete(id);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            redirectAttributes.addFlashAttribute("message", "删除成功");
        }
        else {
            redirectAttributes.addFlashAttribute("message", "删除失败:" + result.getMessage());
        }
        return "redirect:/web/conf/version/view/" + versionId;
    }

    @RequestMapping("/{tableId}/preview/{type}")
    public String preview(@PathVariable("versionId") String versionId,
                          @PathVariable("tableId") String tableId,
                          @PathVariable("type") String type,
                          Model model,
                          RedirectAttributes redirectAttributes){
        logger.debug("/web/conf/version/{}/table/{}/preview/{}", versionId, tableId, type);
        RestResult<String> result = tableService.preview(tableId, type);
        logger.debug("/web/conf/table/{}/preview/{} -> result:{}",tableId, type, result);
        if (RestResult.STATUS_SUCCESS == result.getStatus()) {
            model.addAttribute("content", result.getData());
            model.addAttribute("fileName", type);
            model.addAttribute("tableId", tableId);
            model.addAttribute("versionId", versionId);
            return "table/preview";
        } else {
            redirectAttributes.addFlashAttribute("message", "预览出错：" + result.getMessage());
            return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
        }
    }



}
