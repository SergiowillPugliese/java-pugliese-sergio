package com.engim;

public class Quadrilatero extends Poligono{
    private int base;
    private int altezza;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int area(){
        return (base + altezza);
    }
}
