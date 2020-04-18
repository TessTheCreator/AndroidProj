    package com.example.hotelapp.Models;

    import java.util.ArrayList;
    import java.util.List;

    public class History {

    int currentVisitIndex=0;

        List<Visit> visit=new ArrayList<Visit>();

        List<service> services=new ArrayList<service>();

        double sum=0;

        public History() {
        }

        public void AddToHistory(String hotelName, int roomIndex ){

            Visit newVisit= new Visit(hotelName,roomIndex);
            visit.add(newVisit);


        }

        public int getCurrentVisitIndex() {
            return currentVisitIndex;
        }

        public void setCurrentVisitIndex(int currentVisitIndex) {
            this.currentVisitIndex = currentVisitIndex;
        }

        public List<Visit> getVisit() {
            return visit;
        }

        public void setVisit(List<Visit> visit) {
            this.visit = visit;
        }

        public List<service> getServices() {
            return services;
        }

        public void setServices(List<service> services) {
            this.services = services;
        }

        public double getSum() {
            return sum;
        }

        public void setSum(double sum) {
            this.sum = sum;
        }
    }
