package com.engim.lezione7.interfacce;

public class EsInterfacce {
    public static void main(String[] args){
        Verifica v1 = new Verifica(75, "Pippo");
        Verifica v2 = new Verifica(45, "Pluto");
        System.out.println(v1.confronta(v2));
        System.out.println(v2.confronta(v1));
    }
}
