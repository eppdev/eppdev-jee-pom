/* FileName: FilePathUtils.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.conf.entity.EppdevTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author jinlong.hao
 */
public class FilePathUtils {
    static Logger logger = LoggerFactory.getLogger(FilePathUtils.class);

    public static String getInitFilePath(String fileName, Map<String, String> basicConf) {
        logger.debug("fileName:{}", fileName);
        logger.debug("basicConf:{}", basicConf);
        String projectDir = basicConf.get("PROJECT_PATH");
        String basicPackageName = basicConf.get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/java/" + basicPackageName.replace(".", "/");

        // Utils文件
        if (fileName.endsWith("Utils.java")) {
            return basicPackageDir + "/utils/" + fileName;
        }
        // 其他文件
        else if ("pom.xml".equals(fileName)) {
            return projectDir + "/" + fileName;
        } else if ("Application.java".equals(fileName)) {
            return basicPackageDir + "/" + fileName;
        } else if ("application.properties".equals(fileName)) {
            return projectDir + "/src/main/resources" + "/" + fileName;
        } else if ("BasicDao.java".equals(fileName)) {
            return basicPackageDir + "/commons/dao" + "/" + fileName;
        } else if ("BasicEntity.java".equals(fileName)) {
            return basicPackageDir + "/commons/entity" + "/" + fileName;
        } else if ("BasicParam.java".equals(fileName)) {
            return basicPackageDir + "/commons/param" + "/" + fileName;
        } else if ("BasicService.java".equals(fileName)) {
            return basicPackageDir + "/commons/service" + "/" + fileName;
        }
        return null;
    }

    public static String getEntityFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/entity/" + eppdevTable.getEntityName() + ".java";
    }

    public static String getUpperEntityFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/entity/auto/_" + eppdevTable.getEntityName() + ".java";
    }

    public static String getDaoFilePath(EppdevTable eppdevTable){
        return getModulePackageDir(eppdevTable) + "/dao/" + eppdevTable.getEntityName() + "Dao.java";
    }

    public static String getUpperDaoFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/dao/auto/_" + eppdevTable.getEntityName() + "Dao.java";
    }

    public static String getParamFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/param/" + eppdevTable.getEntityName() + "Param.java";
    }

    public static String getUpperParamFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/param/auto/_" + eppdevTable.getEntityName() + "Param.java";
    }

    public static String getServiceFilePath(EppdevTable eppdevTable) {
        return getModulePackageDir(eppdevTable) + "/service/" + eppdevTable.getEntityName() + "Service.java";
    }

    public static String getMapperXmlFilePath(EppdevTable eppdevTable) {
        return getModuleSourceDir(eppdevTable) + "/dao/" + eppdevTable.getEntityName() + "Dao.xml";
    }

    public static String getUpperMapperXmlFilePath(EppdevTable eppdevTable) {
        return getModuleSourceDir(eppdevTable) + "/dao/auto/_" + eppdevTable.getEntityName() + "Dao.xml";
    }

    public static String getModuleSourceDir(EppdevTable eppdevTable) {
        String projectDir = eppdevTable.getBasicConf().get("PROJECT_PATH");
        String basicPackageName = eppdevTable.getBasicConf().get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/resources/" + basicPackageName.replace(".", "/");
        if (eppdevTable.getModuleName() != null && eppdevTable.getModuleName().trim().length() > 0){
            return basicPackageDir + "/" + eppdevTable.getModuleName();
        } else {
            return basicPackageDir;
        }
    }




    public static String getModulePackageDir(EppdevTable eppdevTable){
        String projectDir = eppdevTable.getBasicConf().get("PROJECT_PATH");
        String basicPackageName = eppdevTable.getBasicConf().get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/java/" + basicPackageName.replace(".", "/");
        if (eppdevTable.getModuleName() != null && eppdevTable.getModuleName().trim().length() > 0){
            return basicPackageDir + "/" + eppdevTable.getModuleName();
        } else {
            return basicPackageDir;
        }
    }

    public static String getBasicPackageDir(Map<String, String> basicConf){
        String projectDir = basicConf.get("PROJECT_PATH");
        String basicPackageName = basicConf.get("BASIC_PACKAGE_NAME");
        String basicPackageDir = projectDir + "/src/main/java/" + basicPackageName.replace(".", "/");
        return basicPackageDir;
    }
}
