/* FileName: SampleModelBuilder.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import cn.eppdev.jee.conf.entity.EppdevColumn;
import cn.eppdev.jee.conf.entity.EppdevTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class SampleModelBuilder {
    static Logger logger = LoggerFactory.getLogger(SampleModelBuilder.class);

    public static Map<String, String> getBasicConf(){
        Map<String, String> map = new HashMap<>();
        map.put("BASIC_PACKAGE_NAME", "cn.eppdev.test");
        map.put("AUTHOR_NAME", "testAuthor");
        map.put("AUTHOR_EMAIL", "mail@test");
        map.put("YEAR", "2018");
        map.put("MONTH", "01");
        map.put("DAY", "20");
        map.put("DATE", "2018-01-20");
        map.put("COMPANY_NAME", "EPPDEV-TEST");
        map.put("LICENSE_DESC", "MIT");
        return map;
    }

    public static EppdevTable createSampleTable(){
        EppdevTable table = new EppdevTable();
        table.setTableName("test_table");
        table.setEntityName("TestTable");
        table.setModuleName("module");
        List<EppdevColumn> columnList = new ArrayList<>();

        EppdevColumn column = new EppdevColumn();
        column.setColumnName("id");
        column.setPropertyName("id");
        column.setColumnType("char");
        column.setColumnLength(32);
        column.setJavaType("String");
        column.setDbColumnType("char");
        column.setPrimaryKeyFlag(1);
        column.setCreateCompareFlag(0);
        column.setCreateEqualFlag(1);
        column.setCreateLikeFlag(0);
        column.setCreateLeftLikeFlag(0);
        column.setCreateLikeFlag(0);
        column.setCreateInFlag(1);
        column.setColumnComment("UUID，唯一标识");
        column.setLogicKeyFlag(0);
        columnList.add(column);

        EppdevColumn column1 = new EppdevColumn();
        column1.setColumnName("age");
        column1.setPropertyName("age");
        column1.setColumnType("int");
        column1.setJavaType("Integer");
        column1.setDbColumnType("Integer");
        column1.setPrimaryKeyFlag(0);
        column1.setCreateEqualFlag(0);
        column1.setCreateCompareFlag(1);
        column1.setCreateLikeFlag(0);
        column1.setCreateLeftLikeFlag(0);
        column1.setCreateLikeFlag(0);
        column1.setCreateInFlag(1);
        column1.setColumnComment("年龄");
        column1.setLogicKeyFlag(1);
        columnList.add(column1);

        EppdevColumn column2 = new EppdevColumn();
        column2.setColumnName("name");
        column2.setColumnType("varchar");
        column2.setColumnLength(20);
        column2.setPropertyName("name");
        column2.setJavaType("String");
        column2.setDbColumnType("varchar");
        column2.setCreateEqualFlag(0);
        column2.setCreateCompareFlag(0);
        column2.setCreateLikeFlag(1);
        column2.setCreateLeftLikeFlag(1);
        column2.setPrimaryKeyFlag(1);
        column2.setCreateLikeFlag(1);
        column2.setCreateInFlag(1);
        column2.setColumnComment("姓名");
        column2.setLogicKeyFlag(1);
        columnList.add(column2);

        table.setColumnList(columnList);

        table.setBasicConf(getBasicConf());
        return table;
    }
}
