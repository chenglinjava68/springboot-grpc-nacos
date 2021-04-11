CREATE TABLE `tbl_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `nick` varchar(255) NOT NULL DEFAULT '' COMMENT '昵称',
  `email` varchar(255) NOT NULL DEFAULT '' COMMENT '邮件',
  `phone` varchar(255) DEFAULT '' COMMENT '手机号',
  `balance` decimal(10,0) DEFAULT '0' COMMENT '余额',
  `date` datetime DEFAULT NULL COMMENT '出生日期',
  `flag` bigint(10) DEFAULT '0' COMMENT '标志',
  `vip` tinyint(10) DEFAULT '0' COMMENT '是否vip',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

