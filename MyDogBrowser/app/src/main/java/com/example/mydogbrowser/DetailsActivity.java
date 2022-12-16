package com.example.mydogbrowser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Dog dog = (Dog) getIntent().getSerializableExtra("dog");
        FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
        DetailsFragment df = DetailsFragment.newInstance(dog);
        fts.add(R.id.container,df);
        fts.commit();
    }
}