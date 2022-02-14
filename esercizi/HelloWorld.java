import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        String s1 = "CIAO";
        System.out.println(s1);
        Scanner tastiera = new Scanner(System.in);
        String s2 = tastiera.nextLine();
        System.out.println("Hai inserito "+s2);
        //System.out.println(tastiera.nextLine());
        if (CONDIZIONE){
            ISTRUZIONI SE VERO
        }else if(CONDIZIONE){
            ISTRUZIONI SE FALSO
        }
    }
}