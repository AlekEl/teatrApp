package com.codecool.teatr.model.user;

import com.codecool.teatr.model.Address;
import com.codecool.teatr.model.Contact;
import com.codecool.teatr.model.Role;
import com.codecool.teatr.model.Spectacle;

import java.util.Date;
import java.util.List;

public abstract class User {
    private int id;
    private Contact contact;
    private List<Contact> contacts;
    private List<Role> roles;
    private List<Date> availableDates;
    private List<Spectacle> wasSpectacles;
    private List<Spectacle> addedToSpectacles;
    private double paymentPerSpectacle;
    private Address address;
    private UserType userType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Date> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<Date> availableDates) {
        this.availableDates = availableDates;
    }

    public List<Spectacle> getWasSpectacles() {
        return wasSpectacles;
    }

    public void setWasSpectacles(List<Spectacle> wasSpectacles) {
        this.wasSpectacles = wasSpectacles;
    }

    public List<Spectacle> getAddedToSpectacles() {
        return addedToSpectacles;
    }

    public void setAddedToSpectacles(List<Spectacle> addedToSpectacles) {
        this.addedToSpectacles = addedToSpectacles;
    }

    public double getPaymentPerSpectacle() {
        return paymentPerSpectacle;
    }

    public void setPaymentPerSpectacle(double paymentPerSpectacle) {
        this.paymentPerSpectacle = paymentPerSpectacle;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
