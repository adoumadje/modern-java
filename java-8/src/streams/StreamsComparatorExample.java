package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        List<Student> sortedStudentByName = studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        List<Student> sortedStudentByGpa = studentList.stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

        List<Student> sortedStudentByGpaDesc = studentList.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

        System.out.println("######## By Name #########");
        sortedStudentByName.forEach(System.out::println);
        System.out.println("######## By GPA #########");
        sortedStudentByGpa.forEach(System.out::println);
        System.out.println("######## By GPA Desc #########");
        sortedStudentByGpaDesc.forEach(System.out::println);

    }
}
