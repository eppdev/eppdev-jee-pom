<!--
     ${tableName}对应的基础Mapper文件，请勿修改，代码生成时会自动进行覆盖
     由EPPDEV-JEE自动创建
-->
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.auto._${entityName}Dao">
    <sql id="columns">
        <#list columnList as column>
        a.${column.columnName} as ${column.propertyName},
        </#list>
    </sql>

    <insert id="insert" parameterType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        insert into ${tableName}(
        <trim suffixOverrides=",">
            <#list columnList as column>
            ${column.columnName},
            </#list>
        </trim>
        )
        values(
        <trim suffixOverrides=",">
            <#list columnList as column>
            ${r"#{"}${column.propertyName}${r"}"},
            </#list>
        </trim>
        )
    </insert>

    <delete id="delete">
        update ${tableName} a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=${r"#{"}updateDate${r"}"}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = ${"#{"}updateBy${r"}"}, </if>
        </set>
        <where>
            <#list primaryKeyList as column>
            and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
        </where>
    </delete>

    <delete id="deleteBy" parameterType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.param.${entityName}Param">
        <#list columnList as column>
        <#if column.createLikeFlag == 1>
        <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_like_${column.columnName}" value="'%' + _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        <#if column.createLeftLikeFlag == 1>
        <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_left_like_${column.columnName}" value="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        </#list>
        update ${tableName} a
        <set>
            a.del_flag=1,
            <if test="updateDate != null">a.update_date=${r"#{"}updateDate${r"}"}, </if>
            <if test="updateBy != null and updateBy != ''">a.update_by = ${"#{"}updateBy${r"}"}, </if>
        </set>
        <where>
            <#list columnList as column>
            <#if column.createEqualFlag == 1>
            <if test="${column.propertyName} != null<#if column.javaType=='String'> and ${column.propertyName} != ''</#if>">and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}</if>
            </#if>
            <#if column.createInFlag == 1>
            <if test="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List != null and _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List.length > 0">
                and a.${column.columnName} in
                <foreach collection="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List" item="_item" separator="," open="(" close=")">
                    ${r"#{"}_item${r"}"}
                </foreach>
            </if>
            </#if>
            <#if column.createCompareFlag == 1>
            <if test="_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType=='String'>  and _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">a.${column.columnName} &gt;= ${r"#{"}_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            <if test="_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType=='String'>  and _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">a.${column.columnName} &lt;= ${r"#{"}_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            </#if>
            <#if column.createLikeFlag == 1>
            <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_like_${column.columnName}${r"}"}</if>
            </#if>
            <#if column.createLeftLikeFlag == 1>
            <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_left_like_${column.columnName}${r"}"}</if>
            </#if>
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
        </where>
    </delete>

    <update id="update" parameterType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        update ${tableName} a
        <set>
            <#list columnList as column>
            <if test="${column.propertyName} != null<#if column.javaType == 'String'> and ${column.propertyName} != ''</#if>">a.${column.columnName} = ${r"#{"}${column.propertyName}${r"}"},</if>
            </#list>
        </set>
        <where>
        <#list primaryKeyList as column>
        and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
        </#list>
        </where>
    </update>


    <select id="get" resultType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefColumns"/>
        </trim>
        from ${tableName} a
        <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefJoin"/>
        <where>
        <#list columnList as column>
        <#if column.primaryKeyFlag == 1>
            and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
        </#if>
        </#list>
        </where>
    </select>


    <select id="list" resultType="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.entity.${entityName}">
        <#list columnList as column>
        <#if column.createLikeFlag == 1>
        <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_like_${column.columnName}" value="'%' + _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        <#if column.createLeftLikeFlag == 1>
        <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} !=''">
            <bind name="_bind_left_like_${column.columnName}" value="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} + '%'"></bind>
        </if>
        </#if>
        </#list>
        select
        <trim suffixOverrides=",">
            <include refid="columns"/>
            <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefColumns"/>
        </trim>
        from ${tableName} a
        <include refid="${basicConf.BASIC_PACKAGE_NAME}<#if moduleName?exists && moduleName?trim?length &gt; 0>.${moduleName?trim}</#if>.dao.${entityName}Dao.customRefJoin"/>
        <where>
            <#list columnList as column>
            <#if column.createEqualFlag == 1 || column.logicKeyFlag == 1>
            <if test="${column.propertyName} != null<#if column.javaType=='String'> and ${column.propertyName} != ''</#if>">and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}</if>
            </#if>
            <#if column.createInFlag == 1>
            <if test="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List != null and _in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List.length > 0">
                and a.${column.columnName} in
                <foreach collection="_in${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}List" item="_item" separator="," open="(" close=")">
                    ${r"#{"}_item${r"}"}
                </foreach>
            </if>
            </#if>
            <#if column.createCompareFlag == 1>
            <if test="_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType == 'String'> and _min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">a.${column.columnName} &gt;= ${r"#{"}_min${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            <if test="_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null<#if column.javaType == 'String'> and _max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''</#if>">a.${column.columnName} &lt;= ${r"#{"}_max${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)}${r"}"}</if>
            </#if>
            <#if column.createLikeFlag == 1>
            <if test="_like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _like${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_like_${column.columnName}${r"}"}</if>
            </#if>
            <#if column.createLeftLikeFlag == 1>
            <if test="_leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != null and _leftLike${column.propertyName?substring(0,1)?upper_case}${column.propertyName?substring(1)} != ''">a.${column.columnName} like ${r"#{"}_bind_left_like_${column.columnName}${r"}"}</if>
            </#if>
            </#list>
            <#list columnList as column>
            <#if column.columnName == "del_flag">
                and a.del_flag = 0
            </#if>
            </#list>
            <if test="_customWhere != null and _customWhere != ''">${r"${"}_customWhere}</if>
        </where>
        <choose>
            <when test="_orderBy != null and _orderBy != ''">
                order by ${r"${"}_orderBy${r"}"}
            </when>
            <#list columnList as column>
            <#if column.columnName == "update_date">
            <otherwise>
                order by a.update_date desc
            </otherwise>
            </#if>
            </#list>
        </choose>
    </select>



    <delete id="realDelete">
        delete from ${tableName} a
        <where>
            <#list primaryKeyList as column>
            and a.${column.columnName}=${r"#{"}${column.propertyName}${r"}"}
            </#list>
        </where>
    </delete>

</mapper>