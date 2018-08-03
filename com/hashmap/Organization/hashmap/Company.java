package com.hashmap.Organization.hashmap;

import com.hashmap.Organization.OrganizationEmployee.EmployeeData;
import com.hashmap.Organization.address.AddressBook;
import com.hashmap.Organization.organization.Storage;

public class Company {
    public static void main(String[] args) {
        Storage storage = new Storage();
        EmployeeData employeeData = new EmployeeData();
        AddressBook addressBook = new AddressBook();
        System.out.println("hashmap has:");
        System.out.println();
        storage.storing();
        System.out.println();
        employeeData.entry();
        System.out.println();
        addressBook.addressing();
        System.out.println();
    }
}
