package com.example.medicwearonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage(){
        return "main";
    }

    @ModelAttribute(name = "title")
    public String title(){
        return "Main Page";
    }
}
