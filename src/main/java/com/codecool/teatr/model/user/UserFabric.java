package com.codecool.teatr.model.user;

public class UserFabric extends User {

    private User user;

    public void createUser(UserType userType) {
        switch (userType) {
            case ADMINISTRATOR:
                user = new Administrator();
                break;
            case ACTOR:
                user = new Actor();
                break;
            case ORGANISER:
                user = new Organiser();
                break;
            case TECHNICAL:
                user = new Technical();
                break;
            case SUPERVISOR:
                user = new Supervisor();
                break;
            default:
                System.out.println("Nie");
                break;
        }
        System.out.println(user);
    }
}
