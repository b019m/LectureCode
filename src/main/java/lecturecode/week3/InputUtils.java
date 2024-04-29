package lecturecode.week3;

import java.util.Scanner;
public class InputUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static String stringInput(String prompt) {
        System.out.println(prompt + "");
        return scanner.nextLine();
    }

    public static double doubleInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static int intInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static int positiveIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }
    public static double positiveDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double value;
        do {
            System.out.print(prompt + ": ");
            while (!(scanner.hasNextDouble() && (value = scanner.nextDouble()) > 0)) {
                System.out.println("Please enter a valid positive double.");
                scanner.next();
            }
        } while (false);
        return value;
    }
}