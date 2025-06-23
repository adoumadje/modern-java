package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer1 = (s) -> System.out.println(s.toUpperCase());
        consumer1.accept("java 8");

        List<Student> students = StudentDataBase.getAllStudents();

        Consumer<Student> consumer2 = student -> System.out.println(student);
        Consumer<Student> consumer3 = student -> System.out.print(student.getName());
        Consumer<Student> consumer4 = student -> System.out.println(student.getActivities());

        System.out.println("####### use consumer in foreach ##########");
        students.forEach(consumer2);

        System.out.println("####### chainning consumers ##########");
        students.forEach(consumer3.andThen(consumer4));

        System.out.println("####### consumers with condition ##########");
        students.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                consumer3.andThen(consumer4).accept(student);
            }
        });

    }
}
