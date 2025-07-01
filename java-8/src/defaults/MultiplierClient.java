package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5);
        Multiplier multiplier = new MultiplierImpl();

        System.out.printf("abstract method multiply(): %d\n", multiplier.multiply(integerList));
        System.out.printf("default method size(): %d\n", multiplier.size(integerList));
        System.out.printf("static method isEmpty(): %b\n", Multiplier.isEmpty(integerList));
    }
}
