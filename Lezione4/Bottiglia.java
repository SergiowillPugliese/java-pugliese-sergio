public class Bottiglia {

    private int capacita;
    private int quantita;

    public Bottiglia(int c, int q){
        capacita = c;
        quantita = q;
    }

    public int getCapacita(){
        return capacita;
    }
    public int getQuantita(){
        return quantita;
    }
    public void setCapacita(int capacita){
        this.capacita = capacita;
    }

    public void stampa(){
        System.out.println("Quantita: " + quantita + " capacita: " + capacita);
    }

}
