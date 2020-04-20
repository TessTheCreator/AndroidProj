package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hotelapp.CheckIn_MainActivity;
import com.example.hotelapp.R;
import com.example.hotelapp.ServiceActivity;

public class ServicesMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_main);
        Intent intent =getIntent();
    }

    public void btnOnClickShowListOfServices(View view) {
        String Message = "showList";
        Intent intent = new Intent(this, CheckIn_MainActivity.class);
        intent.putExtra("showList",Message);
        startActivity(intent);
    }

    public void btn_RequestServices(View view) {
        String Message2 ="Order";
        Intent intent = new Intent(this, ServiceActivity.class);
        intent.putExtra("Order",Message2);
        startActivity(intent);

    }
}
