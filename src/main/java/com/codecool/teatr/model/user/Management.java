package com.codecool.teatr.model.user;

import com.codecool.teatr.model.spectacle.Spectacle;

import java.util.List;

public abstract class Management extends User {
    private List<Spectacle> acceptedSpectacles;
}
