package service;

import model.Loai;
import repository.LoaiRepository;
import repository.LoaiRepositorylmpl;

import java.util.List;

public class LoaiServicelmpl implements  LoaiService {
    private LoaiRepository loaiRepository = new LoaiRepositorylmpl();

    @Override
    public List<Loai> finAll() {
        return loaiRepository.finAll();
    }

    @Override
    public void save(Loai loai) {
        loaiRepository.save(loai);
    }

    @Override
    public List<Loai> finByName(String name) {
        return loaiRepository.finByName(name);
    }

    @Override
    public Loai update(String id, Loai loai) {
        return loaiRepository.update(id, loai);
    }

    @Override
    public void remove(String id) {
        loaiRepository.remove(id);
    }

    @Override
    public Loai finById1(String id) {
        return loaiRepository.finById1(id);
    }
}
