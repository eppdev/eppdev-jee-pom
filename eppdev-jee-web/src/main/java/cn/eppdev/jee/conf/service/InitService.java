/* FileName: InitService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.cg.entity.InitFileInfo;
import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.cg.service.FileGeneratorService;
import cn.eppdev.jee.cg.utils.FreeMarkerUtils;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.share.entity.RestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class InitService {
    static Logger logger = LoggerFactory.getLogger(InitService.class);

    @Autowired
    FileGeneratorService fileGeneratorService;

    @Autowired
    EppdevConfService confService;

    public RestResult<List<InitFileType>> list() {
        try {
            Map<String, String> basicConf = confService.getAllConf();
            List<InitFileType> initFileTypeList = GeneratorUtils.getInitFileTypeList(basicConf.get("DB_TYPE"));
            for (InitFileType fileType: initFileTypeList){
                for (InitFileInfo fileInfo : fileType.getFileInfoList()){
                    if (fileInfo.getFilePath() == null || fileInfo.getFilePath().trim().length() == 0){
                        fileInfo.setFilePath(FreeMarkerUtils.buildResult(fileInfo.getFilePathTemplate(), basicConf));
                    }
                }
            }
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", initFileTypeList);
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), new ArrayList<>());
        }
    }

    public RestResult<String> preview(String fileName) {
        try {
            String content = fileGeneratorService.getInitFileContent(fileName);
            return new RestResult<>(RestResult.STATUS_SUCCESS, "获取成功", content);
        } catch (Exception e) {
            logger.error("Error: {}\n{}", e.getMessage(), e.getStackTrace());
            return new RestResult<>(RestResult.STATUS_FAILED, e.getMessage(), null);
        }
    }
}
