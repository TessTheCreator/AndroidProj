package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

//This Class for Order New Service
public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        Intent intent =getIntent();
        String Message2=intent.getStringExtra("Order");

    }

    @Override
      protected void onStop() {
          super.onStop();
          //save Data in Data Base..
          String tag="Lifecycle Step Service:";
          Log.d(tag,"In onStop Event");

      }
  }
