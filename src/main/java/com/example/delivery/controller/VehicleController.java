package com.example.delivery.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.delivery.entities.Item;
import com.example.delivery.entities.Vehicle;
import com.example.delivery.services.VehicleService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    private VehicleService vehicleService;
    
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/create-vehicle")
    ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.createVehicle(vehicle);
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping("/get-vehicle/{plateNumber}")
    ResponseEntity<Vehicle> getVehicleByPlateNumber(@PathVariable String plateNumber){
        Vehicle vehicle = vehicleService.getVehicleByPlateNumber(plateNumber);
        return ResponseEntity.ok(vehicle);
    }

    @PostMapping("add-item-to-vehicle/{plateNumber}/item/{itemId}")
    ResponseEntity<Vehicle> addItemToVehicle(@PathVariable String plateNumber, @PathVariable Long itemId) {
        Item item = itemServices.getItemById(itemId);  
    }
}
