package com.engim.lezione5.forme;

public class Rettangolo extends Quadrilatero {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void setBase(int base) {
        this.base = Math.max(0,base);
    }

    public void setAltezza(int altezza) {
        this.altezza = Math.max(0,altezza);
    }

    public double area() {
        return (base * altezza);

    }
}