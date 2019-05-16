package com.codecool.teatr.model.spectacle;

import com.codecool.teatr.model.contact.Address;
import com.codecool.teatr.model.play.Play;
import com.codecool.teatr.model.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Spectacle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @OneToOne
    private Play play;
    private Date date;
    private Date startTime;
    private SpectacleType spectacleType;
    /*@OneToOne
    private Address spectaclePlace;*/
    private boolean isDealSend = false; //umowa
    private SpectacleStatus status = SpectacleStatus.NIEZATWIERDZONY;
//    private User organiser;
}
