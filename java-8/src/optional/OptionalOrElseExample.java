package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OptionalOrElseExample {
    private static int REPEAT = 20;

    public static void main(String[] args) {
        System.out.println("######## orElse ########");
        for(int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            String name = optionalStudent.map(Student::getName).orElse("orElse: Default");
            System.out.println(name);
        }

        System.out.println("######## orElseGet ########");
        for(int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            String name = optionalStudent.map(Student::getName).orElseGet(() -> "orElseGet: Default");
            System.out.println(name);
        }

        System.out.println("######## orElseThrow ########");
        for (int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            try {
                String name = optionalStudent.map(Student::getName).orElseThrow();
                System.out.println(name);
            } catch (Exception ex) {
                Logger.getAnonymousLogger().log(Level.WARNING, ex.getMessage());
            }
        }

        System.out.println("######## orElseThrow 2 ########");
        for (int i = 0; i < REPEAT; ++i) {
            Optional<Student> optionalStudent = getStudent();
            try {
                String name = optionalStudent.map(Student::getName).orElseThrow(() ->
                        new IllegalArgumentException("not found"));
                System.out.println(name);
            } catch (Exception ex) {
                Logger.getAnonymousLogger().log(Level.WARNING, ex.getMessage());
            }
        }
    }

    private static Optional<Student> getStudent() {
        return Optional.ofNullable(StudentDataBase.studentSupplier.get());
    }
}
