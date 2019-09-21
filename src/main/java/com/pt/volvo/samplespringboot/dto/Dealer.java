package com.pt.volvo.samplespringboot.dto;

public class Dealer {

    private long id;
    private String name;
    private String address;
    private String location;
    private String phone;

    public Dealer(long id, String name, String address, String location, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.phone = phone;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
