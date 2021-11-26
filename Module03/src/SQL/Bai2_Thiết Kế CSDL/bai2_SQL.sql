create database bai2;
use bai2;

create table contacts
(contact_id  int not null auto_increment,
 last_name varchar(30) not null,
fist_nam varchar(25),
 birthday date,
 primary key (contact_id)
);

-- default gán giá trị mạc đình
create table suppliers(
supplier_id int not null auto_increment,
supplier_name varchar(50) not null,
accout_rep varchar(30) not null default 'TBD',
primary key (supplier_id)
);
-- xóa bảng drop table ten;

-- thêm cột
 alter table  contacts
    add  last_name3 varchar(25)  not null
        after  contact_id;
        
-- chỉnh sửa cột
 alter table contacts
 modify last_name3 varchar(40);
 
 -- xóa cột trong bảng 
 alter table contacts
 drop column  last_name;
 
 -- thay đổi tên cột  last_name3 tên coojt cũ last_name tên cột mới
 alter table contacts
 change column last_name3 last_name
 varchar(50);
 -- thay đổi tên của bangt contact tên cũ, pepple tên mới
  alter table contacts
  rename to pepple;
 