package lecturecode.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        // creates a FileReader object to read from the file named hello.txt
        FileReader reader = new FileReader("hello.txt");

        // wrap the FileReader in a BufferedReader for efficient reading
        BufferedReader bufferedReader = new BufferedReader(reader);

        // read the first line from the file
       String line = bufferedReader.readLine();

       // using the while loop to Read and print each line from the file until you reach the end of file (null)
       while (line != null) {
           System.out.println(line);
           // reads the next line
           line = bufferedReader.readLine();

       }

        bufferedReader.close(); // closes the reader to release the system resources

    }
}
