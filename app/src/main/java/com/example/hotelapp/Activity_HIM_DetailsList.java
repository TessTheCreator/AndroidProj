package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
/*
*This Class is an InterMediaHotelDetails
* Containe an ListView of
* Booking,Services,History
 */

public class Activity_HIM_DetailsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__h_i_m__details_list);
        //Todo:Get Id from HotelSearchResult
        //Intent intent =getIntent();
        // int id = (int) intent.getExtras().get("Hotel_id");//we get hotel index in our object class Hotel..
        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        ListView HImediatDetails_list = findViewById(R.id.HImediatDetails_list);
           // ---Central EventHandler ListView----
           AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 if (position==0){
                      //--GOTO BOOKING --
                      Intent intent =new Intent(Activity_HIM_DetailsList.this,BookingActivity.class);
                      startActivity(intent);
                 }
                 else if (position==1){
                     //--GOTo Services --
                     Intent intent =new Intent(Activity_HIM_DetailsList.this,ServiceActivity.class);
                     startActivity(intent);
                 }
                 else {
                     //--GoTO HistoryDetails --
                     Intent intent =new Intent(Activity_HIM_DetailsList.this,HistoryDetailsActivity.class);
                     startActivity(intent);

                 }
           }
        };
        HImediatDetails_list.setOnItemClickListener(itemClickListener);
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
