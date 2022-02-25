package com.engim.lezione5.forme;

public class Cerchio extends Forma{
    private int raggio;

    public Cerchio(int r) {
        this.raggio=r;
    }

    public void setRaggio(int raggio) {
       this.raggio= Math.max(0,raggio);
    }

    public double area(){
        return ((Math.PI)*(raggio*raggio));
    }
    public double circonferenza(){
        return(2*(Math.PI)*raggio);
    }
}
