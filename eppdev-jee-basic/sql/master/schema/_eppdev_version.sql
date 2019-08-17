-- ------------------------------------------------
-- 修订历史：
-- ------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-16
-- 修改类型：修改库表
-- 修改内容：
--  - 修改表信息：_eppdev_version
--  - 修改字段:version_name
-- --------------------------------------------------

create table _eppdev_version(
  id char(32) comment 'UUID, 唯一标识',
  version_name varchar(255) comment '版本名称',
  remarks varchar(255) comment '说明',
  create_date datetime(19) comment '创建时间',
  create_by varchar(32) comment '创建人',
  update_date datetime(19) comment '最后修改时间',
  update_by varchar(32) comment '最后修改人',
  del_flag integer(10) comment '删除标识',
  primary key(id)
);


