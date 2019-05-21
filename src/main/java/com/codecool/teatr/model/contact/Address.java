package com.codecool.teatr.model.contact;

import com.codecool.teatr.model.user.User;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String street;
    private String number;
    private String local;
    private String zipCode;
    private String city;

    @OneToOne(mappedBy = "address")
    private User user;

    public Address(String street, String number, String local, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.local = local;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return addressId;
    }

    public void setId(int address_id) {
        this.addressId = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + addressId +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", local='" + local + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
