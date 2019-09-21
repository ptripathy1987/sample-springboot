package com.pt.volvo.samplespringboot.dto;

import com.pt.volvo.samplespringboot.utils.FuelTypeEnum;

public class Vehicle {

    private Long id;
    private String name;
    private String manufacturer;
    private Long year;
    private FuelTypeEnum fuelType;
    private String transmission;

    public Vehicle(Long id, String name, String manufacturer, Long year, String fuelType, String transmission) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.fuelType = FuelTypeEnum.valueOf(fuelType.toUpperCase());
        this.transmission = transmission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypeEnum fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
