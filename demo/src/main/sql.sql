DROP TABLE IF EXISTS `lg_game_user`;
CREATE TABLE `lg_game_user`(
	`id` bigint(20) NOT NULL  auto_increment  COMMENT '用户ID，主键，自增长',
	`loginName` varchar(50) default  NULL  COMMENT '登录名',
	`loginPwd` varchar(128) default  NULL  COMMENT '登录密码，使用md5双次加密',
	`loginPwd1` varchar(128) default  NULL  COMMENT '最近一次使用密码，使用md5双次加密',
	`loginPwd2` varchar(128) default  NULL  COMMENT '最近二次使用密码，使用md5双次加密',
	`loginPwd3` varchar(128) default  NULL  COMMENT '最近三次使用密码，使用md5双次加密',
	`loginLimitAddress` varchar(200) default  NULL  COMMENT '登录限制地址，多个IP地址用逗号分隔，可以使用IP段匹配，如：172.17.*非空：则只能该值内的IP可以登录',
	`realName` varchar(50) default  NULL  COMMENT '用户名',
	`mobile` varchar(21) default  NULL  COMMENT '用户手机号',
	`phone` varchar(21) default  NULL  COMMENT '用户联系电话',
	`email` varchar(50) default  NULL  COMMENT '用户邮箱',
	`qq` varchar(20) default  NULL  COMMENT 'QQ号码',
	`userType` tinyint(2) default '1' COMMENT '用户类型，1：系统用户，2：运维用户，默认1',
	`status` tinyint(2) default '1' COMMENT '用户状态，0：停用，1：正常，2：冻结，3：销户，4：离职，默认1',
	`deptIds` varchar(200) default  NULL  COMMENT '部门ID，多个ID用逗号分隔',
	`createTime` datetime default  NULL  COMMENT '创建时间',
	`createUser` varchar(50) default  NULL  COMMENT '创建用户',
	`createUserName` varchar(50) default  NULL  COMMENT '创建用户名称',
	`lastLoginTime` datetime default  NULL  COMMENT '最后一次登录时间',
	`lastLoginAddress` varchar(21) default  NULL  COMMENT '最后一次登录地址',
	`lastModPwdTime` datetime default  NULL  COMMENT '最后修改密码时间',
	`lastModPwdAddr` varchar(21) default  NULL  COMMENT '最后修改密码地址',
	`picUrl` varchar(50) default  NULL  COMMENT '头像地址',
	PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

DROP TABLE IF EXISTS `lg_game_menu`;
CREATE TABLE `lg_game_menu`(
	`Id` bigint(20) NOT NULL  auto_increment  COMMENT '菜单ID，主键，自增长',
	`Name` varchar(50) default  NULL  COMMENT '菜单名称',
	`url` varchar(256) default  NULL  COMMENT '连接地址',
	`parentId` bigint(20) default  NULL  COMMENT '父菜单ID，一级菜单的该字段值为-1',
	`orderId` int(11) default  NULL  COMMENT '排序编号',
	`Status` tinyint(2) default '1' COMMENT '菜单状态，0：禁用，1：启用，默认1',
	`linkType` tinyint(2) default '0' COMMENT '链接方式，0：普通，1：弹出，2：脚本（JavaScript），默认0',
	`groupId` int(11) default '1' COMMENT '分组编号，使用菜单分隔符按该值分隔，默认1',
	`groupName` varchar(50) default  NULL  COMMENT '分组名称',
	`imgPath` varchar(128) default  NULL  COMMENT '主菜单图标，主菜单图标的css样式名',
	`buttonImgPath` varchar(128) default  NULL  COMMENT '按钮图标，按钮图标的css样式名',
	`imgCommPath` varchar(128) default  NULL  COMMENT '常用菜单图标，常用菜单图标的css样式名',
	`commMenu` tinyint(2) default '0' COMMENT '是否常用菜单，0：非常用，1：常用，默认0',
	`menuType` tinyint(2) default '0' COMMENT '菜单类型，0：主菜单，1：非主菜单(功能操作组)，默认0',
	`authType` tinyint(2) default '3' COMMENT '权限类型，0：无限制，1：无需登录查看，2：需要登录查看，3：需要角色权限查看，默认3',
	`createTime` datetime default  NULL  COMMENT '创建时间',
	`createUser` varchar(50) default  NULL  COMMENT '创建用户',
	`createUserName` varchar(50) default  NULL  COMMENT '创建用户名称',
	PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单信息';

DROP TABLE IF EXISTS `lg_game_resource`;
CREATE TABLE `lg_game_resource`(
	`id` bigint(20) NOT NULL  auto_increment  COMMENT '菜单ID，主键，自增长',
	`name` varchar(50) default  NULL  COMMENT '名称',
	`url` varchar(2000) default  NULL  COMMENT '连接地址，多个地址以逗号分隔',
	`authType` tinyint(2) default '3' COMMENT '权限类型，0：无限制，1：无需登录查看，2：需要登录查看，3：需要角色权限查看，默认3',
	`sourceType` varchar(2000) default  NULL  COMMENT '资源分组，下拉选择，可手动录入',
	`createTime` datetime default  NULL  COMMENT '创建时间',
	`createUser` varchar(50) default  NULL  COMMENT '创建用户',
	`createUserName` varchar(50) default  NULL  COMMENT '创建用户名称',
	PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源信息';

DROP TABLE IF EXISTS `lg_game_role`;
CREATE TABLE `lg_game_role`(
	`id` bigint(20) NOT NULL  auto_increment  COMMENT '序号，主键，自增长',
	`name` varchar(50) default  NULL  COMMENT '角色名称',
	`remark` varchar(200) default  NULL  COMMENT '备注',
	`roleType` tinyint(2) default '1' COMMENT '角色类型，0：系统内置角色（不可删除），1：普通角色，默认1',
	`createTime` datetime default  NULL  COMMENT '创建时间',
	`createUser` varchar(50) default  NULL  COMMENT '创建用户',
	`createUserName` varchar(50) default  NULL  COMMENT '创建用户名称',
	PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息';

DROP TABLE IF EXISTS `lg_game_role_auth`;
CREATE TABLE `lg_game_role_auth`(
	`id` bigint(20) NOT NULL  auto_increment  COMMENT '序号，主键，自增长',
	`roleId` bigint(20) default  NULL  COMMENT '角色ID',
	`resourceId` bigint(20) default  NULL  COMMENT '资源ID',
	PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色资源权限';

DROP TABLE IF EXISTS `lg_game_role_user`;
CREATE TABLE `lg_game_role_user`(
	`id` bigint(20) NOT NULL  auto_increment  COMMENT '序号，主键，自增长',
	`roleId` bigint(20) default  NULL  COMMENT '角色ID',
	`userId` bigint(20) default  NULL  COMMENT '用户ID',
	PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色用户';