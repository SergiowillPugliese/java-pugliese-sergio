package com.engim.lezione10.eccezioni.progetto1;

import com.engim.lezione10.eccezioni.EsempioNonControllatoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean finito = false;
        while(!finito){
            System.out.println("Inserisci una stringa composta da non più di 20 caratteri. ");
            String s = tastiera.nextLine();
            try{
                if(s.length()>20){
                    throw new MessaggioTroppoLungoException(s.length());
                }else{
                    System.out.println("Hai inserito "+s.length()+" caratteri, che è un numero accettabile");
                }
            }catch (MessaggioTroppoLungoException e){
                System.out.println(e.getMessage());
            }

            System.out.println("Vuoi ancora inserire qualcosa?(s/n)");
            String risposta = tastiera.nextLine();
            if(risposta.equalsIgnoreCase("n"))
                finito = true;

        }
    }

}
