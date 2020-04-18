package com.example.hotelapp.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room
{
    int roomNumber;

    boolean reserved;

    double price;

    public Room(int roomNumber,double price,boolean reserved){
        this.roomNumber=roomNumber;
        this.price=price;
        this.reserved=reserved;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
