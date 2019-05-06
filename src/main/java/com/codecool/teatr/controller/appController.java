package com.codecool.teatr.controller;

import com.codecool.teatr.model.Actor;
import com.codecool.teatr.model.User;
import com.codecool.teatr.service.ActorService;
import com.codecool.teatr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping({"/", "/actors"})
    public String mainPage(Model model) {
        List<Actor> actors = actorService.getAllActors();
        model.addAttribute("actors", actors);
        return "mainPage";
    }

    @GetMapping("/login")
    public String login(){
        return "loginPage";
        //TODO
    }

    @GetMapping("/register")
    public String registerForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "registerForm";
    }

    @PostMapping("/register")
    public String register(User user) {
        userService.addUser(user);
        System.out.println(user);
        return "redirect: /user";
    }

    @PostMapping("/user")
    public String userDetails(User user){
        System.out.println(user);
        return "userDetails";
    }

    @GetMapping("/actor")
    public String addActorForm(Model model) {
        Actor actor = new Actor();
        model.addAttribute("actor", actor);
        return "addActorForm";
    }

    @PostMapping("/actor")
    public String addActor(Actor actor) {
        actorService.addActor(actor);
        return "redirect:/";
    }

}
