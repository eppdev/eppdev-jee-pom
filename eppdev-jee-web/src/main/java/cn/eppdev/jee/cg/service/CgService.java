/* FileName: CgService.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class CgService {
    static Logger logger = LoggerFactory.getLogger(CgService.class);

    @Autowired
    FileGeneratorService fileGeneratorService;

    @Autowired
    DataSchemaLoadService dataSchemaLoadService;

    public RestResult<Map<String, String>> generateInitFileByFileName(String fileName) {
        Map<String, String> map = new HashMap<>();
        try {
            map = fileGeneratorService.generateInitFileByFileName(fileName);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "生成成功", map);
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), map);
        }
    }

    public RestResult<Map<String, String>> generateAllInitFile() {
        Map<String, String> map = new HashMap<>();
        try {
            map = fileGeneratorService.generateAllInitFile();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "生成成功", map);
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), map);
        }
    }


    public RestResult<Map<String, String>> generateInitFileByType(String type) {
        Map<String, String> map = new HashMap<>();
        try {
            map = fileGeneratorService.generateInitFileByType(type);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "生成成功", map);
        } catch (Exception e) {
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), map);
        }
    }

    public RestResult<Map<String, String>> generateVerionFileByType(String versionId, String type){
        try {
            return new RestResult<>(RestResult.STATUS_SUCCESS,
                    "生成成功",
                    fileGeneratorService.generateVersionFileByType(versionId, type));
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new HashMap<>());
        }
    }

    public RestResult<Map<String, String>> generateAllTableFile(String tableId) {
        try {
            return new RestResult<>(RestResult.STATUS_SUCCESS,
                    "生成成功",
                    fileGeneratorService.generateAllTableFile(tableId));
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new HashMap<>());
        }
    }


    public RestResult<Map<String, String>> generateTableFileByType(String tableId, String type) {
        try {
            return new RestResult<>(RestResult.STATUS_SUCCESS,
                    "生成成功",
                    fileGeneratorService.generateTableFileByType(tableId, type));
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new HashMap<>());
        }
    }


    public RestResult<String> readFromDb(){
        try{
            dataSchemaLoadService.updateTableInfo();
            return new RestResult<>(RestResult.STATUS_SUCCESS, "加载成功", null);
        } catch (Exception e ){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }

    public RestResult<String> readFromDb(String tableName){
        try{
            dataSchemaLoadService.updateTableInfo(tableName);
            return new RestResult<String>(RestResult.STATUS_SUCCESS, "加载成功", null);
        } catch (Exception e){
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }


}
