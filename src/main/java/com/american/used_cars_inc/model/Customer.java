package com.american.used_cars_inc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    private long id;
    private String name;
    private String mail;

    @OneToMany
    @JoinColumn(name="customer_id")
    private List<Vehicle> vehicle;
}
