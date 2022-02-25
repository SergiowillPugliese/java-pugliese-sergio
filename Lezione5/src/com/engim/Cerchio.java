package com.engim;

public class Cerchio extends Main {
    private int raggio;

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        if (raggio>0) {
            this.raggio = raggio;
        }
    }

    public double area(){
        return (Math.PI)=(raggio * raggio);
    }
    public double circonferenza(){
        return (2* (Math.PI) * raggio);
    }

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }
}
