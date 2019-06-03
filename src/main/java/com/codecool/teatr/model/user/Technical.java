package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Address;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Technical")
public class Technical extends Staff {
    private TechnicalFunctions technicalFunction;

    public Technical(String name, String surname, String mail, String phone, Address address, String password) {
        super(name, surname, mail, phone, address, password);
    }
}
