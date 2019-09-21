package com.pt.volvo.samplespringboot.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;
import com.pt.volvo.samplespringboot.payment.CardPayment;
import com.pt.volvo.samplespringboot.payment.ChequePayment;
import com.pt.volvo.samplespringboot.service.DealerService;
import com.pt.volvo.samplespringboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

public class CashPaymentResolver implements GraphQLResolver<CardPayment> {

    @Autowired
    DealerService dealerService;

    @Autowired
    VehicleService vehicleService;

    public Dealer getDealer(ChequePayment chequePayment) {
        return dealerService.getId(chequePayment.getId());
    }

    public Vehicle getVehicle(ChequePayment chequePayment) {
        return vehicleService.getId(chequePayment.getId());
    }
}
