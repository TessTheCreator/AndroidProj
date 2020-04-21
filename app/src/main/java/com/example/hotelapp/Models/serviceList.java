package com.example.hotelapp.Models;

import java.util.ArrayList;

public class serviceList {
    ArrayList<service> service = new ArrayList<service>();

    public serviceList() {
        this.service = service;
    }

    public ArrayList<com.example.hotelapp.Models.service> getService() {
        return service;
    }

    public void setService(ArrayList<com.example.hotelapp.Models.service> service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "serviceList{" +
                "service=" + service +
                '}';
    }
}
