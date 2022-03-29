package com.engim.lezione10.eccezioni;
/*
* Esempio di gestione di un'eccezione
* */
import java.util.Scanner;

public class EsempioTry {

    public static int inserimentoNumero(){
        Scanner tastiera = new Scanner(System.in);
        boolean inserito = false;
        int c = 0;
        while(!inserito){
            try{
                System.out.print("Inserisci un numero: ");
                c = Integer.parseInt(tastiera.nextLine());
                System.out.println(10/c);
                inserito = true;
            }catch(NumberFormatException e){
                System.out.println("Dovevi mettere un numero!!!!" + e.getMessage());
            }catch(ArithmeticException e){
                System.out.println("Non si può dividere per zero, inserisci un altro numero!!! ");
            }catch(Exception e){
                System.out.println("Errore");
            }
        }
        return c;
    }

    public static void main(String[] args) {
        try{
            // ISTRUZIONI
        }catch(Exception e){
            // ISTRUZIONI
        }

        int a = inserimentoNumero();
        int b = inserimentoNumero();
      //  int b = 5/0;
      //String nome = "Sedia";
      //  int a = Integer.parseInt(nome);

        System.out.println("Hai inserito "+ a);


        try{
            // ISTRUZIONI
        }catch(Exception e){
            // ISTRUZIONI
        }/*opt: catch(...)
        /*opt:*/finally{
            //ISTRUZIONI
        }

    }
}
