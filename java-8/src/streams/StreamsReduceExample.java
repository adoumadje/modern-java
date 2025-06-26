package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        List<Integer> emptyList = new ArrayList<>();

        Integer mul = integerList.stream()
                .reduce(1, (a, b) -> a*b);
        Optional<Integer> mulWoIdent = integerList.stream()
                .reduce((a, b) -> a*b);

        Optional<Integer> mulEmpt = emptyList.stream()
                .reduce((a, b) -> a*b);

        Integer mulEmpId = emptyList.stream()
                .reduce(1, (a, b) -> a*b);

        List<Student> studentList = StudentDataBase.getAllStudents();
        Optional<Student> highestGpaStudent = studentList.stream()
                        .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);



        System.out.printf("mul = %d\n", mul);
        System.out.printf("mul without is present: %s\n", mulWoIdent.isPresent());
        System.out.printf("mulWoIdent = %d\n", mulWoIdent.get());
        System.out.printf("mul with empty list is present: %s\n", mulEmpt.isPresent());
        System.out.printf("mulEmp = %d\n", mulEmpId);

        if(highestGpaStudent.isPresent()) {
            System.out.printf("Student with highest GPA: %s\n", highestGpaStudent.get());
        }
    }
}
