package com.codegym.controller;

import com.codegym.service.ProducService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    private ProducService producService = new ProductServiceImpl();
    @GetMapping
    public String index(Model model){
        model.addAttribute("productMap",producService.findAll());
        return "index";
    }
}
