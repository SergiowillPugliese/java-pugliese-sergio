package com.engim.lezione12.es_mvc;

import com.engim.lezione12.es_mvc.controller.ListaSpesaController;

import java.util.List;
import java.util.Scanner;

/*
* Scrivere un programma seguendo il pattern MVC
* che chieda in ingresso, mostri o consenta la cancellazione della lista della spesa.
* Ogni elemento è univoco (non è consentito avere più volte lo stesso elemento).
* È consentito avere più liste della spesa e ogni lista ha un nome univoco
* (cioè non è consentito avere più liste con lo stesso nome).
* Per la view utilizzare il terminale.

Per il mantenimento dei dati creare un'interfaccia chiamata SpesaRepository che abbia i seguenti metodi:
- getListe(): List<String>
- findListaByNome(nome: String): List<String>
- removeListaByNome(nome: String): boolean
- addLista(nome: String): boolean
- addElemToLista(elem: String): boolean
- removeElemToLista(elem: String): boolean

*/
public class Main {
    private static ListaSpesaController controller;

    public static void main(String[] args) {
        controller = new ListaSpesaController();
        System.out.println("Benvenuto nel programma Lista della spesa");
        boolean finito = false;
        Scanner tastiera = new Scanner(System.in);
        while(!finito){
            System.out.println("Cosa vuoi fare? \n" +
                    "1. leggere i nomi delle liste\n" +
                    "2. aggiungere una lista\n" +
                    "3. cancellare una lista\n" +
                    "4. leggere il contenuto di una lista\n" +
                    "5. aggiungere un elemento in una lista\n" +
                    "6. cancellare un elemento in una lista.");
            String risposta = tastiera.nextLine();
            switch (risposta){
                case "1":
                    nomiListe();
                    break;
                case "2":
                    aggiungiLista(tastiera);
                    break;
                case "3":
                    cancellaLista(tastiera);
                    break;
                case "4":
                    leggiLista(tastiera);
                    break;
                case "5":
                    aggiungiElemLista(tastiera);
                    break;
                case "6":
                    cancellaElemLista(tastiera);
                    break;
                default:
                    System.out.println("Hai sbagliato ad inserire");
            }
        }
    }

    private static void cancellaElemLista(Scanner tastiera) {
        System.out.print("Inserisci il nome della lista: ");
        String lista = tastiera.nextLine();
        System.out.print("Inserisci il nome dell'elemento: ");
        String elemento = tastiera.nextLine();
        if(controller.removeElemToLista(lista,elemento))
            System.out.println("OK");
        else
            System.out.println("Errore");
    }

    private static void aggiungiElemLista(Scanner tastiera) {
        System.out.print("Inserisci il nome della lista: ");
        String lista = tastiera.nextLine();
        System.out.print("Inserisci il nome dell'elemento: ");
        String elemento = tastiera.nextLine();
        if(controller.addElemInLista(lista,elemento))
            System.out.println("OK");
        else
            System.out.println("Errore");
    }

    private static void leggiLista(Scanner tastiera) {
        System.out.println("Inserisci il nome della lista da leggere");
        String risposta = tastiera.nextLine();
        List<String> elementi = controller.getElemByNome(risposta);
        for (String elem: elementi) {
            System.out.println(elem);
        }
    }

    private static void cancellaLista(Scanner tastiera) {
        System.out.println("Inserisci il nome della lista da cancellare");
        String risposta = tastiera.nextLine();
        if (controller.rimuoviLista(risposta))
            System.out.println("OK");
        else
            System.out.println("Lista non esistente");
    }

    private static void aggiungiLista(Scanner tastiera) {
        System.out.println("Inserisci il nome della lista");
        String risposta = tastiera.nextLine();
        if (controller.aggiungiLista(risposta))
            System.out.println("OK");
        else
            System.out.println("Lista già esistente");

    }

    private static void nomiListe() {
        System.out.println("Liste: ");
        for (String nome : controller.getNomiListe()) {
            System.out.println(nome);
        }
        System.out.println("\n\n");
    }
}
