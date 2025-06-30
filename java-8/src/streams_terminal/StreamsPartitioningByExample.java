package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {
    public static void main(String[] args) {
        Predicate<Student> gpaFilter = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partition = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(gpaFilter, toSet()));

        System.out.printf("student partition: %s\n", partition);
    }
}
