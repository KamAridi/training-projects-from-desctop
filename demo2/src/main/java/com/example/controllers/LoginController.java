package com.example.controllers;

import com.example.models.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestScope
public class LoginController {

    private LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String toLogin(){
        return "login.html";
    }

    @PostMapping("/")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model){
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean solution = loginProcessor.log();
        if(solution){
            return "/main";
        }

        model.addAttribute("message", "incorrect" );

        return "login.html";
    }
}
