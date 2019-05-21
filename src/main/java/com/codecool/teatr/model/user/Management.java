package com.codecool.teatr.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Management")
public abstract class Management extends User {

}
