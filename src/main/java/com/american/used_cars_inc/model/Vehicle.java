package com.american.used_cars_inc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Vehicle {

    @Id
    private long id;
    private String make;
    private String model;
    private String fuelType;
    private int prodYear;
    private double price;
}
