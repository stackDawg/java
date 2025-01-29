import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        boolean boolInput;
        boolean isHeads;

        System.out.print("Choose Heads (H) or Tails (T): ");
        String userInput = sc.nextLine().trim(); // Trim to remove extra spaces

        if (userInput.equalsIgnoreCase("h")) {
            boolInput = true;
        } else if (userInput.equalsIgnoreCase("t")) {
            boolInput = false;
        } else {
            System.out.println("Invalid input! Please enter 'H' or 'T'.");
            sc.close(); // Close scanner before exiting
            return; // Exit the program
        }

        isHeads = rd.nextBoolean(); // Flip the coin

        // Convert boolean to Heads/Tails
        String flipResult = isHeads ? "Heads" : "Tails";

        if (isHeads == boolInput) {
            System.out.println("It's " + flipResult + "! You won!");
        } else {
            System.out.println("It's " + flipResult + "! You lost!");
        }

        sc.close(); // Close scanner
    }
}
