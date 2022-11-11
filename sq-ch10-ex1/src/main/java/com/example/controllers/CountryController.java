package com.example.controllers;

import com.example.models.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country getFrance(){
        Country country = Country.of("france", 69);
        return country;
    }

    @GetMapping("/all")
    public List<Country> getAll(){
        Country c1 = Country.of("france", 69);
        Country c2 = Country.of("germany", 21);
        return List.of(c1,c2);
    }
}
