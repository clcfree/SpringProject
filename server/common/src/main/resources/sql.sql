DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE "user" (
  "id" varchar(64) NOT NULL COMMENT '用户ID',
  "username" varchar(256) DEFAULT NULL COMMENT '用户账号',
  "password" varchar(128) DEFAULT NULL COMMENT '用户密码',
  "name" varchar(128) DEFAULT NULL COMMENT '用户姓名',
  "id_card" varchar(64) DEFAULT NULL COMMENT '身份证号码',
  "census_register_address" varchar(512) DEFAULT NULL COMMENT '户籍地址',
  "org_id" varchar(64) DEFAULT NULL COMMENT '所属机构ID',
  "house_address" varchar(512) DEFAULT NULL COMMENT '居住地址',
  "native_place" varchar(128) DEFAULT NULL COMMENT '籍贯',
  "gender" varchar(8) DEFAULT NULL COMMENT '性别',
  "height" decimal(10,0) DEFAULT '0' COMMENT '身高',
  "weight" decimal(10,0) DEFAULT '0' COMMENT '体重',
  "birthday" date DEFAULT NULL COMMENT '出生日期',
  "marital_status" varchar(16) DEFAULT NULL COMMENT '婚姻状况',
  "nation" varchar(64) DEFAULT NULL COMMENT '民族',
  "education_level" varchar(64) DEFAULT NULL COMMENT '文化程度',
  "graduate_school" varchar(128) DEFAULT NULL COMMENT '毕业学校',
  "tel" varchar(32) DEFAULT NULL COMMENT '联系电话',
  "email" varchar(128) DEFAULT NULL COMMENT '邮箱',
  "icon" varchar(64) DEFAULT NULL COMMENT '头像ID',
  "type" varchar(128) DEFAULT NULL COMMENT '人员类型',
  "political_status" varchar(4) DEFAULT NULL COMMENT '政治面貌',
  "position" varchar(255) DEFAULT NULL COMMENT '职位',
  "create_time" timestamp NULL DEFAULT NULL COMMENT '创建时间',
  "update_time" timestamp NULL DEFAULT NULL COMMENT '更新时间',
  "login_time" timestamp NULL DEFAULT NULL COMMENT '最后登录时间',
  "login_ip" varchar(32) DEFAULT NULL COMMENT '最后登录ID',
  "enabled" tinyint(1) DEFAULT NULL COMMENT '是否可用',
  "create_by" varchar(255) DEFAULT NULL,
  "update_by" varchar(255) DEFAULT NULL,
  "del_flag" tinyint(1) DEFAULT NULL,
  "online_status" tinyint(4) DEFAULT '0',
  PRIMARY KEY ("id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';