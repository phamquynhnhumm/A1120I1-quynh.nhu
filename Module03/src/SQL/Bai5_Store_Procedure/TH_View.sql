create database TH_View;
use TH_View;
create view  customer_views
as select customerNumber, customerName, phone  from customers;
-- cập nhật view 
create or replace view customer_views
as select customerNumber, customerName, phone  from customers
where city='Nantes' ;
-- xóa view 
drop view  customer_views