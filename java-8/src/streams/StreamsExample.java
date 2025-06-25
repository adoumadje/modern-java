package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        Predicate<Student> gradeFilter = student -> student.getGradeLevel() >= 3;
        Predicate<Student> gpaFilter = student -> student.getGpa() > 3.9;

//        Map<String, List<String>> studentmap =  studentList.stream()
//                // .filter((student -> student.getGradeLevel() >= 3))
//                .filter(gradeFilter.and(gpaFilter))//.filter(gpaFilter)
//                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        // studentList.stream().filter(gradeFilter);

        Map<String, List<String>> studentmap =  studentList.stream()
                .peek(student -> System.out.println(student))
                .filter(gradeFilter)
                .peek(student -> System.out.println("After 1 filter: " + student))
                .filter(gpaFilter)
                .peek(student -> System.out.println("After 2 filter: " + student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

//        System.out.println(studentmap);
    }
}
