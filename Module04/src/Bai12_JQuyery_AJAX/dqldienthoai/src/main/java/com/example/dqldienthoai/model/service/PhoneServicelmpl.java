package com.example.dqldienthoai.model.service;

import com.example.dqldienthoai.model.entity.Phone;
import com.example.dqldienthoai.model.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhoneServicelmpl implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;
    @Override
    public void sava(Phone phone) {
        this.phoneRepository.save(phone);
    }

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }
}
