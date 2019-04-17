package com.codecool.teatr.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {

    private int id;
    private int salery = 0;
    private String name;
    private String lastName;


    @Autowired
    private Contact contact;
    //Lista spektakli TODO
    //Lista dat TODO


    public Actor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
