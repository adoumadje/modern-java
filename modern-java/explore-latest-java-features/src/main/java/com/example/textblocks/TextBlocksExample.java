package com.example.textblocks;

public class TextBlocksExample {
    public static void main(String[] args) {
        System.out.println(multiline("Caleb"));
        System.out.println(sql());
        System.out.println(json());
    }

    private static String multiline(String name) {
        return """
                Hello %s!
                This is
                    multiline string
                with new lines inside
                """.formatted(name);
    }

    private static String sql() {
        return """
                SELECT * FROM employee
                WHERE first_name = 'Kylian'
                AND age > 18;
                """;
    }

    private static String json() {
        return """
                {
                    "id": 123565,
                    "name": "Eduardo Camavinga",
                    "height": 1.80
                }
                """;
    }
}
