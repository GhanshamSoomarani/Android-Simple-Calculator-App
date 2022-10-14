package com.example.calculatorsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstValue, secValue;
    TextView tvAns;
    Button add, subtract, multiply, devide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstValue =findViewById(R.id.etFirst);
        secValue =findViewById(R.id.etSecond);
        tvAns =findViewById(R.id.tvAns);
        add =findViewById(R.id.add);
        subtract =findViewById(R.id.subtract);
        multiply =findViewById(R.id.multi);
        devide =findViewById(R.id.devide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              double firstValue1, secValue2, anss;
                firstValue1= Double.parseDouble(firstValue.getText().toString());
                secValue2= Double.parseDouble(secValue.getText().toString());
                anss= firstValue1+ secValue2;
                tvAns.setText("Ans is "+anss);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double firstValue1, secValue2, anss;
                firstValue1= Double.parseDouble(firstValue.getText().toString());
                secValue2= Double.parseDouble(secValue.getText().toString());
                anss= firstValue1- secValue2;
                tvAns.setText("Ans is "+anss);
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double firstValue1, secValue2, anss;
                firstValue1= Double.parseDouble(firstValue.getText().toString());
                secValue2= Double.parseDouble(secValue.getText().toString());
                anss= firstValue1* secValue2;
                tvAns.setText("Ans is "+anss);
            }
        });

        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double firstValue1, secValue2, anss;
                firstValue1= Double.parseDouble(firstValue.getText().toString());
                secValue2= Double.parseDouble(secValue.getText().toString());
                anss= firstValue1/ secValue2;
                tvAns.setText("Ans is "+anss);
            }
        });


    }
}