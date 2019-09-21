package com.pt.volvo.samplespringboot.service;

import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Inventory;
import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.generators.InventoryDataGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    List<Inventory> inventoryList = new ArrayList<>();
    @Autowired
    DealerService dealerService;
@Autowired
VehicleService vehicleService;
    @PostConstruct
    public void init() {
        inventoryList = InventoryDataGenerator.generate();
    }

    public List<Inventory> getInventoryList() {
        return inventoryList;
    }

    public List<Dealer> getDealersForVehicle(Long vehicleId) {
        return inventoryList.stream().filter(inventory -> vehicleId == inventory.getVehicleId())
                .map(inventory -> dealerService.getId(inventory.getDealerId()))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getVehiclesForDealer(Long dealerId) {
        return inventoryList.stream().filter(inventory -> dealerId == inventory.getDealerId())
                .map(inventory -> vehicleService.getId(inventory.getVehicleId()))
                .collect(Collectors.toList());
    }
}
