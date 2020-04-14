package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HotelSearchResult extends AppCompatActivity {
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
        //ToDo:add listview of Hotel in Run Time as java class  ..

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, HotelList);
        ListView list_HotelRes = findViewById(R.id.list_HotelRes);
        list_HotelRes.setAdapter(listAdapter);//now you connected listView in runTime

        //Define Event Handler for this List
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(HotelSearchResult.this,Activity_HIM_DetailsList.class);
                //intent.putExtra("Hotel_id",(int)id);//or position Where your data array Object order
                startActivity(intent);
            }
        };
        list_HotelRes.setOnItemClickListener(itemClickListener);
    }
}
