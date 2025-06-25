package method_reference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    public static void main(String[] args) {
        Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
        Function<String, String> toUpperMethodReference = String::toUpperCase;

        System.out.println(toUpperCaseLambda.apply("java 8"));
        System.out.println(toUpperMethodReference.apply("java 8"));
    }
}
