package com.example.hotelapp.Models;

import java.util.ArrayList;

public class VisitList {

    ArrayList<Visit> visit = new ArrayList<Visit>();

    public VisitList() {
        this.visit = visit;
    }

    public ArrayList<Visit> getVisit() {
        return visit;
    }

    public void setVisit(ArrayList<Visit> visit) {
        this.visit = visit;
    }

    @Override
    public String toString() {
        return "VisitList{" +
                "visit=" + visit +
                '}';
    }
}
