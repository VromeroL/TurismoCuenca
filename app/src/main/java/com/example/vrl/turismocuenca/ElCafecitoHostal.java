package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ElCafecitoHostal extends AppCompatActivity {
    Button mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_cafecito_hostal);

        mapa = (Button) findViewById(R.id.buttonElCafecitoHostal);
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantes = new Intent(ElCafecitoHostal.this, ElCafecitoHostalMapsActivity.class);
                startActivity(restaurantes);
            }
        });
    }
}
