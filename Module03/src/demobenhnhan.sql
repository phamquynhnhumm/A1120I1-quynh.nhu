create database  benhnhan;
use benhnhan;
select * from benhnhan;
select * from benhan;
create table benhnhan(
benhnhan_id int  not null primary key  auto_increment,
tenbenhnhan  nvarchar(15) not null
);
create table benhan(
benhan_id int  not null primary key  auto_increment,
ngaynhapvien nvarchar(250) not null,
 ngayravien nvarchar(250) not null,
 lydonhapvien nvarchar(2500) not null,
 benhnhan_id int  not null,
 foreign key( benhnhan_id) references  benhnhan( benhnhan_id) on delete cascade
);
insert into benhnhan(benhnhan_id,tenbenhnhan) value
(1,'nhi'),
(2,'hanh'),
(3,'trang'),
(4,'nhung');

insert into benhan(benhan_id,ngaynhapvien, ngayravien,  lydonhapvien, benhnhan_id) value
(1,'12/05/2021','12/08/2021','hey benh roi','1'),
(2,'13/02/2021','1/06/2021','hey benh roi1','4'),
(3,'1/05/2020','12/05/2021','hey benh roi','1'),
(5,'12/05/2021','12/08/2021','hey benh roi','2');






