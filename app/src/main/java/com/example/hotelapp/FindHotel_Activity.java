package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FindHotel_Activity extends AppCompatActivity {

    Spinner countrySpinner;
    Spinner starsSpinner;
    EditText minValue;
    EditText maxValue;
    String country;
    int starValue;
    int min;
    int max;

    //private List<String> Entry = new ArrayList<String >();//to save Entry if needed
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_hotel_);
        countrySpinner = findViewById(R.id.spn_country);
        starsSpinner = findViewById(R.id.spn_stars);
        minValue = findViewById(R.id.min);
        maxValue = findViewById(R.id.max);
        minValue.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    minValue.setHint("");

            }
        });
        maxValue.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    maxValue.setHint("");

            }
        });






    }

    //--Button Activity--
    public void btnOnClickHotelSearchResult(View view) {
        if(minValue.getText().toString().matches("")||maxValue.toString().matches(""))
            DisplayToast("Please don't leave empty fields");
        else {


            country = countrySpinner.getSelectedItem().toString();
            min = Integer.parseInt(minValue.getText().toString());
            max = Integer.parseInt(maxValue.getText().toString());
            starValue = Integer.parseInt(starsSpinner.getSelectedItem().toString());
            Intent intent = new Intent(this, HotelSearchResult.class);
            intent.putExtra("Country", country);
            intent.putExtra("min", min);
            intent.putExtra("max", max);
            intent.putExtra("stars", starValue);
          if(max<=min)
                DisplayToast("Error, Please input correct values for min and max");
            else
                startActivity(intent);
        }

    }


    //--Toast Message --
    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();


    }
}