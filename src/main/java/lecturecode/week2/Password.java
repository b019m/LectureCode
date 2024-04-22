package lecturecode.week2;

import static lecturecode.week3.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {

        String secretPassword = "kittens";// secret password to be guessed

        System.out.println();
        String userPassword = stringInput("Enter the password");// gets user to enter the password using stringInput

        int maxGuesses = 5; // max number of password attempts

    // continue prompting until the correct answer is entered
        // while the userpassword is not equal to the secret password
        while (!userPassword.equals(secretPassword)) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGuesses--;
        }

        if (maxGuesses > 1) { // check if max attempts have been reached
            System.out.println("Correct password - access granted");

        } else {
            System.out.println("Max number of password attempts");
            System.exit(0);

        }

    }
}

