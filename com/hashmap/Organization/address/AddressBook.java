package com.hashmap.Organization.address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
   public void addressing() {
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Location("Pune","Midastower",411027));

        addressList.add(new Location("Amritsar","Guru AmarDas avenue",143001));
       System.out.println("address details:");
        for(int i=0;i<addressList.size();i++)
        {
            System.out.println(addressList.get(i).getCity()+" "
            +addressList.get(i).getBuilding()+" "+"-"+addressList.get(i).getPincode());
        }
    }
}
