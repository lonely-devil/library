/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.7.20-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `user` (
	`id` int (11),
	`username` varchar (765),
	`pwd` varchar (765)
); 
insert into `user` (`id`, `username`, `pwd`) values('1','admin','123456');
insert into `user` (`id`, `username`, `pwd`) values('2','sun','123456');
insert into `user` (`id`, `username`, `pwd`) values('3','wang','123456');
insert into `user` (`id`, `username`, `pwd`) values('4','deng','123456');
