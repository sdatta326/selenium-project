create table login(
username varchar(50) not null,
password varchar(50));


insert into login values("admin", "admin@123"); 
insert into login values("naveen", "testing@123"); 


create database realestate;

use realestate;

create table contactform(
username varchar(50) not null,
email varchar(50),
subject varchar(50),
message varchar(50)
);


insert into contactform values("samama", "s@gmail.com","welcome sub","typing message here"); 
insert into contactform values("naveena", "testingnaveen@123","hello","hello msg"); 