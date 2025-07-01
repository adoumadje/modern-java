package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Student> studentOptional = getStudent();
        if(studentOptional.isPresent()) {
            System.out.println(studentOptional.get().getName());
        } else {
            System.out.println("Student not found");
        }
    }

    private static Optional<Student> getStudent() {
        Student student = StudentDataBase.studentSupplier.get();
        return student != null ? Optional.of(student) : Optional.empty();
    }
}
