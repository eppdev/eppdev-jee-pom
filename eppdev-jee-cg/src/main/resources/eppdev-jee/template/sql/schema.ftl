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

