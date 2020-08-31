package com.example.milestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import  android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;


import android.os.Bundle;

import static com.example.milestokm.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Button buttonConvMilesToKm = ((Button) findViewById((id.buttonConvMilesToKm)));
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = findViewById(id.editTextmiles);
                double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
                double vKm = vMiles/ 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vKm));


            }
        });
        Button buttonConvKmToMiles = ((Button) findViewById((id.buttonConvKmToMiles)));
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxKm = findViewById(id.editTextKm);
                double vKm = Double.parseDouble(textBoxKm.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vMiles));


            }
        });
    }
}