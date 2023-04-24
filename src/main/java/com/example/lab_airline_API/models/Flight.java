package com.example.lab_airline_API.models;

public class Flight {

    private long id;
    private String destination;
    private int capacity;
    private String departureDate;
    private String departureTime;

    public Flight(String destination, int capacity, String departureDate, String departureTime, long id){
        this.destination = destination;
        this.capacity= capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.id = id;
    }

    public Flight(){

    }

//    GETTERS & SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
