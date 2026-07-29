/**
 * @file    NumberGuessingGame.java
 * @author  Muhammad Farooq Haider
 * @brief   Console-based number guessing game where the player attempts
 *          to guess a randomly generated number within a fixed range.
 *
 * @details Demonstrates use of java.util.Random for bounded random
 *          number generation, loop-controlled game state, and basic
 *          conditional feedback (too high / too low / correct) until
 *          the player guesses correctly.
 */
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int number = random.nextInt(1, 101); 

        System.out.println("------ Number Guessing Game ------");

        while (guess != number) {
            System.out.println("Guess the number (1-100):");
            guess = scanner.nextInt();

            if (guess > number) {
                System.out.println("Too High! Guess again.\n");
            } else if (guess < number) {
                System.out.println("Too Low! Guess again.\n");
            } else {
                System.out.println("Congrats! You have Won!");
            }
        }

        scanner.close();
    }
}
