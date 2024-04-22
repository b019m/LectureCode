package lecturecode.week2;

public class OilChange {
    public static void main(String[] args) {

        int mileage = 150000;// initial mileage
        int interval = 3000;// interval for oil change

        // loops through the mileage intervals
        for (int miles = mileage; miles < (mileage + 8 * interval) ; miles+=interval) {
            System.out.println("Get oil change at" + miles + "miles");
        }
    }
}
