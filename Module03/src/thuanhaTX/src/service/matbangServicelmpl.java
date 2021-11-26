package service;

import model.Matbang;
import repository.matbangRepositorylmpl;

import java.util.List;

public class matbangServicelmpl implements matbangService {
     public repository.matbangRepository matbangRepository = new matbangRepositorylmpl();
    @Override
    public List<Matbang> finAll() {
        return matbangRepository.finAll();
    }

    @Override
    public void save(Matbang matbang) {
        matbangRepository.save(matbang);
    }

    @Override
    public List<Matbang> finByLoai(String loai) {
        return matbangRepository.finByLoai(loai);
    }

    @Override
    public List<Matbang> finByTang(String tang) {
        return matbangRepository.finByTang(tang);
    }

    @Override
    public List<Matbang> finByGia(String gia) {
        return matbangRepository.finByGia(gia);
    }

    @Override
    public Matbang update(String id, Matbang matbang) {
        return matbangRepository.update(id,matbang);
    }

    @Override
    public void remove(String id) {
        matbangRepository.remove(id);
    }

    @Override
    public Matbang finById(String id) {
        return matbangRepository.finById(id);
    }
}
