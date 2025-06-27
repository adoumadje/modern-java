package numeric_streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {
    public static void main(String[] args) {

        System.out.printf("Int Range count = %d\n", IntStream.range(1, 50).count());
        IntStream.range(1, 50).forEach(value -> System.out.printf("%d, ", value));
        System.out.printf("\nInt Range Closed count = %d\n", IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.printf("%d, ", value));

        System.out.printf("\nLong Range count = %d\n", LongStream.range(1, 50).count());
        LongStream.range(1, 50).forEach(value -> System.out.printf("%d, ", value));
        System.out.printf("\nLong Range Closed count = %d\n", LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.printf("%d, ", value));

        System.out.println("\n### Double stream ##");
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.printf("%.2f, ", value));
        System.out.println();

    }
}
