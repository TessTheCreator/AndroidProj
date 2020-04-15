package com.example.hotelapp.Models;

public class Visit {
    String hotelName;
    int hotelNumber;

    @Override
    public String toString() {
        return "Visit{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelNumber=" + hotelNumber +
                '}';
    }

    public Visit(String hotelName, int number){
        this.hotelName=hotelName;
        this.hotelNumber=number;

    }
}
