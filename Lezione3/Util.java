import java.util.Scanner;
public class Util {
    // metodo che stampa un array di interi
    public static void stampa(int [] array){
        System.out.print("["); 
        for (int i=0; i<array.length;i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(", ");
            } 
        }
        System.out.println("]");
    }  
    // che restituisce un array di interi chiesti tramite input
    public static int[] creaArray(){
        // Chiedere all'utente quanti numeri vuole inserire
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire?");
        int lunghezza = tastiera.nextInt();

        // fare l'inserimento
        int[] x = new int[lunghezza];

        for(int i = 0; i<lunghezza; i++){
            System.out.println("Inserisci il " + (i+1) + "° elemento");
            x[i] = tastiera.nextInt();
        }
        return x;
        // ritornare l'array inizializzato  
    }
}


    
    
    
     