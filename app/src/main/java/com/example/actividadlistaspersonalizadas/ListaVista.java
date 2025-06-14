package com.example.actividadlistaspersonalizadas;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListaVista extends AppCompatActivity {
    ListView listView;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista_vista);


        listView = (ListView) findViewById(R.id.listaPeliculas);

        adaptador = new Adaptador(this);
        listView.setAdapter(adaptador);

    }
}