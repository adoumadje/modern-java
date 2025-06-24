package functional_interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> capital = name -> name.toUpperCase();
        Function<String, String> concat = name -> name.concat("default");

        System.out.printf("result is: %s\n", capital.apply("java 8"));
        System.out.printf("result is: %s\n", capital.andThen(concat).apply("java 8 "));
        System.out.printf("result is: %s\n", capital.compose(concat).apply("java 8 "));

        String res = doSomething("Hello", capital);
        System.out.println(res);

    }

    private static String doSomething(String s, Function<String, String> function) {
        return function.apply(s);
    }
}
