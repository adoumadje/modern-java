package lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i = 0;

//        Consumer<Integer> consumer = (i) -> {
        Consumer<Integer> consumer = (a) -> {
            //int i = 5;
            System.out.println("Hello lambda!");
        };
    }
}
