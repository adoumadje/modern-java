package streams_terminal;

import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static void main(String[] args) {
        long count = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());

        System.out.printf("Count = %d\n", count);
    }

}
