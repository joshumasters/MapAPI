package com.tts.mapsapp.Models;


public class AddressComponents {
    private String long_name;

    private String short_name;

    public AddressComponents() {
    }

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    @Override
    public String toString() {
        return "AddressComponents [long_name=" + long_name + ", short_name=" + short_name + "]";
    }

    
    
}