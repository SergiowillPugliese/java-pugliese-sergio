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

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        Random rand = new Random();
        int randnum = 100000;
        int int_random = rand.nextInt(randnum);
        String cod = Integer.toString(int_random);
        int somma = 0;
        int contatore = 0;
        int tentativi = 10;
        String n = new String();
        String ins = "Inserisci il tuo codice qui: ";
        System.out.println("");

        while (tentativi > 0) {
            System.out.println("Indovina il codice segreto. Può essere da 1 a " + cod.length() +  " cifre");
            System.out.print(ins);
            n = tastiera.nextLine();
            System.out.println("");
                for (int i = 0; i < cod.length() && i < n.length(); i++) {
                    int num = 1;
                    if (n.charAt(i) == cod.charAt(i)) {
                        num += i;
                        System.out.println("IL " + num + "° NUMERO E' CORRETTO");
                        somma = somma + (n.charAt(i) - '0');
                        contatore++;
                    } else if (n.charAt(i) < cod.charAt(i)) {
                        num += i;
                        System.out.println("---> Il " + num + "° numero è piu' basso <---");
                    } else {
                        num += i;
                        System.out.println("---> Il " + num + "° numero è più alto <---");
                    }
                }
                if (contatore >= 5) {
                    System.out.println("Hai vinto!");
                    break;
                }
                tentativi--;
                System.out.println("");
                System.out.println("Hai indovinato " + contatore + " numeri di " + cod.length());
                System.out.println("la somma dei numeri corretti è: " + somma);
                System.out.println("Sei a: " + tentativi + " di 10");
                contatore = 0;
                somma = 0;
                System.out.println("");
                if (tentativi <= 0) {
                    System.out.println(cod);
                }
            }
        }
    }
