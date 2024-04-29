package lecturecode.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {


      String filename = "ReadNumberFromFile.java";
      int maxLineLength = 100;

        // try with resources handling here
       try (BufferedReader reader = new BufferedReader(new FileReader("ReadNumberFromFile.java"))) {

          boolean lineTooLong = false;
          int numberOfLinesTooLong = 0;
           String line = reader.readLine();
           int lineCounter = 1;
           while (line != null) {
               if (line.length() > maxLineLength) {
                   System.out.println("The line is too long.");
                   System.out.println(line);
               }
               lineCounter ++;
              line = reader.readLine();
           }
           if (lineTooLong) {
               System.out.println("there were lines that were too long ");
           } else {
               System.out.println("There were no lines that were too long");
           }
       } catch (IOException e) { // catch IOExcpetion
           System.out.println("Error reading file" + filename + "because" + e);

       }

    }
}
