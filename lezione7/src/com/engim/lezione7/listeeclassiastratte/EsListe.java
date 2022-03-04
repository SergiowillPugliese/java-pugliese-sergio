package com.engim.lezione7.listeeclassiastratte;

public class EsListe {
    public static void main(String[] args) {
        Nil nil = new Nil();
        List lista = new Node(new Node(new Node(nil,1),2),3);
        System.out.println(lista.get(2));
        System.out.println(lista);
        lista.add(0,4);
        lista.add(0,9);
        System.out.println(lista);
        lista=lista.indexRemove(2);
        System.out.println(lista);
        lista=lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.length());

    }
}
