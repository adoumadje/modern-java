package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalPresentExample {
    private static int REPEAT = 20;

    public static void main(String[] args) {
        System.out.println("###### isPresent ########");
        for (int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            if(optionalStudent.isPresent()) {
                System.out.println(optionalStudent.get());
            } else {
                System.out.println("not found");
            }
        }

        System.out.println("###### ifPresent ########");
        for(int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            optionalStudent.ifPresent(System.out::println);
        }
    }

    private static Optional<Student> getStudent() {
        return Optional.ofNullable(StudentDataBase.studentSupplier.get());
    }
}
