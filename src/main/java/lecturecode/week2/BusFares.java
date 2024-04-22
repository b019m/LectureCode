package lecturecode.week2;

import static lecturecode.week3.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        final int NUMBER_OF_DAYS = 7; // constant for the number of days in a week

        double total = 0; // variable to store the total amount spent on bus fares

        // loop through each day of the week
        for (int day = 1; day <= NUMBER_OF_DAYS ; day++) {
            // gets the user to input the amount spent on bus fares for the current day
            double amountSpent = doubleInput("What did you spend" +
                    "on bus fares on day" + day);

            total = total + amountSpent;// adds the amount spent on the current day to the total

        }
        System.out.printf("Total for the week= $%.2f", total);
    }
}
