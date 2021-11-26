package com.example.casestudy_spring.model.service.lmpl;

import com.example.casestudy_spring.model.entity.taikhoan.User;
import com.example.casestudy_spring.model.repository.UserRepository;
import com.example.casestudy_spring.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void remove(User user) {
        this.userRepository.delete(user);

    }

//    @Override
//    public Boolean dangnhap(String tenUser, String matkhau) {
//        return null;
//    }
    @Override
    public Integer dangnhap(String tenUser, String matkhau) {

        return userRepository.dangnhap(tenUser,matkhau);
    }

    @Override
    public User findById(String tenUser) {
        return userRepository.findById(tenUser).orElse(null);
    }

    @Override
    public Page<User> findByNameContaining(String tenUser, Pageable pageable) {
        return null;
    }

//    @Override
//    public Page<User> findByNameContaining(String tenUser, Pageable pageable) {
//        return userRepository.findAllByTenContaining(tenUser,pageable);
//    }
}
