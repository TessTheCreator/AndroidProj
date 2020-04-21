package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hotelapp.Models.Visit;
import com.example.hotelapp.Models.VisitList;
import com.example.hotelapp.Models.service;
import com.example.hotelapp.Models.serviceList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CheckIn_MainActivity extends AppCompatActivity {

    serviceList b = new serviceList();

    List<service> serviceList=new ArrayList<service>();

   String[] StringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in__main);
        Intent intent =getIntent();
        loadData();
        Fill();
        String Message1 =intent.getStringExtra("showList");
        if(!serviceList.isEmpty()) {
            ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, StringList);
            ListView list_ServiceFlow = findViewById(R.id.list_ServiceFlow);
            list_ServiceFlow.setAdapter(listAdapter);//now you connected listView in runTime
        }


  }
  public void Fill(){
        //////// put code to read here and store it in database

      StringList=new String[serviceList.size()];
      for(int i=0;i<serviceList.size();i++){
          StringList[i]="Service: "+serviceList.get(i).getServiceType()+"       Cost: "+serviceList.get(i).getServiceCost();
      }

  }

    private void loadData(){
        SharedPreferences s = getSharedPreferences("SERVICES", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = s.getString("list", null);
        Type type = new TypeToken<ArrayList<service>>() {}.getType();
        if (gson.fromJson(json,type)!=null) {
            ArrayList<service> load = gson.fromJson(json, type);
            if (load != null && load.isEmpty() != true) {
                serviceList = load;

            }
        }




    }

}
