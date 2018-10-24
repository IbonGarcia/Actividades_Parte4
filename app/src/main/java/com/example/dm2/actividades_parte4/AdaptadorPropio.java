package com.example.dm2.actividades_parte4;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPropio extends ArrayAdapter<Webs> {

    private Webs[] datos;

    public AdaptadorPropio(Context context, Webs[] datos) {

        super(context, R.layout.listaitem, datos);
        this.datos=datos;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listaitem, null);
        TextView lblTitulo = (TextView)item.findViewById(R.id.titulopagina);
        lblTitulo.setText(datos[position].getNombre());
        TextView lblSubtitulo = (TextView)item.findViewById(R.id.url);
        lblSubtitulo.setText(datos[position].getUrl());
        ImageView imagen = (ImageView) item.findViewById(R.id.fotopagina);
        imagen.setImageDrawable(datos[position].getImagen());
        return(item);
    }
}
