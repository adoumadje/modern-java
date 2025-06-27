package numeric_streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {

    public static void main(String[] args) {
        List<MyClass> myClassList = IntStream.rangeClosed(1, 10).mapToObj(MyClass::new).collect(Collectors.toList());

        long sumLong = IntStream.rangeClosed(1, 10).mapToLong(i -> i).sum();

        double sumDouble = IntStream.rangeClosed(1, 10).mapToDouble(i -> i).sum();

        System.out.printf("mapToObj: %s\n", myClassList);
        System.out.printf("mapToLong sum = %d\n", sumLong);
        System.out.printf("mapToDouble sum = %.2f\n", sumDouble);
    }
}
