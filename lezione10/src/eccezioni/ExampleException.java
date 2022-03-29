package com.engim.lezione10.eccezioni;

public class ExampleException extends Exception{
    @Override
    public String getMessage() {
        return "Errore di esempio";
    }
}
