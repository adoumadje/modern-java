package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsReduceMinMax {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9);
        Integer min = integerList.stream().reduce(Integer.MAX_VALUE, Math::min);
        Integer max = integerList.stream().reduce(Integer.MIN_VALUE, Math::max);

        System.out.printf("min = %d\n", min);
        System.out.printf("max = %d\n", max);
    }
}
