import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        
        System.out.println("guess a number between 1 and 100:");

        while (true) {
            String inputStr = sc.next();

            try {
                int input = Integer.parseInt(inputStr);

                if (input < 1 || input > 100) {
                    System.out.println("Invalid input!");
                } else if (input == randomNumber) {
                    System.out.println("Good Guess");
                    break;
                } else if (input < randomNumber) {
                    System.out.println("too low!");
                } else {
                    System.out.println("too high!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 100:");
            }
        }
        
    }
}