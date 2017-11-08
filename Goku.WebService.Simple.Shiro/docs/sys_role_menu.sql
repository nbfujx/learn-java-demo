/*
Navicat MySQL Data Transfer

Source Server         : mysqlimis
Source Server Version : 50151
Source Host           : 10.1.51.234:3306
Source Database       : renren-security

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2017-11-07 09:35:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色ID',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色与菜单对应关系';
