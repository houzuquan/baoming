/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.96-community-nt : Database - yiban
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yiban` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yiban`;

/*Table structure for table `information` */

DROP TABLE IF EXISTS `information`;

CREATE TABLE `information` (
  `stuId` varchar(15) NOT NULL,
  `stuName` varchar(20) NOT NULL,
  `stuQQ` varchar(20) NOT NULL,
  `stuPhone` varchar(20) NOT NULL,
  `stuSection1` varchar(20) NOT NULL,
  `stuSection2` varchar(20) NOT NULL,
  `stuHobby` varchar(1000) NOT NULL,
  `stuJob` varchar(1000) NOT NULL,
  `stuInfo` varchar(1000) NOT NULL,
  `stuDream` varchar(1000) NOT NULL,
  PRIMARY KEY  (`stuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `information` */

insert  into `information`(`stuId`,`stuName`,`stuQQ`,`stuPhone`,`stuSection1`,`stuSection2`,`stuHobby`,`stuJob`,`stuInfo`,`stuDream`) values ('123456','黄富彬','1716850375','15240771718','技术部','宣传部','打球','易班','1233333','梦想');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
