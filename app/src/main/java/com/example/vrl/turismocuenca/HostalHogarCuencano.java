package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HostalHogarCuencano extends AppCompatActivity {
    Button mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostal_hogar_cuencano);

        mapa = (Button) findViewById(R.id.buttonHostalPachamama);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantes = new Intent(HostalHogarCuencano.this, HostalPachamamaMapsActivity.class);
                startActivity(restaurantes);
            }
        });
    }
}
