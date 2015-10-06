package com.example.teppie.dvdcollector.Model;

/**
 * Created by teppie on 04/10/15.
 */
public class Profile {
    private String userName;
    private String contactInfo;
    private String city;

    public Profile(String userName) {
        this.userName = userName;
    }

    public Profile(String userName, String contactInfo, String city) {
        this.userName = userName;
        this.contactInfo = contactInfo;
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
