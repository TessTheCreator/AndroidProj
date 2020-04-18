package com.example.hotelapp.Models;

public class customer {
    String name;

    History visitsHistory;

    public customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public History getVisitsHistory() {
        return visitsHistory;
    }

    public void setVisitsHistory(History visitsHistory) {
        this.visitsHistory = visitsHistory;
    }
}


