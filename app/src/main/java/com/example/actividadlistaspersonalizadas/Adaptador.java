package com.example.actividadlistaspersonalizadas;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {
    private Context context;
    private List<Peliculas> lista;

    public Adaptador(Context context){
        this.context = context;
        lista = Peliculas.llenarLista();
    }
    @Override
    public int getCount() {
        return lista.size();
    }
    public  Object getItem(int position){
        return lista.get(position);
    }
    public long getItemId(int position){
        return position;
    }
    public View getView(int position, View view, ViewGroup viewGroup){
        View root = View.inflate(context, R.layout.vistaprincipal, null);
        TextView txtAutor = (TextView) root.findViewById(R.id.txtautor);
        TextView txtTitulo = (TextView) root.findViewById(R.id.txttitulo);
        ImageView imageView = (ImageView) root.findViewById(R.id.imgpeli);
        txtAutor.setText(lista.get(position).getAutor());
        txtTitulo.setText(lista.get(position).getTitulo());
        imageView.setImageResource(lista.get(position).getImage());
        return root;
    }
}
