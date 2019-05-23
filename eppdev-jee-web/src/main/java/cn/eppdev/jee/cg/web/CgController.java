/* FileName: GenerateController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.web;

import cn.eppdev.jee.cg.service.CgService;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

/**
 * 代码生成的入口
 *
 * @author jinlong.hao
 */
@Controller("webCgController")
@RequestMapping("/web/cg")
public class CgController {

    static Logger logger = LoggerFactory.getLogger(CgController.class);

    @Autowired
    CgService cgService;

    @RequestMapping("/init/file/{fileName}")
    public String generateInitFileByFileName(@PathVariable("fileName") String fileName,
                                             RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateInitFileByFileName(fileName);
        logger.debug("/web/cg/init/file/{}: {}", fileName, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/init/list";
    }

    @RequestMapping("/init/type/{type}")
    public String generateInitFileByType(@PathVariable("type") String type,
                                         RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateInitFileByType(type);
        logger.debug("/web/cg/init/type/{}: {}", type, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/init/list";
    }

    @RequestMapping("/init/all")
    public String generateInitAllFile(RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateAllInitFile();
        logger.debug("/web/cg/init/all: {}", restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/init/list";
    }

    @RequestMapping("/read/db")
    public String readFromDb(RedirectAttributes redirectAttributes) {
        RestResult<String> result = cgService.readFromDb();
        logger.debug("/web/cg/read/db -> result:{}", result);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return "redirect:/web/conf/version/view/00000000000000000000000000000000";
    }


    @RequestMapping("/read/db/{tableName}")
    public String readFromDb(@PathVariable("tableName") String tableName, RedirectAttributes redirectAttributes){
        RestResult<String> result = cgService.readFromDb(tableName);
        logger.debug("/web/cg/read/db -> result:{}", result);
        redirectAttributes.addFlashAttribute("message", result.getMessage());
        return "redirect:/web/conf/version/view/00000000000000000000000000000000";
    }


    @RequestMapping("/version/{versionId}/type/{type}")
    public String generateVersionFileByType(@PathVariable("versionId") String versionId,
                                            @PathVariable("type") String type,
                                            RedirectAttributes redirectAttributes){
        RestResult<Map<String, String>> restResult = cgService.generateVerionFileByType(versionId, type);
        logger.debug("/web/cg/version/{}/type/{} -> restResult:{}", versionId, type, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/version/list";
    }

    @RequestMapping("/version/{versionId}/table/{tableId}/all")
    public String generateTableCodeAll(@PathVariable("versionId") String versionId,
                                  @PathVariable("tableId") String tableId,
                                  RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateAllTableFile(tableId);
        logger.debug("/web/cg/version/{}/table/{}/all", versionId, tableId, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

    @RequestMapping("/version/{versionId}/table/{tableId}/type/{type}")
    public String generateTableFileByType(@PathVariable("versionId") String versionId,
                                          @PathVariable("tableId") String tableId,
                                          @PathVariable("type") String type,
                                          RedirectAttributes redirectAttributes) {
        RestResult<Map<String, String>> restResult = cgService.generateTableFileByType(tableId, type);
        logger.debug("/web/cg/table/{}/type/{}: {}", tableId, type, restResult);
        if (RestResult.STATUS_SUCCESS == restResult.getStatus()) {
            StringBuilder sb = new StringBuilder();
            sb.append(restResult.getMessage() + "\n");
            for (String key : restResult.getData().keySet()) {
                sb.append(key + ":" + restResult.getData().get(key) + "\n");
            }
            redirectAttributes.addFlashAttribute("message", sb.toString());
        } else {
            redirectAttributes.addFlashAttribute("message", restResult.getMessage());
        }
        return "redirect:/web/conf/version/" + versionId + "/table/view/" + tableId;
    }

}
