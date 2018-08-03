package com.hashmap.Organization.organization;

import com.hashmap.Organization.organization.Commodity;

public class Laptop extends Commodity
{
    private String name;
    private int price;
    public Laptop(String name,int price)
    {
        this.name=name;
        this.price=price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
