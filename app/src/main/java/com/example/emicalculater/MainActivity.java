package com.example.emicalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ela;
    TextView eltm;
    TextView eir;
    TextView total;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ela = findViewById(R.id.la);
        eltm = findViewById(R.id.ltm);
        eir = findViewById(R.id.ir);
        total = findViewById(R.id.total);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Float la = Float.parseFloat(ela.getText().toString());
               Float ltm = Float.parseFloat(eltm.getText().toString());
               Float ir = Float.parseFloat(eir.getText().toString());

               Float metar = la*ltm*((1+ltm)*ir);

                Float sum = (1+ltm)*ir-1;

               Float ans = metar/sum;

               total.setText("EMI = "+ans);
            }
        });
    }
}