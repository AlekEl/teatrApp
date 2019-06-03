package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Address;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Supervisor")
public class Supervisor extends Management {
    public Supervisor(String name, String surname, String mail, String phone, Address address) {
        super(name, surname, mail, phone, address);
    }
}
