package com.example.hotelapp.Models;

public class Visit {
    String hotelName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    double cost;
    int days;


    public Visit(String hotelName, int days, double cost) {


    }


    @Override
    public String toString() {
        return "Visit{" +
                "hotelName='" + hotelName + '\'' +
                ", cost=" + cost +
                ", days=" + days +
                '}';
    }
}

