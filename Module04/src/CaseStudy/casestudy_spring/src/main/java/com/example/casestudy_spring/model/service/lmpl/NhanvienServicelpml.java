package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.repository.NhanvienRepository;
import com.example.casestudy_spring.model.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanvienServicelpml  implements NhanvienService {
    @Autowired
    private NhanvienRepository nhanvienRepository;

    @Override
    public Page<NhanVien> findAll(Pageable pageable) {

        return nhanvienRepository.findAll(pageable);
    }

    @Override
    public List<NhanVien> finAll() {
        return nhanvienRepository.findAll();
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


//    @Override
//    public Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable) {
//        return nhanvienRepository.findAllByTenNhanVienContaining(name,pageable);
//    }

    @Override
    public Page<NhanVien> timkiemtheo3truong(String name, String sdt, String idbophan, Pageable pageable) {
        return nhanvienRepository.timkiem3truong(name, sdt, idbophan, pageable );
    }

//    @Override
//    public Page<NhanVien> timkiemtheo3truong(Pageable pageable,String name, Optional<String> idbophan) {
//        return null;
//    }
//
//    @Override
//    public Page<NhanVien> timkiemtheo2truong(Pageable pageable, String name) {
//        return null;
//    }
}
