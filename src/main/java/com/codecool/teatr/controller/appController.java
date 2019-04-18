package com.codecool.teatr.controller;

import com.codecool.teatr.model.Actor;
import com.codecool.teatr.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class appController {

    private final
    ActorService actorService;

    @Autowired
    public appController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping({"/", "actors"})
    public String mainPage(Model model) {
        List<Actor> actors = actorService.getAllActors();
        model.addAttribute("actors", actors);
        return "mainPage";
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
