package lecturecode.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        String filename = "number.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {

            String line = reader.readLine();

            while (line != null) {
                // ignore anything that isn't an integer
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    // ignore lines that are not numbers
                    System.out.println(line + " is not an integer, ignoring.");
                }
                line = reader.readLine();
            }
            System.out.println(numbers);
        } catch (IOException e) { // catch IoException
            // print error in file
            System.out.println("Error reading file" + e);

        }
    }
}



    

