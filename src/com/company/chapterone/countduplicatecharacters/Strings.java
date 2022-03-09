package com.company.chapterone.countduplicatecharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Strings {
    protected static Map<Character, Integer> countDuplicateCharacters(String str) {

        Map<Character, Integer> result = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch , (k, v) -> (v == null) ? 1 : ++v);

        }
        return result;
    }

    protected static Map<String, Long> countDuplicateCharactersStream(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

       return result;
    }

}
