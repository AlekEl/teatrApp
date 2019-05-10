package com.codecool.teatr.model.spectacle;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.play.Play;
import com.codecool.teatr.model.user.User;

public class Spectacle {
    private int id;
    private Play play;
    private java.util.Date date;
    private java.util.Date startTime;
    private SpectacleType spectacleType;
    private Address spectaclePlace;
    private boolean isDealSend = false; //umowa
    private SpectacleStatus status = SpectacleStatus.NIEZATWIERDZONY;
    private User organiser;
}
