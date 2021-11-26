
 create table customers(
 customername varchar(50),
 phone int,
 city varchar(50),
 country varchar(50) );

select * from  customers;
insert into  customers(customername,phone,city,country) value ('Quỳnh Như',12345,'Yen sao','Việt Nam');
insert into  customers(customername,phone,city,country) value ('Ngọc Huy',67890,' Iota code','Quang Nam');
select  * from customers where city  like '%o'; /* kí tự cuối cùng là o*/
select  * from customers where city  like '%co%'; /* kí tự giữa là co*/
select  * from customers where city  in ('Yen sao',' Iota code');




 
     
  
 