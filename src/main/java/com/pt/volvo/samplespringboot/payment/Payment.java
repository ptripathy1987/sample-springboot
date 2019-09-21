package com.pt.volvo.samplespringboot.payment;

import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;

import java.time.LocalDate;

public interface Payment {
        public Long getId();
        public Long getVehicleId();
        public Long getDealerId();
        public Double getPrice();
        public LocalDate getDate();
        public Dealer getDealer();
        public Vehicle getVehicle();
}
