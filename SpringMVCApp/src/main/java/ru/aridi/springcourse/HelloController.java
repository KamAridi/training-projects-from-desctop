package ru.aridi.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/Kamal")
    public String getNames(){
        return "names";
    }
}
