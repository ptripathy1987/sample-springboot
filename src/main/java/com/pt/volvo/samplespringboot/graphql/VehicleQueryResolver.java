package com.pt.volvo.samplespringboot.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.service.InventoryService;
import com.pt.volvo.samplespringboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VehicleQueryResolver implements GraphQLResolver<Vehicle> {

    @Autowired
    InventoryService inventoryService;
    @Autowired
    VehicleService vehicleService;

    public List<Dealer> getDealers(Vehicle vehicle) {
        return inventoryService.getDealersForVehicle(vehicle.getId());
    }

    public Vehicle getVehicle(Vehicle vehicle) {
        return vehicleService.getId(vehicle.getId());
    }
}
