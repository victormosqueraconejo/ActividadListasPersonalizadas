package com.example.actividadlistaspersonalizadas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnVerLista, btnVerGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnVerGrid = findViewById(R.id.btnVerPorGrid);
        btnVerLista = findViewById(R.id.btnVerPorListas);

        btnVerLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irSiguiente = new Intent(MainActivity.this, ListaVista.class);
                startActivity(irSiguiente);
            }
        });
        btnVerGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irSiguiente = new Intent(MainActivity.this, GridVista.class);
                startActivity(irSiguiente);
            }
        });
    }
}