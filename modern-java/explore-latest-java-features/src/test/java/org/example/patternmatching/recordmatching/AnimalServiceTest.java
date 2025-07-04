package org.example.patternmatching.recordmatching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalServiceTest {

    AnimalService animalService = new AnimalService();

    @ParameterizedTest
    @MethodSource("input")
    void retrieveName(Animal animal, String expectedName) {
        var ouput = animalService.retrieveName(animal);

        assertEquals(expectedName, ouput);
    }

    @ParameterizedTest
    @MethodSource("input")
    void retrieveNameV2(Animal animal, String expectedName) {
        var ouput = animalService.retrieveNameV2(animal);

        assertEquals(expectedName, ouput);
    }

    @Test
    void retrieveNameUsingPatternGuards() {
        var ouput = animalService.retrieveNameUsingPatternGuards(new Cat(null, "blue"));

        assertEquals("", ouput);
    }


    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new Cat("Tom", "blue"), "Tom"),
                Arguments.of(new Dog("Bollo", "grey"), "Bollo"),
                Arguments.of(null, "")
        );
    }
}