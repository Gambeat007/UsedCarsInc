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

    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }


    public Vehicle getSingleVehicle(long id) {
        return vehicleRepository.findById(id)
                .orElseThrow();
    }
}
