package com.engim.testfinalejava.model;

public class RigheOrdini {
    private int ordine;
    private int idMenu;

    public RigheOrdini(int ordine, int idMenu) {
        this.ordine = ordine;
        this.idMenu = idMenu;
    }


    public int getOrdine() {
        return ordine;
    }

    public void setOrdine(int ordine) {
        this.ordine = ordine;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public String toString() {
        return "RigheOrdini{" +
                ", ordine=" + ordine +
                ", idMenu=" + idMenu +
                '}';
    }
}
