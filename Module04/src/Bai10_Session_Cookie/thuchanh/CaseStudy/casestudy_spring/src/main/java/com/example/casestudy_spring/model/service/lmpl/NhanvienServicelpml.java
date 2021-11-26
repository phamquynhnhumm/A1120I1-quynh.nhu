package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.repository.NhanvienRepository;
import com.example.casestudy_spring.model.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanvienServicelpml  implements NhanvienService {
    @Autowired
    private NhanvienRepository nhanvienRepository;

    @Override
    public Page<NhanVien> findAll(Pageable pageable) {

        return nhanvienRepository.findAll(pageable);
    }

    @Override
    public void save(NhanVien nhanvien) {

        this.nhanvienRepository.save(nhanvien);
    }

    @Override
    public void remove(String id)
    {

      this.nhanvienRepository.deleteById(id);
    }

    @Override
    public NhanVien finById1(String id) {

        return nhanvienRepository.findById(id).orElse(null);
    }


    @Override
    public Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable) {
        return nhanvienRepository.findAllByTenNhanVienContaining(name,pageable);
    }
}
