create  database Bt_hamthongdung;
use Bt_hamthongdung;
create table sinhvien(
id int not null primary key auto_increment,
ten nvarchar( 200),
 tuoi int ,
  khoahoac nvarchar(200),
  sotien  float
);
 insert into sinhvien(ten,tuoi,khoahoac,sotien) value
 ('hoang',21,'cntt',400000),
 ('viet',19,'dtvt',320000),
 ('thanh',18,'ktdn',400000),
 ('nhan',19,'ck',450000),
 ('huong',20,'tcnh',500000),
 ('huong',20,'tcnh',200000);
-- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong 
select * from sinhvien where ten ='huong';

--  Viết câu lệnh lấy ra tổng số tiền của Huong
select sum(sotien) from sinhvien where ten ='huong';

--  Viết câu lệnh lấy ra tên danh sách của tất cả học viên không trùng lặp
select ten ,  count(*) as soluong from sinhvien 
group by ten having count(*) <= 4 ;

create view  sinhvi as
select * from sinhvien where ten ='huong';

