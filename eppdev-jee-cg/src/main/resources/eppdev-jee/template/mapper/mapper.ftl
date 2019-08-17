<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao">

    <!-- 此段代码将在_${entityName}Dao.xml的list、get方法中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefColumns">

    </sql>

    <!-- 此段代码将在_${entityName}Dao.xml的list、get方法中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefJoin">

    </sql>

    <!-- 此段代码将在_${entityName}Dao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByColumns">

    </sql>

    <!-- 此段代码将在_${entityName}Dao.xml的listGroupBy中引用，请根据需要添加，切勿删除 -->
    <sql id="customRefGroupByJoin">

    </sql>

</mapper>
