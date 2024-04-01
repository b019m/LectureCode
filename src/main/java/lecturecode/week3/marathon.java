package lecturecode.week3;

public class marathon {
    public static void main(String[] args) {

        // initial distance ran by the runner
        double currentDistance = 1;
        // target distance to reach
        double targetDistance = 26.2;
        // percent to increase in distance by each week
        double percentIncrease = 1.10;// used to increase by 10%


        int week = 1;// week counter

        // loop until the current distance reaches the target distance
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);

            // increase current distance by the percentage increase
            currentDistance = currentDistance + percentIncrease;
            week++;
        }

        System.out.println(week + " " + currentDistance);
    }
}