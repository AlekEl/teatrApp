package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.contact.Contact;

import java.util.List;

public abstract class User {
    private int id;
    private Contact contact;
    private List<Contact> contacts;
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
