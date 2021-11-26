package com.example.ql_hocsinh.model.service.lmpl;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.repository.HocsinhRepository;
import com.example.ql_hocsinh.model.service.HocsinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HocsinhServicelpml  implements HocsinhService {
    @Autowired
    private HocsinhRepository hocsinhRepository;

    @Override
    public Page<Hocsinh> findAll(Pageable pageable) {

        return hocsinhRepository.findAll(pageable);
    }

    @Override
    public void save(Hocsinh hocsinh) {

        hocsinhRepository.save(hocsinh);
    }

    @Override
    public void remove(Hocsinh hocsinh) {
        hocsinhRepository.delete(hocsinh);

    }

    @Override
    public Hocsinh update(Integer id, Hocsinh hocsinh) {
        return null;
    }

    @Override
    public Hocsinh findById(Integer id) {
        return hocsinhRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Hocsinh> findByNameContaining(String ten, Pageable pageable) {
        return hocsinhRepository.findAllByTenContaining(ten,pageable);
    }
}
