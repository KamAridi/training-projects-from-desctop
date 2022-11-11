package ru.aridi.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/privet")
    public String sayPrivet(){
        return "first/privet";
    }
    @GetMapping("/poka")
    public String sayPoka(){
        return "first/poka";
    }
}
