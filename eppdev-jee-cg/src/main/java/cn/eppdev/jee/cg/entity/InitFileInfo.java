/* FileName: InitFileInfo.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import cn.eppdev.jee.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jinlong.hao
 */
public class InitFileInfo {
    static Logger logger = LoggerFactory.getLogger(InitFileInfo.class);

    String fileName;

    String fileInfo;

    String filePath;

    public InitFileInfo(){}

    public InitFileInfo(String fileName, String fileInfo) {
        this.fileName = fileName;
        this.fileInfo = fileInfo;
    }

    @JsonIgnore
    Template filePathTemplate;

    @JsonIgnore
    Template contentTemplate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
    }

    public Template getFilePathTemplate() {
        return filePathTemplate;
    }

    public void setFilePathTemplate(Template filePathTemplate) {
        this.filePathTemplate = filePathTemplate;
    }

    public Template getContentTemplate() {
        return contentTemplate;
    }

    public void setContentTemplate(Template contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
