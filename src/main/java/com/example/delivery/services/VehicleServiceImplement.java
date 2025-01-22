package com.example.delivery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.delivery.entities.Vehicle;
import com.example.delivery.repositories.VehicleRepository;

@Service
public class VehicleServiceImplement implements VehicleService {

    
    private VehicleRepository vehicleRepository;
    public VehicleServiceImplement(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);   
    }

    @Override
    public Vehicle updatVehicle(Long id, Vehicle vehicle) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatVehicle'");
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllVehicles'");
    }

    @Override
    public Vehicle getVehicleByPlateNumber(String number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVehicleByPlateNumber'");
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }


}
