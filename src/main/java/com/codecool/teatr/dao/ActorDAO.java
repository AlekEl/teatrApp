package com.codecool.teatr.dao;

import com.codecool.teatr.model.todelete.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDAO extends JpaRepository<Actor,Integer> {
}
