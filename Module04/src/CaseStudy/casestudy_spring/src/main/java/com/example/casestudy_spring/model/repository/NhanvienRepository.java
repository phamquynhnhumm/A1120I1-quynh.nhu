package com.example.casestudy_spring.model.repository;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface NhanvienRepository extends JpaRepository<NhanVien, String> {
    Page<NhanVien> findAllByTenNhanVienContaining(String name, Pageable pageable);
//    Page<NhanVien> findByTenNhanVienContainingAndSdtContainingBoPhan (Pageable pageable, String name,String sdt, Optional<String> idbophan);
//    Page<NhanVien> findByTenNhanVienContaininganhAndSdtContaining(Pageable pageable, String name,String sdt);

//    @Query(value = "select n from  nhanvien n where (n.tenNhanVien like %:tensearch% ) and (n.sdt like %:sodt%) and ( n.boPhan.idBoPhan=:idbophansearch)")
    @Query(value="select * from nhanvien where tennhanvien like %?1% and sdt like %?2% and bophan_id like %?3%",nativeQuery=true)
    Page<NhanVien> timkiem3truong(String tensearch, String sodt, String idbophansearch, Pageable pageable);

}
