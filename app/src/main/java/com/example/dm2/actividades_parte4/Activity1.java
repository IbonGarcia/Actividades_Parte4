package com.example.dm2.actividades_parte4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    private Spinner listapaises;
    private TextView informacion;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        this.setTitle(R.string.titulopaises);
        informacion= (TextView)findViewById(R.id.info);
        final String[] paises= new String[]{"Ninguno","Alemania","Canada","Egipto","España","Japón","Lituania"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,paises);
        listapaises=(Spinner)findViewById(R.id.lista_paises);
        listapaises.setAdapter(adaptador);
        listapaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String pais=(String) listapaises.getSelectedItem();
                switch (pais){

                    case "Alemania":
                        informacion.setText("Superficie: 357.386 km² \nPoblacion : 82,52 millones");
                        informacion.setVisibility(View.VISIBLE);
                        break;
                    case "Canada":
                        informacion.setText("Superficie: 9,985 millones km² \nPoblacion : 36,71 millones");
                        informacion.setVisibility(View.VISIBLE);
                        break;
                    case "Egipto":
                        informacion.setText("Superficie: 1,01 millones km² \nPoblacion : 97,55 millones");
                        informacion.setVisibility(View.VISIBLE);
                        break;
                    case "España":
                        informacion.setText("Superficie: 505.990 km² \nPoblacion : 46,57 millones");
                        informacion.setVisibility(View.VISIBLE);
                        break;
                    case "Japón":
                        informacion.setText("Superficie: 377.972 km² \nPoblacion : 126,8 millones");
                        informacion.setVisibility(View.VISIBLE);
                        break;
                    case "Lituania":
                        informacion.setText("Superficie: 65.300 km² \nPoblacion : 2,848 millones");
                        informacion.setVisibility(View.VISIBLE);
                        break;
                    case "Ninguno":
                        informacion.setVisibility(View.INVISIBLE);
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
