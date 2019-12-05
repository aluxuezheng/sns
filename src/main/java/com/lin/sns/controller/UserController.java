package com.lin.sns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    @PostMapping("/login")
    public String login() {
        return "dashboard/index";
    }

    @GetMapping("/index")
    public String index() {
        System.out.println(123);
        return "user/index";
    }
}
