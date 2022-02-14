/* Esercizio Java:

- Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice numerico di cinque cifre. 
Quando l'utente scrive la risposta, il programma restituisce due valori: il numero di cifre al posto giusto e la 
somma di queste cifre. Per esempio, se il codice segreto è 53840 e l'utente ipotizza 83241, le cifre 3 e 4 sono al posto giusto. 
Il programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7 (somma). Si permetta all'utente di provare per un 
numero prefissato di volte (per esempio 10 volte).
(per il confronto utilizzare in un ciclo substring oppure charAt)

- Chiedere in input 10 numeri e stampare se i numeri sono ordinati crescentemente o decrescentemente.

Se non si riesce a farlo:
caricare su git un file chiamato domande_lezione_2.txt con scritto i problemi
fare un esercizio a scelta dal libro sull'argomento con i problemi
 */

// chiedere all'utente quanti numeri vuole inserire e 
// salvarli in un array

import java.util.Scanner;
public class Esercizio1 {
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        String cod = "53840";
        System.out.println("Indovina il codice numerico di 5 cifre");
        for(int i=0; i < cod.length(); i++){
            int somma = 0;
            String n =  tastiera.nextLine();
            if (n == cod.charAt(i)) {
                somma = somma += 1;                                
            }
            System.out.println("Hai indovinato "+(somma)+" numeri di " +(cod.length()));
        }
        
    }
}

//int n = Integer.parseInt(tastiera.nextLine());
//System.out.println("Inserisci il "+(i+1)+"° numero:");