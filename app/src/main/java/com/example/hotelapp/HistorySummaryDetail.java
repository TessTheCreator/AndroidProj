package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hotelapp.Models.Visit;

public class HistorySummaryDetail extends AppCompatActivity {
TextView details=findViewById(R.id.DisplayCheckInMessage);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String info="";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_details);
        Intent intent=getIntent();
        Visit selected=(Visit)intent.getSerializableExtra("visit");
        if(selected.getDays()>1) {
            info = "You stayed at hotel:      " + selected.getHotelName() + "\n"
                    + "For " + selected.getDays() + "Days\n" +
                    "And paid a total cost of: " + selected.getCost();
        }
        else
        {
            info = "You stayed at hotel:      " + selected.getHotelName() + "\n"
                    + "For " + selected.getDays() + "Day \n" +
                    "And paid a total cost of: " + selected.getCost();
        }

        details.setText(info);






    }
}
