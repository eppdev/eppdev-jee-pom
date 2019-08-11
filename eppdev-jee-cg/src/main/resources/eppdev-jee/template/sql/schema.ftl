-- ------------------------------------------------
-- 修订历史：
-- ------------------------------------------------
<#if logList?exists>
<#list logList as log>
-- 修改人：${log.authorName}
-- 修改时间：${log.updateDate?string('yyyy-MM-dd')}
-- 修改类型：${log.operType}
-- 修改内容：
<#list log.operContent?split("\n") as s>
--  - ${s}
</#list>
-- --------------------------------------------------
</#list>
</#if>

create table ${tableName}(
  <#list columnList as column>
  ${column.columnName} ${column.dbColumnType}<#if column.columnLength?exists && column.columnLength &gt; 0>(${column.columnLength?c})</#if> comment '${column.columnComment}',
  </#list>
  primary key(<#list primaryKeyList as column>${column.columnName}<#sep>, </#sep></#list>)
);

<#list indexList as idx>
<#if idx.indexName != 'PRIMARY'>
create index ${idx.indexName} on ${tableName}(${idx.columnNames});
</#if>
</#list>

