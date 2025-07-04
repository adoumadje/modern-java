package org.example.var;

import java.util.List;
import java.util.Map;

public class VarTypeExample {
    // Not allowed
//    var attribute;

    public static void main(String[] args) {
        var list = List.of("caleb", "camavinga", "Mungulu");
        System.out.println(list);

        var map = Map.ofEntries(Map.entry("Mbappe", 27), Map.entry("Kane", 17));
        map.forEach((var name, var goals) -> System.out.println(name + " - " + goals));

        var res = transform("Arda Guler");
        System.out.println(res);

        var var = 56; // not reserved keyword
        System.out.println(var);

        /**
         *  Limitations
         */
        var game = "GTA-5";
        //game = 700


    }

    private static String transform(String s) { // Not allowed as function param
        var res = s.toUpperCase();
        return res;
    }
}
