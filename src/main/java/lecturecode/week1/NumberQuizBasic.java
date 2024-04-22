package lecturecode.week1;

import static lecturecode.week3.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
     // secret number for the game
        int secretNumber = 6;

        // asking the user to guess the number
        int guess = intInput("Guess the number I am thinking of");

        // checking if the guess is correct
        // == to compare to the secretNumber
        if (guess == secretNumber) {
            System.out.println("You guesses correctly! ");
        }

        System.out.println("The end");// printing the message
        }
    }

