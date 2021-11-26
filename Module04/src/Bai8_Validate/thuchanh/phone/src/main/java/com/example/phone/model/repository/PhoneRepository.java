package com.example.phone.model.repository;

import com.example.phone.model.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository  extends JpaRepository<Phone, Integer> {
}
