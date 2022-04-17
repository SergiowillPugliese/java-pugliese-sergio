package com.engim.testfinalejava.model;

public class Menu {
    private int id;
    private String nome;
    private double prezzo;
    private boolean categoria;

    public Menu(int id, String nome, double prezzo, boolean categoria) {
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean getCategoria() {
        return categoria;
    }

    public void setCategoria(String bool) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
