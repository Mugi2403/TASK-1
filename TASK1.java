package Coding;
import java.util.Random;
import java.util.Scanner;
//import java.util.*;
public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        int roundNumber = 1;

        while (playAgain) {
            System.out.println("\n--- Round " + roundNumber + " ---");
            int targetNumber = random.nextInt(100) + 1;
            int attemptsLeft = 5;
            boolean hasGuessedCorrectly = false;
            while (attemptsLeft > 0 && !hasGuessedCorrectly) {
                System.out.println("\nAttempts left: " + attemptsLeft);
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("You guessed the correct number.");
                    totalScore += attemptsLeft; 
                    hasGuessedCorrectly = true;
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
                
                attemptsLeft--;  
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String userResponse = scanner.next();
            if (userResponse.equalsIgnoreCase("no")) {
                playAgain = false;
            }

            roundNumber++;
        }
        System.out.println("\nGame over! Your total score is: " + totalScore);
        System.out.println("Thank you for playing!");

        scanner.close();
    }
}
