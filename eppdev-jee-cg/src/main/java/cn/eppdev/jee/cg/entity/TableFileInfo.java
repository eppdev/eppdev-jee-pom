/* FileName: TableFileInfo.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import cn.eppdev.jee.utils.JSONUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class TableFileInfo{
    static Logger logger = LoggerFactory.getLogger(TableFileInfo.class);

    static final String DB_TYPE_DEFAULT = "default";

    String type;

    Boolean replace;

    String filePath;

    @JsonIgnore
    Template filePathTemplate;

    @JsonIgnore
    Map<String, Template> contentTemplateMap = new HashMap<>();

    public TableFileInfo(String type, Boolean replace) {
        this.type = type;
        this.replace = replace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Template getFilePathTemplate() {
        return filePathTemplate;
    }

    public void setFilePathTemplate(Template filePathTemplate) {
        this.filePathTemplate = filePathTemplate;
    }

    public Boolean getReplace() {
        return replace;
    }

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setContentTemplate(String dbType, Template template){
        contentTemplateMap.put(dbType, template);
    }

    public Template getContentTemplate(String dbType){
        if (contentTemplateMap.containsKey(dbType)){
            return contentTemplateMap.get(dbType);
        } else {
            return contentTemplateMap.get(DB_TYPE_DEFAULT);
        }
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
