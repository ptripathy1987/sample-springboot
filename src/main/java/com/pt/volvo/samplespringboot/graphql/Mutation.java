package com.pt.volvo.samplespringboot.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.pt.volvo.samplespringboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    VehicleService vehicleService;

    public String deleteVehicleById(Long id) {
        return vehicleService.deleteById(id);
    }
}
