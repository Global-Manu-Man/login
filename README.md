## -- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: spring security, spring boot.
-- ------------------------------------------------------
-- Server version	8.0.0-dmr-log


-- Creation of user and privileges

-- create user and password

      create user 'security'@'%' identified by ''; 
-- show users

      show grants for 'security'; 

-- Validate all users;

      mysql> select user FROM mysql.user; 
      +------------------+
      | user             |
      +------------------+
      | global           |
      | java             |
      | security         |
      | mysql.infoschema |
      | mysql.session    |
      | mysql.sys        |
      | root             |
      +------------------+
      7 rows in set (0.00 sec)
      
-- create database users;

     create database users;
     
-- Show database users;

     mysql> show databases;
     +--------------------+
     | Database           |
     +--------------------+
     | information_schema |
     | mysql              |
     | performance_schema |
     | sys                |
     | users              |
     | usersdb            |
     +--------------------+
    7 rows in set (0.00 sec)
     
     
-- Gives all privileges to the new user on the newly create database.     

     grant all on users.* to 'security'@'%'; 
     
-- user database users

    USE users; 


-- Dumping data for table `users`


-- Delete in the users table if it exists, I doubt it exists in your case.

    drop table  if exists `users`; 

-- Table structure for table `user`;

-- crate table user;

    create table user (   
    
    id bigint(20) not null auto_increment,
    
    active varchar(30) not null,
    
    password varchar(10) not null,
    
    roles varchar(30) not null,
    
    user_name varchar(30) null,
    
    primary key (id)
    
    );
    
 -- insert table user.


     insert into `user` (`true`, `root`, `roles`, `user_name`)value ('activo', 'manu', 'ROLE_USER', 'Emma');


     insert into `user` (`true`, `root`, `roles`, `user_name`)value ('activo', 'manolo', 'ROLE_ADMIN', 'Emmanuel');
     

-- consult table user

     select * from user; 
     
mysql> select * from user;

      +----+--------+----------+------------+-----------+
      | id | active | password | roles      | user_name |
      +----+--------+----------+------------+-----------+
      |  1 | true   | pass     | ROLE_USER  | user      |
      |  2 | true   | pass     | ROLE_ADMIN | admin     |
      +----+--------+----------+------------+-----------+
      2 rows in set (0.00 sec)







