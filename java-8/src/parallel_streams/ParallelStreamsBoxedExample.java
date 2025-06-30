package parallel_streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamsBoxedExample {
    private static int RANGE = 100_000;

    private static void sequentialSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        Optional<Integer> sum = integerList.stream().reduce(Integer::sum);
        long end = System.currentTimeMillis();
        System.out.printf("Duration for sequential: %d\n", end-start);
    }

    private static void parallelSum(List<Integer> integerList) {
        long start = System.currentTimeMillis();
        Optional<Integer> sum = integerList.parallelStream().reduce(Integer::sum);
        long end = System.currentTimeMillis();
        System.out.printf("Duration for parallel: %d\n",  end - start);
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, RANGE).boxed().collect(toList());
        sequentialSum(integerList);
        parallelSum(integerList);
    }

}
