package com.codecool.teatr.controller.user;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.user.Administrator;
import com.codecool.teatr.model.user.User;
import com.codecool.teatr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/h")
    public String index2() {
        Address address = new Address("ulica", "65", "9", "00-000", "waw");
        Administrator administrator = new Administrator("Boguś", "Bo", "123@", "22222", address);
        administrator.setAddress(address);
        userService.addUser(administrator);
        return "index";
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "registerForm";
    }

    @GetMapping("/login")
    public String login() {
        return "loginPage";
    }

    @GetMapping("/users/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        Optional<User> user = userService.getUserById(id);

        if (user.isPresent()) {
            model.addAttribute("user", user);
            return "editForm";
        } else {
            return "error";
        }
    }

    @PostMapping("/users/{id}/edit")
    public String edit(@PathVariable int id,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "lastname") String lastname,
                       @RequestParam(value = "phone") String phone,
                       @RequestParam(value = "city") String city,
                       @RequestParam(value = "zipCode") String zipCode,
                       @RequestParam(value = "street") String street,
                       @RequestParam(value = "number") String number,
                       @RequestParam(value = "local") String local) {

        Optional<User> userToUpdate = userService.getUserById(id);
        Address address = userToUpdate.get().getAddress();

        userToUpdate.get().setName(name);
        userToUpdate.get().setSurname(lastname);
        userToUpdate.get().setPhone(phone);

        address.setCity(city);
        address.setZipCode(zipCode);
        address.setStreet(street);
        address.setNumber(number);
        address.setLocal(local);

        userService.addUser(userToUpdate.get());
        return "redirect:/";
    }

    @GetMapping("/users/{id}")
    public String userProfile(@PathVariable int id, Model model) {
        Optional<User> user = userService.getUserById(id);
        model.addAttribute("user", user);

        return "profilePage";

    }
}
