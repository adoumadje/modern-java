package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        List<String> namesList = studentList.stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        Set<String> namesSet = studentList.stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        System.out.printf("Names List: %s\n", namesList);
        System.out.printf("Names Set: %s\n", namesSet);
    }
}
