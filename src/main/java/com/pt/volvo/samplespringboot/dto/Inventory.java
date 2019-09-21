package com.pt.volvo.samplespringboot.dto;

public class Inventory {

    private Long dealerId;
    private Long vehicleId;
    private Integer totalVehicles;

    public Inventory(Long dealerId, Long vehicleId, Integer totalVehicles) {
        this.dealerId = dealerId;
        this.vehicleId = vehicleId;
        this.totalVehicles = totalVehicles;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(Integer totalVehicles) {
        this.totalVehicles = totalVehicles;
    }
}
