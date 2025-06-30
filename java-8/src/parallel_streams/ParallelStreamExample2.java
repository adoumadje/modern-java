package parallel_streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelStreamExample2 {

    private static void sequentialStudentActivities() {
        long start = System.currentTimeMillis();
        StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.printf("Sequential time: %d\n", end - start);
    }

    private static void parallelStudentActivities() {
        long start = System.currentTimeMillis();
        StudentDataBase.getAllStudents().stream().parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
        long end = System.currentTimeMillis();
        System.out.printf("Parallel time: %d\n", end - start);
    }


    public static void main(String[] args) {
        sequentialStudentActivities();
        parallelStudentActivities();
    }
}
