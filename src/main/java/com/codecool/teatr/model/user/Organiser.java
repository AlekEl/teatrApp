package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Organiser")
public class Organiser extends User {

    public Organiser(Contact contact) {
        super(contact);
    }
}
