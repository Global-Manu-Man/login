-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: spring
-- ------------------------------------------------------
-- Server version	8.0.0-dmr-log


create user 'security'@'%' identified by ''; -- create user and password

show grants for 'security'; -- show users

select user FROM mysql.user; -- Validate all users;

create database users; -- create database users;

grant all on users.* to 'security'@'%'; -- Gives all privileges to the new user on the newly create database.

USE users; -- user database users.

--
-- Dumping data for table `users`
--

drop table  if exists `users`; -- delete in tagle usersdb.

--
-- Table structure for table `users`
--

create table user (   
    id bigint(20) not null auto_increment,
    active varchar(30) not null,
    password varchar(10) not null,
    roles varchar(30) not null,
    user_name varchar(30) null,
    primary key (id)
    );                             -- crate table users;


insert into `user` (`true`, `root`, `roles`, `user_name`)value ('activo', 'manu', 'ROLE_USER', 'Emma');
insert into `user` (`true`, `root`, `roles`, `user_name`)value ('activo', 'manolo', 'ROLE_ADMIN', 'Emmanuel');


select * from user; -- consult table user
