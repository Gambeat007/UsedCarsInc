package com.american.used_cars_inc.service;

import com.american.used_cars_inc.model.Vehicle;
import com.american.used_cars_inc.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAllVehicles();
    }

    public Vehicle findVehicleById(long id) {
        return vehicleRepository.findVehicleById(id);
    }

    public List<Vehicle> findVehicleCheaperThan(double price) {
        return vehicleRepository.findVehicleCheaperThan(price);
    }
}
