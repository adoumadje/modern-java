package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         *  Old fashion
         */
        Runnable oldRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside old runnable");
            }
        };
        new Thread(oldRunnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable implemented inside (old fashion)");
            }
        }).start();

        /**
         *  With lambdas
         */

        Runnable runnable1 = () -> {
            System.out.println("Inside runnable 1");
        };
        new Thread(runnable1).start();

        Runnable runnable2 = () -> System.out.println("Inside runnable 2");
        new Thread(runnable2).start();

        new Thread(() -> System.out.println("Lambdas as argument")).start();
    }
}
