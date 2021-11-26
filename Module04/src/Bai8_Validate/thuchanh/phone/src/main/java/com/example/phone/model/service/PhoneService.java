package com.example.phone.model.service;

import com.example.phone.model.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface PhoneService {
    void  sava(Phone phone);
    Page<Phone> findAll(Pageable pageable);

}
