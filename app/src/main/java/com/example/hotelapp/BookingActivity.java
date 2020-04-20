package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class BookingActivity extends AppCompatActivity {
    TextView hotelname;
    TextView totalPrice;
    EditText daysInput;
    String name;
    double price;
    double cost;
    int days;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Intent intent = getIntent();
         name = intent.getStringExtra("Hotel");
         price= intent.getDoubleExtra("price",0);
        hotelname=findViewById(R.id.txt_HotelName);
        hotelname.setText(name);
        daysInput=findViewById(R.id.numberOfDays);
        totalPrice=findViewById(R.id.totalPrice);
        daysInput.addTextChangedListener(new TextWatcher() {
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
                    totalPrice.setText("Total Cost is price:" + cost);
                }
            }
        });

    }
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();


    }

    public void btnOnClickHotelSearchResult(View view) {


    }
}
