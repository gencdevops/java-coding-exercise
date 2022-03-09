package com.company.chapterone.countduplicatecharacters;

 /* Counting duplicate characters:
  Write a program that counts duplicate characters from a given string.
  */

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "TurkeyJavaCommunityTipKata";

        Map<Character, Integer> duplicateCharacter = Strings.countDuplicateCharacters(str);
        System.out.println("Duplicate characters : " + duplicateCharacter);

        Map<Character, Long> duplicateCharacterStream = Strings.countDuplicateCharactersStream(str);
        System.out.println("Duplicate characters stream : " + duplicateCharacterStream);


    }
}
