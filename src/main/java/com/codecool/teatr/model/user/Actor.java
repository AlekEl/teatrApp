package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Actor")
@DiscriminatorValue("Actor")
public class Actor extends Staff {

    public Actor(Contact contact, double paymentPerSpectacle) {
        super(contact, paymentPerSpectacle);
    }
}
