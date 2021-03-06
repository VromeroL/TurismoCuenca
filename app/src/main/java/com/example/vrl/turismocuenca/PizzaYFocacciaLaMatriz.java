package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PizzaYFocacciaLaMatriz extends AppCompatActivity {
    Button mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_yfocaccia_la_matriz);

        mapa = (Button) findViewById(R.id.buttonPizzaYFocacciaLaMatriz);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantes = new Intent(PizzaYFocacciaLaMatriz.this, PizzaYFocacciaLaMatrizMapsActivity.class);
                startActivity(restaurantes);
            }
        });
    }
}
