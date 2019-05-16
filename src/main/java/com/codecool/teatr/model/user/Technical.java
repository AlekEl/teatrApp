package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Technical")
public class Technical extends Staff {
    private TechnicalFunctions technicalFunction;

    public Technical(Contact contact, double paymentPerSpectacle, TechnicalFunctions technicalFunction) {
        super(contact, paymentPerSpectacle);
        this.technicalFunction = technicalFunction;
    }
}
