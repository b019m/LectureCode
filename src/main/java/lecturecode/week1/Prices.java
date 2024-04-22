package lecturecode.week1;

import static lecturecode.week3.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        // asking for product name, price nad quantity from the user
        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("How much does a " + productName + " cost? ");
        int quantity = intInput(" How many " + productName + " to sell? ");

        double totalPrice = price * quantity; // calculating total price

        // printing the total price in two different formats
        System.out.println(quantity + " of " + productName + " at $ " +
                price + "each costs $" + totalPrice);

        System.out.printf(" %d of %s at %.2f each costs $%.2f ",
                quantity , productName, price, totalPrice);
    }
}
