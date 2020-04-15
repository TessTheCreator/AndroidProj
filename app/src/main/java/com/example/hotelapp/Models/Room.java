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


}
