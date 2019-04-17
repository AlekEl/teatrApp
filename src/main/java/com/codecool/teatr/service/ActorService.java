package com.codecool.teatr.service;

import com.codecool.teatr.dao.ActorDAO;
import com.codecool.teatr.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    @Autowired
    ActorDAO actorDAO;


    public void addActor(Actor actor){
        actorDAO.save(actor);
    }

}
