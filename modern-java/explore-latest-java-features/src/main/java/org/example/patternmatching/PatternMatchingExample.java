package org.example.patternmatching;

public class PatternMatchingExample {
    public String pattern(Object obj) {
        if(obj instanceof Integer) {
            Integer i = (Integer) obj;
            return "Integer: " + i;
        } else if (obj instanceof String) {
            String s = (String) obj;
            return "String of length: " + s.length();
        } else {
            return "Not a String or Integer";
        }
    }


    /**
     *  pattern matching with Instanceof - Java 16
     */
    public String patternWithInstanceof(Object obj) {
        if(obj instanceof Integer i) {
            return "Integer: " + i;
        } else if (obj instanceof String s) {
            return "String of length: " + s.length();
        } else {
            return "Not a String or Integer";
        }
    }

    /**
     *  pattern matching using switch - java 21
     */
    public String patternWithSwitch(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String of length: " + s.length();
            case null, default -> "Not a String or Integer";
        };
    }
}
