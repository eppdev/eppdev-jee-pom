/* FileName: TypeMapperUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jinlong.hao
 */
public class TypeMapperUtils {
    static Logger logger = LoggerFactory.getLogger(TypeMapperUtils.class);

    static Map<String, String> DB_TO_STD_MAP = new HashMap<>();

    static Map<String, Boolean> NEED_LENGTH_MAP = new HashMap<>();

    static Map<String, Integer> COLUMN_INDEX_MAP = new HashMap<>();

    static {
        DB_TO_STD_MAP.put("CHAR", "char");
        DB_TO_STD_MAP.put("VARCHAR", "varchar");
        DB_TO_STD_MAP.put("TINYTEXT", "varchar");
        DB_TO_STD_MAP.put("TEXT", "text");
        DB_TO_STD_MAP.put("LONGTEXT", "text");
        DB_TO_STD_MAP.put("MEDIUMTEXT", "text");
        DB_TO_STD_MAP.put("DATE", "datetime");
        DB_TO_STD_MAP.put("DATETIME", "datetime");
        DB_TO_STD_MAP.put("TIMESTAMP", "datetime");
        DB_TO_STD_MAP.put("TINYINT", "int");
        DB_TO_STD_MAP.put("INT", "int");
        DB_TO_STD_MAP.put("BIGINT", "long");
        DB_TO_STD_MAP.put("DOUBLE", "double");
        DB_TO_STD_MAP.put("FLOAT", "float ");
        DB_TO_STD_MAP.put("BLOB", "bytes");
        DB_TO_STD_MAP.put("LONGBLOB", "bytes");
        DB_TO_STD_MAP.put("MEDIUMBLOB", "bytes");
        DB_TO_STD_MAP.put("TINYBLOB", "bytes");
        DB_TO_STD_MAP.put("BINARY", "bytes");
        DB_TO_STD_MAP.put("VARBINARY", "bytes");
        DB_TO_STD_MAP.put("DECIMAL", "decimal");
        DB_TO_STD_MAP.put("BIT", "boolean");


        NEED_LENGTH_MAP.put("boolean", false);
        NEED_LENGTH_MAP.put("int", false);
        NEED_LENGTH_MAP.put("long", false);
        NEED_LENGTH_MAP.put("float", false);
        NEED_LENGTH_MAP.put("double", false);
        NEED_LENGTH_MAP.put("char", true);
        NEED_LENGTH_MAP.put("varchar", true);
        NEED_LENGTH_MAP.put("bytes", false);
        NEED_LENGTH_MAP.put("datetime", false);
        NEED_LENGTH_MAP.put("text", false);
        NEED_LENGTH_MAP.put("decimal", false);



        COLUMN_INDEX_MAP.put("id", 1);
        COLUMN_INDEX_MAP.put("remarks", 9999);
        COLUMN_INDEX_MAP.put("create_date", 10000);
        COLUMN_INDEX_MAP.put("create_by", 10001);
        COLUMN_INDEX_MAP.put("update_date", 10002);
        COLUMN_INDEX_MAP.put("update_by", 10003);
        COLUMN_INDEX_MAP.put("del_flag", 10004);
    }

    public static String getStdTypeFromDb(String dbColumnType, String dbType){
        return DB_TO_STD_MAP.get(dbColumnType);
    }


    public static Boolean getNeedLength(String columnType){
        return NEED_LENGTH_MAP.get(columnType);
    }


    public static Integer getDefaultSortIndex(String columnName){
        Integer index = COLUMN_INDEX_MAP.get(columnName);
        if (index != null){
            return index;
        }
        return -1;
    }
}
