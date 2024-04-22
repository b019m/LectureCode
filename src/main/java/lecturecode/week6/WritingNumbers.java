package lecturecode.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    private static int number;

    // throws IOException, which means it may encounter input/ output errors
    public static void main(String[] args)  throws IOException {

         // first define the integer data
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        // create a FileWriter object to write to a file named number.txt
        FileWriter writer = new FileWriter("numbers.txt");
        // wraps the fileWriter in a BufferedWriter for more effective writing
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // write each integer data to the file
        // appending a newline() after each one
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n"); // int number argument

        // specify that you want it as a number or else it will be interpreted as its corresponding unicode character
        bufferedWriter.write(number + "\n");
        //writes a test string to the file
        bufferedWriter.write("test");


        bufferedWriter.close(); // close BufferedWriter



    }
}
