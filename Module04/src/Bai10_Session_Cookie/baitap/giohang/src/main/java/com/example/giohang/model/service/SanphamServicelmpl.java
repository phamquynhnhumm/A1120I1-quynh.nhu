package com.example.giohang.model.service;

import com.example.giohang.model.entity.SanPham;
import com.example.giohang.model.repository.SanphamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;
import java.util.List;
@Service
public class SanphamServicelmpl  implements  SanphamService{
    @Autowired
    private SanphamRepository sanphamRepository;
    @Override
    public List<SanPham> findAll() {
        return sanphamRepository.findAll();
    }

    @Override
    public void save(SanPham sanPham) {
        sanphamRepository.save(sanPham);

    }

    @Override
    public void remove(SanPham sanPham) {
        sanphamRepository.delete(sanPham);
    }


    @Override
    public SanPham finById(Integer id) {

        return sanphamRepository.getById(id);
    }
}
