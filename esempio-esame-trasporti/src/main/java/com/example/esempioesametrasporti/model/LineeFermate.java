package com.example.esempioesametrasporti.model;

public class LineeFermate {
    private int idFermata;
    private String nomeFermata;
    private int idLinea;
    private String nomeLinea;
    private String zona;

    public LineeFermate() {
    }

    public LineeFermate(int idFermata, String nomeFermata, int idLinea, String nomeLinea, String zona) {
        this.idFermata = idFermata;
        this.nomeFermata = nomeFermata;
        this.idLinea = idLinea;
        this.nomeLinea = nomeLinea;
        this.zona = zona;
    }

    public int getIdFermata() {
        return idFermata;
    }

    public void setIdFermata(int idFermata) {
        this.idFermata = idFermata;
    }

    public String getNomeFermata() {
        return nomeFermata;
    }

    public void setNomeFermata(String nomeFermata) {
        this.nomeFermata = nomeFermata;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public String getNomeLinea() {
        return nomeLinea;
    }

    public void setNomeLinea(String nomeLinea) {
        this.nomeLinea = nomeLinea;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Linee_fermate{" +
                "idFermata=" + idFermata +
                ", nomeFermata='" + nomeFermata + '\'' +
                ", idLinea=" + idLinea +
                ", nomeLinea='" + nomeLinea + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }
}
