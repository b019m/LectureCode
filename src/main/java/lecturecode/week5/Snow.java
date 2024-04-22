package lecturecode.week5;

import java.util.HashMap;
import java.util.Map;

public class Snow {
    public static void main(String[] args) {

        // create hashmap to store the snowfall data
         Map<String, Double> snowfall = new HashMap<>();

         // adds the snowfall data for different months
         snowfall.put("January", 3.1);
         snowfall.put("February", 10.8);
         snowfall.put("December", 3.1);

         // print the snowfall data for all months
         System.out.println(snowfall);

         // update the snowfall data for february
         snowfall.put("February", 12.4);

         // print the snowfall data for all months
         System.out.println(snowfall);

         // print snowfall for january
         System.out.println("The snow in January is" + snowfall.get("January") + "inches");

         System.out.println("The snow in July is" + snowfall.get("July") + "inches");

         // if-else to check if there is snow in july
         if (snowfall.containsKey("July")) {
             System.out.println("There was snow in July!");
         }else{
             System.out.println("There was no snow in July");

             /* Hashmap is a data structure that stores key value pairs
             - each element in a HashMap consists of a key and its corresponding pairs
             -
              */

         }
    }
}
