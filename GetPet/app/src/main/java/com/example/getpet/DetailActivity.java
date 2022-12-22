package com.example.getpet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView txtInfoName, txtInfoAge, txtInfoGender, txtSize, txtLength, txtEnergy;
    ImageView detailImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailImage = findViewById(R.id.detailImage);

        txtInfoName = findViewById(R.id.txtInfoName);
        txtInfoAge = findViewById(R.id.txtInfoAge);
        txtInfoGender = findViewById(R.id.txtInfoGender);
        txtSize = findViewById(R.id.txtSize);
        txtLength = findViewById(R.id.txtLength);
        txtEnergy = findViewById(R.id.txtEnergy);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){

            Glide.with(this).load(bundle.getString("Image")).into(detailImage);

            txtInfoName.setText(bundle.getString("Name"));
            txtInfoAge.setText(bundle.getString("Age"));
            txtInfoGender.setText(bundle.getString("Gender"));
            txtSize.setText(bundle.getString("Size"));
            txtLength.setText(bundle.getString("Length"));
            txtEnergy.setText(bundle.getString("Energy"));

        }

    }
}