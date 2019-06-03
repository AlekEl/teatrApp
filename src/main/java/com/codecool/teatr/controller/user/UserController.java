package com.codecool.teatr.controller.user;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.user.Administrator;
import com.codecool.teatr.model.user.TempUser;
import com.codecool.teatr.model.user.User;
import com.codecool.teatr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/h")
    public String index2() {
        Address address = new Address("ulica","65","9","00-000","waw");
        Administrator administrator = new Administrator("Boguś","Bo","123@","22222",address);
        administrator.setAddress(address);
        userService.addUser(administrator);
        System.out.println(administrator);
        return "index";
    }
//

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public ModelAndView showRegistrationPage(ModelAndView modelAndView, TempUser user, Address address){
        modelAndView.addObject("user", user);
        modelAndView.addObject("address", address);
        modelAndView.setViewName("registerForm");
        return modelAndView;
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public ModelAndView showRegistrationPage(ModelAndView modelAndView, @Valid User user){
        userService.addUser(user);
        modelAndView.setViewName("registerForm");
        return modelAndView;
    }

    @GetMapping("/login")
    public String login(){
        return "loginPage";
    }

    @GetMapping("/user/{id}/edit")
    public String edit(){
        return "editForm";
    }
}
