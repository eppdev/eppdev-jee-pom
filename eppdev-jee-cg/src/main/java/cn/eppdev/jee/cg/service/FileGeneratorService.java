/* FileName: FileGeneratorService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.entity.InitFileInfo;
import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.cg.entity.TableFileInfo;
import cn.eppdev.jee.cg.utils.*;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevTable;
import cn.eppdev.jee.conf.service.EppdevConfService;
import cn.eppdev.jee.conf.service.EppdevTableService;
import cn.eppdev.jee.utils.StringUtils;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
@Service
public class FileGeneratorService {
    static Logger logger = LoggerFactory.getLogger(FileGeneratorService.class);

    @Autowired
    EppdevConfService confService;

    @Autowired
    EppdevTableService tableService;

    @Autowired
    GitService gitService;

    public String getInitFileContent(String fileName) throws IOException, TemplateException {
        Map<String, String> basicConf = confService.getAllConf();
        String dbType = basicConf.get("DB_TYPE");
        return FreeMarkerUtils.buildResult(GeneratorUtils.getInitFileInfo(dbType, fileName).getContentTemplate(), basicConf);
    }

    public Map<String, String> generateAllInitFile() throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // 1. git pull
        gitService.pull();

        // 2. generator init file
        List<InitFileType> fileTypeList = GeneratorUtils.getInitFileTypeList(confService.getDbType());
        for (InitFileType fileType : fileTypeList) {
            for (InitFileInfo initFileInfo : fileType.getFileInfoList()) {
                logger.debug("generate file: {}", initFileInfo.getFileName());
                String filePath = FreeMarkerUtils.buildResult(initFileInfo.getFilePathTemplate(), confService.getAllConf());
                String fileContent = FreeMarkerUtils.buildResult(initFileInfo.getContentTemplate(), confService.getAllConf());
                int cnt = SourceFileUtils.writeFile(filePath, fileContent, false);
                if (cnt > 0) {
                    count++;
                    map.put(initFileInfo.getFileName(), "Success");
                    sb.append(initFileInfo.getFileName());
                }
            }
        }

        // 3. git push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(), "generate " + StringUtils.removeEnd(sb.toString(), ","));
        }

        return map;
    }


    public Map<String, String> generateInitFileByType(String type) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // 1. git pull
        gitService.pull();

        // 2. generator init file
        List<InitFileType> fileTypeList = GeneratorUtils.getInitFileTypeList(confService.getDbType());
        for (InitFileType fileType : fileTypeList) {
            if (type.equals(fileType.getTypeId())) {
                for (InitFileInfo initFileInfo : fileType.getFileInfoList()) {
                    logger.debug("generate file: {}", initFileInfo.getFileName());
                    String filePath = FreeMarkerUtils.buildResult(initFileInfo.getFilePathTemplate(), confService.getAllConf());
                    String fileContent = FreeMarkerUtils.buildResult(initFileInfo.getContentTemplate(), confService.getAllConf());
                    int cnt = SourceFileUtils.writeFile(filePath, fileContent, false);
                    if (cnt > 0) {
                        count++;
                        map.put(initFileInfo.getFileName(), "Success");
                        sb.append(initFileInfo.getFileName());
                    }
                }
            }
        }

        // 3. git push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(), "generate " + StringUtils.removeEnd(sb.toString(), ","));
        }

        return map;
    }


    public Map<String, String> generateInitFileByFileName(String fileName) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();

        // 1. git pull
        gitService.pull();

        // 2. generator init file
        InitFileInfo initFileInfo = GeneratorUtils.getInitFileInfo(confService.getDbType(), fileName);
        logger.debug("generate file: {}", initFileInfo.getFileName());
        String filePath = FreeMarkerUtils.buildResult(initFileInfo.getFilePathTemplate(), confService.getAllConf());
        String fileContent = FreeMarkerUtils.buildResult(initFileInfo.getContentTemplate(), confService.getAllConf());
        int cnt = SourceFileUtils.writeFile(filePath, fileContent, false);

        // 3. build result and push
        if (cnt > 0) {
            map.put(initFileInfo.getFileName(), "Success");
            gitService.push(GitUtils.generateNewBranchName(), "generate " + fileName);
        }

        return map;
    }

    public Map<String, String> generateAllTableFile(String tableId) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // 1. git pull
        gitService.pull();

        // 2. generator tableFile
        EppdevTable eppdevTable = getTableInfo(tableId);
        List<TableFileInfo> tableFileInfoList = GeneratorUtils.getTableFileInfoList();
        for (TableFileInfo tableFileInfo : tableFileInfoList) {
            logger.debug("generate {} for {}", tableFileInfo.getType(), eppdevTable.getTableName());
            String filePath = FreeMarkerUtils.buildResult(tableFileInfo.getFilePathTemplate(), eppdevTable);
            String content = FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
            int cnt = SourceFileUtils.writeFile(filePath, content, tableFileInfo.getReplace());
            if (cnt > 0) {
                count++;
                map.put(tableFileInfo.getType(), "Success");
                sb.append(tableFileInfo.getType());
            }
        }

        // 3. git push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(),
                    "generate " + StringUtils.removeEnd(sb.toString(), ",") + " for " + eppdevTable.getTableName());
        }

        return map;
    }

    public Map<String, String> generateVersionFileByType(String versionId, String type) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();

        // 1. git pull
        gitService.pull();

        // 2. generate file
        List<EppdevTable> list = tableService.listByVersionId(versionId);
        int count = 0;
        for (EppdevTable table : list) {
            EppdevTable eppdevTable = getTableInfo(table.getId());
            TableFileInfo tableFileInfo = GeneratorUtils.getTableFileInfo(confService.getDbType(), type);
            logger.debug("generate {} for {}", eppdevTable.getTableName(), type);
            String filePath = FreeMarkerUtils.buildResult(tableFileInfo.getFilePathTemplate(), eppdevTable);
            String fileContent = FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
            int cnt = SourceFileUtils.writeFile(filePath, fileContent, tableFileInfo.getReplace());
            if (cnt > 0){
                map.put(eppdevTable.getTableName(), "Success");
            }
            count += cnt;
        }

        // 3. build result and push
        if (count > 0) {
            gitService.push(GitUtils.generateNewBranchName(), "regenerate " + type + " for " + versionId);
        }
        return map;
    }


    public Map<String, String> generateTableFileByType(String tableId, String type) throws IOException, TemplateException {
        Map<String, String> map = new HashMap<>();

        // 1. git pull
        gitService.pull();

        // 2. generator init file
        EppdevTable eppdevTable = getTableInfo(tableId);
        TableFileInfo tableFileInfo = GeneratorUtils.getTableFileInfo(confService.getDbType(), type);
        logger.debug("generate {} for {}", eppdevTable.getTableName(), type);
        String filePath = FreeMarkerUtils.buildResult(tableFileInfo.getFilePathTemplate(), eppdevTable);
        String fileContent = FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
        int cnt = SourceFileUtils.writeFile(filePath, fileContent, tableFileInfo.getReplace());

        // 3. build result and push
        if (cnt > 0) {
            map.put(type, "Success");
            gitService.push(GitUtils.generateNewBranchName(), "generate " + type + " for " + eppdevTable.getTableName());
        }

        return map;
    }

    public String generateContent(String tableId, String type) throws IOException, TemplateException {
        EppdevTable eppdevTable = getTableInfo(tableId);
        TableFileInfo tableFileInfo = GeneratorUtils.getTableFileInfo(confService.getDbType(), type);
        return FreeMarkerUtils.buildResult(tableFileInfo.getContentTemplate(confService.getDbType()), eppdevTable);
    }


    public EppdevTable getTableInfo(String tableId) {
        EppdevTable eppdevTable = tableService.get(tableId);
        for (EppdevColumn column : eppdevTable.getColumnList()) {
            column.setJavaType(GeneratorUtils.getJavaType(confService.getDbType(), column.getColumnType()));
            column.setDbColumnType(GeneratorUtils.getDbColumnType(confService.getDbType(), column.getColumnType()));
        }
        return eppdevTable;
    }
}

