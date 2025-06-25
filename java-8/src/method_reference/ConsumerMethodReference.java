package method_reference;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReference {
    public static void main(String[] args) {
        /**
         *  class::methodName
         */
        Consumer<Student> consumer1 = System.out::println;
        Consumer<Student> consumer2 = Student::printListOfActivities;

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(consumer1);
        System.out.println("#################");
        students.forEach(consumer2);
    }
}
