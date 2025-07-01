package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalFilterMapFlatMapExample {
    private static int REPEAT = 20;

    public static void main(String[] args) {
        System.out.println("###### filter ########");
        for(int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            optionalStudent
                    .filter(student -> student.getGpa() >= 3.5)
                    .ifPresent(System.out::println);
        }

        System.out.println("###### map ########");
        for(int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            optionalStudent
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName)
                    .ifPresent(System.out::println);

        }

        System.out.println("###### flatMap ########");
        for(int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            optionalStudent.filter(student -> student.getGpa() >= 3.5)
                    .flatMap(Student::getBike)
                    .ifPresent(System.out::println);
        }
    }

    private static Optional<Student> getStudent() {
        return Optional.ofNullable(StudentDataBase.studentSupplier.get());
    }
}
