package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ggdich {
    @GetMapping ("/ggdich")
    public String dich()
    {
        return "index";
    }

    @PostMapping("/ggdich")
    public String kqdich(@RequestParam ("name") String name, Model model)
    {
        if(name.equals("hello"))
        {
            System.out.println("helllo1");
            model.addAttribute("dich","xin chào");
            return "index";
        }

        if(name.equals("I love you"))
        {    System.out.println("helllo2");
            model.addAttribute("dich","Tôi yêu bạn");
            return "index";
        }

        if(name.equals("good morning"))
        {
            System.out.println("helllo3");
            model.addAttribute("dich","Chào buổi sáng quỳnh như");
            return "index";
        }
        else {
            model.addAttribute("dich","không tìm thấy kq");
            return "index";
        }

    }
}
