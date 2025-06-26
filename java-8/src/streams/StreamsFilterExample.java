package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        List<Student> femaleStudents = studentList.stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa() > 3.5)
                .collect(Collectors.toList());

        femaleStudents.forEach(System.out::println);
    }
}
