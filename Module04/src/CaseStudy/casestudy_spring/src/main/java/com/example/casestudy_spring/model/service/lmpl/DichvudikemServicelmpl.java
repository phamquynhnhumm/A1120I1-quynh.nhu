package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.hopdong.DichVuDiKem;
import com.example.casestudy_spring.model.entity.khachhang.KhachHang;
import com.example.casestudy_spring.model.repository.DichvuRepository;
import com.example.casestudy_spring.model.repository.DichvudikemRepository;
import com.example.casestudy_spring.model.service.DichvudikemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichvudikemServicelmpl  implements DichvudikemService {

    @Autowired
    private DichvudikemRepository dichvudikemRepository;
    @Override
    public List<DichVuDiKem> findAll() {
        return dichvudikemRepository.findAll();
    }


    @Override
    public DichVuDiKem finById1(String name) {
        return dichvudikemRepository.findById(name).orElse(null);
    }
}
