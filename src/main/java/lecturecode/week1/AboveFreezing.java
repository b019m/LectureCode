package lecturecode.week1;

import static lecturecode.week3.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {

        // asking the user to input todays temperature
        double temp = doubleInput("enter today's temperature in F");

        /*
        uses the doubleInput methods and check whether the temp is above freezing
         */
        // if it's freezing
        if (temp > 32) {
            // this will run if the condition is true
            System.out.println("It's above freezing");
        } else {
            System.out.println("It's below freezing");

        }

    }
}
