package com.example.baseadapter_travelapp;

import java.util.ArrayList;
import java.util.List;

public class enlace {
    private String description;
    private int resource;
    private Class clase;

    public enlace(String description, int resource, Class clase) {
        this.description = description;
        this.resource = resource;
        this.clase = clase;
    }

    public enlace() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public Class getClase() {
        return clase;
    }

    public void setClase(Class clase) {
        this.clase = clase;
    }

    public final List<enlace> generateEnlaces() {
        List<enlace> enlaceList = new ArrayList<>();
        enlaceList.add(new enlace("Enlace 1", R.drawable.viajar, MainActivity.class));
        enlaceList.add(new enlace("Enlace 2", R.drawable.objetivo, MainActivity.class));
        return enlaceList;
    }

}
