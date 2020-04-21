package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.hotelapp.Models.service;

import java.util.ArrayList;
import java.util.List;

public class CheckIn_MainActivity extends AppCompatActivity {

    List<service> serviceList=new ArrayList<service>();

   String[] StringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in__main);
        Intent intent =getIntent();
        String Message1 =intent.getStringExtra("showList");

        ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,StringList);
        ListView list_ServiceFlow  = findViewById(R.id.list_ServiceFlow);
        list_ServiceFlow.setAdapter(listAdapter);//now you connected listView in runTime


  }
  public void Fill(){
        //////// put code to read here and store it in database

      StringList=new String[serviceList.size()];
      for(int i=0;i<serviceList.size();i++){
          StringList[i]="Service: "+serviceList.get(i).getServiceType()+"       Cost: "+serviceList.get(i).getServiceCost();
      }



  }

}
