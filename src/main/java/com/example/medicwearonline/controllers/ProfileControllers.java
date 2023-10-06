package com.example.medicwearonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileControllers {
    @GetMapping
    public String profilePage(){
        return "profile/profile";
    }

    @ModelAttribute(name = "title")
    public String title(){
        return "Profile Page";
    }
}
