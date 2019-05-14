package com.codecool.teatr.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Actor")
@DiscriminatorValue("Actor")
public class Actor extends Staff {

//    private List<RoleToPlay> roleToPlays;

    private String testColumn;

}
