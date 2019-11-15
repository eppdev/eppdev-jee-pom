/* FileName: InitFileType.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.entity;

import cn.eppdev.jee.utils.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class InitFileType {
    static Logger logger = LoggerFactory.getLogger(InitFileType.class);

    String typeId;
    String typeName;
    List<InitFileInfo> fileInfoList = new ArrayList<>();

    public InitFileType(){}

    public InitFileType(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<InitFileInfo> getFileInfoList() {
        return fileInfoList;
    }

    public void setFileInfoList(List<InitFileInfo> fileInfoList) {
        this.fileInfoList = fileInfoList;
    }

    @Override
    public String toString() {
        return JSONUtils.toJson(this);
    }
}
