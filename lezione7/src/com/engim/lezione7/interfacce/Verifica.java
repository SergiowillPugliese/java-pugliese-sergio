package com.engim.lezione7.interfacce;

public class Verifica implements Comparable{
    private int voto;
    private String proprietario;

    public Verifica(int voto, String proprietario) {
        this.voto = voto;
        this.proprietario = proprietario;
    }

    @Override
    public int compareTo(Object o) {
        if(o.getClass()==getClass()){
            Verifica v = (Verifica)o;
            if (this.voto > v.voto){
                return 1;
            }else if(this.voto == v.voto){
                return 0;
            }else{
                return -1;
            }
        }else
            // qui andrebbe una eccezione
            return 0;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}