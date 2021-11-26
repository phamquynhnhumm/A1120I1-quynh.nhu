package service;

import model.Sanpham;
import repository.SanphamRepository;
import repository.SanphamRepositorylmpl;

import java.util.List;

public class SanphamServicelmpl implements SanphamService {
    private SanphamRepository sanphamRepository = new SanphamRepositorylmpl();
    @Override
    public List<Sanpham> finAll() {

        return sanphamRepository.finAll();
    }

    @Override
    public void save(Sanpham sanpham) {
        sanphamRepository.save(sanpham);
    }

    @Override
    public List<Sanpham> finByName(String name)
    {
        return sanphamRepository.finByName(name);
    }

    @Override
    public Sanpham update(int id, Sanpham sanpham) {

        return sanphamRepository.update(id,sanpham);
    }

    @Override
    public void remove(int id) {
        sanphamRepository.remove(id);

    }

    @Override
    public Sanpham finById1(int id) {
        return sanphamRepository.finById1(id);
    }
}
