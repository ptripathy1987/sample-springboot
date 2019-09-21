package com.pt.volvo.samplespringboot.controller;

import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("vehicles")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @RequestMapping(path= "/getVehicles", method = RequestMethod.GET)
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getVehicleList();
    }
}
