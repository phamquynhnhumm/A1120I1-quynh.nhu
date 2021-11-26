create database TComplex;
use TComplex;

create table Matbang(
id_matbang  nvarchar(20)  primary  key not null,
trangthai nvarchar(250) not null,
dientich float ,
tang int,
loai  nvarchar(250) ,
gia float,
ngaybatdau  nvarchar(250) ,
ngayketthuc  nvarchar(250)
);

select * from Matbang;
insert into Matbang(id_matbang,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc) value 
('IMB-11-22','Đầy đủ',23,2,'Văn phòng trọn gói',900000,'12/03/2020','1/10/2020'),
('IMB-11-21','Trống',40,4,'Văn phòng',800000,'03/02/2020','01/08/2020'),
('IMB-11-23','Hạ Tầng',34,15,'Văn phòng chia sẻ',300000,'12/01/2020','05/07/2021');


