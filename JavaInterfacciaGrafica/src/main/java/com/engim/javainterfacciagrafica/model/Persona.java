package com.engim.javainterfacciagrafica.model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nome;
    private List<Automobile>auto;

    public Persona(String nome){
        this.nome = nome;
        auto = new ArrayList<>();
    }

    public void addAuto(Automobile a){
        auto.add(a);
    }

    public void removeAuto(Automobile a){
        auto.remove(a);
    }

    public String getNome() {
        return nome;
    }

    public List<Automobile> getAuto() {
        return auto;
    }
}
