package com.codecool.teatr.model.contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String street;
    private String number;
    private String local;
    private String zipCode;
    private String city;
}
