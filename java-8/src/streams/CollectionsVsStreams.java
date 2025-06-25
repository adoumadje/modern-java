package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ceballos");
        names.add("arda");
        names.add("belligham");

        names.remove(1);

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
    }
}
