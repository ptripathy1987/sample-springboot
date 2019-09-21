package com.pt.volvo.samplespringboot.payment;

import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;

import java.time.LocalDate;

public class ChequePayment implements Payment {

    private Long id;
    private Long vehicleId;
    private Long dealerId;
    private Double price;
    private LocalDate date;
    private Long bankIFSC;
    private String chequeNumber;
    private Dealer dealer;
    private Vehicle vehicle;

    public ChequePayment(Long id, Long vehicleId, Long dealerId, Double price, LocalDate date, Long bankIFSC, String chequeNumber) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.dealerId = dealerId;
        this.price = price;
        this.date = date;
        this.bankIFSC = bankIFSC;
        this.chequeNumber = chequeNumber;
    }

    @Override
    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getBankIFSC() {
        return bankIFSC;
    }

    public void setBankIFSC(Long bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }
}
