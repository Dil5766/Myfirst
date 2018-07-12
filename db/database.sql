drop table IF EXISTS Student ;
create table Student (
id int not null auto_increment,
address varchar(20) not null,
lname varchar(20) not null,
age int(3) not null,
school varchar(60),
PRIMARY KEY (id))ENGINE=InnoDB;