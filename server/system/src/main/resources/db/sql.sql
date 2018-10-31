DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` BIGINT(20) NOT NULL COMMENT '角色id',
  `code` varchar(255) DEFAULT NULL COMMENT '角色编码',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `type` tinyint(4) unsigned DEFAULT '1' COMMENT '角色类型，1.系统角色',
  `is_enable` tinyint(1) unsigned DEFAULT '1' COMMENT '状态，1:启用，0:禁用，默认1',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `create_id` bigint(20) unsigned DEFAULT NULL COMMENT '创建用户id',
  `create_name` varchar(255) DEFAULT NULL COMMENT '创建用户名',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `update_id` bigint(20) unsigned DEFAULT NULL COMMENT '更新用户id',
  `update_name` varchar(255) DEFAULT NULL COMMENT '更新用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色';

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL  COMMENT '用户id',
  `login_name` varchar(30) DEFAULT NULL COMMENT '录登账号',
  `password` varchar(32) DEFAULT NULL COMMENT '录登密码',
  `user_code` varchar(10) DEFAULT NULL COMMENT '员工编号',
  `user_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `tel` varchar(64) DEFAULT NULL COMMENT '手机',
  `email` varchar(100) DEFAULT NULL COMMENT '电子邮件',
  `user_type` tinyint(4) DEFAULT '0' COMMENT '用户类型',
  `edit_sign` tinyint(4) DEFAULT '1' COMMENT '可管理标志',
  `is_stop` tinyint(4) DEFAULT '0' COMMENT '账户停用标志',
  `valid` tinyint(4) DEFAULT '1' COMMENT '有效标志',
  `login_ip` varchar(100) DEFAULT NULL COMMENT 'WEB允许登录IP',
  `login_time` varchar(200) DEFAULT NULL COMMENT 'WEB允许登录时段',
  `comment` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_id` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_name` varchar(255) DEFAULT NULL COMMENT '创建用户名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_id` bigint(20) unsigned DEFAULT NULL COMMENT '更新用户id',
  `update_name` varchar(255) DEFAULT NULL COMMENT '更新用户名',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `scope_type` tinyint(4) DEFAULT NULL COMMENT '查看客户权限类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8  COMMENT='用户信息';

DROP TABLE IF EXISTS `sys_auth`;
CREATE TABLE `sys_auth` (
  `id` bigint(20) NOT NULL  COMMENT '权限id',
  `parent_id` bigint(20) NOT NULL  COMMENT '父节点id',
  `authority_code` varchar(50) DEFAULT NULL,
  `authority_name` varchar(200) DEFAULT NULL,
  `icon` varchar(50) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-菜单 1-按钮',
  `is_enable` tinyint(4) NOT NULL DEFAULT '1',
  `create_id` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_name` varchar(255) DEFAULT NULL COMMENT '创建用户名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_id` bigint(20) unsigned DEFAULT NULL COMMENT '更新用户id',
  `update_name` varchar(255) DEFAULT NULL COMMENT '更新用户名',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限';

DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user` (
  `user_id` bigint(20) not NULL COMMENT '用户id',
  `role_id` bigint(20) not NULL COMMENT '角色id',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户角色';

DROP TABLE IF EXISTS `sys_role_auth`;
CREATE TABLE `sys_role_auth` (
  `auth_id` bigint(20) not NULL COMMENT '权限id',
  `role_id` bigint(20) not NULL COMMENT '角色id',
  PRIMARY KEY (`auth_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统角色权限';