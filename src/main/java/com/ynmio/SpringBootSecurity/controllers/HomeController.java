package com.ynmio.SpringBootSecurity.controllers;

import com.ynmio.SpringBootSecurity.dao.MyUserRepository;
import com.ynmio.SpringBootSecurity.model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String publicUse(){
        return "home";
    }

    @GetMapping("/login")
        public String login(){
            return "custom_login";
        }
//    @PostMapping("/login")
//    public String loginProcessor(){
//        return "custom_login";
//    }


    @GetMapping("/user")
    public String normalUser(){
        return "normalUser";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "adminPage";
    }
}
