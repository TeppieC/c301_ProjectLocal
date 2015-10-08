package com.example.teppie.dvdcollector.Model;

import java.util.List;

/**
 * Created by teppie on 04/10/15.
 */
public class Owner {
    private List<Owner> myFriendList;
    private Inventory myInventory;
    private Profile myProfile;

    public Owner(String userName, String contact, String city) {
        this.myInventory = new Inventory();
        this.myProfile = new Profile(userName, contact, city);
    }

}
