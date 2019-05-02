
-- 添加主分支
insert into _eppdev_version(
    id,
    version_name,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag,
    remarks
)
values (
    '00000000000000000000000000000000',
    'master',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0,
    '主分支'
);

-- --------------------------------
-- 添加配置
-- --------------------------------
-- PROJECT_NAME
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000001',
    'PROJECT_NAME',
    'cn.eppdev',
    '工程名称，在生成pom.xml中使用',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);

-- DB_TYPE
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000002',
    'DB_TYPE',
    'mysql',
    '数据库类型，针对不同的数据库(mysql, oracle, postgresql, sqlserver等）会生成不同的代码，目前只支持mysql',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);

-- PROJECT_PATH
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000003',
    'PROJECT_PATH',
    '~/eppdev_test/',
    '工程目录位置，用于生成代码',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);


-- BASIC_PACKAGE_NAME
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000004',
    'BASIC_PACKAGE_NAME',
    'cn.eppdev',
    '基础包名，用于生成代码使用',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);

-- AUTHOR_NAME
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000005',
    'AUTHOR_NAME',
    'jinlong.hao',
    '代码作者，用于在代码中显示作者',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);


-- AUTHOR_EMAIL
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000006',
    'AUTHOR_EMAIL',
    'jinlong.hao@eppdev.cn',
    '作者邮箱，生成在代码注释中',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);


-- COMPANY_NAME
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000007',
    'COMPANY_NAME',
    'EPPDEV_JEE',
    '公司名称，生成在代码注释中',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);






-- GIT_PATH
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000008',
    'GIT_PATH',
    '~/eppdev_test/',
    'GIT仓库的目录位置，用于调用本地git命令进行push代码',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);


-- GIT_AUTO_PUSH
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000009',
    'GIT_AUTO_PUSH',
    '0',
    '是否自动PUSH代码到远端仓库中，1位自动PUSH，0位不自动PUSH，手工处理',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);


-- GIT_USE_NEW_BRANCH
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000010',
    'GIT_USE_NEW_BRANCH',
    '0',
    '进行git push的时候是否直接使用新的分支，仅在GIT_AUTO_PUSH为1时生效，1位使用新分支（主要用于PR模式），0为不是用新分支（用于传统模式）',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);



-- GIT_MAIN_BRANCH_NAME
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000011',
    'GIT_MAIN_BRANCH_NAME',
    'master',
    'GIT开发主分支名称，仅GIT_USE_NEW_BRANCH、GIT_AUTO_PUSH为1时生效，此时自动push前会首先切换回此分支，然后pull代码，创建分支，生成代码，push到服务器端',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);


-- USE_SWAGGER
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000012',
    'USE_SWAGGER',
    '0',
    '是否生成swagger注解',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);



-- USE_SWAGGER
insert into _eppdev_conf(
    id,
    conf_name,
    conf_value,
    remarks,
    create_date,
    create_by,
    update_date,
    update_by,
    del_flag
)
values(
    '00000000000000000000000000000013',
    'LICENSE_DESC',
    'Apache License 2.0',
    '软件许可说明：PRIVATE/BSD/MIT/APACHE2.0/...',
    now(),
    'jinlong.hao',
    now(),
    'jinlong.hao',
    0
);
