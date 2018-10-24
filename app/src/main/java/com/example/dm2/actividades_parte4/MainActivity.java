package com.example.dm2.actividades_parte4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle(R.string.titulo);
    }

    public void lanzareje1(View view){

        Intent intento = new Intent(this,Activity1.class);
        startActivity(intento);
    }

    public void lanzareje2(View view){

        Intent intento2 = new Intent(this,Activity2.class);
        startActivity(intento2);
    }
}
