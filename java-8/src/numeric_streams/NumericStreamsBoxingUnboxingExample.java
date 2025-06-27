package numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        int sum = integerList.stream().mapToInt(Integer::intValue).sum();

        System.out.printf("Boxing: %s\n", integerList);
        System.out.printf("Unboxing and sum = %d\n", sum);
    }
}
