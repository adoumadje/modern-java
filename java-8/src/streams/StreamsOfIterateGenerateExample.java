package streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsOfIterateGenerateExample {

    public static void main(String[] args) {
        System.out.println("##### OF ##########");
        Stream.of("Camavinga", "Vinicius", "Bellingham", "Valverde", "Arnold", "Mbappe")
                .forEach(System.out::println);

        System.out.println("######## ITERATE ##########");
        Stream.iterate(1, x -> 2 * x)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("######## GENERATE ##########");
        Stream.generate(new Random()::nextInt)
                .limit(10)
                .forEach(System.out::println);
    }
}
