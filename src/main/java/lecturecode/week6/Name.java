package lecturecode.week6;

import java.io.*;


public class Name {
    public static void main(String[] args) throws IOException{

     // define each variable to store name, favorite color and class
     String name= "Balha";
     String favoriteColor = "Black";
     int classCode = 2545;

     // open a file named data.txt for writing
     FileWriter fileWriter = new FileWriter("data.txt");

     // create a fileWriter object to write data to the file
     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

     // write each data on a separate line in the file
     bufferedWriter.write(name + "\n");
     bufferedWriter.write(favoriteColor + "\n");
     bufferedWriter.write(classCode + "\n");


     bufferedWriter.close(); // close the buffered writer ensuring all the data is written to the file

     // creates a fileReader object to read data from the file data.txt
     // wrap the FileReader in a BufferedReader
     // BufferedReader allows us to read data from the file without it buffering the input
     BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));

     // read the first line from the file and store in a variable "line"
      String line = bufferedReader.readLine();

      // use a while loop to iterate through each of the lines in the file until it reaches the end of file
       while (line != null) {
        System.out.println(line);
        // reads the next line from the file and updates the value of the line variable
        line = bufferedReader.readLine();

       }


    }
}
