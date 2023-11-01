import java.util.Random;
import java.util.Scanner;

public class NumGuessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int UpperBound = 100;
        int numbertoGuess = random.nextInt(UpperBound - lowerBound + 1) + lowerBound;
        int numofAttempts = 0;
        int MaxAttempts = 10;
        System.out.println("welcome to number guessing game");
        System.out.println("I have Selected a ranadom number between" + lowerBound + " and" + UpperBound);

        while (numofAttempts < MaxAttempts) {

            System.out.println("Enter your Guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess < lowerBound || userGuess > UpperBound) {

                System.out.println("please  guess the number between " + lowerBound + "and" + UpperBound + ".");

            } else if (userGuess < numbertoGuess) {
                System.out.println("Too high ! Try again");
            } else if (userGuess > numbertoGuess) {
                System.out.println("Too low! try again");

            } else {
                System.out.println("Congratulation you won!");
                break;

            }

        }
        if (numofAttempts >= MaxAttempts) {
            System.out.println("Sorry you reached maximum number of Attempts");

        }
        scanner.close();
    }

}
