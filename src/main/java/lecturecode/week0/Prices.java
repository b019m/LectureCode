package lecturecode.week0;

public class Prices {
    public static void main(String[] args) {
        // declares a variable for the product name
        String productName = "Packet of spaghetti";
        // declares a variable for price and quantity
        double price = 1.60;
        int quantity = 10;

        double totalPrice = price * quantity;

        // prints the total cost without string formatting
        System.out.println(quantity + " of " + productName
                + " at $ " + price + " each costs a total of $ " + totalPrice);

   // String formatting version for 2 decimal places in the prices
        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f",
                quantity, productName, price, totalPrice);
    }
}
