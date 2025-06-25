package lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    private static int gv = 3;

    public static void main(String[] args) {
        int variable = 5;
        // variable = 4;

        gv = 6;

        Consumer<Integer> consumer = (x) -> {
            // variable = 2;
            gv = 10;
            System.out.println(variable + x);
        };
        consumer.accept(4);


    }
}
