package controller;


import model.KhachHang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.KhachhangService;
import service.KhachhangServicelmpl;

import java.util.List;

@Controller
public class KhachhangController {

    private KhachhangService khachhangService = new KhachhangServicelmpl();

    @GetMapping("/")
    public String home(Model model) {
        List<KhachHang> khachhangList = khachhangService.finAll();
        model.addAttribute("khachhangs", khachhangList);
        return "/index";
    }

    @GetMapping("/khachhang/create")
    public String showcreate(Model model) {
        model.addAttribute("khachhangs", new KhachHang());
        return "/create";

    }


    @PostMapping("/khachhang/save")
    public String save(KhachHang khachHang, Model model) {
        khachHang.setId((int) (Math.random() * 10000));
        khachhangService.sava(khachHang);
        return "redirect:/";
    }

    @GetMapping("/khachhang/edit")
    public String showedit(@RequestParam Integer id, Model model) {
        model.addAttribute("khachhangs", khachhangService.finById(id));
        return "/edit";
    }

    @PostMapping("/khachhang/edit")
    public String editkhachhang(@RequestParam Integer id, KhachHang khachHang, RedirectAttributes redirect) {
        khachhangService.update(id, khachHang);
        redirect.addFlashAttribute("message", "Ban da chinh sua khach hang: " + khachHang.getTen());
        return "redirect:/";
    }

    @GetMapping("khachhang/delete")
    public String deletekhachhang(@RequestParam Integer id, KhachHang khachHang, RedirectAttributes redirectAttributes) {
        khachhangService.remove(id);
        redirectAttributes.addFlashAttribute("delete", "Ban da xoa khach hang thành công");
        return "redirect:/";
    }

    @GetMapping("khachhang/view")
    public String viewkhachhang(@RequestParam Integer id, Model model) {
        model.addAttribute("khachhangs", khachhangService.finById(id));
        return "/view";
    }

}
