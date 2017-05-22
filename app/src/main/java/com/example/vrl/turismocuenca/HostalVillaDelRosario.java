package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HostalVillaDelRosario extends AppCompatActivity {
    Button mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostal_villa_del_rosario);

        mapa = (Button) findViewById(R.id.buttonHostalVillaDelRosario);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantes = new Intent(HostalVillaDelRosario.this, HostalVillaDelRosarioMapsActivity.class);
                startActivity(restaurantes);
            }
        });
    }
}
