CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_name` varchar(25) DEFAULT NULL COMMENT '用户名',
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `sex` int(1) DEFAULT NULL COMMENT '性别 0女，1男',
  `nickname` varchar(25) DEFAULT NULL COMMENT '昵称',
  `email` varchar(30) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(25) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(25) DEFAULT NULL COMMENT '修改人',
  `is_delete` int(1) DEFAULT NULL COMMENT '删除状态，0正常 1 删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';



CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(30) DEFAULT NULL COMMENT '菜单名称',
  `menu_code` varchar(30) DEFAULT NULL COMMENT '菜单编码',
  `menu_desc` varchar(255) DEFAULT NULL COMMENT '菜单描述',
  `menu_url` varchar(255) DEFAULT NULL COMMENT '菜单访问路径',
  `menu_level` int(1) DEFAULT NULL COMMENT '菜单层级',
  `is_show` int(1) DEFAULT NULL COMMENT '是否显示，0显示1隐藏',
  `parent_menu_code` varchar(30) DEFAULT NULL COMMENT '父节级菜单编码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(25) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(25) DEFAULT NULL COMMENT '修改人',
  `is_delete` int(1) DEFAULT NULL COMMENT '删除状态，0正常 1 删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4  COMMENT='菜单表';

CREATE TABLE `sys_demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `test_name` varchar(255) DEFAULT NULL COMMENT '名称',
  `test_desc` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(25) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(25) DEFAULT NULL COMMENT '修改人',
  `is_delete` int(1) DEFAULT NULL COMMENT '删除状态，0正常 1 删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测试表';



INSERT INTO `demo`.`sys_demo` (`id`, `test_name`, `test_desc`, `create_time`, `update_time`, `create_by`, `update_by`, `is_delete`) VALUES ('1', '李四', '李四', '2020-11-21 19:41:30', '2020-11-21 19:41:32', 'admin', 'admin', '0');
INSERT INTO `demo`.`sys_demo` (`id`, `test_name`, `test_desc`, `create_time`, `update_time`, `create_by`, `update_by`, `is_delete`) VALUES ('2', '王五', '王五', '2020-11-21 19:41:30', '2020-11-21 19:41:32', 'admin', 'admin', '0');


