package com.example.delivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.delivery.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT status FROM Vehicle WHERE status.status = 'IDLE'")
    List<Vehicle> getVehiclesStatus();

    List<Vehicle> getVechiclesByCarryingWeightGreaterThan(float weight);
}
