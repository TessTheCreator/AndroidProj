    package com.example.hotelapp.Models;

    import java.util.ArrayList;
    import java.util.List;

    public class History {

    int currentVisitIndex=0;

        List<Visit> visit=new ArrayList<Visit>();

        List<service> services=new ArrayList<service>();

        double sum=0;

        public void AddToHistory(String hotelName,int roomIndex ){

            Visit newVisit= new Visit(hotelName,roomIndex);
            visit.add(newVisit);


        }
    }
