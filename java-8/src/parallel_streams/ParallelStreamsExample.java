package parallel_streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExample {
    private static int RANGE = 10_000_000;
    private static int NUM_OF_EXEC = 20;

    private static long checkPerformance(Supplier<Integer> function) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < NUM_OF_EXEC; ++i) {
            function.get();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static int sumSequentialStream() {
        return IntStream.rangeClosed(1, RANGE).sum();
    }

    private static int sumParallelStream() {
        return IntStream.rangeClosed(1, RANGE).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println(sumSequentialStream() == sumParallelStream());
        System.out.printf("Result of seq: %d\n", checkPerformance(ParallelStreamsExample::sumSequentialStream));
        System.out.printf("Result of parallel: %d\n", checkPerformance(ParallelStreamsExample::sumParallelStream));
    }
}
