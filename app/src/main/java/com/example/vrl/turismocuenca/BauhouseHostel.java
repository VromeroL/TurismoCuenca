package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BauhouseHostel extends AppCompatActivity {
    Button mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bauhouse_hostel);
        mapa = (Button) findViewById(R.id.buttonBauhouseHostel);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantes = new Intent(BauhouseHostel.this, BauhouseHostelMapsActivity.class);
                startActivity(restaurantes);
            }
        });
    }
}
