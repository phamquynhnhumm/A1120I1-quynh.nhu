package com.example.ql_khachhang.controller;

import com.example.ql_khachhang.model.entity.Khachhang;
import com.example.ql_khachhang.model.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class KhachHangRest {

    @Autowired
    private KhachhangService khachhangService;

    @GetMapping(value = "/khachhangrest")
    private ResponseEntity<Page<Khachhang>> list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        // chú ý cái ResponseEntntity<?> : ? Là CáU EM MUốN TRUYềN đI OKE AH
        Sort sort = Sort.by("ten").and(Sort.by("id")).descending();
        Page<Khachhang> khachhangPage = khachhangService.findAll(PageRequest.of(page, 2, sort));

        return new ResponseEntity<>(khachhangPage, HttpStatus.OK);
        // nếu có móc khách ngoại thì nó sẽ ra vòng lặp vô hạn..... chỗ mà rứa là xong hả anh mục đích của cái kia là lamfchi á ạ

        // neu có khóa ngoiaj thì có 2 cách: @OneToMany
        // @JsonIgnore // Cách 1
        //  @JsonBackReference // Cách 2
    }

    @PostMapping("/createrest")
    private ResponseEntity<Void> createRest(@RequestBody Khachhang khachhang) {
        this.khachhangService.save(khachhang);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/editrest", method = RequestMethod.PUT)
    private ResponseEntity<?> edit(@PathVariable("id") int id, @RequestBody Khachhang khachhang) {
        Khachhang khachhangEdit = this.khachhangService.finById(id);
        if (khachhangEdit == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        khachhangEdit = khachhang;
        this.khachhangService.save(khachhangEdit);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
