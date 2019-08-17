-- ------------------------------------------------
-- 修订历史：
-- ------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-11
-- 修改类型：修改库表
-- 修改内容：
--  - 修改字段:create_count_distinct_in_groupby_flag
--  - 修改字段:create_cnt_dist_in_groupby_flag
-- --------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-11
-- 修改类型：修改库表
-- 修改内容：
--  - 修改字段:create_sum_in_groupby_flag
--  - 修改字段:create_min_in_groupby_flag
--  - 修改字段:group_by_param_flag
--  - 修改表信息：_eppdev_column
--  - 修改字段:group_by_param_flag
--  - 修改字段:group_by_param_flag
--  - 修改字段:create_sum_in_groupby_flag
--  - 修改字段:create_min_in_groupby_flag
-- --------------------------------------------------
-- 修改人：jinlong.hao
-- 修改时间：2019-08-11
-- 修改类型：修改库表
-- 修改内容：
--  - 修改表信息：_eppdev_column
--  - 修改字段:group_by_param_flag
--  - 修改字段:group_by_param_flag
--  - 修改字段:create_sum_in_groupby_flag
--  - 修改字段:create_sum_in_groupby_flag
--  - 修改字段:create_sum_in_groupby_flag
--  - 修改字段:group_by_param_flag
--  - 修改字段:group_by_param_flag
--  - 修改字段:group_by_param_flag
-- --------------------------------------------------

create table _eppdev_column(
  id char(32) comment 'UUID, 唯一标识',
  table_id char(32) comment '所在表id',
  column_name char(255) comment '列名',
  column_type char(64) comment '列类型',
  column_length integer(10) comment '列长度',
  sort_index integer(10) comment '页面展示排序',
  primary_key_flag integer(10) comment '是否主键',
  logic_key_flag integer(10) comment '是否逻辑主键',
  column_comment varchar(255) comment '列注释',
  property_name varchar(255) comment '列对应的Java属性名称',
  java_type varchar(255) comment '对应的Java类型',
  origin_column_id char(32) comment '原来的列id，多版本时使用',
  create_equal_flag integer(10) comment '是否创建=查询条件',
  create_like_flag integer(10) comment '是否创建like查询条件',
  create_left_like_flag integer(10) comment '是否创建left like查询条件',
  create_in_flag integer(10) comment '是否创建in查询条件',
  create_compare_flag integer(10) comment '是否创建大于小于条件',
  create_cnt_dist_in_groupby_flag integer comment '在group中是否创建count distinct语句',
  create_avg_in_groupby_flag integer comment '是否在groupby查询中增加本字段的avg结果，0为否，1为是',
  create_sum_in_groupby_flag integer comment '是否创建sum结果在groupby语句中，0为否，1为是',
  create_min_in_groupby_flag integer comment '是否在GroupBy中针对本字段创建min结果，0为否，1为是',
  create_max_in_groupby_flag integer comment '是否在groupby语句中创建本字段的max属性，0为否，1为是',
  remarks varchar(255) comment '说明',
  create_date datetime(19) comment '创建时间',
  create_by varchar(32) comment '创建人',
  update_date datetime(19) comment '最后修改时间',
  update_by varchar(32) comment '最后修改人',
  del_flag integer(10) comment '删除标识',
  primary key(id)
);

create index idx___eppdev_column__table_id on _eppdev_column(table_id);



