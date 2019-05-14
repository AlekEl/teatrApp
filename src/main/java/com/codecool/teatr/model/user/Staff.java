package com.codecool.teatr.model.user;

import com.codecool.teatr.model.spectacle.Spectacle;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("Staff")
public abstract class Staff extends User {
    private double paymentPerSpectacle;
    @OneToMany
    @JoinColumn
    private List<Spectacle> attendedToSpectacles;
    @OneToMany
    @JoinColumn
    private List<Spectacle> addedToSpectacle;
   /* @OneToMany
    private List<Date> availableDates;*/

    public void addBusyTerm(Date date) {
    }

    public List<Spectacle> getPlayedSpectacles() {
        return null;
    }

    public List<Spectacle> getFutureSpectacles() {
        return null;
    }

    public void exportCalendar() {
    }

    public void importCalendar() {
    }
}
