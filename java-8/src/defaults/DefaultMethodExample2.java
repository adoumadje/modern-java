package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        Consumer<Student> studentConsumer = System.out::println;
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);

        System.out.println("Before sorting");
        studentList.forEach(studentConsumer);
        System.out.println("After sorting");
//        studentList.sort(nameComparator);
//        studentList.sort(gpaComparator.thenComparing(nameComparator));
        studentList.sort(gpaComparator.reversed().thenComparing(nameComparator));
        studentList.forEach(studentConsumer);

    }
}
