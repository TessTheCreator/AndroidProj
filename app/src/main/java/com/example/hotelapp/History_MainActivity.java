package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class History_MainActivity extends AppCompatActivity {
  String []DummyHotelOldViset={"Hotel0_Visit","Hotel1_Visit","Hotel2_Visit","Hotel3_Visit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history__main);
        Intent intent =getIntent();
        ListView list_HistoryVisited =findViewById(R.id.list_HistoryVisited);
        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,DummyHotelOldViset);
        list_HistoryVisited.setAdapter(listAdapter);//now you connected listView in runTime

        //Define Event Handler for this List
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(History_MainActivity.this,HistorySummaryDetail.class);
                intent.putExtra("HotelVisetFlow_id",(int)id);//or position Where your data array Object order
                startActivity(intent);
            }
        };
        
        list_HistoryVisited.setOnItemClickListener(itemClickListener);
    }
}
