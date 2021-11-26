package controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class tinh {
    @GetMapping("/tinh")
    public String doi()
    {
     return "index";
    }
    @PostMapping("/tinh")
    public String tinh(@RequestParam("vnd") int vnd, Model model)
    {
        model.addAttribute("usd", vnd * 23 );
        System.out.println("dang tinh toan" + vnd * 23);
        return "index";

    }
}
