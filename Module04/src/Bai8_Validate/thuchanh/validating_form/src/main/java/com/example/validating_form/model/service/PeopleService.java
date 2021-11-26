package com.example.validating_form.model.service;

import com.example.validating_form.model.entity.People;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface PeopleService {

    void save(People people);
    void remove(People people);
    Page<People> findAll(Pageable pageable);
}
