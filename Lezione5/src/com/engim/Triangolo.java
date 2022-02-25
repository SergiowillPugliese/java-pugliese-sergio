package com.engim.lezione5.forme;

public class Triangolo extends Poligono {
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double area(){
        return (base*altezza)/2;
    }
}
