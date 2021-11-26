 create database module03;
 use module03;
 create table  danhmuc(
 id_loai nvarchar(20)  primary  key not null,
 ten_loai nvarchar(250)
 );
 create table  sanpham(
 id_sanpham  int  primary key auto_increment,
 ten_sp  nvarchar(250),
 gia float,
 soluong int,
 mausac nvarchar(250),
 mota nvarchar(2500),
 id_loai nvarchar(250),
 foreign key(id_loai) references danhmuc(id_loai) on delete cascade
 );
 
 select * from danhmuc;
  insert into sanpham(ten_sp, gia, soluong, mausac, mota,id_loai) value 
  ('Iphone 11' ,'77700','12','den, xam, xanh','dep chuan ','loai1'),
  ('Sam sung 54' ,'5050','6','den, do, xanh','dep chuan oke ','loai1'),
  ('viewSonic' ,'456789','15','do, cam','dep to rong ','loai2');
 
 insert into danhmuc( id_loai, ten_loai) value 
 ('loai1','phone'),
('loai2','tivi'),
('loai3','camera');
update sanpham set ten_sp ="quynh", gia=4, soluong=4, mausac="okr", mota="chuan",id_loai="loai2" where id_sanpham=1;

select * from danhmuc;
select * from sanpham;
select  id_sanpham, ten_sp, gia, soluong, mausac, mota, danhmuc.ten_loai from sanpham inner join danhmuc on sanpham.id_loai = danhmuc.id_loai;
select  id_sanpham, ten_sp, gia, soluong, mausac, mota, danhmuc.ten_loai from sanpham inner join danhmuc on sanpham.id_loai = danhmuc.id_loai;