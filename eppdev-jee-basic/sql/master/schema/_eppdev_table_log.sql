-- ------------------------------------------------
-- 修订历史：
-- ------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-17
-- 修改类型：修改库表
-- 修改内容：
--  - 修改字段:oper_content
-- --------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-16
-- 修改类型：修改库表
-- 修改内容：
--  - 修改表信息：_eppdev_table_log
--  - 修改字段:table_id
--  - 修改字段:author_name
-- --------------------------------------------------

create table _eppdev_table_log(
  id char(32) comment 'UUID，唯一标识',
  table_id char(32) comment '表id',
  author_name varchar(64) comment '修改人',
  oper_type varchar(64) comment '操作类型，如创建库表、修改字段等等',
  oper_content text comment '修改详细内容说明',
  remarks varchar(1024) comment '备注（技术字段）',
  create_date datetime comment '数据创建时间（技术字段）',
  create_by char(32) comment '数据创建人ID（技术字段）',
  update_date datetime comment '数据最后修改时间（技术字段）',
  update_by char(32) comment '数据最后修改人ID（技术字段）',
  del_flag integer(10) comment '删除标识（技术字段）',
  primary key(id)
);

create index idx___eppdev_table_log__table_id on _eppdev_table_log(table_id);

