/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.17-log : Database - fmtest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fmtest` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fmtest`;

/*Table structure for table `t_ball_club` */

DROP TABLE IF EXISTS `t_ball_club`;

CREATE TABLE `t_ball_club` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `money` int(11) NOT NULL COMMENT '资金',
  `reputation` int(6) NOT NULL COMMENT '声望',
  `nation` int(11) NOT NULL COMMENT '国家',
  `league` int(11) NOT NULL COMMENT '联赛',
  `levelTeam0` tinyint(1) NOT NULL COMMENT '一线队 是否组建',
  `levelTeam21` tinyint(1) NOT NULL COMMENT 'U21队 是否组建',
  `levelTeam18` tinyint(1) NOT NULL COMMENT 'U18队 是否组建',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='球员俱乐部';

/*Table structure for table `t_ball_league` */

DROP TABLE IF EXISTS `t_ball_league`;

CREATE TABLE `t_ball_league` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `maxTeamNum` int(11) NOT NULL COMMENT '最大队伍数',
  `reputation` int(6) NOT NULL COMMENT '声望',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `t_ball_nation` */

DROP TABLE IF EXISTS `t_ball_nation`;

CREATE TABLE `t_ball_nation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `reputation` int(6) DEFAULT NULL COMMENT '声望',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `t_ball_player` */

DROP TABLE IF EXISTS `t_ball_player`;

CREATE TABLE `t_ball_player` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `price` int(11) NOT NULL COMMENT '价格',
  `age` int(4) NOT NULL COMMENT '年龄',
  `sex` int(4) NOT NULL COMMENT '性别',
  `pass` int(4) NOT NULL COMMENT '传球',
  `trapping` int(4) NOT NULL COMMENT '拦截',
  `shoot` int(4) NOT NULL COMMENT '神门',
  `sense` int(4) NOT NULL COMMENT '球感',
  `position` int(4) NOT NULL COMMENT '位置',
  `club_id` bigint(13) NOT NULL COMMENT '俱乐部id',
  `team_id` bigint(13) NOT NULL COMMENT '队伍id',
  `nation_id` int(11) NOT NULL COMMENT '国家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=570 DEFAULT CHARSET=utf8;

/*Table structure for table `t_ball_team` */

DROP TABLE IF EXISTS `t_ball_team`;

CREATE TABLE `t_ball_team` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level_type` int(4) NOT NULL COMMENT 'U23 U21 U18',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COMMENT='球队';

/*Table structure for table `t_favorite_player` */

DROP TABLE IF EXISTS `t_favorite_player`;

CREATE TABLE `t_favorite_player` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) DEFAULT NULL,
  `player_id` bigint(13) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(13) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `server_id` int(11) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `money` int(11) DEFAULT NULL,
  `is_login` tinyint(1) DEFAULT NULL,
  `idname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
