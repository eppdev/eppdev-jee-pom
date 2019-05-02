create table _eppdev_conf(
  id char(32) comment 'UUID, 唯一标识',
  conf_name varchar(64) comment '配置标识',
  conf_value varchar(255) comment '配置结果',
  remarks varchar(255) comment '说明',
  create_date datetime(19) comment '创建时间',
  create_by varchar(32) comment '创建人',
  update_date datetime(19) comment '最后修改时间',
  update_by varchar(32) comment '最后修改人',
  del_flag integer(10) comment '删除标识',
  primary key(id)
);


