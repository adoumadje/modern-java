package functional_interfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    public static void main(String[] args) {
        Function<List<Student>, Map<String, Integer>> nameToGrade = students -> {
            Map<String, Integer> map = new HashMap<>();
            students.forEach(student -> map.put(student.getName(), student.getGradeLevel()));
            return map;
        };

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(nameToGrade.apply(students));
    }
}
