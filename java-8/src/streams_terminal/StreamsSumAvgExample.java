package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsSumAvgExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        int sum = studentList.stream().collect(Collectors.summingInt(Student::getNoteBooks));
        double avg = studentList.stream().collect(Collectors.averagingInt(Student::getNoteBooks));

        System.out.printf("sum = %d\n", sum);
        System.out.printf("avg = %.2f\n", avg);
    }
}
