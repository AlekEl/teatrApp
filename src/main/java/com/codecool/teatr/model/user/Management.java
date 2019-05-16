package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;
import com.codecool.teatr.model.spectacle.Spectacle;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("Management")
public abstract class Management extends User {
//    @OneToMany
//    private List<Spectacle> acceptedSpectacles;


    public Management(Contact contact) {
        super(contact);
    }
}
