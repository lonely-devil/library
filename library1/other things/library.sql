/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.7.20-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `library` (
	`id` int (11),
	`name` varchar (765),
	`count` int (11),
	`type` varchar (765)
); 
insert into `library` (`id`, `name`, `count`, `type`) values('1','html和css基础','4','自然图书');
insert into `library` (`id`, `name`, `count`, `type`) values('2','echarts入门','5','自然图书');
insert into `library` (`id`, `name`, `count`, `type`) values('3','scrapy从入门到实战','5','自然图书');
insert into `library` (`id`, `name`, `count`, `type`) values('4','jQuery入门','2','自然图书');
insert into `library` (`id`, `name`, `count`, `type`) values('5','资本论','1','文学图书');
