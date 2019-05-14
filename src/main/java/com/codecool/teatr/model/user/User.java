package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.contact.Contact;

import javax.persistence.*;

@Entity(name = "USERS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @OneToOne
    private Contact contact;
    @OneToOne
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }
}
