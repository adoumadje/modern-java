package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /**
         *  Old fashion
         */
        Comparator<Integer> oldComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("old fashion comparator: " + oldComparator.compare(3, 2));

        /**
         *  with lambdas
         */
        Comparator<Integer> lambdaComparator = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("lambda comparator: " + lambdaComparator.compare(3, 2));

        Comparator<Integer> lambdaComparator2 = (a, b) -> a.compareTo(b);
        System.out.println("lambda comparator 2: " + lambdaComparator.compare(3, 2));
    }
}
