package parallel_streams;

import java.util.stream.IntStream;

public class SumClient {
    private static final int RANGE = 10_000;

    public static void main(String[] args) {
        Sum seqSum = new Sum();
        Sum paraSum = new Sum();

        IntStream.rangeClosed(1, RANGE).forEach(seqSum::performSum);
        IntStream.rangeClosed(1, RANGE).parallel().forEach(paraSum::performSum);

        System.out.printf("sums are equal: %b\n", seqSum.getTotal() == paraSum.getTotal());
        System.out.printf("Sequential sum: %d\n", seqSum.getTotal());
        System.out.printf("Parallel sum: %d\n", paraSum.getTotal());
    }
}
