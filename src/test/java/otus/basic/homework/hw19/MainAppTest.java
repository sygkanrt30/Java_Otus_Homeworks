package otus.basic.homework.hw19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import otus.basic.homeworks.hw19.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainAppTest {

    @ParameterizedTest
    @MethodSource("test1Data")
    public void testElementsAfterLastOne(List<Integer> arr, List<Integer> result) {
        Assertions.assertEquals(result, MainApp.elementsAfterLastOne(arr));
    }

    private static Stream<Arguments> test1Data() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(2, 3, 4, 1, 2, 4, 5, 6, 11)), new ArrayList<>(List.of(2, 4, 5, 6, 11))),
                Arguments.of(new ArrayList<>(List.of(2, 1, 4, 1, 2, 4, 1, 6, 11)), new ArrayList<>(List.of(6, 11)))
        );
    }

    @Test
    public void testElementsAfterLastOneForException() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            MainApp.elementsAfterLastOne(new ArrayList<>(List.of(2, 3, 4, 32, 2, 4, 5, 6, 11)));
        });
    }

    @ParameterizedTest
    @MethodSource("test2Data")
    public void testIsContainsOneAndTwo(List<Integer> arr, boolean result) {
        Assertions.assertEquals(result, MainApp.isContainsOneAndTwo(arr));
    }

    private static Stream<Arguments> test2Data() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(2, 1, 2, 1, 1, 1, 1, 2)), true),
                Arguments.of(new ArrayList<>(List.of(2, 2, 2, 2, 2)), false),
                Arguments.of(new ArrayList<>(List.of(1, 1, 1, 1, 1)), false),
                Arguments.of(new ArrayList<>(List.of(1, 2, 2, 1, 3)), false)
        );
    }
}
