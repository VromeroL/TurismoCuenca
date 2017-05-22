package com.example.vrl.turismocuenca;

import android.Manifest;
import android.app.VoiceInteractor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;

public class SitiosTuristicosActivity extends AppCompatActivity {

    Spinner Restaurantes;
    Spinner Hoteles;
    Spinner Museos;


    String [] datosRestaurante={"Opciones de restaurantes", "Moliendo Café","Don Colon Restaurante", "Pizzalacqua Cuenca","\n" +
            "Ali Baba KABAB", "Canaima", "Tacanijo", "El Tunel", "Pizza Y Focaccia La Matriz"};

    String [] datosHoteles={"Opciones de restaurantes","La Casa Cuencana", "Nass Bed & Breakfast", "Mallki Hostal", "Hostal Pachamama", "Bauhouse Hostel", "Hostal Hogar Cuencano", "Hostal Yakumama","\n"+
            "Posada Del Rio", "Hotel Check Inn", "Mochilier's Hostel & Café", "Hostal Alternative", "El Cafecito Hostal", "Bed and Breakfast Mi paraiso", "Mi Casa Hostal", "Hostal Villa Del Rosario"};

    String [] datosMuseos={"Opciones de museos", "Museo Pumapungo y parque arqueológico"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_turisticos2);

        Restaurantes = (Spinner) findViewById(R.id.spinnerRestaurantes);

        ArrayAdapter<String> restauranteAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosRestaurante);
        Restaurantes.setAdapter(restauranteAdaptador);

        Restaurantes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        Intent uno = new Intent(SitiosTuristicosActivity.this,MoliendoCafe.class);
                        startActivity(uno);
                        break;
                    case 2:
                        Intent dos = new Intent (SitiosTuristicosActivity.this, DonColonRestaurante.class);
                        startActivity(dos);
                        break;
                    case 3:
                        Intent tres = new Intent(SitiosTuristicosActivity.this, PizzalacquaCuenca.class);
                        startActivity(tres);
                        break;
                    case 4:
                        Intent cuatro = new Intent(SitiosTuristicosActivity.this, AliBabaKABAB.class);
                        startActivity(cuatro);
                        break;
                    case 5:
                        Intent cinco = new Intent(SitiosTuristicosActivity.this, Canaima.class);
                        startActivity(cinco);
                        break;
                    case 6:
                        Intent seis = new Intent(SitiosTuristicosActivity.this, Tacanijo.class);
                        startActivity(seis);
                        break;
                    case 7:
                        Intent siete = new Intent(SitiosTuristicosActivity.this, ElTunel.class);
                        startActivity(siete);
                        break;
                    case 8:
                        Intent ocho = new Intent(SitiosTuristicosActivity.this, PizzaYFocacciaLaMatriz.class);
                        startActivity(ocho);
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Hoteles = (Spinner) findViewById(R.id.spinnerHoteles);

        ArrayAdapter<String> hotelesAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosHoteles);
        Hoteles.setAdapter(hotelesAdaptador);

        Restaurantes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        Intent uno = new Intent(SitiosTuristicosActivity.this, LaCasaCuencana.class);
                        startActivity(uno);
                        break;
                    case 2:
                        Intent dos = new Intent(SitiosTuristicosActivity.this, NassBedYBreakfast.class);
                        startActivity(dos);
                        break;
                    case 3:
                        Intent tres = new Intent(SitiosTuristicosActivity.this, MallkiHostel.class);
                        startActivity(tres);
                        break;
                    case 4:
                        Intent cuatro = new Intent(SitiosTuristicosActivity.this, HostalPachamama.class);
                        startActivity(cuatro);
                        break;
                    case 5:
                        Intent cinco = new Intent(SitiosTuristicosActivity.this, BauhouseHostel.class);
                        startActivity(cinco);
                        break;
                    case 6:
                        Intent seis = new Intent(SitiosTuristicosActivity.this, HostalHogarCuencano.class);
                        startActivity(seis);
                        break;
                    case 7:
                        Intent siete = new Intent(SitiosTuristicosActivity.this, HostalYakumama.class);
                        startActivity(siete);
                        break;
                    case 8:
                        Intent ocho = new Intent(SitiosTuristicosActivity.this, PosadaDelRio.class);
                        startActivity(ocho);
                        break;
                    case 9:
                        Intent nueve = new Intent(SitiosTuristicosActivity.this, HotelCheckInn.class);
                        startActivity(nueve);
                        break;
                    case 10:
                        Intent diez = new Intent(SitiosTuristicosActivity.this, MochilierHostelYCafe.class);
                        startActivity(diez);
                        break;
                    case 11:
                        Intent once = new Intent(SitiosTuristicosActivity.this, HostalAlternative.class);
                        startActivity(once);
                        break;
                    case 12:
                        Intent doce = new Intent(SitiosTuristicosActivity.this, ElCafecitoHostal.class);
                        startActivity(doce);
                        break;
                    case 13:
                        Intent trece = new Intent(SitiosTuristicosActivity.this, BedandBreakfastMiparaiso.class);
                        startActivity(trece);
                        break;
                    case 14:
                        Intent catorce = new Intent(SitiosTuristicosActivity.this, MiCasaHostal.class);
                        startActivity(catorce);
                        break;
                    case 15:
                        Intent quince = new Intent(SitiosTuristicosActivity.this, HostalVillaDelRosario.class);
                        startActivity(quince);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        Museos = (Spinner) findViewById(R.id.spinnerMuseos);

        ArrayAdapter<String> parquesAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosMuseos);
        Museos.setAdapter(parquesAdaptador);


        Museos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        Intent uno = new Intent(SitiosTuristicosActivity.this, MuseoPumapungo.class);
                        startActivity(uno);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        /*
        restaurantes = (Button) findViewById(R.id.button2);
        restaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantes = new Intent(DonColonRestauranteActivity.this, SonColonRestauranteMapsActivity.class);
                startActivity(restaurantes);
            }
        });
        */





    }
}
