// Chiede all'utente un numero e stampa se è PARI
import java.util.Scanner;
public class Selezione{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = tastiera.nextInt();
        if(n % 2 == 0){
            System.out.println("Il numero è PARI");
        }else{
            System.out.println("Il numero è DISPARI");
        }
    }
}