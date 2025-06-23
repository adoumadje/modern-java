package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        System.out.println("#### Single BiConsumer #######");
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
        biConsumer.accept("Caleb", "Adoumadje");

        System.out.println("#### Chained BiConsumer #######");
        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiply = " + a*b);
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division = " + a/b);

        multiply.andThen(division).accept(8, 4);

        BiConsumer<String, List<String>> biConsumer2 = (a, b) -> System.out.println(a + ": " + b);

        System.out.println("#### Student BiConsumer #######");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> biConsumer2.accept(student.getName(), student.getActivities()));
    }
}
