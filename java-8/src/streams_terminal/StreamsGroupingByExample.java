package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.sql.Struct;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        Map<String, List<Student>> studentMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        Map<String, List<Student>> byGpa = studentList.stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        Map<String, Map<String, List<Student>>> tw2LevelMap = studentList.stream()
                        .collect(Collectors.groupingBy(Student::getGender,
                                Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING"
                                        : "AVERAGE")));

        Map<String, Integer> sumByGender = studentList.stream()
                        .collect(Collectors.groupingBy(Student::getGender,
                                Collectors.summingInt(Student::getNoteBooks)));

        LinkedHashMap<String, Set<Student>> thr3ArgsMap = studentList.stream()
                        .collect(Collectors.groupingBy(Student::getGender, LinkedHashMap::new, Collectors.toSet()));

        Map<Integer, Student> bestGpaByGradeLevel = studentList.stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.collectingAndThen(Collectors
                                        .maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        Map<Integer, Student> worstGpaByGradeLevel = studentList.stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.collectingAndThen(Collectors
                                        .minBy(Comparator.comparing(Student::getGpa)), Optional::get)));

        System.out.printf("By Gender: %s\n", studentMap);
        System.out.println();
        System.out.printf("By GPA: %s\n", byGpa);
        System.out.println();
        System.out.printf("By Gender then GPA: %s\n", tw2LevelMap);
        System.out.println();
        System.out.printf("By Gender to LinkedHashMap: %s\n", thr3ArgsMap);
        System.out.println();
        System.out.printf("Best Student By Grade level: %s\n", bestGpaByGradeLevel);
        System.out.println();
        System.out.printf("Worst Student By Grade level: %s\n", worstGpaByGradeLevel);

    }
}
