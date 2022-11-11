package com.example.project.controllers;

import com.example.project.model.Product;
import com.example.project.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model) {

        var products = service.viewProduct();

        model.addAttribute("products", products);

        return "products.html";
    }

    @PostMapping("/products")
    public String addProducts(@RequestParam String name,
                              @RequestParam double price,
                              Model model) {

        Product p = new Product();
        p.setName(name);
        p.setPrice(price);

        service.addProduct(p);
        var products = service.viewProduct();

        model.addAttribute("products", products);

        return "products.html";
    }
}
