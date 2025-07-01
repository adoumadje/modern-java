package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Adam", "Berkay", "Clems", "Sissoko", "Alex", "Bromovo");
        /**
         *  Prior Java 8
         */
//        Collections.sort(namesList);
//        System.out.println(namesList);

        /**
         *  After Java 8
         */
        namesList.sort(Comparator.naturalOrder());
        System.out.println(namesList);

    }

}
