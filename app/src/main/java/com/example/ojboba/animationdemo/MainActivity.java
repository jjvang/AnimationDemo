package com.example.ojboba.animationdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
YourPojo yourPojo;
    ViewPager viewPager;
    customSwip  customSwip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        customSwip=new customSwip(this);
        viewPager.setAdapter(customSwip);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SOMEHOW PASS THESE DATA TO customSWIP to set new values
                int [] imageResources2 ={R.drawable.capture2,R.drawable.capture2,R.drawable.capture5,R.drawable.capture2,R.drawable.capture2};
                yourPojo.imageResources = imageResources2;
                String[] imageText2 = {"new", "two", "three", "four", "five"};
                yourPojo.imageText = imageText2;
                String[] imageHmong2 = {"new", "new", "new", "new", "new"};
                yourPojo.imageDifferent = imageHmong2;

                viewPager.setAdapter(customSwip);
            }
        });

    }
}