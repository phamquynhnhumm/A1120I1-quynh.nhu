package controller;


import model.SanPham;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.SanphamService;
import service.SanphamServicelmpl;

import java.util.List;

@Controller
public class SanphamController {

    private SanphamService sanphamService = new SanphamServicelmpl();

    @GetMapping("/")
    public String home(Model model) {
        List<SanPham> sanPhamList = sanphamService.finAll();
        model.addAttribute("sanphams", sanPhamList);
        return "/index";
    }

    @GetMapping("/sanpham/create")
    public String showcreate(Model model) {
        model.addAttribute("sanphams", new SanPham());
        return "/create";

    }


    @PostMapping("/sanpham/save")
    public String save(SanPham sanpham, Model model) {
        sanpham.setId((int) (Math.random() * 10000));
        sanphamService.sava(sanpham);
        return "redirect:/";
    }

    @GetMapping("/sanpham/edit")
    public String showedit(@RequestParam Integer id, Model model) {
        model.addAttribute("sanphams", sanphamService.finById(id));
        return "/edit";
    }

    @PostMapping("/sanpham/edit")
    public String editsanpham(@RequestParam Integer id, SanPham sanPham, RedirectAttributes redirect) {
        sanphamService.update(id, sanPham);
        redirect.addFlashAttribute("message", "Ban da chinh sua san pham " + sanPham.getTensp());
        return "redirect:/";
    }

    @GetMapping("sanpham/delete")
    public String deletesanpham(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        sanphamService.remove(id);
        redirectAttributes.addFlashAttribute("delete", "Ban da xoa san pham thanh cong!");
        return "redirect:/";
    }

    @GetMapping("sanpham/view")
    public String viewsanpham(@RequestParam Integer id, Model model) {
        model.addAttribute("sanphams", sanphamService.finById(id));
        return "/view";
    }

}
