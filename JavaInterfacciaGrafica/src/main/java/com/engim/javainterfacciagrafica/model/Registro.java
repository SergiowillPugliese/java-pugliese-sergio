package com.engim.javainterfacciagrafica.model;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private static Registro instance;
    private List<Persona>persone;

    private Registro() {
        persone = new ArrayList<>();
    }

    public void addPersona(String nome){
        Persona p = new Persona(nome);
        persone.add(p);
    }

    public String getNomiPersone(){
        String s = "";
        for (Persona p:persone) {
            s += p.getNome() + "\n";
        }
        return s;
    }

    public static Registro getInstance(){
        if (instance==null)
            instance = new Registro();
        return instance;
    }
}
