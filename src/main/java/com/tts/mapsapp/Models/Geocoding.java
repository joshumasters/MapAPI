package com.tts.mapsapp.Models;

public class Geocoding {
    
    private Geometry geometry;

    private AddressComponents address_components;

    public Geocoding() {
    }

    
    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
    public AddressComponents getAddress_Components() {
        return address_components;
    }

    public void setAddress_Components(AddressComponents address_components) {
        this.address_components = address_components;
    }

    @Override
    public String toString() {
        return "Geocoding [geometry=" + geometry + "]";
    }

    

    
}
