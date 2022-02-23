// Esercizio: cosa fa metodoRicorsivo? Disegnare lo stack.

public class RicorsioneEsempio {

    public static void metodoRicorsivo(int n){

        System.out.println(n);

        /*if (n == 0){
            
        }else{
            metodoRicorsivo(n-1);
        }*/
        if(n > 0)
            metodoRicorsivo(n-1);
    }
    public static void main(String[] args) {
        metodoRicorsivo(3);
        stampaPari(5);
    }

    public static void stampaPari(int n){
    // Esercizio 2: (scrivi un metodo ricorsivo che stampi i numeri pari da 0 a n)
    // esempio: input: 5, stampa: 0 2 4 

    }


}

/* Ricorsione: come fare? Consiglio: partire sempre da caso base
 e poi definire il passo induttivo. 
Cos'è il caso base? E' il caso dove viene fermata la ricorsione
Cosa sono i passi induttivi? Sono tutti gli altri casi, in cui la ricorsione continua.

*/