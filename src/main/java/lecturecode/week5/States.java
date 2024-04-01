package lecturecode.week5;

import java.util.HashMap;

public class States {
    public static void main(String[] args) {

        //
        HashMap<String, String> stateAbbreviations= new HashMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");


        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        // make sure to keep it uppercase or lowercase depending on what you did first
        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

    }
}

