package lecturecode.week3;

import java.util.Arrays;

public class corporatesponsors {

    public static void main(String[] args) {

        // start by declaring an array named sponsors that will hold the name of the corporateSponsors
        // modify array, make strings uppercase
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

        // Initializes a for loop that iterates over each element of the sponsor array
        // (i++) increments i by 1
        for (int i = 0; i < sponsors.length; i++) {

            // inside the loop we convert string to uppercase using the .toUpperCase() method
            sponsors[i] = sponsors[i].toUpperCase();

        }
        // Arrays.toString() is used to convert an array to string
        System.out.println(Arrays.toString(sponsors));
    }
}
