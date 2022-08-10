package com.alexdeveng.coding_solutions.leetcode.let75.level1;

import java.util.HashMap;
import java.util.Map;

public class Problem205IsomorphicStrings {

    public Boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapStoT = new HashMap<>();
        Map<Character, Character> mapTtoS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!mapStoT.containsKey(charS)) {
                mapStoT.put(charS, charT);
            }
            if (!mapTtoS.containsKey(charT)) {
                mapTtoS.put(charT, charS);
            }
            if (mapStoT.get(charS) != charT || mapTtoS.get(charT) != charS) return false;
        }
        return true;
    }

}
