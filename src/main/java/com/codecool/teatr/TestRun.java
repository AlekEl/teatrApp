package com.codecool.teatr;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.contact.Contact;
import com.codecool.teatr.model.user.Administrator;
import com.codecool.teatr.model.user.UserFabric;
import com.codecool.teatr.model.user.UserType;
import com.codecool.teatr.service.UserService;

public class TestRun {
    public static void main(String[] args) {
//        UserFabric userFabric = new UserFabric();
//        userFabric.createUser(UserType.ACTOR);


        Address address = new Address("ulica","65","9","00-000","waw");
        Contact contact = new Contact(address, "Waldek", "Jakiśtam", "organiser@ccc", "99999999");
        Administrator administrator = new Administrator(contact);

        UserService userService = new UserService();
        userService.addUser(administrator);
    }
}
