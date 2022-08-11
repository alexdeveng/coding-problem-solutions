package com.alexdeveng.coding_solutions.leetcode.let75.level1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
class Problem392IsSubsequenceTest {

    static Problem392IsSubsequence subsequence = new Problem392IsSubsequence();

    @ParameterizedTest
    @CsvSource({
            "ace, abcde, true",
            "aec, abcde, false",
            "abc, ahbgdc, true",
            "axc, ahbgdc, false",
            "ab, baab, true",
            "leeeeetcode, ylyyeyyeyyeyeyyyeytyycyyyoyyydyyeyyyyyyyyyyyyy,true",
            "'', asdfsadf, true"
    })
    void is_subsequence(String s, String t, boolean expected) {

        boolean result = subsequence.isSubsequence(s, t);

        assertThat(result).isEqualTo(expected);
    }
}
