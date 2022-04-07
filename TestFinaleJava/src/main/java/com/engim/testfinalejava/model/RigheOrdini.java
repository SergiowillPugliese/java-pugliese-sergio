package com.engim.testfinalejava.model;

public class RigheOrdini {
    private int id;
    private int ordine;
    private int idMenu;

    public RigheOrdini(int id, int ordine, int idMenu) {
        this.id = id;
        this.ordine = ordine;
        this.idMenu = idMenu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", ordine=" + ordine +
                ", idMenu=" + idMenu +
                '}';
    }
}
