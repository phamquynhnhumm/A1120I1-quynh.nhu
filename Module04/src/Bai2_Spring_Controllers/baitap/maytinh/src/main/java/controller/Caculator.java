package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    @GetMapping("/Caculator")
    public String viewCaculator ()
    {
        return "index";
    }
    @PostMapping("/Caculator")
    public String Caculator(@RequestParam int a, @RequestParam int b,@RequestParam String tinh, Model model)
    {
        int kq= 0;
        switch (tinh)
        {
            case "cong":
                kq = a+ b;
                break;
            case "tru":
                kq = a - b;
                break;
            case "nhan":
                kq = a * b;
                break;
            case "chia":
                kq = a / b;
                break;
        }
        System.out.println("đang tính kq" + kq);
        model.addAttribute("kq",kq);
        return "index";
    }
}
