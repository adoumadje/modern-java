package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOfNullableEmptyExample {
    public static void main(String[] args) {
        for(int i = 0; i < 20; ++i) {
            Optional<Student> optionalStudent = getStudent();
            if(optionalStudent.isPresent()) {
                System.out.println(optionalStudent.get().getName());
            } else {
                System.out.println("not found");
            }
        }
    }

    private static Optional<Student> getStudent() {
        Student student = StudentDataBase.studentSupplier.get();
        return Optional.ofNullable(student);
    }
}
