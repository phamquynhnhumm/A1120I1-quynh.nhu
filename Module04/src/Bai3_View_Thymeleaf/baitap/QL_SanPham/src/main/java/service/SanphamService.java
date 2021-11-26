package service;

import model.SanPham;

import java.util.List;

public interface SanphamService {
    List<SanPham> finAll();
    void sava(SanPham sanPham);
    SanPham finById(int id);
    void update(int id, SanPham sanPham);
    void remove(int id);
}
