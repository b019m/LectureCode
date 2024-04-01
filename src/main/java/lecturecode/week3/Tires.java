package lecturecode.week3;

import static lecturecode.week3.InputUtils.doubleInput;
import static lecturecode.week3.InputUtils.stringInput;
import static lecturecode.week3.InputUtils.intInput;


public class Tires {
    public static void main(String[] args) {
        // ask the user for the number of tires to compare
        int numberOfTiresToCompare = intInput("Enter number of tires to compare: ");
 // loop to get information for each tire
        for (int t = 0; t < numberOfTiresToCompare; t++) {
            // get information for the current tire and print the report
            String report = getTireInfo();
            System.out.println(report);

        }
    }

        public static String getTireInfo() {
        // prompts the user to enter the price of the tire/ warranty of the tire and calculates the price per mile for the tire
          String tireName = stringInput("Enter name of tire: ");
          double price = doubleInput("Enter price for" + tireName+ ":");
          double miles = doubleInput("Enter warranty miles for " + tireName + ":");
          double pricePerMile = price / miles;
          return "The" + tireName + "tire costs $" + pricePerMile + "dollars per mile";


    }
}
