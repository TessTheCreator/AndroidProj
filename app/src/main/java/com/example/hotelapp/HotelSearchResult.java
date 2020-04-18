package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hotelapp.Models.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelSearchResult extends AppCompatActivity {
        List<Hotel> hotelList;
        String country;
        int maxValue;
        int minValue;
        int stars;






    //This list must Be from Result Search ..
    private String[] HotelList = {
            "Dwight D. Eisenhower",
            "Palestine Plaza",
            "21St Floor 360 Suitop",
            "Harmony an Atlas Boutique Hotel",
            "Crowne Plaza Jerusalem",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hotel_search_result);

        collectDataFromPrevious();   // reads data from the search result

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, HotelList);
        ListView list_HotelRes = findViewById(R.id.list_HotelRes);
        list_HotelRes.setAdapter(listAdapter);//now you connected listView in runTime

        //Define Event Handler for this List
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(HotelSearchResult.this,Activity_HIM_DetailsList.class);
                intent.putExtra("Hotel_id",(int)id);//or position
                startActivity(intent);
            }
        };
        list_HotelRes.setOnItemClickListener(itemClickListener);
    }



    private void collectDataFromPrevious(){
        country= getIntent().getStringExtra("Country");
        minValue=getIntent().getIntExtra("min",0);
        minValue=getIntent().getIntExtra("max",0);
        stars=getIntent().getIntExtra("stars",0);
    }


    private String[] search(String country, int minValue,int maxValue,int stars){




    }

    private void populateHotels(){

        hotelList=new ArrayList<Hotel>();
        hotelList.add(new Hotel("City inn",1,1000,100,"Palestine"));
        hotelList.add(new Hotel("City inn",4,10000,100,"Morocco"));
        hotelList.add(new Hotel("City inn",3,5000,100," Saudi Arabia"));
        hotelList.add(new Hotel("City inn",2,3000,100,"Palestine"));
        hotelList.add(new Hotel("City inn",3,2000,100,"Palestine"));
        hotelList.add(new Hotel("City inn",1,100,100,"Palestine"));
        hotelList.add(new Hotel("City inn",4,50,100,"Palestine"));
       </item>
        <item>  </item>
        <item>Jordan</item>
        <item>Egypt





    }
}
