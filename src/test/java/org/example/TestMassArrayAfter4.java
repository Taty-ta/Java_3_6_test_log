package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayAfter4 {
    public static Stream<Arguments> dataForAfter4() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{2, 5, 7, 5, 4, 3, 2, 1}, new int[]{3, 2, 1}));
        list.add(Arguments.arguments(new int[]{2, 5, 7, 5, 4, 1, 2, 3}, new int[]{1, 2, 3}));
        list.add(Arguments.arguments(new int[]{2, 5, 7, 5, 4}, new int[]{}));
        list.add(Arguments.arguments(new int[]{2, 5, 7, 5, 5, 3, 4, 1}, new int[]{1}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForAfter4")
    public void massTectAfter4(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, ArrTest.newArr(in, 4));
    }
}
