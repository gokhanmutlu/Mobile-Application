package com.example.fragmenders;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity implements Fragment1.CityListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    @Override
    public void setCity(City city) {

    }
}