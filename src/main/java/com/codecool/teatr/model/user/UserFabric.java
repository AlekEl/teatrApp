package com.codecool.teatr.model.user;

import com.codecool.teatr.model.contact.Contact;

public class UserFabric extends User {

    private User user;
    private Contact contact;

    public UserFabric(Contact contact, User user) {
        super(contact);
        this.user = user;
        this.contact = contact;
    }

   /* public void createUser(UserType userType) {
        switch (userType) {
            case ADMINISTRATOR:
                user = new Administrator(contact);
                break;
            case ACTOR:
                user = new Actor();
                break;
            case ORGANISER:
                user = new Organiser(contact,"");
                break;
            case TECHNICAL:
                user = new Technical(contact);
                break;
            case SUPERVISOR:
                user = new Supervisor(contact);
                break;
            default:
                System.out.println("Nie");
                break;
        }
        System.out.println(user);
    }*/
}
