package com.engim.testfinalejava.model;

public class Ordini {
    private int id;
    private int nCoperti;
    private int nTavolo;
    private boolean pagato;
    private int idStaff;

    public Ordini(int id, int nCoperti, int nTavolo, boolean pagato, int idStaff) {
        this.id = id;
        this.nCoperti = nCoperti;
        this.nTavolo = nTavolo;
        this.pagato = pagato;
        this.idStaff = idStaff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getnCoperti() {
        return nCoperti;
    }

    public void setnCoperti(int nCoperti) {
        this.nCoperti = nCoperti;
    }

    public int getnTavolo() {
        return nTavolo;
    }

    public void setnTavolo(int nTavolo) {
        this.nTavolo = nTavolo;
    }

    public boolean isPagato() {
        return pagato;
    }

    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Override
    public String toString() {
        return "Ordini{" +
                "id=" + id +
                ", nCoperti=" + nCoperti +
                ", nTavolo=" + nTavolo +
                ", pagato=" + pagato +
                ", idStaff=" + idStaff +
                '}';
    }
}
