package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.nhanvien.BoPhan;
import com.example.casestudy_spring.model.repository.BophanRepository;
import com.example.casestudy_spring.model.service.BophanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BophanServicelmpl  implements BophanService {
    @Autowired
    private BophanRepository bophanRepository;

    @Override
    public List<BoPhan> findAll() {
        return bophanRepository.findAll();
    }

    @Override
    public void save(BoPhan boPhan) {
        this.bophanRepository.save(boPhan);
    }

    @Override
    public void remove(BoPhan boPhan) {
        this.bophanRepository.delete(boPhan);

    }

    @Override
    public BoPhan finById1(String name) {
        return bophanRepository.findById(name).orElse(null);
    }
}
