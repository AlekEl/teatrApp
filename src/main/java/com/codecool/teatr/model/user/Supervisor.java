package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Supervisor")
public class Supervisor extends Management {
    public Supervisor(Contact contact) {
        super(contact);
    }
}
