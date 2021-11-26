package service;

import model.Matbang;

import java.util.List;

public interface matbangService {
    List<Matbang> finAll();
    void save ( Matbang matbang);
    List<Matbang> finByLoai(String loai);
    List<Matbang> finByTang(int tang);
    List<Matbang> finByGia(float gia);
    Matbang update ( String id, Matbang matbang);
    void remove(String id);
    Matbang finById(String id);
    boolean finByIdTrung( String id);
    List<Matbang> finByLoai_Gia(String loai, float gia);
    List<Matbang> finByLoai_Tang(String loai, int tang);
    List<Matbang> finByGia_Tang(float gia, int tang);
    List<Matbang> finByLoai_Gia_Tang(String loai, float gia, int tang);
}
