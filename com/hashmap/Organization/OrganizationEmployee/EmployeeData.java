package com.hashmap.Organization.OrganizationEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public void entry() {
        List<Employee>database = new ArrayList<>();
        database.add(new ManagedServices(1,"rdx","admin"));
        database.add(new ManagedServices(2,"terminator","senior admin"));
        database.add(new Development(3,"joey","junior developer"));
        database.add(new Development(4,"chan","senior developer"));
        System.out.println("employees details:");
        for (int i=0;i<database.size();i++)
        {
            System.out.println(database.get(i).getId()+" "+
                    database.get(i).getNameof()+" "+database.get(i).getDesignation());
        }
    }
}
