package com.example.actividadlistaspersonalizadas;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class GridVista extends AppCompatActivity {

    GridView gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_grid_vista);
        gridLayout = (GridView) findViewById(R.id.gridview);
        List<Peliculas> lista = Peliculas.llenarLista();

        gridLayout.setAdapter(new Adaptador(this));

    }
}