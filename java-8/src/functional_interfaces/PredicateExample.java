package functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> even = (x) -> x % 2 == 0;

        System.out.printf("number %d is even: %s\n", 4, even.test(4));

        Predicate<Integer> byFive = (x) -> x % 5 == 0;

        int x = 15;

        System.out.printf("number %d is even and divided by 5: %s\n", x, even.and(byFive).test(x));

        System.out.printf("number %d is even or divided by 5: %s\n", x, even.or(byFive).test(x));

        System.out.printf("number %d is not even or divided by 5: %s\n", x, even.or(byFive).negate().test(x));

    }
}
