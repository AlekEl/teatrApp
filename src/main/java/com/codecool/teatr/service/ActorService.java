package com.codecool.teatr.service;

import com.codecool.teatr.dao.ActorDAO;
import com.codecool.teatr.model.todelete.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    ActorDAO actorDAO;

    public List<Actor> getAllActors() {
        return actorDAO.findAll();
    }


    public void addActor(Actor actor){
        actorDAO.save(actor);
    }

}
