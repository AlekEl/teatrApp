package com.codecool.teatr.model.contact;

import com.codecool.teatr.model.user.User;

import javax.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @OneToOne(mappedBy = "contact")
    private User user;
    private String name;
    private String surname;
    private String mail;
    private String phone;

    public Contact(Address address, String name, String surname, String mail, String phone) {
        this.address = address;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
    }
}
