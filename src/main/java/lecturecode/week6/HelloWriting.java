package lecturecode.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
public static void main(String[] args) throws IOException {

    // FileWriter is a class used for writing character files
    //BufferedWriter is a class used for buffering character output. It wraps around a writer object and buffers the output data
    FileWriter writer = new FileWriter("hello.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(writer);

    // file will be created if it doesn't exist
    // file will be overwritten if it does exist

    // make sure to include \n for new lines can also use bufferedWriter.newline();
    bufferedWriter.write("Hello!\n");
    bufferedWriter.write("Hello Java Students!\n");
    bufferedWriter.write("Goodbye!\n");

    // make sure to close file
    bufferedWriter.close();

    // append flag -true means add data to the end
    // append keeps the data that you already have and adds new data
    FileWriter writer2 = new FileWriter("hello.txt", true);
    //we're putting the FileWriter inside a BufferedWriter to make writing faster
    BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

    // using the newline() method to move to a new line after each write operation
    // it ensures that each piece of data appears on a separate line
    bufferedWriter2.write("Other data!");
    bufferedWriter2.newLine();
    bufferedWriter2.write("Hello programmers!");
    bufferedWriter2.newLine();
    bufferedWriter2.write("End of File");
    bufferedWriter2.newLine();

    bufferedWriter2.close(); // make sure to close file




    }
}
