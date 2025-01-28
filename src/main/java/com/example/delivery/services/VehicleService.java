package com.example.delivery.services;

import java.util.List;

import com.example.delivery.entities.Vehicle;

public interface VehicleService {
    Vehicle createVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleByPlateNumber(String plateNumber);
    void deleteVehicle(Long id);
}
