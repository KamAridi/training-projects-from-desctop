package com.example.demo.controllers;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/products")
    public String showProducts(Model model){
        List<Product> p = service.showProducts();
        model.addAttribute("products", p);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        service.addProduct(product);
        List<Product> l = service.showProducts();

        model.addAttribute("products" , l);

        return "products.html";
    }
}
