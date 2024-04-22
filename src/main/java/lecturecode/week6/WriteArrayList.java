package lecturecode.week6;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        // write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web" etc.
        List<String> classNames = List.of("Java", "Web", "C#");

        // List<String> classes = new ArrayList<>();
        // classes.add("Java");
        // classes.add("Web");
        // classes.add("C#");

        // lists of class codes
        List<Integer> classCodes = List.of(2545, 2568, 2505);

        // Create a BufferedWriter to write to the file ITEC_Classes.txt
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));

        // Iterates through each class name and code
        for (int i = 0 ; i < classNames.size(); i++) {
            // Get the name and code of the current class
            String name = classNames.get(i);
            int code = classCodes.get(i);

            // write class information to the file in a formatted string
            bufferedWriter.write(String.format("ITEC %d %s \n", code, name));

            // writes the index of the current class to the file
            bufferedWriter.write(i);





        }
       // closes the BufferedWrite to release the system resources
         bufferedWriter.close();


    }
}
