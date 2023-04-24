package com.example.lab_airline_API.models;

public class Passenger {

    private Long id;
    private String name;
    private String phoneNumber;

    public Passenger(String name, String phoneNumber, long id){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id=id;
    }

    public Passenger(){

    }


//    GETTERS & SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
