package com.alexdeveng.coding_solutions.leetcode.let75.level1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index
 * is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements
 * to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
class Problem724FindPivotIndexTest {

    Problem724FindPivotIndex findPivotIndex = new Problem724FindPivotIndex();

    static Stream<Arguments> pivot_index_arguments() {
        return Stream.of(
                arguments(new int[]{1, 7, 3, 6, 5, 6}, 3),
                arguments(new int[]{1, 2, 3}, -1),
                arguments(new int[]{2, 1, -1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("pivot_index_arguments")
    void find_pivot_index(int[] nums, int expectedPivotIndex) {

        final int result = findPivotIndex.pivotIndex(nums);

        assertThat(result).isEqualTo(expectedPivotIndex);
    }

    @ParameterizedTest
    @MethodSource("pivot_index_arguments")
    void find_pivot_index_using_streams(int[] nums, int expectedPivotIndex) {

        final int result = findPivotIndex.pivotIndexWithStreams(nums);

        assertThat(result).isEqualTo(expectedPivotIndex);
    }
}
