package lecturecode.week4;

import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {

        // create new arraylist to store integer class codes
        List<Integer> classCodes = new ArrayList<>();
        // adding the integer class codes to the list
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        classCodes.add(0,1425);
        classCodes.add(2, 1100);

        // print out the list and list size
        System.out.println(classCodes);
        System.out.println(classCodes.size());

        // iterates over the list and print all of the class codes
        for (int classCode: classCodes) {
            System.out.println("ITEC" + classCode);

        }
    }
}
