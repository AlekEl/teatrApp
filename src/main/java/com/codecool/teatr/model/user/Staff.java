package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Staff")
public abstract class Staff extends User {
    private double paymentPerSpectacle;

    public Staff(Contact contact, double paymentPerSpectacle) {
        super(contact);
        this.paymentPerSpectacle = paymentPerSpectacle;
    }

}
