create database Th_Store_Procedure;
use Th_Store_Procedure;
DELIMITER $$
create procedure findALLCustomers()
begin 
 select * from customers;
 end; $$
 DELIMITER ;


-- gọi findAllCustomers
call  findALLCustomers();
 -- Store_Procedure không cung cấp sửa nên thường sẽ 
  drop procedure if exists  `findALLCustomers`;
 --  để thực hiện xóa và tạo mới lạ