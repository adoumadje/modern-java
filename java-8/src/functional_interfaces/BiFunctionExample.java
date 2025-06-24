package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> nameToGpa = (students,
                                                                                        filter) -> {
            Map<String, Double> map = new HashMap<>();
            students.forEach(student -> {
                if(filter.test(student)) map.put(student.getName(), student.getGpa());
            });
            return map;
        };

        List<Student> students = StudentDataBase.getAllStudents();
        Predicate<Student> filterByGpa = student -> student.getGpa() > 3.9;
        System.out.println(nameToGpa.apply(students, filterByGpa));
    }
}
