package ru.aridi.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @GetMapping("/calculator")
    public String calculator(@RequestParam(value = "value1", required = false) int value1,
                             @RequestParam(value = "value2", required = false) int value2,
                             @RequestParam(value = "action", required = false) String action,
                             Model model){

        switch (action){
            case "plus":
                model.addAttribute("answer", value1 + value2);
                break;
            case "minus":
                model.addAttribute("answer", value1 - value2);
                break;
            case "division":
                model.addAttribute("answer", value1 / (double)value2);
                break;
            case "multi":
                model.addAttribute("answer", value1 * value2);
                break;
        }
        return "/calculator";

    }
}
