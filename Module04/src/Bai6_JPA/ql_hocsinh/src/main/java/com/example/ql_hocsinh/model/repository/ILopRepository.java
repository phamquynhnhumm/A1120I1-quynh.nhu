package com.example.ql_hocsinh.model.repository;

import com.example.ql_hocsinh.model.entity.Lop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILopRepository  extends JpaRepository<Lop,Integer> {

//    @Query(value="select * from lop")
}
