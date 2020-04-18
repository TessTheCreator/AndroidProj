package com.example.hotelapp.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    String name;

    int stars;

    double maxPrice;

    double minPrice;

    String country;






    public Hotel(String name, int stars, double maxPrice, double minPrice, String country) {
        this.name = name;
        this.stars = stars;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
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

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                '}';
    }
}
