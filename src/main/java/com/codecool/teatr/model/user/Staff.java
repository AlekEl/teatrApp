package com.codecool.teatr.model.user;

import com.codecool.teatr.model.spectacle.Spectacle;

import java.util.Date;
import java.util.List;

public abstract class Staff extends User {
    private double paymentPerSpectacle;
    private List<Spectacle> attendedToSpectacles;
    private List<Spectacle> addedToSpectacle;
    private List<Date> availableDates;
}
