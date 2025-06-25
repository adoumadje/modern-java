package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        List<String> nameList = studentList.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        Set<String> nameSet = studentList.stream()
                .map(Student::getName)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println(nameList);
        System.out.println(nameSet);
    }
}
