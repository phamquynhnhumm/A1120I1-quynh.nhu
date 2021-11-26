package com.example.ql_hocsinh.model.service;

import com.example.ql_hocsinh.model.entity.Hocsinh;
import com.example.ql_hocsinh.model.entity.LopHoc;
import org.omg.PortableInterceptor.HOLDING;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.List;

@Service
public interface LophocService {

   List<LopHoc> findAll();
//    void  save(Hocsinh hocsinh);
//    void  remove(Hocsinh hocsinh);
//    Hocsinh update(Integer id, Hocsinh hocsinh);
//    Hocsinh findById( Integer id);
//    Page<Hocsinh> findByNameContaining(String ten, Pageable pageable);
//}
}
