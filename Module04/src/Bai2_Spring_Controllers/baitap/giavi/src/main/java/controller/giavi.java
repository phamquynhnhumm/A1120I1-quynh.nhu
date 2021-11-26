package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class giavi {
    @GetMapping("/giavi")
    public String giavi()
    {
        return "index";
    }

    @PostMapping("/giavi")
    public String viewgiavi(@RequestParam String[] vehicle, Model model)
    {
        String kq =" ";
        if(vehicle != null)
        {
            for(String gia :vehicle)
            {
                kq += gia + ",";
            }
        }
       else if(vehicle == null) {
           kq=" bạn hãy chọn gia vị";
        }
        System.out.println("gia vi" + vehicle);
        model.addAttribute("kq",kq);
        return "index";
    }

}
