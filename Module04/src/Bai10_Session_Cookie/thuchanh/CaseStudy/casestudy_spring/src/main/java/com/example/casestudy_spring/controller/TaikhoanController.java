package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.taikhoan.User;
import com.example.casestudy_spring.model.service.UserService;
import com.example.casestudy_spring.model.service.VaitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class TaikhoanController {
    @ModelAttribute("user")
    public User setUpUserForm()
    {
        return new User();
    }

    @Autowired
    private UserService userService;

    @Autowired
    private VaitroService vaitroService;

    @GetMapping(value = "/")
    private String viewDangnhap(@CookieValue(value = "setUser", defaultValue = "") String setUser,Model model, User user) {
        Cookie cookie = new Cookie("setUser",setUser);
        model.addAttribute("cookieValue", cookie);
//        model.addAttribute("users", new User());
        return "/user/list";
//        return "/trangchu/list";

    }
    @PostMapping(value = "/dangnhap")
    private String DangNhap(@ModelAttribute("user") User user, @CookieValue(value = "setUser",defaultValue = "") String setUser, HttpServletResponse response, HttpServletRequest request, @RequestParam("tenUser") String tenUser, @RequestParam("matKhau") String matKhau, RedirectAttributes redirectAttributes, Model model) {

        if (userService.dangnhap(tenUser, matKhau) == 1) {
            if(user.getTenUser()  != null)
                setUser = user.getTenUser();
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);

            Cookie[] cookies = request.getCookies();
            for(Cookie ck : cookies)
            {
                if(ck.getName().equals(tenUser))
                {
                    model.addAttribute("cookieValue",ck);
                    break;
                }
                else {
                    ck.setValue("");
                    model.addAttribute("cookieValue",ck);
                    break;
                }
            }
            model.addAttribute("mgs", "đăng nhập thành công");
            model.addAttribute("tenUsers", tenUser);
            return "/trangchu";
        } else {
            user.setTenUser("");
            Cookie cookie = new Cookie("setUser",setUser);
            model.addAttribute("cookieValue",cookie);
            model.addAttribute("mgs", "sai ten hoac  mat khau");
            return "redirect:/";
        }
    }

}
