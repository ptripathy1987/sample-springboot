package com.pt.volvo.samplespringboot.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.payment.CardPayment;
import com.pt.volvo.samplespringboot.payment.CashPaymentService;
import com.pt.volvo.samplespringboot.payment.ChequePayment;
import com.pt.volvo.samplespringboot.payment.ChequePaymentService;
import com.pt.volvo.samplespringboot.service.DealerService;
import com.pt.volvo.samplespringboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    VehicleService vehicleService;
    @Autowired
    DealerService dealerService;
    @Autowired
    CashPaymentService cashPaymentService;
    @Autowired
    ChequePaymentService chequePaymentService;

    public List<Vehicle> vehiclesByManufacturer(String name) {
        return vehicleService.getVehicleManufacturesList(name);
    }
    public List<Vehicle> vehiclesByManufacturerAndFuelType(String name, String fuelType) {
        if(null == fuelType)
            return vehiclesByManufacturer(name);
return vehicleService.getVehicleManufacturesWithFuelList(name,fuelType);
    }

    public List<Vehicle> getVehiclesByYearList(Long year) {
        return vehicleService.getVehiclesByYearList(year);
    }
    public List<Dealer> getDealersList() {
        return dealerService.getDealerList();
    }

    public List<CardPayment> allCardPayments() {
        return cashPaymentService.getAllCardPayments();
    }

    public List<ChequePayment> allChequePayments() {
        return chequePaymentService.getAllChequePayments();
    }

    public List<Object> allPayments() {
        List<Object> payments = new ArrayList<>();
        payments.addAll(allChequePayments());
        payments.addAll(allCardPayments());
        return payments;
    }
}
