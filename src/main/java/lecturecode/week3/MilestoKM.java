package lecturecode.week3;

import lecturecode.week3.InputUtils;

public class MilestoKM {
    public static void main(String[] args) {

        // gets the user to enter a number of miles and store the input
        double miles = InputUtils.doubleInput("Enter a number if miles: ");
        // converts the miles to kilometer using the miletoKM method
        double km = milesToKM(miles);
       System.out.println(miles + " miles is equal to " + km + " kilometer");
    }
       private static double milesToKM(double miles) {
        // convert : 1mile = 1.6 kilometers
        double km = miles * 1.6;
        return km;
    }
}
