package service;

import model.Sanpham;
import repository.SanphamRepository;
import repository.SanphamRepositorylmpl;

import java.util.List;

public class Sanphamservicelmpl  implements Sanphamservice {

    private SanphamRepository repository = new SanphamRepositorylmpl();

    @Override
    public List<Sanpham> finAll() {
        return repository.finAll();
    }

    @Override
    public void save(Sanpham sanpham) {
        repository.save(sanpham);
    }

    @Override
    public Sanpham finById(int id) {
        return repository.finById(id);
    }

    @Override
    public void update(int id, Sanpham sanpham) {
        repository.update(id, sanpham);

    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public List<Sanpham> searchSanpham(String key) {
     return  repository.searchSanpham(key);
    }

}
