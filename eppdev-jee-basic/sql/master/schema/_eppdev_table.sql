-- ------------------------------------------------
-- 修订历史：
-- ------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-11
-- 修改类型：修改库表
-- 修改内容：
--  - 修改表信息：_eppdev_table
-- --------------------------------------------------


create table _eppdev_table(
  id char(32) comment 'UUID, 唯一标识',
  table_name varchar(255) comment '表名',
  table_comment varchar(255) comment '表备注',
  module_name varchar(255) comment '模块名称',
  entity_name varchar(255) comment '对应的实体名称',
  table_type integer(10) comment '库表类型',
  version_id char(32) comment '对应的版本id',
  create_sql text(2147483647) comment '创建语句',
  origin_table_id char(32) comment 'master下的表ID',
  remarks varchar(255) comment '说明',
  create_date datetime(19) comment '创建时间',
  create_by varchar(32) comment '创建人',
  update_date datetime(19) comment '最后修改时间',
  update_by varchar(32) comment '最后修改人',
  del_flag integer(10) comment '删除标识',
  primary key(id)
);

create index idx___eppdev_table__version_id on _eppdev_table(version_id);

