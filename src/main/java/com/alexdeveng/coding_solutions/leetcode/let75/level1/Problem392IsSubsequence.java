package com.alexdeveng.coding_solutions.leetcode.let75.level1;

public class Problem392IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int i = 0;
        int sLength = s.length();
        for (char c : t.toCharArray()) {
            if (s.charAt(i) == c) {
                i++;
                if (i == sLength) return true;
            }
        }
        return false;
    }

}
