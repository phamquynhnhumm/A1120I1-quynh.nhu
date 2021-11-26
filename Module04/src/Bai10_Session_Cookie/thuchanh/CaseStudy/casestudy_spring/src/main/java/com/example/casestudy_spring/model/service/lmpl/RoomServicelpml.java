package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.dichvu.Room;
import com.example.casestudy_spring.model.repository.RoomRepository;
import com.example.casestudy_spring.model.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServicelpml  implements RoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room finById1(String name) {
        return roomRepository.findById(name).orElse(null);
    }
}
