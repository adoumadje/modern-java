package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamsFindAnyFirstExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Predicate<Student> predicate = student -> student.getGpa() >= 3.9;
        Optional<Student> anyStudent = studentList.stream()
                .filter(predicate).findAny();
        Optional<Student> firstStudent = studentList.stream()
                .filter(predicate).findFirst();

        if(anyStudent.isPresent()) {
            System.out.printf("Any Student: %s\n", anyStudent.get());
        } else {
            System.out.println("No result");
        }

        if(firstStudent.isPresent()) {
            System.out.printf("First Student: %s\n", firstStudent.get());
        } else {
            System.out.println("No result");
        }
    }
}
