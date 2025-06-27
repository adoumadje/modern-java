package numeric_streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.printf("sum = %d\n", sum);

        OptionalInt optionalMin = IntStream.rangeClosed(1, 50).min();
        if(optionalMin.isPresent()) {
            System.out.printf("min = %d\n", optionalMin.getAsInt());
        } else {
            System.out.println("No result");
        }

        OptionalLong optionalMax = LongStream.rangeClosed(1, 100).max();

        System.out.printf("max = %d\n", optionalMax.orElse(0));

        OptionalDouble optionalAvg = LongStream.rangeClosed(1, 100).average();

        System.out.printf("avg = %.2f\n", optionalAvg.orElse(0));
    }
}
