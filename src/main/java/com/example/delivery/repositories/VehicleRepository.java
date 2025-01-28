package com.example.delivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.delivery.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT v FROM Vehicle v WHERE v.status = :status")
    List<Vehicle> getVehiclesStatus(@Param("status") String status);

    List<Vehicle> getVechiclesByCarryingWeightGreaterThan(float weight);

    Vehicle getVehicleByPlateNumber(String plateNumber);
}
