package com.example.dqldienthoai.model.service;

import com.example.dqldienthoai.model.entity.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface PhoneService {
    void  sava(Phone phone);
    Page<Phone> findAll(Pageable pageable);

}
