package com.pt.volvo.samplespringboot.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.service.DealerService;
import com.pt.volvo.samplespringboot.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class DealerQueryResolver implements GraphQLResolver<Dealer> {

    @Autowired
    InventoryService inventoryService;

    @Autowired
    DealerService dealerService;

    public List<Vehicle> getVehicles(Dealer dealer) {
        return inventoryService.getVehiclesForDealer(dealer.getId());
    }

    public List<Dealer> getDealers() {
        return dealerService.getDealerList();
    }
    public Dealer getDealer(Dealer dealer) {
        return dealerService.getId(dealer.getId());
    }

}
