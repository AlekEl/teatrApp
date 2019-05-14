package com.codecool.teatr;

import com.codecool.teatr.model.user.UserFabric;
import com.codecool.teatr.model.user.UserType;

public class TestRun {
    public static void main(String[] args) {
        UserFabric userFabric = new UserFabric();
        userFabric.createUser(UserType.ACTOR);
    }
}
