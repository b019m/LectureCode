package lecturecode.week4;

import java.util.ArrayList;
import java.util.List;

public class list {
    // can remove and add things throughout
    // can remove by value or index
    // can find out size of the list
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Balha");
        arrayList.add("MCTC");


       //

        for (String s: arrayList) {
            System.out.println(s);
            // converts list to uppercase
            System.out.println(s.toUpperCase());
            System.out.println(s.length());

            // removing item from list .remove

        }

    }
}
