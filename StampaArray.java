public class StampaArray{

public static void Stampa(int [] pippo) {

    System.out.print("[");

    for (int i = 0; i < pippo.length; i++) {
        System.out.print(pippo[i]);
        if (i != pippo.length - 1) {
            System.out.print(",");
            
        }
        
    }
    
    System.out.print("]");
}

public static void main(String[]args) {
    int[] array1 = {1,2,3,4,5,6,7};

    Stampa(array1);
    
}

}