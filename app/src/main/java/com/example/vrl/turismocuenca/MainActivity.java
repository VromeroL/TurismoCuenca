package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sitiosTuristicos;
    Button eventos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sitiosTuristicos= (Button) findViewById(R.id.buttonSitiosTuristicos);
        sitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sitiosTuristicos = new Intent (MainActivity.this, SitiosTuristicosActivity.class);
                startActivity(sitiosTuristicos);
            }

        });
        /*
        sitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sitiosTuristicos= new Intent(MainActivity.this, GoogleMapsActivity.class);
                //startActivity(sitiosTuristicos);

            }
        });
*/

        eventos = (Button) findViewById(R.id.buttonEventos);
        eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventos = new Intent(MainActivity.this, EventosActivity.class);
                startActivity(eventos);
            }
        });
    }

}
