package ru.aridi.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String sayGoodbye(@RequestParam("name") String name,
                             @RequestParam("surname") String surname) {
        System.out.println(name + surname);

        return "first/goodbye";
    }
}
