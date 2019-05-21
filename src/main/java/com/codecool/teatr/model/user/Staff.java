package com.codecool.teatr.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Staff")
public abstract class Staff extends User {
    private double paymentPerSpectacle;

}
