package service;

import model.Sanpham;

import java.util.List;

public interface SanphamService {
    List<Sanpham> finAll();
    void  save(Sanpham sanpham);
    List<Sanpham>  finByName(String name);
    Sanpham update(int id,  Sanpham sanpham);
    void remove(int id);
    Sanpham finById1(int id);
}
