package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;

public class StreamsMapReduceFilterExample {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Integer numOfNoteBooks = studentList.stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0, (a, b) -> a + b)
                .reduce(0, Integer::sum);

        System.out.printf("numOfNoteBooks = %d\n", numOfNoteBooks);

        int[] arr = new int[]{};
        Arrays.stream(arr);
    }
}
