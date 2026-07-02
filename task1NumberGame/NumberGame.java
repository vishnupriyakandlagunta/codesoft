import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // Number between 1 and 100
        int guess;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("===== NUMBER GAME =====");
        System.out.println("Guess the number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        while (attempts < maxAttempts) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("\nCongratulations! You guessed the correct number.");
                System.out.println("Number: " + randomNumber);
                System.out.println("Attempts used: " + attempts);
                break;
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }

            System.out.println("Remaining attempts: " + (maxAttempts - attempts));
        }

        if (attempts == maxAttempts) {
            System.out.println("\nGame Over!");
            System.out.println("The correct number was: " + randomNumber);
        }

        sc.close();
    }
}