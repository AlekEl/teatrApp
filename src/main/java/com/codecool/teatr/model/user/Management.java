package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Address;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Management")
public abstract class Management extends User {

    public Management(String name, String surname, String mail, String phone, Address address) {
        super(name, surname, mail, phone, address);
    }
}
