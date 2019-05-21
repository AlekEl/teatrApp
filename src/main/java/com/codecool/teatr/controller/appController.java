package com.codecool.teatr.controller;

import com.codecool.teatr.model.todelete.Actor;
import com.codecool.teatr.model.todelete.User;
import com.codecool.teatr.service.ActorService;
import com.codecool.teatr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class appController {

    private final ActorService actorService;

    @Autowired
    private UserService userService;

    @Autowired
    public appController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "registerForm";
    }

    @GetMapping("/login")
    public String login(){
        return "loginPage";
    }

}
