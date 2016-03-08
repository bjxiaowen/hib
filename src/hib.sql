
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` varchar(20) NOT NULL DEFAULT '',
  `sname` varchar(20) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birtday` date DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('s10001', '张三', '男', '2016-03-08');
INSERT INTO `student` VALUES ('s10002', '李四', '男', '2016-03-08');
INSERT INTO `student` VALUES ('s10003', '王五', '男', '2016-03-08');
INSERT INTO `student` VALUES ('s10004', '马六', '女', '2016-03-08');


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `sid` varchar(20) NOT NULL DEFAULT '',
  `cid` varchar(20) DEFAULT NULL,
  `grade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('s10001', 'c01', '80');
INSERT INTO `score` VALUES ('s10001', 'c02', '90');
INSERT INTO `score` VALUES ('s10002', 'c01', '85');
INSERT INTO `score` VALUES ('s10002', 'c02', '80');


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` varchar(20) NOT NULL DEFAULT '',
  `cname` varchar(20) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('c01', 'Oracle数据库', '5');
INSERT INTO `course` VALUES ('c02', 'JAVA程序设计', '6');
INSERT INTO `course` VALUES ('c03', '数据结构', '4');
