package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Controller
public class UploadController {


    @GetMapping("/")
    public String register() {
        return "/infor";
    }

    @PostMapping("/save")
    public String save(@RequestParam("name") String name,
                       @RequestParam("photo") MultipartFile photo,
                       @RequestParam("filecv") MultipartFile filecv, Model model) {
        Infor infor = new Infor();
        infor.setName(name);
        if (photo.isEmpty() || filecv.isEmpty()) {

            return "infor";

        }
        Path path = Paths.get("uploads");
        try{
            InputStream inputStream = photo.getInputStream();
            Files.copy(inputStream, path.resolve(photo.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            infor.setPhotp(photo.getOriginalFilename().toLowerCase());
            //
            //
             inputStream = filecv.getInputStream();
            Files.copy(inputStream, path.resolve(filecv.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

            model.addAttribute("INFOR",infor);
            model.addAttribute("FILE_NAME",filecv.getOriginalFilename());
            model.addAttribute("FILE_TYPE",filecv.getContentType());
            model.addAttribute("FILE_SIZE",filecv.getSize());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "/viewinfor";
    }

}
