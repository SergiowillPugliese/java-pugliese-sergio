// Chiede all'utente un numero e fa il count down
import java.util.Scanner;
public class Iterazione{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = tastiera.nextInt();
        /*while(n >= 0){
            if(n % 2 == 0)
                System.out.println(n);
            n--;
        }*/
        for (int i = n; i >= 0; i--){
            System.out.println(i);
        }

        //while(CONDIZIONE){
        //    ISTRUZIONI SE LA CONDIZIONE È VERA
        //}



    }
}