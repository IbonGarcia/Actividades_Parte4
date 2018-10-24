package com.example.dm2.actividades_parte4;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity2 extends AppCompatActivity {

    private ListView lista;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        this.setTitle(R.string.tituloweb);
        lista=(ListView)findViewById(R.id.lista_web);
        final Webs[] webs= new Webs[]{new Webs("Youtube","https://www.youtube.com",getDrawable(R.mipmap.ic_youtube)),
                new Webs("Netflix","https://www.netflix.com",getDrawable(R.mipmap.ic_netflix)),
                new Webs("Google","https://www.google.es",getDrawable(R.mipmap.ic_google)),
                new Webs("Moodle","http://moodle.icjardin.com",getDrawable(R.mipmap.ic_moodle))};
        AdaptadorPropio adaptador= new AdaptadorPropio(this,webs);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intento = new Intent(Intent.ACTION_VIEW, Uri.parse(webs[position].getUrl()));
                startActivity(intento);
            }
        });
    }
}
