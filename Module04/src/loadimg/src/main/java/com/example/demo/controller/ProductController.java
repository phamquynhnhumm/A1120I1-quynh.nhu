package com.example.demo.controller;


import com.example.demo.enitty.Product;
import com.example.demo.enitty.ProductForm;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @Value("${upload.path}")
    private String fileUpload;

    @GetMapping ("/products")
    public String home(Model model){
        List<Product> products = (List<Product>) productService.findAll();
        model.addAttribute("products", products);
        model.addAttribute("message", "Thanh cong");
        return "/list";
    }
    @GetMapping("/products/create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new ProductForm());
        return modelAndView;
    }

    @PostMapping("/products/save")
    public String createProduct(@ModelAttribute("products") ProductForm product,Model model){

        Product product1 = new Product.ProductBuilder(product.getName()).description(product.getDescription()).build();

        MultipartFile multipartFile = product.getImage();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(product.getImage().getBytes(), new File(this.fileUpload + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        product1.setImage(fileName);
        productService.save(product1);

//        List<Product> products = (List<Product>) productService.findAll();
//        model.addAttribute("products", products);
//        model.addAttribute("message", "Thanh cong");
          return "/list";
    }
}