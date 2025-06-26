package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        List<String> studentActivities = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        List<String> distinctActivities = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        long activitiesCount = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        List<String> sortedActivities = studentList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.printf("All activities: %s\n", studentActivities);
        System.out.printf("Distinct activities: %s\n", distinctActivities);
        System.out.printf("Sorted activities: %s\n", sortedActivities);
        System.out.printf("Activities count: %d\n", activitiesCount);
    }
}
