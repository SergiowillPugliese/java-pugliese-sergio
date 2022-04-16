package com.engim.testfinalejava.model;

public class Admin {
    private int id;
    private String nome;
    private  String cognome;
    private String mansione;
    private boolean admin;
    private String password;

    public Admin(int id, String nome, String cognome, String mansione, boolean admin, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.mansione = mansione;
        this.admin = admin;
        this.password = password;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMansione() {
        return mansione;
    }

    public void setMansione(String mansione) {
        this.mansione = mansione;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", mansione='" + mansione + '\'' +
                ", admin=" + admin +
                ", password='" + password + '\'' +
                '}';
    }
}
