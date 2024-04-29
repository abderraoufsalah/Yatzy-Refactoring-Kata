package io.abderraoufsalah;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiceRollTest {

    static Stream<List<Integer>> provideArguments() {
        return Stream.of(
                asList(1, 2, 3, 4, -1),
                asList(1, 2, 7, 4, 5),
                singletonList(1),
                null
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void badArgument(List<Integer> roll) {
        assertThrows(IllegalArgumentException.class, () -> {
            new DiceRoll(roll);
        });
    }
}
