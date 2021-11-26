create database bai3_khoaChinh;
use bai3_khoaChinh;

create table users(
user_id int auto_increment primary key,
roles int not null,
username varchar(40),
 password varchar(255),
 email varchar(255)
);

-- primarykey khoá chính ," auto_icrement" id tự động tăng
 create table userroles(
user_id int  not null ,
role_id int not null,
primary key (user_id, role_id),
foreign key (user_id) references users(user_id)
 );
 
 -- tạo khóa chính khi thay đổi bảng
 alter table userroles
 

 
 
 