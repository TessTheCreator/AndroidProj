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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FindHotel_Activity extends AppCompatActivity {

    private Switch swtStarServes;
    private RadioGroup radG_Service;
    private Spinner spn_country;
    private Spinner spn_city;
    private Spinner spn_PriceRange;
    //private List<String> Entry = new ArrayList<String >();//to save Entry if needed
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_hotel_);
        //Not USe Yet _For Handling View Event..
       // HandlingViewEvent();
        //Todo:Save Entry .. and search for Hotel
    }

    //--Button Activity--
    public void btnOnClickHotelSearchResult(View view) {
        //This Method Should Show ListOfHotel as a search Result
        startActivity(new Intent(this,HotelSearchResult.class));
        //Todo:send Intent loaded with (city,or Id object),depined on search result

    }

    //Note:Not Active Function..
    private void HandlingViewEvent() {
        //--RadioGroup--
        radG_Service = (RadioGroup) findViewById(R.id.radG_Service);
        radG_Service.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //---RadioButton---
                RadioButton radb_Vacation =findViewById(R.id.radb_Vacation);
                if(radb_Vacation.isChecked()){
                    DisplayToast("Option Vacation");
                   // Entry.add("Vacation");
                }   else {
                    DisplayToast("Option Business");
                }
            }
        });
        //--Spinner City--
        final String []City = getResources().getStringArray(R.array.City_Spinner);
        spn_city = findViewById(R.id.spn_city);
        spn_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index = parent.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),
                        "You have selected item : " + City[index], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--Spinner Country--
        final String []Country = getResources().getStringArray(R.array.country_Spinner);
        spn_country = findViewById(R.id.spn_country);
        spn_country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index = parent.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),
                        "You have selected item : " + Country[index], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--Spinner PriceRange--
        final String []PriceRange = getResources().getStringArray(R.array.Price_Spinner);
        spn_PriceRange = findViewById(R.id.spn_PriceRange);
        spn_PriceRange.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index = parent.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),
                        "You have selected item : " + PriceRange[index], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //--Switch--
        swtStarServes = findViewById(R.id.swtStarServes);
        swtStarServes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swtStarServes.isChecked()){
                    DisplayToast("Star Services Added");
                }//else do Nothing
            }
        });
    }

    //--Toast Message --
    private void DisplayToast(String msg)
    {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();
    }

}
