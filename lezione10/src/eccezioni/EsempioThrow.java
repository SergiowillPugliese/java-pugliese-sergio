package com.engim.lezione10.eccezioni;
/*Esempio di lancio di eccezione*/
public class EsempioThrow {

    public static void m1() throws Exception {
        throw new ExampleException();
    }

    public static void main(String[] args) {
        int c = 0;
        if (c ==0)
            throw new EsempioNonControllatoException();
        try{
            // SINTASSI del comando per lanciare un'eccezione
            throw new Exception("Errore");
        }catch(Exception e){

        }


        try {
            m1();
            System.out.println("Stampa se non fallisci");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
