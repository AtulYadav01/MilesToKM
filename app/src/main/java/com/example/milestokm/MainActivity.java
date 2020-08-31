package com.example.milestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import  android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = ((Button) findViewById((R.id.buttonConvMilesToKm)));
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                @SuppressLint("WrongViewCast") EditText textBoxMiles = findViewById(R.id.buttonConvMilesToKm);
                EditText textBoxKm = findViewById(R.id.editTextKm);
                double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
                double vKm = vMiles/ 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));


            }
        });
        Button buttonConvKmToMiles = ((Button) findViewById((R.id.buttonConvKmToMiles)));
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                @SuppressLint("WrongViewCast") EditText textBoxMiles = findViewById(R.id.buttonConvMilesToKm);
                EditText textBoxKm = findViewById(R.id.editTextKm);
                double vKm = Double.parseDouble(textBoxKm.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vMiles));


            }
        });
    }
}