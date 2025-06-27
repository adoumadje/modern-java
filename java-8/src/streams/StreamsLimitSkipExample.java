package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limSum = integerList.stream()
                .limit(2)
                .reduce(Integer::sum);

        if(limSum.isPresent()) {
            System.out.printf("limSum = %d\n", limSum.get());
        } else {
            System.out.println("No result");
        }

        Optional<Integer> skipSum = integerList.stream()
                .skip(3)
                .reduce(Integer::sum);

        if (skipSum.isPresent()) {
            System.out.printf("skipSum = %d\n", skipSum.get());
        } else {
            System.out.println("No result");
        }
    }
}
