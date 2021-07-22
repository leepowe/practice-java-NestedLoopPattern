import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello! How many characters would you like? ");
        int numOfChars = input.nextInt();
        System.out.println("What character would you like to make a design out of? ");
        String character = input.next();

        for(int i = 1; i <= numOfChars; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(character); //print not println
            }
            System.out.println();
        }

        for (int i = numOfChars - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
