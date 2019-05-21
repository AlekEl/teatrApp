package com.codecool.teatr.model.user;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Technical")
public class Technical extends Staff {
    private TechnicalFunctions technicalFunction;

}
