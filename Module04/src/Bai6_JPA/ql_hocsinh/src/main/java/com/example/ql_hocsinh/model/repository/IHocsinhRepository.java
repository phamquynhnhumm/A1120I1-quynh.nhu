package com.example.ql_hocsinh.model.repository;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.swing.*;
import java.util.List;

public interface IHocsinhRepository extends JpaRepository<Hocsinh, Integer> {

    List<Hocsinh> findAll();

    List<Hocsinh> findAllByTenContaining(String ten);

    @Query(value = "select * from hocsinh where ten like %?1% and ngaysinh = ?2" , nativeQuery = true)
    List<Hocsinh> searchNameAnDate(String name, String date);

    @Query(value ="delete from hocsinh where id=?1", nativeQuery = true)
    void removeById(Integer id);

   @Query(value="update hocsinh set ten = ?1, gioitinh= ?2, ngaysinh= ?3, lophoc = ?4 where id= ?5 ", nativeQuery = true)
    Hocsinh update(Integer id, Hocsinh hocsinh);


//   Page<Hocsinh> findAllByNameContaining(String name, Pageable pageable);
}
