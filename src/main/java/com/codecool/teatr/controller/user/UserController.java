package com.codecool.teatr.controller.user;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.contact.Contact;
import com.codecool.teatr.model.user.Administrator;
import com.codecool.teatr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/h")
    public String index() {
        Address address = new Address("ulica","65","9","00-000","waw");
        Contact contact = new Contact(address, "Waldek", "Jakiśtam", "organiser@ccc", "99999999");
        Administrator administrator = new Administrator(contact);
        userService.addUser(administrator);
        System.out.println();
        return "mainPage";
    }
}
