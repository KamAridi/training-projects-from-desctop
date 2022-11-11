package com.example.demo.services;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p){
        productList.add(p);
    }

    public List<Product> showProducts(){
        return productList;
    }
}
