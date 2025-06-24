package functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<String> concat = name -> name.concat("default");
        System.out.println(concat.apply("java 8 "));
        System.out.println(UnaryOperator.identity().apply("Caleb"));
    }
}
