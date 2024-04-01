package lecturecode.week3;

import lecturecode.week3.InputUtils;

public class hellomethods {
    public static void main(String[] args) {
        String name = InputUtils.stringInput("Please enter your name:");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }

    public static String makeGreeting(String n) {
        String greeting ="Hello  " + n + "!" ;
        return greeting;
    }
}
