use dboqlsanphamnhu;



INSERT INTO `dboqlsanphamnhu`.`khachhang` (`ma_khach_hang`, `email`, `sdt`, `ten_khach_hang`) VALUES ('kh01', 'quynhnhu@gmail.com', '0816602607', 'Phạm Quỳnh Như');
INSERT INTO `dboqlsanphamnhu`.`khachhang` (`ma_khach_hang`, `email`, `sdt`, `ten_khach_hang`) VALUES ('kh02', 'nga@gmail.com', '0815583785', 'Nguyễn Thị Nga');


create database test;
use test;


create table  Customers (
CustomerId int primary key,
CustomerName nvarchar(100),
Sex boolean,
Country nvarchar(100)
);
-- 1 là true 
INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('1', 'quỳnh nhu', '0', 'Việt Nam');
INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('2', 'Thanh Thủy', '0', 'Việt Nam');
INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('3', 'Hoàng Xoan', '0', 'Việt Nam');
INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('4', 'Nga Nguyễn', '1', ' Trung Quốc');
 INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('5', 'xxxxn', '1', ' Trung Quốc');
 INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('6','Nga Nguyễn', '0', ' Trung Quốc');
 INSERT INTO `test`.`customers` (`CustomerId`, `CustomerName`, `Sex`, `Country`) VALUES ('7', 'xxxxn', '0', ' Trung Quốc');

select  Country,count(Country) as countrys  from Customers where Sex = 0 
 GROUP BY Country
 where countrys >5 

( select count(Country) from Customers)