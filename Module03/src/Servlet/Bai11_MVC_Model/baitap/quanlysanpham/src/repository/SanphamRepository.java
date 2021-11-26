package repository;

import model.Sanpham;

import java.util.List;

public interface SanphamRepository
{
    List<Sanpham> finAll();
    void save(Sanpham sanpham);
    Sanpham finById(int id);
    void  update(int id, Sanpham sanpham);
    void remove(int id);
    List<Sanpham> searchSanpham(String key);
}
