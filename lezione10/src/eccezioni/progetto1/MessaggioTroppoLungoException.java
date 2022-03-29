package com.engim.lezione10.eccezioni.progetto1;

public class MessaggioTroppoLungoException extends Exception{
    private int length;

    public MessaggioTroppoLungoException(int x) {

       this("Messaggio troppo lungo", x);
       // super("Messaggio troppo lungo");
    }

    public MessaggioTroppoLungoException(String message, int x) {
        super(message);
        length = x;
    }
}
