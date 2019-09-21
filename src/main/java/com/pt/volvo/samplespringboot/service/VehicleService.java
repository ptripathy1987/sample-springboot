package com.pt.volvo.samplespringboot.service;

import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.generators.VehicleDataGenerator;
import com.pt.volvo.samplespringboot.utils.FuelTypeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    List<Vehicle> vehicleList = new ArrayList<>();

    @PostConstruct
    public void init() {
        vehicleList = VehicleDataGenerator.generate();
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }
    public List<Vehicle> getVehicleManufacturesList(String name) {
        return vehicleList.stream().filter(vehicle -> name.equals(vehicle.getManufacturer())).collect(Collectors.toList());
    }

    public List<Vehicle> getVehicleManufacturesWithFuelList(String name, String fuelType) {

        return vehicleList.stream().filter(vehicle -> name.equals(vehicle.getManufacturer()) && FuelTypeEnum.valueOf(fuelType.toUpperCase()).equals(vehicle.getFuelType())).collect(Collectors.toList());
    }



    public List<Vehicle> getVehiclesByYearList(long year) {
        return vehicleList.stream().filter(vehicle -> year==vehicle.getYear()).collect(Collectors.toList());
    }

    public Vehicle getId(Long id) {
        return vehicleList.stream().filter(vehicle -> id==vehicle.getId())
                .findFirst().orElse(null);
    }
}
