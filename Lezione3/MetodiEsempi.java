import java.util.Scanner;
public class MetodiEsempi {
    
    public static int somma(int a, int b){
        // int c = a + b;
        // return c;
        // VIETATO: int a = System.out.println(a); 
        return a + b; 
    }
    public static void main(String[] args) { 

     //   int num = somma(1,2);
     //   System.out.println(num);
       // int[] a = {1,2,3,4,5,6,7};
       // Util.stampa(a);
      //  a[1] = 4;
      //  Util.stampa(a);
 

        // riempire un array, ordinarlo in modo crescente, poi stamparlo

        
        int[] b = Util.creaArray();
        Util.ordinaArray(b);
        Util.stampa(b);


    } 
 

}
