package com.example.medicwearonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactControllers {
    @GetMapping
    public String contactPage(){
        return "contact/contact";
    }

    @ModelAttribute(name = "title")
    public String title(){
        return "Contact Page";
    }
}
