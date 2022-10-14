package com.example.bkandroid_7activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("msg", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("msg", "onResume: ");
    }
}