package com.hashmap.Organization.organization;

import com.hashmap.Organization.organization.Chair;
import com.hashmap.Organization.organization.Commodity;
import com.hashmap.Organization.organization.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Storage{
    public void storing() {
      //  Map<Integer,Commodity>store = new HashMap<>();
        List<Commodity> store1 = new ArrayList<>();
        store1.add(new Laptop("dell",500));
        store1.add(new Laptop("apple",500));
        store1.add(new Laptop("lenovo",300));
        store1.add(new Chair("recliner",600));
        store1.add(new Chair("normal",100));
        System.out.println("total items :");

       for(int i=0;i<store1.size();i++)
       {
           System.out.println(store1.get(i).getName()+" "+store1.get(i).getPrice());
       }



    }






}
