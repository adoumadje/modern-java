package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StreamsMatchExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Predicate<Student> predicate = student -> student.getGpa() >= 3.5;
        boolean anyMatch = studentList.stream().anyMatch(predicate);
        boolean allMatch = studentList.stream().allMatch(predicate);
        boolean noneMatch = studentList.stream().noneMatch(predicate);

        System.out.printf("result of Any Match: %s\n", anyMatch);
        System.out.printf("result of All Match: %s\n", allMatch);
        System.out.printf("result of None Match: %s\n", noneMatch);
    }
}
