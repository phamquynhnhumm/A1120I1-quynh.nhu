package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.hopdong.HopDong;
import com.example.casestudy_spring.model.repository.HopdongRepository;
import com.example.casestudy_spring.model.service.HopdongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HopdongServicelmpl  implements HopdongService {
    @Autowired
    private HopdongRepository hopdongRepository;

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return hopdongRepository.findAll(pageable);
    }

    @Override
    public void save(HopDong hopDong) {
        hopdongRepository.save(hopDong);
    }

    @Override
    public void remove(String id) {
        hopdongRepository.deleteById(id);
    }

    @Override
    public HopDong finById1(String id) {
        return hopdongRepository.findById(id).orElse(null);
    }
}
