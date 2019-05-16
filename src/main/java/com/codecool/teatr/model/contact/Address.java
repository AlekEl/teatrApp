package com.codecool.teatr.model.contact;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String number;
    private String local;
    private String zipCode;
    private String city;

    @OneToOne(mappedBy = "address")
    private Contact contact;

    public Address(String street, String number, String local, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.local = local;
        this.zipCode = zipCode;
        this.city = city;
    }
}
