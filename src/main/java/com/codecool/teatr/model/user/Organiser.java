package com.codecool.teatr.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Organiser")
public class Organiser extends User {
//    private List<Spectacle> orderedSpectacles;

    private String test;

}
