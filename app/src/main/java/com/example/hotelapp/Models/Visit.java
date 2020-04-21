package com.example.hotelapp.Models;

import java.io.Serializable;

public class Visit implements Serializable {
    String hotelName;
    double cost;
    int days;
    public Visit(String hotelName, int day, double cost) {

    this.cost=cost;
    this.days=day;
    this.hotelName=hotelName;
    }

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






    @Override
    public String toString() {
        return "" +
                "hotel: '" + hotelName + '\'' +
                ",   cost: " + cost +
                ",   days: " + days +
                ' ';
    }
}

