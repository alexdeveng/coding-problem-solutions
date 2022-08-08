package com.alexdeveng.coding_solutions.leetcode.let75.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem1480RunningSumOf1DArrayTest {
    /*
      Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
      Return the running sum of nums.
    */
    Problem1480RunningSumOf1DArray runningSumOf1DArray = new Problem1480RunningSumOf1DArray();

    @Test
    void return_the_running_sum_of_nums() {
        int[] nums = {1, 2, 3, 4};

        int[] runningSumNums = runningSumOf1DArray.runningSum(nums);

        assertThat(runningSumNums).containsExactly(1, 3, 6, 10);
    }

//    *Shorter solution but mutates the input :(
//    public int[] runningSum(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i - 1];
//        }
//        return nums;
//    }
}
