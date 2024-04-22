package lecturecode.week1;

public class Main {
    public static void main(String[] args) {

        // defining the number fo zebras and cats
        int zebras = 4;
        System.out.println(" There are " + zebras + " zebras ");
        int cats = 6;
        System.out.println(" There are " + cats + " cats ");

        // calculating the total number of animals
        int animals = cats + zebras;
        System.out.println(" There are " + animals + " altogether ");

        System.out.println();

        // defining widget related variable
        double widgetPrice = 4.57;
        int widgetsNeeded = 56;
        double shippingPrice = 22.33;

        // calculating total widget cost and cost with shipping
        double allWidgetCost = widgetPrice * widgetsNeeded;
        System.out.println("Total widget cost: $" + allWidgetCost);
        double widgetsPlusShipping = allWidgetCost + shippingPrice;
        System.out.println("Total with shipping: $" + widgetsPlusShipping);
    }
}
