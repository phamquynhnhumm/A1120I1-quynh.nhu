package service;

import model.KhachHang;

import java.util.List;

public interface KhachhangService {
    List<KhachHang> finAll();
    void sava(KhachHang khachHang);
    KhachHang finById(int id);
    void update ( int id, KhachHang khachHang);
    void remove( int id);
}
