package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.taikhoan.TaiKhoan;
import com.example.casestudy_spring.model.service.TaiKhoanService;
import com.example.casestudy_spring.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class MainController {


    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public TaiKhoanService taiKhoanService;

    @GetMapping("/")
    private String trangnchu() {
        return "/trangchu";
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        // 1 cái util( dùng chung) dùng để hiển thị principal
        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "/userInfoPage";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "/signIn";
    }

    @GetMapping("/signUp")
    public String signPage(Model model) {
//        model.addAttribute("taikhoans", new TaiKhoan());
        return "/signUp";
    }

    @PostMapping("/signUp")
    public String singUp(@RequestParam String username, @RequestParam String password, TaiKhoan taiKhoan) {
        System.out.println("đã hêm tài khoản===============");
        taiKhoan.setTaiKhoan(username);
        taiKhoan.setMatKhau(bCryptPasswordEncoder.encode(password));
        taiKhoanService.save(taiKhoan);
        return "redirect:/login";
    }

    @GetMapping("/403")
    private String accessDenied(Model model, Principal principal) {
//        NguoiDung nguoiDung = nguoiDungRepo.findByTaiKhoan_TaiKhoan(principal.getName());
//        model.addAttribute("nguoiDung", nguoiDung);
        model.addAttribute("mgs", "Bạn không có quyền truy cập !");
        return "403page";
    }
}
