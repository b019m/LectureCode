package lecturecode.week1;

import static lecturecode.week3.InputUtils.stringInput;

public class compareStrings {
    public static void main(String[] args) {

        // prompts the user to input their college
        String college = stringInput("What college do you attend? ");


        // uses if else to compare the input to MCTC
        if ( college.equals("MCTC")) {
            System.out.println("Yay, MCTC");
        } else {
            System.out.println("too bad, you should check out MCTC");

        }
    }
}
