package lecturecode.week1;

import static lecturecode.week0.Input.InputUtils.intInput;
import static lecturecode.week0.Input.InputUtils.stringInput;


public class HelloInput {
    public static void main(String[] args) {

        // prompts the user to input their name
        String name = stringInput("Please enter your name: ");
        // prints name and !!
        System.out.println("Hello," + name + "!");

        // prompts the user to input the number of classes they are taking
        // uses intInput to get user input
        int numberOfClasses = intInput("How many classes are you taking this semester");

        String units = "classes";

        if(numberOfClasses == 1) {
            units = "class";
        }
        // printing the number of classes the user is taking
        System.out.println(" You are taking " + numberOfClasses + " " + units + "  this semester ");

    }
}
