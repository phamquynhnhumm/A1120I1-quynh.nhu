package com.example.blogsecurity.controller;


import com.example.blogsecurity.model.AppUser;
import com.example.blogsecurity.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.security.Principal;

@Controller
public class MainController {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "loginPage";
    }

//    @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
//    public String logoutSuccessfulPage(Model model) {
//        model.addAttribute("title", "Logout");
//        return "logoutSuccessfulPage";
//    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public String userInfo(Model model, Principal principal) {

        // Sau khi user login thanh cong se co principal
        String userName = principal.getName();

        System.out.println("User Name: " + userName);

        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        // 1 cái util( dùng chung) dùng để hiển thị principal
        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);

        return "userInfoPage";
    }

    @PostMapping("/singup")
    public String singUp(@RequestParam("username")String username, @RequestParam("password")String password) {
        AppUser appUser = new AppUser();
        appUser.setUserName(username);
        appUser.setEncrytedPassword(bCryptPasswordEncoder.encode(password));
        //save tài khoản tại đây.
        return "login";
    }


}
