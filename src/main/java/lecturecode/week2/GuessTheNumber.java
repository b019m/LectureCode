package lecturecode.week2;

import static lecturecode.week3.InputUtils.intInput;

public class GuessTheNumber {
    public static void main(String[] args) {

        // define the secret number
        int secretNumber = 5;

        // prompt the user to guess the number
        int guess = intInput("Guess the number!");

        // continue looping until the user guesses the correct answer
        // != not equal
        while (guess != secretNumber) {
            System.out.println("That's wrong, Try again");
            guess = intInput("Guess the number");

            if (guess < secretNumber) {
                System.out.println("Guess lower!");
            }
         // provide hints to the user based on their guess
            if (guess > secretNumber) {
                System.out.println("Guess Lower!");
            }

            //inform the user that their guess is wrong and prompt for another guess
            guess = intInput("Guess the number!");

        }
        // if the loop exists it means the user has guessed the correct number
        System.out.println("Correct!");

    }
}
