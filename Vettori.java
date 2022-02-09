// chiedere all'utente quanti numeri vuole inserire e 
// salvarli in un array
import java.util.Scanner;
public class Vettori{
    public static void main(String[] args){
        /*
        int[] n = new int[10];
        n[0] = 0;
        System.out.println(n[0]);
        */
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire? ");
        int n = Integer.parseInt(tastiera.nextLine());
        int array[] = new int[n];
        for(int i=0; i < n; i++){
            System.out.println("Inserisci il "+(i+1)+"° numero:");
            array[i] = Integer.parseInt(tastiera.nextLine());
        }

        for(int i=0; i < n; i++){
            System.out.print(array[i] + " ");
        }

    }
}