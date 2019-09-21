package com.pt.volvo.samplespringboot.payment;

import com.pt.volvo.samplespringboot.dto.Dealer;
import com.pt.volvo.samplespringboot.dto.Vehicle;

import java.time.LocalDate;

public class CardPayment implements Payment {
    private Long id;
    private Long vehicleId;
    private Long dealerId;
    private Double price;
    private LocalDate date;
    private String cardNumber;
    private String cardType;
    private Dealer dealer;
    private Vehicle vehicle;

    public CardPayment(Long id, Long vehicleId, Long dealerId, Double price, LocalDate date, String cardNumber, String cardType) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.dealerId = dealerId;
        this.price = price;
        this.date = date;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
