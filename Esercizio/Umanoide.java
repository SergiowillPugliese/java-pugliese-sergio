public class Umanoide{
    int numeroArti;
    boolean haUnaTesta;
    int altezza;
    int peso;
    private String nome;
    String cognome;

    public Umanoide(String nome){
        this.nome = nome;
    }
    public Umanoide(){}

    public void cammina(){
        System.out.println("Sto camminando!");
    }

    public void mangia(){
        System.out.println("Sto mangiando!");
    }

    public void informazioni(){
        System.out.println("Mi chiamo: " + nome + " " + cognome + " sono alto: " + altezza + ", peso: " + peso + " ho una testa? " + haUnaTesta + " e ho " + numeroArti + " arti");
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}