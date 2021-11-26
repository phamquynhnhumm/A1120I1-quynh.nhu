create database TH_KhoaNgoai;
use  TH_KhoaNgoai;

create table customers (
i int auto_increment primary key,
name varchar(40),
address varchar(255),
email varchar(255)
);

create table orders(
id int auto_increment,
staff varchar(50),
primary key(id),
foreign key (id) references customers(i)
);

