package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Address;

public class TempUser extends User {
    public TempUser(String name, String surname, String mail, String phone, Address address) {
        super(name, surname, mail, phone, address);
    }
}
