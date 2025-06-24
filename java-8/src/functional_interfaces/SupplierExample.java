package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("Dave",3,4.0,"male",
                15, Arrays.asList("swimming", "gymnastics","soccer"));

        System.out.println("Student is: " + studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Students are: " + listSupplier.get());
    }
}
