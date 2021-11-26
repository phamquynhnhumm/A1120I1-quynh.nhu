package com.example.demo;

import com.example.demo.service.sanphamservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class UploadController {

    @Autowired
    private sanphamservice sanphamservice;


    @GetMapping("/")
    public String register(Model model) {
        model.addAttribute("sanphams", new sanpham());
        return "/infor";
    }

    @PostMapping("/save")
    public String save( @ModelAttribute sanphamimgform sanphamimg1,
                       Model model) {


        Infor infor = new Infor();
//        MultipartFile multipartFile = sanpham.getImg();
//        String fileName = multipartFile.getOriginalFilename();

//        MultipartFile photo = new  MultipartFile sanpham.getImg();
        sanpham.getImg();
        System.out.println(" imggggggggggggggggggggg " + sanpham.getImg() );
//        infor.setName(name);
        if (photo.isEmpty()) {
            return "infor";
        }
        Path path = Paths.get("D:\\A1120I1-PhamThiQuynhNhu\\Module04\\src\\uploadanh\\src\\main\\resources\\static\\uploads");
        try {
            InputStream inputStream = photo.getInputStream();
            Files.copy(inputStream, path.resolve(photo.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            infor.setPhotp(photo.getOriginalFilename().toLowerCase());
            model.addAttribute("INFOR", infor);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.sanphamservice.save(sanpham);
        return "/viewinfor";
    }
}
