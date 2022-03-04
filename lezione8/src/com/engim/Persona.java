package com.engim;

public class Persona {
    private String nome;
    private String cognome;
    private int id;
    private static int nextId = 0;
    public void persona(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }

}

//Le variabili static, sono variabili comuni a tutti gli oggetti di quella stessa classe