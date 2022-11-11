package com.example.demo.controllers;

import com.example.demo.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String toLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String logging(@RequestParam String username,
                          @RequestParam String password,
                          Model model){
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean log = loginProcessor.isExist();

        if(log){
            return "redirect:/main";
        }

        model.addAttribute("message" , "Uncorrect Login or Password");
        return "login.html";
    }
}
