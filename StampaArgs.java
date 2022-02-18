import java.util.Scanner;

public class StampaArgs {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + args[i]);
        }

    }
}


  
