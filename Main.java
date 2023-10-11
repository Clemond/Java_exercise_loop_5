import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Skapa ett program där användaren får mata in ett tal. Låt sedan programmet skriva ut
        // alla siffror som är mindre än det inmatade talet men större än 0. Lös detta med en loop.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Välkommen! vänligen mata in ett tal!");
        int userNumber = myScanner.nextInt();

        for(int i = userNumber-1; i > 0; i--){
            System.out.println(i);
        }

    }
}