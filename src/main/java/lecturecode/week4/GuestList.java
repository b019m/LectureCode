package lecturecode.week4;

import java.util.Random;

public class GuestList {
    public static void main(String[] args) {

        // creates a random object to generate random numbers
        Random rnd = new Random();

        // generates a random integer between 0 and 10
        int randomNumber = rnd.nextInt(10);

        // generates a random integer between 1 and 10
        int randomNumberBetween1and10 = rnd.nextInt(10)+ 1;

        // prints the random number that is generated
        System.out.println(randomNumber + " " + randomNumberBetween1and10);
    }
}
