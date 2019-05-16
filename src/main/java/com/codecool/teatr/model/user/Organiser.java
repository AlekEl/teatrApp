package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Organiser")
public class Organiser extends User {
//    private List<Spectacle> orderedSpectacles;

    private String test;

    public Organiser(Contact contact, String test) {
        super(contact);
        this.test = test;
    }
}
