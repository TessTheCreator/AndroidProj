package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hotelapp.Models.VisitList;

import org.w3c.dom.Text;

public class BookingActivity extends AppCompatActivity {
    Button booking;
    VisitList list=new VisitList();

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



        }
        else {
            DisplayToast("Please put a number of days!");
        }
    }
}
