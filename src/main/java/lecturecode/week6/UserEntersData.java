package lecturecode.week6;

import static lecturecode.week3.InputUtils.intInput;

public class UserEntersData {
    public static void main(String[] args) {

        // Example: you want the user to enter a number between 1 and 10

        int userInput = 0;
        do {
            userInput = intInput("Please enter a number between 1 and 10");
        }
        while (userInput < 1 || userInput > 10);
        System.out.println("Thanks, the number you entered is " + userInput);
    }
}
