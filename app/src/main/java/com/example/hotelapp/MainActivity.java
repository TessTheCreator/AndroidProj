package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//A Main Activity ...
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClickSearch(View view) {
        startActivity(new Intent(this,FindHotel_Activity.class));

    }
    public void btnOnClickCheckIn(View view) {
        //startActivity(new Intent(this,HistoryListActivity.class));
       }

    public void btnOnClickHistory(View view) {
        //startActivity(new Intent(this,CheckInListActivity.class));
    }


}
