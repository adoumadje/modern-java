package data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class StudentDataBase {
    private static Random rand = new Random();

    public static Supplier<Student> studentSupplier = () -> {
        Bike bike = new Bike("Motorota", "R1");
        Student student = new Student("Adam",2,3.6,
                "male",10,Arrays.asList("swimming", "basketball","volleyball"));
        student.setBike(Optional.of(bike));
        return rand.nextBoolean() ? student : null;
    };

    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Jenny",2,3.8,"female", 11,Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", 12,Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male", 15,Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female",10, Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male", 22,Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2, null, student3,student4,student5,student6);
        return students;
    }
}
