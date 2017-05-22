package com.example.vrl.turismocuenca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RestaurantesActivity extends AppCompatActivity {

    Spinner Fruta;
    Spinner Bebida;
    Spinner Comida;

    String[] datosfruta = {"Manzana", "Pera", "Platano", "Uva", "Naranja"};
    String []  datosbebida = {"Coca", "Agua", "Horchata", "Cerveza"};
    String [] datoscomida = {"Sabritas", "Chocolate", "Galletas", "Caramelos", "Frituras"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        Fruta = (Spinner) findViewById(R.id.FrutaSpinn);
        Bebida = (Spinner) findViewById(R.id.BebidaSpinn);
        Comida = (Spinner) findViewById(R.id.ComidaChatarraSpinn);

        ArrayAdapter<String> frutaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosfruta);
        Fruta.setAdapter(frutaadaptador);

        final ArrayAdapter<String> bebidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosbebida);
        Bebida.setAdapter(bebidaadaptador);

        ArrayAdapter<String> comidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datoscomida);
        Comida.setAdapter(comidaadaptador);

        Fruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent mz = new Intent(RestaurantesActivity.this,Main2Activity.class);
                        startActivity(mz);
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
