create table _eppdev_column(
  id char(32) comment 'UUID, 唯一标识',
  table_id char(32) comment '所在表id',
  column_name char(255) comment '列名',
  column_type char(64) comment '列类型',
  column_length Integer comment '列长度',
  sort_index Integer comment '页面展示排序',
  primary_key_flag Integer comment '是否主键',
  logic_key_flag Integer comment '是否逻辑主键',
  column_comment varchar(255) comment '列注释',
  property_name varchar(255) comment '列对应的Java属性名称',
  java_type varchar(255) comment '对应的Java类型',
  origin_column_id char(32) comment '原来的列id，多版本时使用',
  create_equal_flag Integer comment '是否创建=查询条件',
  create_like_flag Integer comment '是否创建like查询条件',
  create_left_like_flag Integer comment '是否创建left like查询条件',
  create_in_flag Integer comment '是否创建in查询条件',
  create_compare_flag Integer comment '是否创建大于小于条件',
  remarks varchar(255) COMMENT '说明',
  create_by varchar(32) comment '创建人',
  update_by varchar(32) comment '最后修改人',
  create_date datetime COMMENT '创建时间',
  update_date datetime COMMENT '最后修改时间',
  del_flag int(11) COMMENT '删除标识',
  PRIMARY KEY (`id`)
);

create index idx___eppdev_column__table_id on _eppdev_column(table_id);


create table if not exists _eppdev_conf(
  id char(32) comment 'UUID, 唯一标识',
  conf_name varchar(64) comment '配置标识',
  conf_value varchar(255) comment '配置结果',
  remarks varchar(255) COMMENT '说明',
  create_by varchar(32) comment '创建人',
  update_by varchar(32) comment '最后修改人',
  create_date datetime COMMENT '创建时间',
  update_date datetime COMMENT '最后修改时间',
  del_flag int(11) COMMENT '删除标识',
  PRIMARY KEY (`id`)
);

create table if not exists _eppdev_index(
  id char(32) comment 'UUID, 唯一标识',
  table_id char(32) comment '表ID',
  index_name varchar(255) comment '索引名称',
  column_names varchar(255) comment '索引列名称',
  remarks varchar(255) COMMENT '说明',
  create_by varchar(32) comment '创建人',
  update_by varchar(32) comment '最后修改人',
  create_date datetime COMMENT '创建时间',
  update_date datetime COMMENT '最后修改时间',
  del_flag int(11) COMMENT '删除标识',
  PRIMARY KEY (`id`)
);

create index idx___eppdev_index__table_id on _eppdev_index(table_id);

create table if not exists _eppdev_table(
  id char(32) comment 'UUID, 唯一标识',
  table_name varchar(255) comment '表名',
  table_comment varchar(255) comment '表备注',
  module_name varchar(255) COMMENT '模块名称',
  entity_name varchar(255) COMMENT '对应的实体名称',
  entity_name_upper varchar(255) comment '对应的实体名称首字母大写',
  table_type int(11) COMMENT '库表类型',
  version_id char(32) COMMENT '对应的版本id',
  create_sql longtext COMMENT '创建语句',
  origin_table_id char(32) COMMENT 'master下的表ID',
  remarks varchar(255) COMMENT '说明',
  create_by varchar(32) comment '创建人',
  update_by varchar(32) comment '最后修改人',
  create_date datetime COMMENT '创建时间',
  update_date datetime COMMENT '最后修改时间',
  del_flag int(11) COMMENT '删除标识',
  PRIMARY KEY (`id`)
);

create index idx___eppdev_table__version_id on _eppdev_table(version_id);



create table if not exists _eppdev_user(
  id char(32) comment 'UUID, 唯一标识',
  login_name varchar(64) comment '登录名',
  password_hex varchar(255) comment '密码哈希值',
  remarks varchar(255) COMMENT '说明',
  create_by varchar(32) comment '创建人',
  update_by varchar(32) comment '最后修改人',
  create_date datetime COMMENT '创建时间',
  update_date datetime COMMENT '最后修改时间',
  del_flag int(11) COMMENT '删除标识',
  PRIMARY KEY (`id`)
);


create index idx___eppdev_user__login_name on _eppdev_user(login_name);


create table _eppdev_version(
  id char(32) comment 'UUID, 唯一标识',
  version_name varchar(255) comment '版本名称',
  remarks varchar(255) COMMENT '说明',
  create_by varchar(32) comment '创建人',
  update_by varchar(32) comment '最后修改人',
  create_date datetime COMMENT '创建时间',
  update_date datetime COMMENT '最后修改时间',
  del_flag int(11) COMMENT '删除标识',
  PRIMARY KEY (`id`)
);


create table _eppdev_table_log(
  id char(32) comment 'UUID，唯一标识',
  table_id char(32) comment '表id',
  author_name varchar(64) comment '修改人',
  oper_type varchar(64) comment '操作类型，如创建库表、修改字段等等',
  oper_content text comment '修改详细内容说明',
  create_date datetime comment '数据创建时间（技术字段）',
  update_date datetime comment '数据最后修改时间（技术字段）',
  create_by char(32) comment '数据创建人ID（技术字段）',
  update_by char(32) comment '数据最后修改人ID（技术字段）',
  remarks varchar(1024) comment '备注（技术字段）',
  del_flag integer comment '删除标识（技术字段）',
  primary key(id)
);

create index idx___eppdev_table_log__table_id on _eppdev_table_log(table_id);

