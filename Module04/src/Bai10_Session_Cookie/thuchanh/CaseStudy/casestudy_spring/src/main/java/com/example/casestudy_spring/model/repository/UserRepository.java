package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.taikhoan.User;
import com.sun.org.apache.xpath.internal.objects.XBoolean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, String> {
//    Page<User> findAllByTenContaining(String name, Pageable pageable);

    @Query(value= "select  count(tenuser) from user where tenuser = ?1 and matkhau = ?2", nativeQuery= true)
    Integer dangnhap(String tenuser, String matkhau);
}
