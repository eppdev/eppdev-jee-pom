alter table _eppdev_column
    add column   create_cnt_dist_in_groupby_flag integer(10) comment '在group中是否创建count distinct语句';
alter table _eppdev_column
    add column   create_avg_in_groupby_flag integer(10) comment '是否在groupby查询中增加本字段的avg结果，0为否，1为是',
alter table _eppdev_column
    add column   create_sum_in_groupby_flag integer(10) comment '是否创建sum结果在groupby语句中，0为否，1为是',
alter table _eppdev_column
    add column   create_min_in_groupby_flag integer(10) comment '是否在GroupBy中针对本字段创建min结果，0为否，1为是',
alter table _eppdev_column
    add column   create_max_in_groupby_flag integer(10) comment '是否在groupby语句中创建本字段的max属性，0为否，1为是',

update _eppdev_column set create_cnt_dist_in_groupby_flag=0 where create_cnt_dist_in_groupby_flag is null;
update _eppdev_column set create_avg_in_groupby_flag=0 where create_avg_in_groupby_flag is null;
update _eppdev_column set create_sum_in_groupby_flag=0 where create_sum_in_groupby_flag is null;
update _eppdev_column set create_min_in_groupby_flag=0 where create_min_in_groupby_flag is null;
update _eppdev_column set create_max_in_groupby_flag=0 where create_max_in_groupby_flag is null;

