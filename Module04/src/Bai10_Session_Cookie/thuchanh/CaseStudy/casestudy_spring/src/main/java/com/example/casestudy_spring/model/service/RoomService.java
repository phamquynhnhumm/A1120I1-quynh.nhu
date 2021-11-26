package com.example.casestudy_spring.model.service;

import com.example.casestudy_spring.model.entity.dichvu.Room;
import com.example.casestudy_spring.model.entity.dichvu.Villa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    List<Room> findAll();
    Room finById1(String name);
}
