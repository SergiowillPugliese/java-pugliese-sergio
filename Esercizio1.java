// Chiede all'utente un numero e fa il count down
import java.util.Scanner;
public class Esercizio1{
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        boolean fine = false;
        while(!fine){
            
            String s1 = tastiera.nextLine();
            fine = s1.equalsIgnoreCase("fine");
            if(!fine){
                String prima, ultima;
                prima = s1.substring(0,1);
                ultima = s1.substring(s1.length()-1, s1.length());
                System.out.println("Prima lettera uguale all'ultima: " + prima.equalsIgnoreCase(ultima));
            }

        } 
        
        System.out.println(fine);
                


    }
}