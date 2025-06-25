package method_reference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {
    public static void main(String[] args) {
        Predicate<Student> predicate1 = student -> student.getGradeLevel() >= 3;
        Predicate<Student> predicate2 = RefactorMethodReference::greaterOrEqual;

        Student student = StudentDataBase.studentSupplier.get();
        System.out.println(predicate1.test(student));
        System.out.println(predicate2.test(student));
    }

    private static boolean greaterOrEqual(Student student) {
        return student.getGradeLevel() >= 3;
    }
}
