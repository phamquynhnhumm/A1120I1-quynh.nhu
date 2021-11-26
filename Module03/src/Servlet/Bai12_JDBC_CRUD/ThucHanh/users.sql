create database demo;
use demo;
-- drop database demo;
create table user 
(
id int not null auto_increment primary key,
name nvarchar(120) not null,
email nvarchar(120) not null,
country nvarchar(120)
);

insert into user(name, email, country) values('nhu','nhu@gmail.com','Viet Nam');
insert into user(name, email, country) values('hanh','hanh@gmail.com','Nhat');
select * from user;
select  * from user where name ='hanh';
-- delete from user where id = 6;

select  * from user where name ='nhu';
update user  set name = 'huy',email='trugduc',country='quang Nam' where id =5;

SELECT * FROM user
ORDER BY name;

--  hiển thị theo id
DELIMITER $$
create procedure get_user_by_id(in user_id int)
begin
select user.name,user.email,user.country
from user
where user.id= user_id;
end; $$
DELIMITER ;


-- thêm mới 
DELIMITER $$
create procedure get_user_by_id(
in user_name nvarchar(50),
in user_email nvarchar(50),
in user_country nvarchar(50))
begin
insert into   user(name,email,country)
 values( user_name, user_email, user_country);
end; $$
DELIMITER ;



