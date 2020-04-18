package com.example.hotelapp.Models;

public class Visit {
    String hotelName;
    int hotelNumber;



    public Visit(String hotelName, int number){
        this.hotelName=hotelName;
        this.hotelNumber=number;

    }
    @Override
    public String toString() {
        return "Visit{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelNumber=" + hotelNumber +
                '}';
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(int hotelNumber) {
        this.hotelNumber = hotelNumber;
    }
}
