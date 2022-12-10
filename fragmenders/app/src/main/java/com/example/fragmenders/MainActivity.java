package com.example.fragmenders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity implements Fragment1.CityListener {

    City city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btrnOpen);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("city_name","ANKARA");
                FragmentManager fm = getSupportFragmentManager();
                Fragment f2 = fm.findFragmentByTag("second");
                if (f2 == null) {
                    fm.beginTransaction().
                            replace(R.id.fragmentContainerView, Fragment2.class, bundle, "second").addToBackStack("").commit();
                }else{
                    fm.popBackStack();
                }
            }
        });
    }


    public void setCity(City city){
        this.city = city;
        Toast.makeText(
                this,city.name + " " + city.population, Toast.LENGTH_LONG).show();
    }
}