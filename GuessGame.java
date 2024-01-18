// guass the number game task provided by technohacks
import java.util.*;
public class GuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a valid guess within the range " + lowerBound + " and " + upperBound + ".");
            } else if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly in " + numberOfAttempts + " attempts.");
            } else {
                String hint = (userGuess < numberToGuess) ? "higher" : "lower";
                System.out.println("Try again! The correct number is " + hint + " than your guess.");
            }
        }
    }
}
