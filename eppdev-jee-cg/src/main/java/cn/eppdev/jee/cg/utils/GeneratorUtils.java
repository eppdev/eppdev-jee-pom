/* FileName: GeneratorUtils.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.cg.entity.ColumnTypeInfo;
import cn.eppdev.jee.cg.entity.InitFileInfo;
import cn.eppdev.jee.cg.entity.InitFileType;
import cn.eppdev.jee.cg.entity.TableFileInfo;
import freemarker.template.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
public class GeneratorUtils {
    static Logger logger = LoggerFactory.getLogger(GeneratorUtils.class);

    static List<InitFileType> INIT_FILE_TYPE_LIST = new ArrayList<>();

    static List<TableFileInfo> TABLE_FILE_INFO_LIST = new ArrayList<>();

    static {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document= documentBuilder.parse(GeneratorUtils.class.getResourceAsStream("/eppdev-jee/conf/eppdev.xml"));

            // 处理InitFileType
            NodeList initFileTypeNodeList = document.getElementsByTagName("initFileType");
            for (int i=0; i< initFileTypeNodeList.getLength(); i++){
                Node node = initFileTypeNodeList.item(i);
                NamedNodeMap attrs = node.getAttributes();
                String typeId = attrs.getNamedItem("typeId").getNodeValue();
                String typeName = attrs.getNamedItem("typeName").getNodeValue();
                InitFileType initFileType = new InitFileType(typeId, typeName);
                INIT_FILE_TYPE_LIST.add(initFileType);
            }

            // 处理InitFile
            NodeList initFileNodeList = document.getElementsByTagName("initFile");
            for (int i=0; i< initFileNodeList.getLength(); i++){
                Node node = initFileNodeList.item(i);
                InitFileInfo initFileInfo = new InitFileInfo();
                String fileName = node.getAttributes().getNamedItem("fileName").getNodeValue();
                initFileInfo.setFileName(fileName);
                String type = node.getAttributes().getNamedItem("type").getNodeValue();
                NodeList initFileAttrNodeList = node.getChildNodes();
                for (int j=0; j<initFileAttrNodeList.getLength(); j++){
                   Node node2 = initFileAttrNodeList.item(j);
                   if (node2.getNodeName().equals("filePathTemplate")){
                       String filePathTemplateStr = node2.getTextContent().trim();
                       initFileInfo.setFilePathTemplate(FreeMarkerUtils.getTemplate(filePathTemplateStr));
                   } else if (node2.getNodeName().equals("contentTemplatePath")){
                       String contentTemplatePath = node2.getTextContent().trim();
                       initFileInfo.setContentTemplate(FreeMarkerUtils.getTemplate(TemplateFileUtils.readTemplateToString(contentTemplatePath)));
                   } else if (node2.getNodeName().equals("fileInfo")){
                       String fileInfo = node2.getTextContent().trim();
                       initFileInfo.setFileInfo(fileInfo);
                   }
                }
                logger.debug("initFileInfo:{}", initFileInfo);
                for (InitFileType initFileType: INIT_FILE_TYPE_LIST){
                    if (initFileType.getTypeId().equals(type)){
                        initFileType.getFileInfoList().add(initFileInfo);
                    }
                }
            }

            // 处理TableFileInfo
            NodeList tableFileNodeList = document.getElementsByTagName("tableFile");
            for (int i=0; i< tableFileNodeList.getLength(); i++){
                Node node = tableFileNodeList.item(i);
                String type = node.getAttributes().getNamedItem("type").getNodeValue();
                String replace = node.getAttributes().getNamedItem("replace").getNodeValue();
                TableFileInfo tableFileInfo = new TableFileInfo(type, "true".equals(replace.trim().toLowerCase()));
                NodeList initFileAttrNodeList = node.getChildNodes();
                for (int j=0; j<initFileAttrNodeList.getLength(); j++){
                    Node node2 = initFileAttrNodeList.item(j);
                    if (node2.getNodeName().equals("filePathTemplate")){
                        String filePathTemplateStr = node2.getTextContent().trim();
                        tableFileInfo.setFilePathTemplate(FreeMarkerUtils.getTemplate(filePathTemplateStr));
                    } else if (node2.getNodeName().equals("contentTemplatePath")){
                        String dbType = node2.getAttributes().getNamedItem("dbType").getNodeValue();
                        String contentTemplatePath = node2.getTextContent().trim();
                        Template template = FreeMarkerUtils.getTemplate(TemplateFileUtils.readTemplateToString(contentTemplatePath));
                        tableFileInfo.setContentTemplate(dbType, template);
                    }
                }
                logger.debug("tableFileInfo:{}", tableFileInfo);
                TABLE_FILE_INFO_LIST.add(tableFileInfo);
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<InitFileType> getInitFileTypeList(String dbType) {
        return INIT_FILE_TYPE_LIST;
    }


    public static InitFileInfo getInitFileInfo(String dbType, String fileName) {
        for (InitFileType initFileType : INIT_FILE_TYPE_LIST){
            for (InitFileInfo initFileInfo: initFileType.getFileInfoList()){
                if (fileName.equals(initFileInfo.getFileName())){
                    return initFileInfo;
                }
            }
        }
        return null;
    }


    public static List<TableFileInfo> getTableFileInfoList() {
        return TABLE_FILE_INFO_LIST;
    }

    public static TableFileInfo getTableFileInfo(String dbType, String type){
        for (TableFileInfo tableFileInfo: TABLE_FILE_INFO_LIST){
            if (type.equals(tableFileInfo.getType())){
                return tableFileInfo;
            }
        }
        return null;
    }


    public static List<ColumnTypeInfo> listAllColumnType(String dbType){
        List<ColumnTypeInfo> list = new ArrayList<>();
        list.add(new ColumnTypeInfo("int", "Integer", "integer"));
        list.add(new ColumnTypeInfo("long", "Integer", "long"));
        list.add(new ColumnTypeInfo("decimal", "java.math.BigDecimal", "double"));
        list.add(new ColumnTypeInfo("char", "String", "char"));
        list.add(new ColumnTypeInfo("varchar", "String", "varchar"));
        list.add(new ColumnTypeInfo("text", "String", "text"));
        list.add(new ColumnTypeInfo("longtext", "String", "longtext"));
        list.add(new ColumnTypeInfo("boolean", "Boolean", "bit(1)"));
        list.add(new ColumnTypeInfo("datetime", "java.util.Date", "datetime"));
        list.add(new ColumnTypeInfo("float", "Float", "float"));
        list.add(new ColumnTypeInfo("double", "Double", "double"));
        list.add(new ColumnTypeInfo("blob", "byte[]", "blob"));
        return list;
    }

    public static String getDbColumnType(String dbType, String columnType){
        for (ColumnTypeInfo typeInfo: listAllColumnType(dbType)){
            if (typeInfo.getColumnType().equals(columnType)){
                return typeInfo.getDbColumnType();
            }
        }
        return null;
    }

    public static String getJavaType(String dbType, String columnType){
        for (ColumnTypeInfo typeInfo: listAllColumnType(dbType)){
            if (typeInfo.getColumnType().equals(columnType)){
                return typeInfo.getJavaType();
            }
        }
        return null;
    }

}
