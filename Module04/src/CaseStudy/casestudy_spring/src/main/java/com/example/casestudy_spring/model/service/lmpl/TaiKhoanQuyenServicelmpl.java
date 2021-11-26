package com.example.casestudy_spring.model.service.lmpl;


import com.example.casestudy_spring.model.entity.taikhoan.Quyen;
import com.example.casestudy_spring.model.repository.TaiKhoanQuyenRepo;
import com.example.casestudy_spring.model.service.TaiKhoanQuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanQuyenServicelmpl implements TaiKhoanQuyenService {

    @Autowired
    private TaiKhoanQuyenRepo taiKhoanQuyenRepo;

    @Override
    public List<Quyen> finAllQuyen(String taikhoan)
    {
        return taiKhoanQuyenRepo.findAlQuyen(taikhoan);
    }


}
