package com.american.used_cars_inc.repository;

import com.american.used_cars_inc.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT vehicle FROM Vehicle vehicle")
    List<Vehicle> findAllVehicles();

    @Query("SELECT vehicle FROM Vehicle vehicle WHERE vehicle.id=?1")
    Vehicle findVehicleById(long id);

    @Query("SELECT vehicle FROM Vehicle vehicle WHERE vehicle.price<=?1")
    List<Vehicle> findVehicleCheaperThan(double price);

}
