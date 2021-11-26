 create database BT_ThuVien;
 use BT_ThuVien;
 


create table TheLoai (
MaTheLoai varchar(10) not null primary key,
Ten varchar(100) 
);

 create table Sach(
 MaSach varchar(10) not null primary key,
TenSach varchar(100) not null,
NXB varchar(100) not null,
TacGia varchar(100) not null,
NamXB year ,
SoLanXB int ,
img varchar(250),
MaTheLoai  varchar(10) not null ,

foreign key (MaTheLoai)  references  TheLoai(MaTheLoai)

 );
create table SinhVien(
MaSV varchar(10) not null primary key,
TenSV varchar(100) not null,
NgaySinh date,
DiaChi varchar(100),
email varchar(100),
SDT int,
img varchar(250)
);

create table PhieuMuonSach(
MaSV varchar(10) not null ,
 MaSach varchar(10) not null,
 primary key(MaSV, MaSach),
 foreign key (MaSV)  references  SinhVien(MaSV),
 foreign key ( MaSach )  references  Sach( MaSach ),
 ngaymuon date not null,
 ngaytra date not null
);