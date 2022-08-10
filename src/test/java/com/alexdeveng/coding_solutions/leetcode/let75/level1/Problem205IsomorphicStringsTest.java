package com.alexdeveng.coding_solutions.leetcode.let75.level1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters.
 * No two characters may map to the same character, but a character
 * may map to itself.
 */
class Problem205IsomorphicStringsTest {

    static Problem205IsomorphicStrings isomorphicStrings = new Problem205IsomorphicStrings();

    @ParameterizedTest
    @CsvSource({
            "egg, add, true",
            "foo, bar, false",
            "paper, title, true",
            "badc, baba, false"
    })
    void is_isomorphic(String s, String t, boolean expectedResult) {

        Boolean result = isomorphicStrings.isIsomorphic(s, t);

        assertThat(result).isEqualTo(expectedResult);
    }

}
