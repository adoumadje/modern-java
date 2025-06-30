package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        String joined1 = studentList.stream().map(Student::getName).collect(Collectors.joining());
        String joined2 = studentList.stream().map(Student::getName).collect(Collectors.joining("-"));
        String joined3 = studentList.stream().map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));

        System.out.println(joined1);
        System.out.println(joined2);
        System.out.println(joined3);
    }
}
