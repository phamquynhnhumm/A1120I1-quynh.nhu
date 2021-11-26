create database Th_truyenthamso;
use Th_truyenthamso;
-- kiểu in 
DELIMITER $$
create procedure getCusByID( in cusNum int(11))
begin
  select * from customers where customersNumber = cusNum;
  end; $$
  DELIMITER ;
  call getCusById(175);
  
  -- kiểu out
  
DELIMITER $$
create procedure getCusByID( in in_city varchar(100) , out total int)
begin
select count(customerNumber)
into total from customers
where city = in_city;
  end; $$
  DELIMITER ;
  
  call getCusByID('Lyon',@total);
  select @total
  
  -- kiểu inout
    
DELIMITER $$
  create procedure setConter( inout counter int, in inc int)
begin
set counter = counter + inc;
  end; $$
  DELIMITER ;
  
  set @counter =1;
  call setConter(@counter,1) ;--2 
  call setConter(@counter,1); --3
  call setConter(@counter,5); -- 8
  select @counter; -- 8