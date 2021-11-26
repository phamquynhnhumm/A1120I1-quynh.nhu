package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.taikhoan.VaiTro;
import com.example.casestudy_spring.model.repository.VaitroRepository;
import com.example.casestudy_spring.model.service.VaitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaitroServicelmpl  implements VaitroService {

    @Autowired
    private VaitroRepository vaitroRepository;
//    @Override
//    public Page<VaiTro> findAll(Pageable pageable) {
//        return vaitroRepository.findAll(pageable);
//    }

    @Override
    public List<VaiTro> findAll() {
        return vaitroRepository.findAll();
    }

    @Override
    public void save(VaiTro vaiTro) {
        this.vaitroRepository.save(vaiTro);
    }

    @Override
    public void remove(VaiTro vaiTro) {
        this.vaitroRepository.delete(vaiTro);
    }

    @Override
    public VaiTro findById(String vaitro_id) {
        return vaitroRepository.findById(vaitro_id).orElse(null);
    }

//    @Override
//    public Page<VaiTro> findByNameContaining(String vaitro_id, Pageable pageable) {
//        return vaitroRepository.findAllByTenContaining(vaitro_id,pageable);
//    }
}
