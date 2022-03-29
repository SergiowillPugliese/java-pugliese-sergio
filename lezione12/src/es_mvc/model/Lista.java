package com.engim.lezione12.es_mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<String> prodotti;

    public Lista() {
        prodotti = new ArrayList<>();
    }

    public List<String> getProdotti() {
        return prodotti;
    }

    public boolean addProdotto(String nome){
        if (prodotti.contains(nome))
            return false;
        else{
            prodotti.add(nome);
            return true;
        }
    }

    public boolean removeProdotto(String nome){
        if (prodotti.contains(nome)){
            prodotti.remove(nome);
            return true;
        }else{
            return false;
        }
    }


}
