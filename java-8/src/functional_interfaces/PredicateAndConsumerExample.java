package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    public static void main(String[] args) {
        Predicate<Student> filterByGrade = student -> student.getGradeLevel() >= 3;
        Predicate<Student> filterByGPA = student -> student.getGpa() > 3.9;
        BiConsumer<String, List<String>> studentBiconsumer = (name, activities) ->
                System.out.printf("%s: %s\n", name, activities);
        Consumer<Student> studentConsumer = student -> {
            if(filterByGrade.or(filterByGPA).test(student)) {
                studentBiconsumer.accept(student.getName(), student.getActivities());
            }
        };

        BiPredicate<Integer, Double> filterByGradeAndGpa = (grade, gpa) -> grade >= 3 && gpa > 3.9;
        Consumer<Student> studentConsumer2 = student -> {
            if(filterByGradeAndGpa.test(student.getGradeLevel(), student.getGpa())) {
                studentBiconsumer.accept(student.getName(), student.getActivities());
            }
        };

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
        System.out.println("#######################");
        students.forEach(studentConsumer2);
    }
}
