package lecturecode.week0;

public class Temp {
    public static void main(String[] args) {

        // String and int variables to store the date
        String currentMonth = "January";
        int dayOfMonth = 11;

        // double variables to store the high and low forecast temperatures
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        // Calculate the difference between high and low temperature
        double tempDifference = forecastHigh - forecastLow;

        // print out all of the information
        System.out.println(" On " + currentMonth + " " + dayOfMonth + " "
        + "the difference between the high and low temperature is " + tempDifference);


    }
}
