package com.codecool.teatr.model;

public class Spectacle {
    private int id;
    private Play play;
    private java.util.Date date;
    private java.util.Date startTime;
    private SpectacleType spectacleType;
    private Address spectaclePlace;
    private boolean isAcepted;
    private boolean isDealSend; //umowa
    private SpectacleStatus status;
}
