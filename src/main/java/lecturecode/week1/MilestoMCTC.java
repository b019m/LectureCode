package lecturecode.week1;

import static lecturecode.week3.InputUtils.doubleInput;

public class MilestoMCTC {
    public static void main(String[] args) {
        // asking user for input: how many miles from your house to MCTC?
        double miles = doubleInput("How many miles from your house to MCTC?");

        // converting miles to kilometers
        double km = miles * 1.6;
        System.out.println("You live" + km + "kilometers from school");

        // does the user live more than 10 miles away?

        // checking if the user lives more than 10 miles away
        if (miles > 10) {
            System.out.println("You live more than 10 miles away. ");
        } else {
            System.out.println("YOu live less than 10 miles away. ");

        }
    }
}
