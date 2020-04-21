package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hotelapp.Models.Visit;
import com.example.hotelapp.Models.VisitList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Text;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity {

    VisitList b = new VisitList();
    ArrayList<Visit> bHistory = b.getVisit();

    Button booking;
    TextView hotelname;
    TextView totalPrice;
    EditText daysInput;
    String name; //the selected hotel name
    double price;//price per night
    double cost;// price* day = total cost
    int days=0; // number of days to stay in
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         booking=findViewById(R.id.btn_Booking);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Intent intent = getIntent();
         name = intent.getStringExtra("Hotel");
         price= intent.getDoubleExtra("price",0);
        hotelname=findViewById(R.id.txt_HotelName);
        hotelname.setText(name);
        daysInput=findViewById(R.id.numberOfDays);
        totalPrice=findViewById(R.id.totalPrice);

        daysInput.addTextChangedListener(new TextWatcher() {  // calculates the cost from number of days * price per day

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!(daysInput.getText().toString().matches("")||daysInput.getText().toString().matches(" ")))
                {
                    days = Integer.parseInt(daysInput.getText().toString());
                    cost = days * price;
                    totalPrice.setText("Total Cost is:" + cost);

                }
            }
        });

    }
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();


    }


    //put code for placing into database here
    public void btnOnClickHotelSearchResult(View view) {
        if(days>0){
            //make it save into the database here
            saveData();
        }
        else {
            DisplayToast("Please put a number of days!");
        }
    }

    private void saveData(){
        loadData();
        bHistory.add(new Visit(name, days, cost));
        SharedPreferences s = getSharedPreferences("VISITS", MODE_PRIVATE);
        SharedPreferences.Editor editor = s.edit();
        Gson gson = new Gson();
        String json = gson.toJson(bHistory);
        editor.putString("list", json);
        editor.apply();

        DisplayToast("Booked!");
    }

    private void loadData(){
        SharedPreferences s = getSharedPreferences("VISITS", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = s.getString("list", null);
        Type type = new TypeToken<ArrayList<Visit>>() {}.getType();
        ArrayList<Visit> load = gson.fromJson(json, type);

        bHistory = load;


    }


}
