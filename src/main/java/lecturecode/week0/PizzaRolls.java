package lecturecode.week0;

public class PizzaRolls {
    public static void main(String[] args) {
        // sharing pizza rolls between people
        // double used for number with decimal
        // variable names one word
        double pizzaRolls = 48;
        int people = 7;

        double rollsPerPerson = pizzaRolls / people;

        System.out.println("Each person gets " + rollsPerPerson + "  pizza rolls");
        // %.1f specifies the format for the floating point number printf()
        // print f is print formatted
        System.out.printf("Each person gets %.1f pizza rolls", rollsPerPerson);

    }
}
