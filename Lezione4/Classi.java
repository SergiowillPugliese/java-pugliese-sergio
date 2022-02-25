public class Classi{
    public static void main(String[] args) {
        //System.out.println();
        //Scanner tastiera = new Scanner(System.in);
        //Persona p1 = new Persona();
        //p1.nome = "Filippo";
        //p1.saluta();

        Bottiglia b1 = new Bottiglia(1500,1000);
        Bottiglia b2 = new Bottiglia();
        b2.setCapacita(1500);
        
        b1.stampa();
        // NON SI PUO' perchè è privato
        //b1.capacita = 1500;
        //b1.quantita = 2000;

    }
}