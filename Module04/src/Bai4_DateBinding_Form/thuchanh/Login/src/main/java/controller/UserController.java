package controller;

import dao.UserDao;
import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("/home")
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView("home","logind",new Login());
        return modelAndView;
    }


    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login)
    {
        System.out.println("đang login ");
        User user = UserDao.checkLogin(login);
        System.out.println("hien thi user :" + UserDao.checkLogin(login));
        if(user == null){
            System.out.println("userla : " + user);
            ModelAndView modelAndView = new ModelAndView("erroe");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
    }
}
