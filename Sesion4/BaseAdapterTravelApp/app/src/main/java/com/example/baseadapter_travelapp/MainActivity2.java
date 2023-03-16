package com.example.baseadapter_travelapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.List;

public class MainActivity {
    super();
    setCotentView...

    //Recuperar gridview, crea adaptador y establecer el adaptador (setAdapter) al gridview
}

class EnlaceAdapter extends BaseAdapter {

    private List<enlace> listEnlaces;

    // Dice desde dónde lo está mandando y hacia dónde va
    private Context context;

    public EnlaceAdapter(List<enlace> listEnlaces, Context context) {
        this.listEnlaces = listEnlaces;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listEnlaces.size();
    }

    @Override
    public Object getItem(int i) {
        return listEnlaces.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listEnlaces.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.enlace_item, viewGroup, false);
        }
        // Recuperamos las listas del layout cifrado
        CardView cardView = view.findViewById(R.id.cardView);
        TextView textView = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(listEnlaces.get(i).getResource());
        textView.setText(listEnlaces.get(i).getDescription());
        cardView.setOnClickListener(view1 -> context.startActivity(
                new Intent(context, listEnlaces.get(i).getClass())
        ));

        return view;
    }
}
