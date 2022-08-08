package com.alexdeveng.coding_solutions.leetcode.let75.level1;

public class Problem1480RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] resultNums = new int[nums.length];
        int acc = 0;

        for (int i = 0; i < nums.length; i++) {
            resultNums[i] = nums[i] + acc;
            acc += nums[i];
        }

        return resultNums;
    }

}
