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

    String Type;

    List<Room> rooms= new ArrayList<Room>();



    public Hotel(String name, int stars, double maxPrice, double minPrice, String country) {
        this.name = name;
        this.stars = stars;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.country = country;
        initilaize();;
    }




    //generates 180 rooms with random price and status of being occupied/full
    public void initilaize(){
            for(int i=0;i<180;i++){

                Random rand = new Random();

                int flag = rand.nextInt((1 - 0) + 1) + 1;

                Random rand2 = new Random();


                double price = 100.0 + (1000.0 - 100.0) * rand2 .nextDouble();
                if(flag==0){

                   Room newRoom=new Room(i,price,false);
                   rooms.add(newRoom);

                }

                    else {
                    Room newRoom=new Room(i,price,true);
                    rooms.add(newRoom);


                }

            }
    }

    public void reserveRoom(int roomIndex){
        Room temp=rooms.get(roomIndex);
        temp.reserved=true;
        rooms.set(roomIndex,temp);
    }
    public void EmptyARoom(int roomIndex){
        Room temp=rooms.get(roomIndex);
        temp.reserved=false;
        rooms.set(roomIndex,temp);
    }











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

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


}
