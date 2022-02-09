import java.text.BreakIterator;
import java.util.Scanner;

public class Esercizio1Pag194 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("insetisci una parola: ");
        //String s1 = tastiera.nextLine();
        boolean fine = false;
        while(!fine){
            String s1 = tastiera.nextLine();
            fine = s1.equalsIgnoreCase("fine");
            if (!fine){
                String prima, ultima;
                prima = s1.substring(0,1);
                ultima = s1.substring(s1.length()-1, s1.length());
                System.out.println("prima lettera uguale all'ultima: " + prima .equalsIgnoreCase(ultima));
            }
        }
        //boolean fine = s1.equals("fine");
        //boolean fine = s1.equalsIgnoreCase("fine"); IGNORA LE MAIUSCOLE
        System.out.println(fine);
    }
}
//FINCHE' NON SCRIVI FINE, NON è VERO!

//una sottostringa è una stringa che è una parte della stringa
//questo è un ciclo while da vedere bene!

