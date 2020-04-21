package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hotelapp.Models.service;
import com.example.hotelapp.Models.serviceList;

import java.util.ArrayList;
import java.util.List;

//This Class for Order New Service
public class ServiceActivity extends AppCompatActivity {
    TextView servicePrice;
    List<service> serviceList;
    private Spinner typeOfServices;
    ArrayAdapter<String> spinnerArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_service);
        servicePrice=findViewById(R.id.servicePrice);

        typeOfServices= findViewById(R.id.spn_TypeServices);
        populate();
        typeOfServices.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                servicePrice.setText("Cost: "+serviceList.get(position).getServiceCost());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }


      public void order(View view) {
        int index= typeOfServices.getSelectedItemPosition();
        service selectedService=serviceList.get(index);
        DisplayToast("Service ordered!");
          //save Data in Data Base..



      }
      private void populate(){
        serviceList=new ArrayList<service>();
          serviceList.add(new service("Laundry",1000));
          serviceList.add(new service("Massage",500));
          serviceList.add(new service("Fitness center",100));
          serviceList.add(new service("Breakfast",300));
          serviceList.add(new service("Dinner",200));
        String[]  servicesArray=new String[serviceList.size()];
          for(int i=0;i<serviceList.size();i++){
              servicesArray[i]=serviceList.get(i).getServiceType();

          }
          spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, servicesArray);
          spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
          typeOfServices.setAdapter(spinnerArrayAdapter);




      }

    private void DisplayToast(String msg) {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();


    }

  }
