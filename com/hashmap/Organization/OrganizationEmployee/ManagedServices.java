package com.hashmap.Organization.OrganizationEmployee;

public class ManagedServices extends Employee {
    private int id;
    private String name;
    private String designation;
    public ManagedServices(int id,String name,String designation)
    {
        this.designation=designation;
        this.id=id;
        this.name=name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameof(String name) {
        this.name = name;
    }

    @Override
    public String getNameof() {
        return name;
    }
}
