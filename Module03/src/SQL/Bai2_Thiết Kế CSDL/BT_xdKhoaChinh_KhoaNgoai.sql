create database xdkhoachinh_khoangoai;
use  xdkhoachinh_khoangoai;

create table Customers(
customer_number varchar(10) not null primary key,
fullname varchar(100) not null,
address varchar(100) not null,
email varchar(100) not null,
phone int(10) not null
);
 create table Accounts(
 account_number varchar(10) not null primary key,
 account_type varchar(100) not null,
 date date not null,
balance float not null,
 customer_number varchar(10),
 foreign key (customer_number) references customers(customer_number)
 );
  create table Transactions(
  tran_number  varchar(10) not null primary key,
account_number varchar(10) not null,
date date not null,
amounts float not null,
 descriptions varchar(300),
    foreign key (account_number) references  Accounts(account_number)
  );
 
 