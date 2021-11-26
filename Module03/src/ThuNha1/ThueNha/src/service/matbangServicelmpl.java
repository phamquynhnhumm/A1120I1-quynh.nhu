package service;

import model.Matbang;
import repository.matbangRepository;
import repository.matbangRepositorylmpl;

import java.util.List;

public class matbangServicelmpl implements  matbangService {
     public matbangRepository matbangRepository = new matbangRepositorylmpl();
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
    public List<Matbang> finByTang(int tang) {
        return matbangRepository.finByTang(tang);
    }

    @Override
    public List<Matbang> finByGia(float gia) {
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

    @Override
    public boolean finByIdTrung(String id) {
        return matbangRepository.finByIdTrung(id);
    }

    @Override
    public List<Matbang> finByLoai_Gia(String loai, float gia) {
        return matbangRepository.finByLoai_Gia(loai,gia);
    }

    @Override
    public List<Matbang> finByLoai_Tang(String loai, int tang) {
        return matbangRepository.finByLoai_Tang(loai,tang);
    }

    @Override
    public List<Matbang> finByGia_Tang(float gia, int tang) {
        return matbangRepository.finByGia_Tang(gia,tang);
    }

    @Override
    public List<Matbang> finByLoai_Gia_Tang(String loai, float gia, int tang) {
        return matbangRepository.finByLoai_Gia_Tang(loai,gia,tang);
    }
}
