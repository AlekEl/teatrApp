package com.codecool.teatr.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Supervisor")
public class Supervisor extends Management {
}
