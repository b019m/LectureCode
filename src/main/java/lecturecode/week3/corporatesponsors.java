package lecturecode.week3;

import java.util.Arrays;

public class corporatesponsors {

    public static void main(String[] args) {

        // modify array, make strings uppercase
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

        // Initializes a for loop that iterates over each element of the sponsor array
        // (i++) increments i by 1
        for (int i = 0; i < sponsors.length; i++) {
            // convert string to uppercase
            sponsors[i] = sponsors[i].toUpperCase();

        }
        System.out.println(Arrays.toString(sponsors));
    }
}
