package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.nhanvien.TrinhDo;
import com.example.casestudy_spring.model.repository.TrinhdoRepository;
import com.example.casestudy_spring.model.service.TrinhdoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrinhdoServicelmpl implements TrinhdoService {
    @Autowired
    private TrinhdoRepository trinhdoRepository;

    @Override
    public List<TrinhDo> findAll() {
        return trinhdoRepository.findAll();
    }

    @Override
    public void save(TrinhDo trinhDo) {
        this.trinhdoRepository.save(trinhDo);
    }

    @Override
    public void remove(TrinhDo trinhDo) {
        this.trinhdoRepository.delete(trinhDo);

    }

    @Override
    public TrinhDo finById1(String name) {
        return trinhdoRepository.findById(name).orElse(null);
    }
}
