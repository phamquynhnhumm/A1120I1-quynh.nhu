package repository;

import model.Loai;

import java.util.List;

public interface LoaiRepository {
    List<Loai> finAll();
    void  save(Loai loai);
    List<Loai>  finByName(String name);
    Loai update(String id,  Loai loai);
    void remove(String id);
    Loai finById1(String id);
}
