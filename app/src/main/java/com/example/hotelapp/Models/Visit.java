package com.example.hotelapp.Models;

public class Visit {
    String hotelName;
    int roomNumber;



    public Visit(String hotelName, int roomNumber){
        this.hotelName=hotelName;
        this.roomNumber=roomNumber;

    }
    @Override
    public String toString() {
        return "Visit{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelNumber() {
        return roomNumber;
    }

    public void setHotelNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
