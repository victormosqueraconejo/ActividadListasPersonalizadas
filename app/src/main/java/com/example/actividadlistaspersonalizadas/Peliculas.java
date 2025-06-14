package com.example.actividadlistaspersonalizadas;


import java.util.ArrayList;
import java.util.List;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class Peliculas {

    private String titulo;
    private String autor;
    private int image;


    public Peliculas(String titulo, String autor, int image){
        this.titulo = titulo;
        this.autor = autor;
        this.image = image;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getImage(){
        return image;
    }
    public void  setImage(int image){
        this.image = image;
    }
    public static List<Peliculas> llenarLista(){
        ArrayList<Peliculas> lista_peliculas = new ArrayList<>();
        lista_peliculas.add(new Peliculas("WestWorld", "Jonathan Nolan and Lisa Joy", R.drawable.westworld));
        lista_peliculas.add(new Peliculas("Rick y Morty", "Justin Roiland and Dan Harmon", R.drawable.rickymorty));
        lista_peliculas.add(new Peliculas("Dr. House", "David Shore", R.drawable.drhouse));
        lista_peliculas.add(new Peliculas("La red social", "David Fincher", R.drawable.laredsocial));
        lista_peliculas.add(new Peliculas("Jhon Wick", "Derek Kolstad", R.drawable.jhonwick));
        lista_peliculas.add(new Peliculas("Transformer One", "Josh Cooley", R.drawable.transformeone));
        lista_peliculas.add(new Peliculas("Mickey 17", "Bong Joon Ho", R.drawable.mickey));
        return lista_peliculas;
    }
}
