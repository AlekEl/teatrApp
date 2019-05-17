package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Management")
public abstract class Management extends User {

    public Management(Contact contact) {
        super(contact);
    }
}
