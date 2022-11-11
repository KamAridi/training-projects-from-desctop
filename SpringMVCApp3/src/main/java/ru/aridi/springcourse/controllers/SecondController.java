package ru.aridi.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/vihod")
    public String vihod(){
        return "second/vihod";
    }
}
