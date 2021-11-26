 create database quanlycongtrinh;
 use quanlycongtrinh;
 create table CongTrinh(
 MaCT varchar(10) not null primary key,
 TenCT varchar(200) not null,
 Diadiem varchar(200) not null,
 NgayCapGP date not null,
 NgayKC date not null,
 NgayHT date not null,
 );

 create table PhongBan(
 MaPB varchar(100) not null primary key,
 TenPb varchar(200) not null,
 );
 create table NhanVien (
 MaNV varchar(10) not null primary key,
 HoTen varchar(200) not null,
 NgaySinh varchar(200) not null,
 Phai varchar(200) not null,
 DiaChi varchar(200) not null,
 MaPB varchar(100) not null,
Foreign key (MaPb)  references PhongBan(MaPb),
 );
 create table CongTrinh_NhanVien(
 MaCT varchar(10) not null ,
 MaNV varchar(10) not null ,
Foreign key (MaCT)  references  CongTrinh(MaCT), 
Foreign key ( MaNV)  references  NhanVien( MaNV), 
SLNgayCong int not null,
 );
 create table BaoHiem(
 MasoBH varchar(10) not null,
 NgayCap date not null,
ThoiHan date not  null,
MaNV varchar(10) not null ,
primary key (MasoBH, MaNV),
Foreign key (MaNV)  references NhanVien(MaNV),
 );