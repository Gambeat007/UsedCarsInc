package com.american.used_cars_inc.controller;

import com.american.used_cars_inc.model.Vehicle;
import com.american.used_cars_inc.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @GetMapping("/vehicles")
    public List<Vehicle> findAllVehicles() {
        return vehicleService.findAllVehicles();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle findVehicleById(@PathVariable long id) {
       return vehicleService.findVehicleById(id);
    }

    @GetMapping("/prices/{price}")
    public List<Vehicle> findVehicleCheaperThan(@PathVariable double price) {
        return vehicleService.findVehicleCheaperThan(price);
    }

}
