package com.lin.sns.controller.admin;

import com.lin.sns.domain.User;
import com.lin.sns.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login() {
        return "dashboard/index";
    }

    @GetMapping("/admin/users")
    public String index(@PageableDefault(value = 15, sort = {"id"}, direction = Sort.Direction.ASC)
                        Pageable pageable, Model model) {
        Page<User> users = userService.findAll(pageable);
        model.addAttribute("users", users);
        model.addAttribute("pageNumbers", users.getTotalPages());
        return "user/index";
    }
}
