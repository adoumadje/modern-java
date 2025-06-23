package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         *  Imperative - How programming
         */
        int sum = 0;
        for(int i = 0; i <= 100; ++i) {
            sum += i;
        }
        System.out.println("sum from Imperative = " + sum);


        /**
         *  Declarative - what programming
         */
        int sum2 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("sum from declarative = " + sum2);
    }
}
