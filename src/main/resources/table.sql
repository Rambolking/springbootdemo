use test;
drop table `t_student`;
create table `student` (
   `id` int(10) NOT NULL AUTO_INCREMENT,
   `name` varchar(25) NOT NULL,
   `number` varchar(25) NOT NULL,
   PRIMARY KEY (`id`)
 );
insert into `t_student` (`id`, `name`, `number`) values('1','yh','121314');