package com.codecool.teatr.controller;

import com.codecool.teatr.model.Actor;
import com.codecool.teatr.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class appController {

    private final
    ActorService actorService;

    @Autowired
    public appController(ActorService actorService) {
        this.actorService = actorService;
    }

    @RequestMapping(method= RequestMethod.GET)
    public String mainPage(Model model) {
        List<Actor> actors = actorService.getAllActors();
        model.addAttribute("actors", actors);
        return "mainPage";
    }
}
