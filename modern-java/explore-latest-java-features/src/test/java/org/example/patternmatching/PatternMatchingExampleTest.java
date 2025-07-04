package org.example.patternmatching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingExampleTest {
    PatternMatchingExample patternMatchingExample = new PatternMatchingExample();

    @ParameterizedTest
    @MethodSource("input")
    void withoutPatternTest(Object obj, String expectedOuput) {
        var output = patternMatchingExample.pattern(obj);
        assertEquals(expectedOuput, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void withPatternTest(Object obj, String expectedOuput) {
        var output = patternMatchingExample.patternWithInstanceof(obj);
        assertEquals(expectedOuput, output);
    }

    @ParameterizedTest
    @MethodSource("input")
    void withSwitchPatternTest(Object obj, String expectedOuput) {
        var output = patternMatchingExample.patternWithSwitch(obj);
        assertEquals(expectedOuput, output);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(1, "Integer: 1"),
                Arguments.of("Caleb", "String of length: 5"),
                Arguments.of(null, "Not a String or Integer")
        );
    }
}