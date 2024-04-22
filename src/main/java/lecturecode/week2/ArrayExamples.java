package lecturecode.week2;

public class ArrayExamples {
    public static void main(String[] args) {
// storing the numbers in [] brakcets
        int[] numbers = new int[5];// creating an array of integers
        numbers[0] = 4;
        numbers[1] = 4;
        // numbers [5] = 3;

        String [] classNames = new String [3];// creating an array of strings
        classNames [0] = "Java";
        classNames [1] = "C#";
        classNames [2] = "Web";

        System.out.println("One of the second year classes is" + classNames[2]);

        int numberOfClasses = classNames.length;// getting the length of the array
        System.out.println("There are " + numberOfClasses + " classes ");

        // looping through the array and printing each element
        for (int x=0; x <classNames.length; x++ ) {
            System.out.println("A class name is " + classNames[x]);

        }



    }
}
