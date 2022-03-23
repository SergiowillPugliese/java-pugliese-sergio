public class Gargoyle extends Umanoide implements Guerriero {
    int aperturaAlare;

    public Gargoyle(int aperturaAlare){
        this.aperturaAlare = aperturaAlare;
    }

    public void informazioni(){
        System.out.println("Mi chiamo: " + getNome() + " " + cognome + " sono alto: " + altezza + ", peso: " + peso + " ho una testa? " + haUnaTesta + " e ho " + numeroArti + " arti" + " e ho un'apertura alare di: " + aperturaAlare);
    }

    public void vola(){
        System.out.println("I believe I can fly");
    }

    @Override
    public void salta() {
        // TODO Auto-generated method stub
        System.out.println("Sto saltando!");
        
    }

    @Override
    public void combatti() {
        // TODO Auto-generated method stub
        System.out.println("Sto combattendo!");
        
    }

    @Override
    public void corri() {
        // TODO Auto-generated method stub
        System.out.println("Sto correndo!");
        
    }

    
}
