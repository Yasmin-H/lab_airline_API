package com.example.lab_airline_API.controllers;

import com.example.lab_airline_API.models.Passenger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/passengers")
public class PassengerController {


    @GetMapping
    public ResponseEntity<Passenger>  newPassenger(){
        Passenger passenger = new Passenger("Yasmin","074353", 1);
        return new ResponseEntity<>(passenger, HttpStatus.OK);
    }








}
