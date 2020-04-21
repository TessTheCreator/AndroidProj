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
        String Message1 =intent.getStringExtra("showList");

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,DummyList);
        ListView list_ServiceFlow  = findViewById(R.id.list_ServiceFlow);
        list_ServiceFlow.setAdapter(listAdapter);//now you connected listView in runTime


  }

}
