package com.codecool.teatr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {

    @GetMapping("/")
    public String mainPage() {
        return "mainPage";
    }
}
