public class Programma {
   public static void main(String[] args) {
       Umanoide human1 = new Umanoide("Sergio");
       Umanoide human2 = new Umanoide();
       Umanoide human3 = new Umanoide("Luca");
       Umanoide human4 = new Umanoide();
       Gargoyle human5 = new Gargoyle(2); 
       UmanoGuerriero human6 = new UmanoGuerriero();
       Guerriero human7 = new Gargoyle(2);
       Guerriero human8 = new UmanoGuerriero();

       human1.setNome("Antonio");
       human1.cognome = "Drago";
       human1.peso = 80;
       human1.altezza = 185;
       human1.haUnaTesta = true;
       human1.numeroArti = 4;

       human2.setNome("Maria");
       human2.cognome = "Donna";
       human2.peso = 60;
       human2.altezza = 150;
       human2.haUnaTesta = false;
       human2.numeroArti = 3;

       //human3.nome = "Luca";
       human3.cognome = "Acul";
       human3.peso = 150;
       human3.altezza = 210;
       human3.haUnaTesta = true;
       human3.numeroArti = 6;

       human4.setNome("Laura");
       human4.cognome = "Luna";
       human4.peso = 80;
       human4.altezza = 180;
       human4.haUnaTesta = true;
       human4.numeroArti = 4;

       human5.setNome("Marco");
       human5.cognome = "Fdp";
       human5.peso = 80;
       human5.altezza = 180;
       human5.haUnaTesta = true;
       human5.numeroArti = 4;

       human1.informazioni();
       human2.informazioni();
       human3.informazioni();
       human4.informazioni();
       human5.informazioni();
       human5.vola();
       human5.salta();
       human5.corri();
       human5.combatti();

       human7.combatti();
       human8.combatti();
   } 
}
