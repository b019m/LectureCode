package lecturecode.week3;

import lecturecode.week3.InputUtils;

public class hellomethods {
    public static void main(String[] args) {

        // gets the user to enter their name and store it in the name variable
        String name = InputUtils.stringInput("Please enter your name:");

        // call the makeGreeting method
        // store results in greeting
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    public static String makeGreeting(String n) { // method generates a greeting message
        String greeting ="Hello  " + n + "!" ;
        return greeting;
    }
}
