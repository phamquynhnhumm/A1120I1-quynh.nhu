package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.hopdong.HopDongDichVuDiKem;
import com.example.casestudy_spring.model.repository.HopdongdvdikemRepository;
import com.example.casestudy_spring.model.service.HopdongdichvudikemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopdongdichvudikemServicelmpl implements HopdongdichvudikemService {
    @Autowired
    private HopdongdvdikemRepository hopdongdvdikemRepository;
    @Override
    public List<HopDongDichVuDiKem> findAll() {
        return hopdongdvdikemRepository.findAll();
    }

    @Override
    public HopDongDichVuDiKem finById1(String name) {
        return hopdongdvdikemRepository.findById(name).orElse(null);
    }
}
