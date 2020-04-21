package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hotelapp.Models.Visit;
import com.example.hotelapp.Models.VisitList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;


public class History_MainActivity extends AppCompatActivity {
  //String []historyList={"Hotel0_Visit","Hotel1_Visit","Hotel2_Visit","Hotel3_Visit"};

    VisitList b = new VisitList();
    ArrayList<Visit> bHistory = b.getVisit();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history__main);


        loadData();
        if(!b.getVisit().isEmpty()) {
            String[] visitList = getAllVisit();

            Intent intent = getIntent();


            ListView list_HistoryVisited = findViewById(R.id.list_HistoryVisited);
            ArrayAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, visitList);
            list_HistoryVisited.setAdapter(listAdapter);//now you connected listView in runTime

            //Define Event Handler for this List
            AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(History_MainActivity.this, HistorySummaryDetail.class);
                    //   intent.putExtra("visit", bHistory.get(position));//or position Where your data array Object order
                    startActivity(intent);
                }
            };

            list_HistoryVisited.setOnItemClickListener(itemClickListener);
        }
    }

    private void loadData(){
        SharedPreferences s = getSharedPreferences("VISITS", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = s.getString("list", null);
        Type type = new TypeToken<ArrayList<Visit>>() {}.getType();
        ArrayList<Visit> load = gson.fromJson(json, type);

        bHistory = load;


        //Print(bHistory.toString());
        //txt.setText(bHistory.toString());
    }

    public String[] getAllVisit(){
        loadData();
        //Print(b.toString());
        int size = bHistory.size();
        String[] v = new String[size];

        for(int i = 0; i < size; i++){
            v[i] = bHistory.get(i).toString();
           // Print(b.getVisit().toString());
        }
        return v;
    }

    private void Print(String msg) {
        Toast.makeText(getBaseContext(), msg,
                Toast.LENGTH_SHORT).show();


    }

}
