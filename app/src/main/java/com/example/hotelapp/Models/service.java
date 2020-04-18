package com.example.hotelapp.Models;

public class service {



    String serviceType;

    int serviceCost;

    public service(String serviceType, int serviceCost) {
        this.serviceType = serviceType;
        this.serviceCost = serviceCost;
    }

    public String getServiceType() {
        return serviceType;
    }

    public int getServiceCost() {
        return serviceCost;
    }
}
