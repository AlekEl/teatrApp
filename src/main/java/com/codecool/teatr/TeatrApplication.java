package com.codecool.teatr;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.contact.Contact;
import com.codecool.teatr.model.user.Administrator;
import com.codecool.teatr.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeatrApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeatrApplication.class, args);
    }

}
