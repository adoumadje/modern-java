package functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> addition = (a, b) -> a+b;

        System.out.println("addition = " + addition.apply(3, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        int x = 4, y = 5;

        System.out.println("min = " + BinaryOperator.minBy(comparator).apply(x, y));
        System.out.println("max = " + BinaryOperator.maxBy(comparator).apply(x, y));
    }
}
