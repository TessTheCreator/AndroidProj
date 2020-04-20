package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hotelapp.Models.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchResult extends AppCompatActivity {
        List<Hotel> hotelList;
        String country;
        int maxValue;
        int minValue;
        int stars;
        private String[] HotelList;

        private Double[] numbersResult;
        private String[] outputList;
        boolean empty=true;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        populateHotels();
        collectDataFromPrevious();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_search_result);

        HotelList=search(country,minValue,maxValue,stars);
        if(empty==false) {



            ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, outputList);
            ListView list_HotelRes = findViewById(R.id.list_HotelRes);
            list_HotelRes.setAdapter(listAdapter);//now you connected listView in runTime

            //Define Event Handler for this List
            AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(HotelSearchResult.this,BookingActivity.class);
                    double price=numbersResult[position];
                    String name=HotelList[position];
                    intent.putExtra("Hotel",name);
                    intent.putExtra("price",price);
                    startActivity(intent);
                }
            };
            list_HotelRes.setOnItemClickListener(itemClickListener);
        }
        else
            DisplayToast("Sorry, no results");
    }



    private void collectDataFromPrevious(){
       this.country= getIntent().getStringExtra("Country");
        this.minValue=getIntent().getIntExtra("min",0);
        this.maxValue=getIntent().getIntExtra("max",0);
        this.stars=getIntent().getIntExtra("stars",0);
    }



    private String[] search(String country, int minValue,int maxValue,int stars){
                List<String> results=new ArrayList<String>();
                List<Double> results2=new ArrayList<Double>();
                List<String> output=new ArrayList<String>();
                String[] StringResults;
            for(int i=0;i<hotelList.size();i++){
               Hotel temp= hotelList.get(i);
                if(country.matches(temp.getCountry() ) &&  (temp.price>=minValue )&& (temp.price<=maxValue )   && stars==temp.getStars()){
                    results.add(temp.getName());
                   results2.add(temp.getPrice());
                   output.add(temp.getName()+"                   "+"Price per night: "+temp.getPrice());
                    empty=false;

                }

            }
            StringResults = new String[results.size()];
            numbersResult=new Double[results2.size()];
            outputList=new String[output.size()];

        if(results.isEmpty()==true)
            {
                DisplayToast("No Results");
            }
            else {
                for (int j = 0; j < results.size(); j++) {
                    StringResults[j] = results.get(j);
                   this.numbersResult[j]= results2.get(j);
                   outputList[j]=output.get(j);

                }
            }
        return StringResults;




    }

    private void populateHotels(){

        hotelList=new ArrayList<Hotel>();
        hotelList.add(new Hotel("City inn",1,1000,"Palestine"));
        hotelList.add(new Hotel("Grand park",4,10000,"Morocco"));
        hotelList.add(new Hotel("Move n pick",3,5000,"Saudi Arabia"));
        hotelList.add(new Hotel("CMarriott",2,3000,"Egypt"));
        hotelList.add(new Hotel("Hyatt",3,2000,"Jordan"));
        hotelList.add(new Hotel("Mandarin Oriental",1,100,"Palestine"));
        hotelList.add(new Hotel("Kings Inn",4,50,"Palestine"));
        hotelList.add(new Hotel("Roadside",3,500,"Jordan"));
        hotelList.add(new Hotel("Quaint Mote",4,400,"Jordan"));
        hotelList.add(new Hotel("City inn",5,700,"Jordan"));
        hotelList.add(new Hotel("Better And Better",1,900,"Jordan"));
        hotelList.add(new Hotel("The Worldly Traveler",2,5000,"Egypt"));
        hotelList.add(new Hotel("City inn",4,1000,"Egypt"));
        hotelList.add(new Hotel("City inn",1,2000,"Egypt"));
        hotelList.add(new Hotel("City inn",3,3000,"Egypt"));
        hotelList.add(new Hotel("City inn",4,90000,"Morocco"));
        hotelList.add(new Hotel("City inn",4,400,"Morocco"));

        hotelList.add(new Hotel("City inn",4,10000,"Morocco"));
        hotelList.add(new Hotel("City inn",1,800,"Saudi Arabia"));
        hotelList.add(new Hotel("City inn",4,10000,"Morocco"));
        hotelList.add(new Hotel("City inn",2,100,"Saudi Arabia"));
        hotelList.add(new Hotel("City inn",4,10000,"Morocco"));
        hotelList.add(new Hotel("City inn",5,5400,"Saudi Arabia"));






    }

    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();


    }
}
