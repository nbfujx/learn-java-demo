/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : renren-security

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-11-07 09:35:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户与角色对应关系';
