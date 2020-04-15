package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CheckIn_MainActivity extends AppCompatActivity {
   String DummyList[] ={"serves1","serves2","serves3"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in__main);
        Intent intent =getIntent();

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,DummyList);
        ListView list_ServiceFlow  = findViewById(R.id.list_ServiceFlow);
        list_ServiceFlow.setAdapter(listAdapter);//now you connected listView in runTime

        //Define Event Handler for this List
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(CheckIn_MainActivity.this,ServesSummaryDetails.class);
                intent.putExtra("ServiceFlow_id",(int)id);//or position Where your data array Object order
                startActivity(intent);
            }
        };
        list_ServiceFlow.setOnItemClickListener(itemClickListener);



  }
}
