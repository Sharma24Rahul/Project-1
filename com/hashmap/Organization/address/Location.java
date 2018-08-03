package com.hashmap.Organization.address;

public class Location extends Address {
    private String city;
    private int pincode;
    private String building;

    public Location(String city,String building,int pincode)
    {
        this.building=building;
        this.city=city;
        this.pincode=pincode;

    }

    public int getPincode() {
        return pincode;
    }

    @Override
    public String getBuilding() {
        return building;
    }

    @Override
    public String getCity() {
        return city;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
