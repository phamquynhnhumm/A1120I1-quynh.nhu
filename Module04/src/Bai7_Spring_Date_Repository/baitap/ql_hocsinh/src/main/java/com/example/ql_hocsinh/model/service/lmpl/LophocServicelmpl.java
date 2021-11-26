package com.example.ql_hocsinh.model.service.lmpl;

import com.example.ql_hocsinh.model.entity.LopHoc;
import com.example.ql_hocsinh.model.repository.LophocRepository;
import com.example.ql_hocsinh.model.service.LophocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LophocServicelmpl implements LophocService {

    @Autowired
    private LophocRepository lophocRepository;

    @Override
    public List<LopHoc> findAll() {
        return lophocRepository.findAll();
    }
}
