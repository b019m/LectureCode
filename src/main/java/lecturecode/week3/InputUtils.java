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


}