package lecturecode.week7;

public class Pool {
    private String name; // field, or a variable
     private double length;

    Pool(String poolName, double poolLength) {
        name = poolName;
        length = poolLength;
    }
    // instance method
    // instance is another word for an object
    // an instance of a class
    // a pool object is an instance of the pool class
    public double distanceForLaps(int laps) {
        // 10 laps of pool length 50, that's 500 meters.
        double total = laps * this.length;
        return total;
    }

    @Override
    public String toString() {
        String description = name + "pool is " + length + " meter long.";
        return description;
    }
}
