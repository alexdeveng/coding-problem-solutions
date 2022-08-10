package com.alexdeveng.coding_solutions.leetcode.let75.level1;

import java.util.stream.IntStream;

public class Problem724FindPivotIndex {

    static final int NO_PIVOT_INDEX = -1;

    public int pivotIndex(int... nums) {
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (prefixSum[i] == prefixSum[prefixSum.length - 1] - prefixSum[i] - nums[i]) {
                return i;
            }
        }
        return NO_PIVOT_INDEX;
    }

    public int pivotIndexWithStreams(int... nums) {
        int[] prefixSum = new int[nums.length + 1];
        IntStream.range(1, prefixSum.length)
                .forEach(i -> prefixSum[i] = prefixSum[i - 1] + nums[i - 1]);
        return IntStream
                .range(0, nums.length)
                .filter(i -> prefixSum[i] == prefixSum[prefixSum.length - 1] - prefixSum[i] - nums[i])
                .findFirst()
                .orElse(NO_PIVOT_INDEX);
    }
}
