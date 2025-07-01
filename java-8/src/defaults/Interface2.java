package defaults;

public interface Interface2 extends Interface1 {
    default void methodB() {
        System.out.println("Inside methodB");
    }

    @Override
    default void methodA() {
        System.out.println("Inside methodA " + Interface2.class);
    }
}
