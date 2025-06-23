package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(0, 1, 2,2, 3,3,4,5,5);

        /**
         *  Imperative
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(int i: integerList) {
            if(!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        System.out.println("Imperative unique list = " + uniqueList);

        /**
         *  Declarative
         */
        List<Integer> uniqueList2 = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Declarative unique list = " + uniqueList);
    }
}
