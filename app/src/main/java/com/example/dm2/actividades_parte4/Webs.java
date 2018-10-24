package com.example.dm2.actividades_parte4;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Webs extends AppCompatActivity {

    private String nombre;
    private String url;
    private Drawable imagen;

    public Webs(String nom, String url, Drawable img){

        nombre=nom;
        this.url=url;
        this.imagen=img;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webs);
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public Drawable getImagen() {
        return imagen;
    }
}
