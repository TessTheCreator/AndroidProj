package com.example.hotelapp.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    String name;

    int stars;

    public double price;

    String country;






    public Hotel(String name, int stars, double price, String country) {
        this.name = name;
        this.stars = stars;
    this.price=price;
        this.country = country;
    }




    //generates 180 rooms with random price and status of being occupied/full













    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public double price() {
        return price;
    }

    public void price(double price) {
        this.price = price;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Hotel: "+ name + "                      Price:    "+price;
    }
}
