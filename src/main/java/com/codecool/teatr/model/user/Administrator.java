package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Administrator")
public class Administrator extends Management {
    public Administrator(Contact contact) {
        super(contact);
    }
}
