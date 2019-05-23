package com.codecool.teatr.controller.user;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.user.Administrator;
import com.codecool.teatr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping("/h")
//    public String index2() {
//        Address address = new Address("ulica","65","9","00-000","waw");
//        Administrator administrator = new Administrator();
//        administrator.setAddress(address);
//        userService.addUser(administrator);
//        System.out.println(administrator);
//        return "mainPage";
//    }
//

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "registerForm";
    }

    @GetMapping("/login")
    public String login(){
        return "loginPage";
    }
}
