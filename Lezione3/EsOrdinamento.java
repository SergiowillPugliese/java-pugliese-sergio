public class EsOrdinamento {
    // fare un metodo che ritorna la posizione del numero massimo in un array
    public static int posMax(int[] a){
       int posMax = 0;
       for(int i=1; i<a.length; i++){
           if (a[i] > a[posMax])
            posMax = i;
       } 
       return posMax;
    }

    // metodo swap che dato un array e due posizioni, scambi i valori all'interno
    public static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp; 
    }

    public static void main(String[] args) {
        int[] a = {3,-6,9,-12};
        //         0 1  2  3
        // posMax: 2 
        // i : 2

        //{1}
        //pos: 0
        System.out.println(posMax(a));
        // deve stampare 2
    }
}
