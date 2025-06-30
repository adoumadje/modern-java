package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Optional<Student> worstStudent = studentList.stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
        Optional<Student> bestStudent = studentList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

        System.out.printf("Best student: %s\n", bestStudent.orElse(null));
        System.out.printf("Worst student: %s\n", worstStudent.orElse(null));
    }
}
