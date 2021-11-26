package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.repository.NhanvienRepository;
import com.example.casestudy_spring.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class NhanvienController {
    @Autowired
    private NhanvienService nhanvienService;

     @Autowired
     private NhanvienRepository nhanvienRepository;
    @Autowired
    private TrinhdoService trinhdoService;

    @Autowired
    private VitriService vitriService;

    @Autowired
    private BophanService bophanService;

    @GetMapping(value = "/nhanvien")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model) {

        Sort sort = Sort.by("idNhanVien").and(Sort.by("tenNhanVien")).descending();
        model.addAttribute("nhanviens", this.nhanvienService.findAll(PageRequest.of(page, 5, sort)));
        return "/nhanvien/list";
    }


    @GetMapping(value = "/nhanvien/create")
    private String viewCreate(Model model) {
        model.addAttribute("nhanviens", new NhanVien());
        model.addAttribute("trinhdos", trinhdoService.findAll());
        model.addAttribute("vitris", vitriService.findAll());
        model.addAttribute("bophans", bophanService.findAll());
//        model.addAttribute("users", userService.findAll());
        return "/nhanvien/create";
    }

    @PostMapping(value = "/nhanvien/create")
    private String Create(@Valid @ModelAttribute("nhanviens") NhanVien nhanVien, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model)
    {
        new  NhanVien().validate(nhanVien, bindingResult);
        if(bindingResult.hasErrors())
        {
//            model.addAttribute("nhanviens", new NhanVien());
            model.addAttribute("trinhdos", trinhdoService.findAll());
            model.addAttribute("vitris", vitriService.findAll());
            model.addAttribute("bophans", bophanService.findAll());
            return "/nhanvien/create";

        }
        this.nhanvienService.save(nhanVien);
        redirectAttributes.addFlashAttribute("mgs","them moi thanh cong");
        return "redirect:/nhanvien";
    }


    @GetMapping(value = "/nhanvien/edit")
    private String ViewEdit(@RequestParam("id") String id, Model model) {
        model.addAttribute("nhanviens", nhanvienService.finById1(id));
        model.addAttribute("trinhdos", trinhdoService.findAll());
        model.addAttribute("vitris", vitriService.findAll());
        model.addAttribute("bophans", bophanService.findAll());
        return "/nhanvien/edit";
    }

    @PostMapping(value = "/nhanvien/edit")
    private String Edit(NhanVien nhanVien, RedirectAttributes redirectAttributes)
    {
        this.nhanvienService.save(nhanVien);
        redirectAttributes.addFlashAttribute("mgs","chỉnh sửa thanh cong");
        return "redirect:/nhanvien";
    }


    @GetMapping(value = "/nhanvien/delete/{idNhanVien}")
    public String delete(@PathVariable String idNhanVien, RedirectAttributes redirectAttributes)
    {
        this.nhanvienService.remove(idNhanVien);
        redirectAttributes.addFlashAttribute("mgs", "Xóa nhân viên thành công");
        return "redirect:/nhanvien";
    }
    @GetMapping("/nhanvien/search")
    public String searchCustomer(@RequestParam(value = "page",defaultValue ="0") int page,
                                 String tennhanvien,
                                 String sdt,
                                 String idbophan, Model model){

        model.addAttribute("tennhanvien",tennhanvien);
        model.addAttribute("idbophan",idbophan);
        model.addAttribute("sdt",sdt);
        model.addAttribute("bophamList", bophanService.findAll());
//
//        if (idbophan.equals("")) {
//            idbophan = null;
//        }
        System.out.println(tennhanvien);
        System.out.println(sdt);
        System.out.println(idbophan);
        model.addAttribute("nhanviens", nhanvienService.timkiemtheo3truong(tennhanvien,sdt,idbophan,PageRequest.of(page,10)));
//        if (idbophan.isPresent()){
//            model.addAttribute("customerListSearch", nhanvienService.timkiemtheo3truong(PageRequest.of(page,3),namecustomer,idbophan));
//        } else {
//            model.addAttribute("customerListSearch", nhanvienService.timkiemtheo2truong(PageRequest.of(page,3),namecustomer));
//        }

        return "/nhanvien/list";
    }



}
